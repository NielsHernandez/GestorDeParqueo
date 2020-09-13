package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <title>Gestiones - Car</title>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <style>\n");
      out.write("        body,h1,h2,h3,h4,h5,h6 {font-family: \"Raleway\", sans-serif}\n");
      out.write("    </style>\n");
      out.write("    <body class=\"w3-light-grey w3-content\" style=\"max-width:1600px\">\n");
      out.write("\n");
      out.write("        <!-- Sidebar/menu -->\n");
      out.write("        <nav class=\"w3-sidebar w3-collapse w3-white w3-animate-left\" style=\"z-index:3;width:300px;\" id=\"mySidebar\"><br>\n");
      out.write("            <div class=\"w3-container\">\n");
      out.write("                <a href=\"#\" onclick=\"w3_close()\" class=\"w3-hide-large w3-right w3-jumbo w3-padding w3-hover-grey\" title=\"close menu\">\n");
      out.write("                    <i class=\"fa fa-remove\"></i>\n");
      out.write("                </a>\n");
      out.write("                <img src=\"img/logo1.png\" style=\"width:45%;\" class=\"w3-round\"><br><br>\n");
      out.write("                <h4><b>Sistema de Parqueos</b></h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"w3-bar-block\">\n");
      out.write("                <a href=\"\" onclick=\"w3_close()\" class=\"w3-bar-item w3-button w3-padding w3-text-teal\"><i class=\"fa fa-th-large fa-fw w3-margin-right\"></i>GESTIONES</a> \n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <!-- Overlay effect when opening sidebar on small screens -->\n");
      out.write("        <div class=\"w3-overlay w3-hide-large w3-animate-opacity\" onclick=\"w3_close()\" style=\"cursor:pointer\" title=\"close side menu\" id=\"myOverlay\"></div>\n");
      out.write("\n");
      out.write("        <!-- !PAGE CONTENT! -->\n");
      out.write("        <div class=\"w3-main\" style=\"margin-left:300px\">\n");
      out.write("\n");
      out.write("            <!-- Header -->\n");
      out.write("            <header id=\"portfolio\">\n");
      out.write("                <a href=\"#\"><img src=\"img/logo1.png\" style=\"width:65px;\" class=\"w3-circle w3-right w3-margin w3-hide-large w3-hover-opacity\"></a>\n");
      out.write("                <span class=\"w3-button w3-hide-large w3-xxlarge w3-hover-text-grey\" onclick=\"w3_open()\"><i class=\"fa fa-bars\"></i></span>\n");
      out.write("                <div class=\"w3-container\">\n");
      out.write("                    <h1><b>Sistema de Parqueos</b></h1>\n");
      out.write("                    <div class=\"w3-section w3-bottombar w3-padding-16\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <!-- First Photo Grid-->\n");
      out.write("            <div class=\"w3-row-padding\">\n");
      out.write("                <div class=\"w3-third w3-container w3-margin-bottom\">\n");
      out.write("                    <a href=\"registrar_auto.jsp\"><img src=\"img/fondo.png\" alt=\"Registrar Vehiculo\" style=\"width:100%\" class=\"w3-hover-opacity\"></a>\n");
      out.write("                    <div class=\"w3-container w3-white\">\n");
      out.write("                        <p><b>Registrar Vehiculo</b></p>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"w3-third w3-container w3-margin-bottom\">\n");
      out.write("                    <a href=\"registrar_nivel.jsp\"><img src=\"img/fondo.png\" alt=\"Registrar Nivel\" style=\"width:100%\" class=\"w3-hover-opacity\"></a>\n");
      out.write("                    <div class=\"w3-container w3-white\">\n");
      out.write("                        <p><b>Registrar Nivel</b></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"w3-third w3-container w3-margin-bottom\">\n");
      out.write("                    <a href=\"registrar_nomina.jsp\"><img src=\"img/fondo.png\" alt=\"Registrar Nivel\" style=\"width:100%\" class=\"w3-hover-opacity\"></a>\n");
      out.write("                    <div class=\"w3-container w3-white\">\n");
      out.write("                        <p><b>Registrar Nomina</b></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Second Photo Grid-->\n");
      out.write("            <div class=\"w3-row-padding\">\n");
      out.write("\n");
      out.write("                <div class=\"w3-third w3-container w3-margin-bottom\">\n");
      out.write("                    <a href=\"registro_empleado.jsp\"><img src=\"img/fondo.png\" alt=\"Registrar Nivel\" style=\"width:100%\" class=\"w3-hover-opacity\"></a>\n");
      out.write("                    <div class=\"w3-container w3-white\">\n");
      out.write("                        <p><b>Registrar Empleado</b></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"w3-third w3-container w3-margin-bottom\">\n");
      out.write("                    <a href=\"simular_entrada.jsp\"><img src=\"img/fondo.png\" alt=\"Registrar Nivel\" style=\"width:100%\" class=\"w3-hover-opacity\"></a>\n");
      out.write("                    <div class=\"w3-container w3-white\">\n");
      out.write("                        <p><b>Simular Entrada Vehiculo</b></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"w3-third w3-container\">\n");
      out.write("                    <a href=\"reportes.jsp\"><img src=\"img/fondo.png\" alt=\"Norway\" style=\"width:100%\" class=\"w3-hover-opacity\"></a>\n");
      out.write("                    <div class=\"w3-container w3-white\">\n");
      out.write("                        <p><b>Reportes del sistema</b></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- third Photo Grid-->\n");
      out.write("            <div class=\"w3-row-padding\">\n");
      out.write("\n");
      out.write("                <div class=\"w3-third w3-container w3-margin-bottom\">\n");
      out.write("                    <a href=\"pago.jsp\"><img src=\"img/fondo.png\" alt=\"Registrar Nivel\" style=\"width:100%\" class=\"w3-hover-opacity\"></a>\n");
      out.write("                    <div class=\"w3-container w3-white\">\n");
      out.write("                        <p><b>Realizar pagos</b></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"w3-third w3-container w3-margin-bottom\">\n");
      out.write("                    <a href=\"simular_salida.jsp\"><img src=\"img/fondo.png\" alt=\"Registrar Nivel\" style=\"width:100%\" class=\"w3-hover-opacity\"></a>\n");
      out.write("                    <div class=\"w3-container w3-white\">\n");
      out.write("                        <p><b>Simular Salida Vehiculo</b></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("                // Script to open and close sidebar\n");
      out.write("                function w3_open() {\n");
      out.write("                    document.getElementById(\"mySidebar\").style.display = \"block\";\n");
      out.write("                    document.getElementById(\"myOverlay\").style.display = \"block\";\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                function w3_close() {\n");
      out.write("                    document.getElementById(\"mySidebar\").style.display = \"none\";\n");
      out.write("                    document.getElementById(\"myOverlay\").style.display = \"none\";\n");
      out.write("                }\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
