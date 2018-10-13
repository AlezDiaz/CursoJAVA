package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserCreate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Header.jsp");
    _jspx_dependants.add("/Footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Usuarios</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Resources/Styles/Proyecto.css\">        \n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://jqueryvalidation.org/files/demo/site-demos.css\">\n");
      out.write("        \n");
      out.write("        <script\n");
      out.write("          src=\"https://code.jquery.com/jquery-3.3.1.js\"\n");
      out.write("          integrity=\"sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60=\"\n");
      out.write("          crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/jquery-validation@1.17.0/dist/jquery.validate.js\"></script>\n");
      out.write("        <script src=\"Resources/Scripts/messages_es_PE.js\"></script>\n");
      out.write("        \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>   \n");
      out.write("        \n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">IDAT</a>\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\n");
      out.write("        <ul class=\"navbar-nav\">\n");
      out.write("          <li class=\"nav-item active\">\n");
      out.write("              <a class=\"nav-link\" href=\"UserCreate.jsp\">Crear <span class=\"sr-only\">(current)</span></a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link\" href=\"UserList.jsp\">Listado</a>\n");
      out.write("          </li>\n");
      out.write("          <!--<li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"#\">Pricing</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item dropdown\">\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("              Dropdown link\n");
      out.write("            </a>\n");
      out.write("            <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("            </div>\n");
      out.write("          </li>-->\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("        \n");
      out.write("    <div class=\"container\">");
      out.write("\n");
      out.write("\n");
      out.write("        <h1>Crear Usuario</h1>\n");
      out.write("        \n");
      out.write("        <form id=\"frmUserCreate\" method=\"POST\" action=\"UserCreate\">\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <label>Usuario:</label>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" placeholder=\"Ingrese el nombre de usuario\" \n");
      out.write("                           id=\"txtUsuario\" name=\"txtUsuario\" /><!-- required.- valida que el campo sea requerido -->                \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("               \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <label>Password:</label>\n");
      out.write("                    <input class=\"form-control\" type=\"password\" placeholder=\"Ingrese el password de usuario\" \n");
      out.write("                           id=\"txtPassword\" name=\"txtPassword\" />\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <label>DNI:</label>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" placeholder=\"Ingrese el DNI\" \n");
      out.write("                           id=\"txtDni\" name=\"txtDni\" /><!-- required.- valida que el campo sea requerido -->                \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <label>Nombre:</label>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" placeholder=\"Ingrese el Nombre\" \n");
      out.write("                           id=\"txtNombre\" name=\"txtNombre\" /><!-- required.- valida que el campo sea requerido -->                \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <label>Apellido:</label>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" placeholder=\"Ingrese el Apellido\" \n");
      out.write("                           id=\"txtApellido\" name=\"txtApellido\" /><!-- required.- valida que el campo sea requerido -->                \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <input class=\"btn btn-primary\" type=\"submit\" value=\"Grabar\" />\n");
      out.write("                    <input class=\"btn btn-success\" type=\"button\" id=\"btnGrabarAJAX\" value=\"Grabar Ajax\" />\n");
      out.write("                    <a class=\"btn btn-warning\" href=\"UserList.jsp\">Ir a Listado</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            $.validator.addMethod(\"hardpass\", function(value) {\n");
      out.write("                return /^[A-Za-z0-9\\d=!\\-@._*]*$/.test(value) // consists of only these\n");
      out.write("                    && /[a-z]/.test(value) // has a lowercase letter\n");
      out.write("                    && /\\d/.test(value) // has a digit\n");
      out.write("             });\n");
      out.write("            \n");
      out.write("            $.validator.addMethod(\"accept\", function(value, element, param) {\n");
      out.write("                return value.match(new RegExp(\".\" + param + \"$\"));\n");
      out.write("              });\n");
      out.write("            \n");
      out.write("            $(\"#frmUserCreate\").validate({\n");
      out.write("                rules:{\n");
      out.write("                    txtUsuario : {\n");
      out.write("                        required : true,\n");
      out.write("                        email : true\n");
      out.write("                    },\n");
      out.write("                    txtPassword : {\n");
      out.write("                        required : true,\n");
      out.write("                        hardpass : true\n");
      out.write("                    },\n");
      out.write("                    txtDni : {\n");
      out.write("                        required : true,\n");
      out.write("                        digits : true,\n");
      out.write("                        accept: \"[0-9]+\",\n");
      out.write("                        rangelength : [8,8]\n");
      out.write("                    },\n");
      out.write("                    txtNombre:{\n");
      out.write("                        required : true,\n");
      out.write("                        accept: \"[a-zA-Z]+\"\n");
      out.write("                    },\n");
      out.write("                    txtApellido:{\n");
      out.write("                        required : true,\n");
      out.write("                        accept: \"[a-zA-Z]+\"\n");
      out.write("                    }\n");
      out.write("                },\n");
      out.write("                messages: {\n");
      out.write("                    txtUsuario : {\n");
      out.write("                      required : \"Ingrese su correo corporativo\"  \n");
      out.write("                    },\n");
      out.write("                    txtPassword:{\n");
      out.write("                        hardpass : \"Ingrese una contraseña considerando letras y numeros\"\n");
      out.write("                    },\n");
      out.write("                    txtDni:{\n");
      out.write("                        required : \"Ingrese el Dni del usuario\",\n");
      out.write("                        digits : \"Ingrese solo numeros\",\n");
      out.write("                        rangelength : \"Ingrese 8 numeros\"\n");
      out.write("                    },\n");
      out.write("                    txtNombre:{\n");
      out.write("                        required : \"Ingrese el Nombre del usuario\",\n");
      out.write("                        accept : \"Ingrese solo letras\"\n");
      out.write("                    },\n");
      out.write("                    txtApellido:{\n");
      out.write("                        required : \"Ingrese el Apellido del usuario\",\n");
      out.write("                        accept : \"Ingrese solo letras\"\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            $(document).ready(function(){\n");
      out.write("                //Esto se ejecuta cuando la pagina esta LISTA.\n");
      out.write("                $(\"#btnGrabarAJAX\").click(function(){\n");
      out.write("                    var frm = $(\"frmUserCreate\");\n");
      out.write("                    if(!frm.valid()){\n");
      out.write("                        return;\n");
      out.write("                    }\n");
      out.write("                    //Esto se ejecuta cuando alguien hace CLick en btnGrabarAJAX\n");
      out.write("                    if(confirm(\"¿Esta seguro que desea crear un Usuario?\")){\n");
      out.write("                        var nombreUsuario = $(\"#txtUsuario\").val();\n");
      out.write("                        var password = document.getElementById(\"txtPassword\").value;\n");
      out.write("                        \n");
      out.write("                        if(nombreUsuario == \"\"){\n");
      out.write("                            alert(\"Debe ingresar el nombre del usuario\");\n");
      out.write("                            return;//AQUI SE QUEDA Y NO EJECUTA MAS CODIGO\n");
      out.write("                        }\n");
      out.write("                        \n");
      out.write("                        if(password == \"\"){\n");
      out.write("                            alert(\"Debe ingresar una contraseña\");\n");
      out.write("                            return;\n");
      out.write("                        }\n");
      out.write("                        \n");
      out.write("                        var url = \"/WebApp03/UserCreateAjax?user=\" + nombreUsuario + \"&pass=\" + password;\n");
      out.write("                        $.get(url, function(data) {\n");
      out.write("                            alert(data);\n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("                });               \n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write('\n');
      out.write('\n');
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
