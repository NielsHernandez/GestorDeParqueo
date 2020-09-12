package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Inicio</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Pagina inicio</h1>\n");
      out.write("        <form action=\"\" class=\"w3-container w3-card-4 w3-light-grey w3-text-blue w3-margin\">\n");
      out.write("<h2 class=\"w3-center\">Registro Vehiculo</h2>\n");
      out.write(" \n");
      out.write("<div class=\"w3-row w3-section\">\n");
      out.write("  <div class=\"w3-col\" style=\"width:50px\"><i class=\"w3-xxlarge fa fa-user\"></i></div>\n");
      out.write("    <div class=\"w3-rest\">\n");
      out.write("      <input class=\"w3-input w3-border\" name=\"placa\" type=\"text\" placeholder=\"placa\">\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"w3-row w3-section\">\n");
      out.write("  <div class=\"w3-col\" style=\"width:50px\"><i class=\"w3-xxlarge fa fa-color\"></i></div>\n");
      out.write("    <div class=\"w3-rest\">\n");
      out.write("      <select class=\"w3-select w3-border\" name=\"marca\">\n");
      out.write("    <option value=\"\" disabled selected>Selecione la Marca</option>\n");
      out.write("    <option value=\"Toyota\">Toyota</option>\n");
      out.write("    <option value=\"Honda\">Honda</option>\n");
      out.write("    <option value=\"Mazda\">Mazda</option>\n");
      out.write("    <option value=\"Kia\">Kia</option>\n");
      out.write("    <option value=\"Chevy\">Chevy</option>\n");
      out.write("  </select>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"w3-row w3-section\">\n");
      out.write("  <div class=\"w3-col\" style=\"width:50px\"><i class=\"w3-xxlarge fa fa-color\"></i></div>\n");
      out.write("    <div class=\"w3-rest\">\n");
      out.write("      <select class=\"w3-select w3-border\" name=\"color\">\n");
      out.write("    <option value=\"\" disabled selected>Selecione el color</option>\n");
      out.write("    <option value=\"Negro\">Negro</option>\n");
      out.write("    <option value=\"Azul\">Azul</option>\n");
      out.write("    <option value=\"Rojo\">Rojo</option>\n");
      out.write("    <option value=\"Blanco\">Blanco</option>\n");
      out.write("  </select>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"w3-row w3-section\">\n");
      out.write("  <div class=\"w3-col\" style=\"width:50px\"><i class=\"w3-xxlarge fa fa-car\"></i></div>\n");
      out.write("    <div class=\"w3-rest\">\n");
      out.write("      <select class=\"w3-select w3-border\" name=\"tipo\">\n");
      out.write("    <option value=\"\" disabled selected>Selecione el tipo</option>\n");
      out.write("    <option value=\"Sedan\">Sedan</option>\n");
      out.write("    <option value=\"Camioneta\">Camioneta</option>\n");
      out.write("    <option value=\"Pick Up\">Pick Up</option>\n");
      out.write("  </select>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<button class=\"w3-button w3-block w3-section w3-blue w3-ripple w3-padding\">Ingresar</button>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("    </body>\n");
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
