/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-06-21 08:50:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>首页</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<fieldset>\r\n");
      out.write("    <h4>用法1：多个URL路径映射到同一个Handler（同一个方法中）</h4>\r\n");
      out.write("    <a href=\"http://localhost:9090/gotoResultURL1.do\">测试gotoResultURL1</a><br/>\r\n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/gotoResultURL2.do\">测试gotoResultURL2</a>\r\n");
      out.write("</fieldset>\r\n");
      out.write("<fieldset>\r\n");
      out.write("    <h4>用法2：RequestMapping注解作用在类上，实现对请求路径的分类管理，限定类中方法访问的前缀</h4>\r\n");
      out.write("    <a href=\"http://localhost:9090/user/gotoResultURL1.do\">测试User gotoResultURL1</a><br/>\r\n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/default/gotoResultURL1.do\">测试Default gotoResultURL1</a>\r\n");
      out.write("</fieldset>\r\n");
      out.write("<fieldset>\r\n");
      out.write("    <h4>用法3：method属性限定请求方法：请求的handler相同，请求方式不同进入不同方法处理</h4>\r\n");
      out.write("    <a href=\"http://localhost:9090/default/gotoResultMethod.do\">Get请求</a><br/>\r\n");
      out.write("    <form action=\"/default/gotoResultMethod.do\" method=\"post\">\r\n");
      out.write("        <input type=\"submit\" value=\"Post请求\">\r\n");
      out.write("    </form>\r\n");
      out.write("</fieldset>\r\n");
      out.write("<fieldset>\r\n");
      out.write("    <h4>用法4：Params属性限定请求参数：支持简单的表达式语法，url一样，根据携带参数的不同进入不同的方法处理</h4>\r\n");
      out.write("    <a href=\"http://localhost:9090/user/login.do?type=user\">普通用户</a><br/>\r\n");
      out.write("    <a href=\"http://localhost:9090/user/login.do?type=admin\">管理员</a><br/>\r\n");
      out.write("    <a href=\"http://localhost:9090/user/login.do?type=vip\">VIP</a><br/>\r\n");
      out.write("\r\n");
      out.write("</fieldset>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
