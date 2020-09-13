package dbmodelo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author niels
 */
public class controlador extends HttpServlet {

    private String peticion;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet controlador</title>");
            out.println("</head>");
            out.println("<body>");
            try {
                peticion = request.getParameter("peticion").toString();
                Conexion con = new Conexion();

                switch (peticion) {
                    case "vehiculo":
                        String placa = request.getParameter("placa").toString();
                        String marca = request.getParameter("marca").toString();
                        String color = request.getParameter("color").toString();
                        String tipo = request.getParameter("tipo").toString();
                        con.agregar("INSERT INTO vehiculo (No_placa, Marca, Color, Tipo) VALUES ('" + placa + "', '" + marca + "', '" + color + "', '" + tipo + "');");
                        out.println("<h2>Insertado registro en la tabla vehiculo");
                        break;
                    case "nivel":
                         String id_nivel = request.getParameter("id_nivel").toString();
                         String tarifa = request.getParameter("tarifa").toString();
                         String nombre_nivel = request.getParameter("nombre_nivel").toString();
                         String capacidad = request.getParameter("capacidad").toString();
                         con.agregar("INSERT INTO nivel (Id_nivel, Tarifa, Nombre, Capacidad) VALUES ('" + id_nivel + "', '" + tarifa + "', '" + nombre_nivel + "', '" + capacidad + "');");
                         out.println("<h2>Insertado registro en la tabla nivel");
                        break;
                    case "nomina":
                         String no_nomina = request.getParameter("no_nomina").toString();
                         String fecha_nomina = request.getParameter("fecha_nomina").toString();
                         String saldo = request.getParameter("saldo").toString();
                         con.agregar("INSERT INTO nomina (Id_nomina, Fecha, Saldo) VALUES ('" + no_nomina + "', '" + fecha_nomina + "', '" + saldo + "');");
                         out.println("<h2>Insertado registro en la tabla nomina");
                        break;
                        
                    case "empleado":
                        String id_empleado = request.getParameter("id_empleado").toString();
                        String nombre = request.getParameter("nombre").toString();
                        String apellido = request.getParameter("apellido").toString();
                        String puesto = request.getParameter("puesto").toString();
                        String jefe = request.getParameter("jefe").toString();
                        String salario = request.getParameter("salario").toString();
                        con.agregar("INSERT INTO empleado (Id_empleado, Nombre, Apellido, Puesto, Jefe, Salario) VALUES ('"+id_empleado+"', '"+nombre+"', '"+apellido+"', '"+puesto+"', '"+jefe+"', '"+salario+"');");
                        out.println("<h2>Insertado registro en la tabla empleado");
                        
                        break;
                }

            } catch (Exception e) {

                out.print(e.getMessage().toString());

            }
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
