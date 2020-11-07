package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controller.ContactController;

public final class ListContacts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Contact | View</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>Contacts List</h2>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <a href=\"AddContact\"><button>ADD NEW CONTACT </button></a>\n");
      out.write("\n");
      out.write("            <a href=\"view_group\"><button>LIST ALL GROUP</button></a>\n");
      out.write("        </div><br>\n");
      out.write("        <hr>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Id</th>\n");
      out.write("                    <th>First Name</th>\n");
      out.write("                    <th>Last Name</th>\n");
      out.write("                    <th type=\"hidden\">Group Id</th>\n");
      out.write("                    <th>Group name</th>\n");
      out.write("                    <th>Phone</th>\n");
      out.write("                    <th>Operations</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("            <input type=\"hidden\" name=\"criminal_index\" value=\"\">\n");
      out.write("            ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setVar("i");
      _jspx_th_c_forEach_0.setItems(ContactController.contactList);
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("                      \n");
            out.write("                <tr> \n");
            out.write("                    <td><font><b>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.id_contact}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</b></font></td>\n");
            out.write("                    <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.first_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                    <td><b>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.last_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</b></td>\n");
            out.write("                    <td><font><b>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.id_group}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</b></font></td>\n");
            out.write("                    <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                    <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>         \n");
            out.write("                    <td class=\"justify-content-center\"> \n");
            out.write("                        <button onclick=\"editFunction(");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.id_contact}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write(")\" class=\"btn-warning\">Edit</button></a><br>\n");
            out.write("                        <button onclick=\"deleteFunction(");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.id_contact}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write(")\" class=\"btn-danger\">Remove</button>\n");
            out.write("                    </td>\n");
            out.write("                </tr>       \n");
            out.write("            ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("    <!--EDIT-->\n");
      out.write("    <form id=\"editform\" action=\"get_contact\">\n");
      out.write("        <input id=\"id_contact_edit\" type=\"hidden\" name=\"id_contact_edit\" value=\"\">\n");
      out.write("    </form>   \n");
      out.write("    <script>\n");
      out.write("        function editFunction(i) {\n");
      out.write("            document.getElementById(\"id_contact_edit\").value = i;\n");
      out.write("            document.getElementById(\"editform\").submit();\n");
      out.write("        }\n");
      out.write("    </script>     \n");
      out.write("\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@9\"></script>\n");
      out.write("    <!--DELETE-->\n");
      out.write("    <form id=\"deleteform\" method=\"post\" action=\"delete_contact\">\n");
      out.write("        <input id=\"id_contact_delete\" type=\"hidden\" name=\"id_contact_delete\" value=\"\">\n");
      out.write("    </form>   \n");
      out.write("    <script>\n");
      out.write("        function deleteFunction(i) {\n");
      out.write("//            Swal.fire({\n");
      out.write("//                title: '<h2 style=\"color:white;\">Delete this contact?<h2>',\n");
      out.write("//                text: \"Bạn có chắc muốn xóa liên hệ này không?\",\n");
      out.write("//                icon: 'warning',\n");
      out.write("//                showCancelButton: true,\n");
      out.write("//                confirmButtonColor: '#3085d6',\n");
      out.write("//                cancelButtonColor: '#d33',\n");
      out.write("//                confirmButtonText: 'Xóa ngay',\n");
      out.write("//                cancelButtonText: 'Hủy bỏ'\n");
      out.write("//            }).then((result) => {\n");
      out.write("//                if (result.value) {\n");
      out.write("//                    document.getElementById(\"id_contact_delete\").value = i;\n");
      out.write("//                    Swal.fire(\n");
      out.write("//                            '<h2 style=\"color:white;\">Đang xử lý</h2>',\n");
      out.write("//                            'Danh sách liên hệ sẽ được cập nhật sau vài giây...',\n");
      out.write("//                            'success'\n");
      out.write("//                            );\n");
      out.write("//                    document.getElementById(\"deleteform\").submit();\n");
      out.write("//                }\n");
      out.write("//            });\n");
      out.write("            document.getElementById(\"id_contact_delete\").value = i;\n");
      out.write("\n");
      out.write("            document.getElementById(\"deleteform\").submit();\n");
      out.write("        }\n");
      out.write("    </script> \n");
      out.write("    <br/><br/>\n");
      out.write("    <a href=\"https://www.hitwebcounter.com\" target=\"_blank\">\n");
      out.write("            <img src=\"https://hitwebcounter.com/counter/counter.php?page=7697280&style=0001&nbdigits=5&type=page&initCount=0\" title=\"Total Website Hits\" Alt=\"Web Hits\"   border=\"0\" /></a>    \n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
