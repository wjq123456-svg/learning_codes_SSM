/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-06-21 11:15:03 UTC
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
      out.write("    <title>Title</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<FIELDSET>\r\n");
      out.write("    <h4>功能一：默认支持ServletAPI</h4>\r\n");
      out.write("    <a href=\"/params/gotoParams.do?id=100&name=lisi\">测试</a>\r\n");
      out.write("</FIELDSET>\r\n");
      out.write("<FIELDSET>\r\n");
      out.write("    <h4>功能二：绑定简单数据类型</h4>\r\n");
      out.write("    <a href=\"/params/gotoParamsBase.do?id=100&name=lisi\">测试</a>\r\n");
      out.write("</FIELDSET>\r\n");
      out.write("<FIELDSET>\r\n");
      out.write("    <h4>功能三：当形参和传递的参数名称不一致时使用RequestParam进行手动映射</h4>\r\n");
      out.write("    <a href=\"/params/gotoParamsRequestParam.do?ids=100\">测试</a>\r\n");
      out.write("</FIELDSET>\r\n");
      out.write("<FIELDSET>\r\n");
      out.write("    <h4>功能四：绑定pojo对象</h4>\r\n");
      out.write("    <a href=\"/params/gotoParamsPojo.do?id=100&name=lisi&sex=nan\">测试</a>\r\n");
      out.write("</FIELDSET>\r\n");
      out.write("<FIELDSET>\r\n");
      out.write("    <h4>功能五：绑定pojo对象的包装对象</h4>\r\n");
      out.write("    <a href=\"/params/gotoParamsQueryVo.do?user.id=100&user.name=lisi&user.sex=nan\">测试</a>\r\n");
      out.write("</FIELDSET>\r\n");
      out.write("<FIELDSET>\r\n");
      out.write("    <h4>功能六：绑定pojo对象的list集合</h4>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <form action = \"/params/gotoParamsList.do\" method=\"post\">\r\n");
      out.write("        <input type=\"text\" name=\"userList[0].id\" placeholder=\"请输入id\"/>\r\n");
      out.write("        <input type=\"text\" name=\"userList[0].name\" placeholder=\"请输入用户名\"/>\r\n");
      out.write("        <input type=\"text\" name=\"userList[0].sex\" placeholder=\"请输入性别\"/>\r\n");
      out.write("        <br/>\r\n");
      out.write("        <input type=\"text\" name=\"userList[1].id\" placeholder=\"请输入id\"/>\r\n");
      out.write("        <input type=\"text\" name=\"userList[1].name\" placeholder=\"请输入用户名\"/>\r\n");
      out.write("        <input type=\"text\" name=\"userList[1].sex\" placeholder=\"请输入性别\"/>\r\n");
      out.write("        <br/> <input type=\"submit\" value=\"提交\">\r\n");
      out.write("    </form>\r\n");
      out.write("</FIELDSET>\r\n");
      out.write("<FIELDSET>\r\n");
      out.write("    <h4>功能七：绑定pojo对象的Map集合</h4>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <form action = \"/params/gotoParamsMap.do\" method=\"post\">\r\n");
      out.write("        <input type=\"text\" name=\"userMap['u001'].id\" placeholder=\"请输入id\"/>\r\n");
      out.write("        <input type=\"text\" name=\"userMap['u001'].name\" placeholder=\"请输入用户名\"/>\r\n");
      out.write("        <input type=\"text\" name=\"userMap['u001'].sex\" placeholder=\"请输入性别\"/>\r\n");
      out.write("        <br/> <input type=\"submit\" value=\"提交\">\r\n");
      out.write("    </form>\r\n");
      out.write("</FIELDSET>\r\n");
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
