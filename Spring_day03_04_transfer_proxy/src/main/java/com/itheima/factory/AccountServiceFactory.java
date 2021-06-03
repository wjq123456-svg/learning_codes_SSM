package com.itheima.factory;

import com.itheima.pojo.Account;
import com.itheima.service.AccountService;
import com.itheima.utils.TranscationManager;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 *@Author wjq
 *@Date 2021/6/3
 *@Version v1.0
 *@Description 用于创建AccountService代理对象的工具类
 */
@Component
public class AccountServiceFactory {
    //依赖注入  被代理对象
    @Autowired
    private AccountService accountService;
    //依赖注入事务管理器
    @Autowired
    private TranscationManager transcationManager;

    //方式一：使用JDK提供的动态代理技术Proxy
    @Bean("accountServiceProxy")
    public AccountService createAccountServiceProxy(){
        //创建代理对象
        //参数一：制定与被动态代理对象使用相同的类加载器   参数二：指定与被代理对象使用相同的接口 参数三：指定如何进行代理功能增强
        AccountService proxy = (AccountService) Proxy.newProxyInstance(
                accountService.getClass().getClassLoader(),
                accountService.getClass().getInterfaces(),
                new InvocationHandler() {
                    //具体进行对原有功能进行增强的方法
                    //o:代理对象的引用
                    //method:代表具体要执行的方法名字
                    //objects：代表具体执行的方法所要接收的参数值
                    //return:代表具体要执行的具体方法的执行结果
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        System.out.println("Proxy被代理对象 = "+accountService);
                        System.out.println("被代理对象 要执行增强的方法 = "+method.getName());
                        System.out.println("被代理对象 要执行增强的方法 接收的参数值 = " + Arrays.toString(objects));
                        Object obj = null;
                        try{
                            //开启事务
                            transcationManager.begin();

                            //调用被代理类的原有方法
                            obj = method.invoke(accountService, objects);

                            //提交事务
                            transcationManager.commit();
                        }catch (Exception e){
                            e.printStackTrace();

                            //回滚事务
                            transcationManager.rollback();

                        }finally {

                            //释放资源
                            transcationManager.close();
                        }
                        return obj;
                    }
                }
        );
        return proxy;
    }

    @Bean("accountServiceCglib")
    //方法二：基于子类的动态代理使用Cglib的动态代理技术
    public AccountService createAccountServiceCglib(){
        //创建代理对象
        //参数一：父类的字节码文件  通过被代理对象得到字节码文件
        //参数二：方法增强代码
        AccountService proxy = (AccountService) Enhancer.create(
                accountService.getClass(),
                new MethodInterceptor() {
                    @Override
                    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                        //参数一：代理对象的引用
                        //参数二：具体执行的方法
                        //参数三：要接收的参数值
                        //参数四：代表参数二的动态代理对象
                        System.out.println("cglib被代理对象 = "+accountService);
                        System.out.println("被代理对象 要执行增强的方法 = "+method.getName());
                        System.out.println("被代理对象 要执行增强的方法 接收的参数值 = " + Arrays.toString(objects));
                        Object obj = null;
                        try{
                            //开启事务
                            transcationManager.begin();

                            //调用被代理类的原有方法
                            obj = method.invoke(accountService, objects);

                            //提交事务
                            transcationManager.commit();
                        }catch (Exception e){
                            e.printStackTrace();

                            //回滚事务
                            transcationManager.rollback();

                        }finally {

                            //释放资源
                            transcationManager.close();
                        }
                        return obj;
                    }
                }
        );
        return proxy;
    }
}
