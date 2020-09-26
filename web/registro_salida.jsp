<%@page import="java.sql.ResultSet"%>
<%@page import="dbmodelo.Conexion"%>
<!DOCTYPE html>
<html>
    <title>Torre Parqueo</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <body>
        <div class="w3-animate-zoom" style="width: 50%;margin: auto;">

            <%

                try {
                    String placa = "";
                    String marca = "";
                    String color = "";
                    String tipo = "";
                    String horaEntrada = "";
                    String Fecha = "";
                    String no_parqueo = "";
                    String nivel_parqueo = "";

                    Conexion miConexion = new Conexion();

                    String q = request.getParameter("placa").toString();

                    ResultSet temp = miConexion.resultados(q);
                   
                    
                    

                    if (temp != null) {
                        
                        while (temp.next()) {
                            
                            placa = temp.getString(1);
                            marca = temp.getString(2);
                            color = temp.getString(3);
                            tipo = temp.getString(4);

                        }
                        
                        ResultSet datosTemp = miConexion.getRegistroData(q);
                        
                        while(datosTemp.next()){
                        
                            no_parqueo = datosTemp.getString(4);
                            Fecha = datosTemp.getString(5);
                            horaEntrada = datosTemp.getString(6);
                            nivel_parqueo = datosTemp.getString(3);
                        }
                        
                        
            %>
            <form class="w3-container w3-card-4" action="controlador" method="GET">
                <input type="hidden" name="peticion" value="registro_salida"/>
                <br/>
               
                <h2 class="w3-text-blue">Detalles de la visita</h2>

                <p><label class="w3-text-gray"><b>No placa: <%=placa%> </b></label></p>
                <p><label class="w3-text-gray"><b>Marca: <%=marca%> </b></label></p>
                <p><label class="w3-text-gray"><b>Color: <%=color%> </b></label></p>
                <p><label class="w3-text-gray"><b>Tipo: <%=tipo%> </b></label></p>
                <p><label class="w3-text-gray"><b>Numero Parqueo: <%=no_parqueo%> </b></label></p>
                 <p><label class="w3-text-gray"><b>Nivel: <%=nivel_parqueo%> </b></label></p>
                <p><label class="w3-text-gray"><b>Fecha: <%=Fecha%> </b></label></p>
                <p><label class="w3-text-gray"><b>Hora de Entrada <%=horaEntrada%> </b></label></p>
                
               
               
              

                
                 <div class="w3-row w3-section">
                     <label class="w3-text-blue"><b>Hora de Salida: </b></label>
                        <div class="w3-col" style="width:50px"></div>
                        <div class="w3-rest">
                            <input class="w3-input w3-border" name="hora_salida" type="time"   placeholder="hora de entrada:">
                        </div>
                 </div>
                <input  name="hora_registro_entrada" type="hidden" value="<%=horaEntrada%>">
                <input  name="placa_registro_salida" type="hidden" value="<%=placa%>">
                 <input  name="nivel_parqueo_salida" type="hidden" value="<%=nivel_parqueo%>">

                <p><button class="w3-btn w3-blue">Continuar</button></p>
            </form>


            <%} else {
out.print("Vehiculo no encontrado"+q);

                    }

                } catch (Exception e) {

                }

            %>
        </div>

    </body>
</html> 