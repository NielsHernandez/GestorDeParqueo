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
            %>
            <form class="w3-container w3-card-4" action="controlador" method="GET">
                <input type="hidden" name="peticion" value="registro"/>
                <br/>
                <img src="img/parqueo.jpg" class="w3-round-xxlarge" style="width:100%">
                <h2 class="w3-text-blue">Vehiculo validado</h2>

                <p><label class="w3-text-blue"><b>No placa: </b></label><input class="w3-input w3-border" name="placa_registro" type="text" value="<%=placa%>"></p>
                <p><label class="w3-text-blue"><b>Marca: </b></label><input class="w3-input w3-border" name="1" type="text" value="<%=marca%>" disabled></p>
                <p><label class="w3-text-blue"><b>Color: </b></label><input class="w3-input w3-border" name="2" type="text" value="<%=color%>" disabled></p>
                <p><label class="w3-text-blue"><b>Tipo: </b></label><input class="w3-input w3-border" name="3" type="text" value="<%=tipo%>" disabled></p>

                <div class="w3-row w3-section">
                    <label class="w3-text-blue"><b>Nivel: </b></label>
                    <div class="w3-col" style="width:50px"></div>
                    <div class="w3-rest">
                        <select class="w3-select w3-border" name="nivel_registro">
                            <option value="" disabled selected>Selecionar id nivel</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                        </select>
                    </div>
                </div>

                <div class="w3-row w3-section">
                    <label class="w3-text-blue"><b>No parqueo: </b></label>
                    <div class="w3-col" style="width:50px"></div>
                    <div class="w3-rest">
                        <input class="w3-input w3-border" name="no_parqueo" type="text" placeholder="Numero de parquo">
                    </div>
                </div>
                
                <div class="w3-row w3-section">
                    <label class="w3-text-blue"><b>Fecha: </b></label>
                        <div class="w3-col" style="width:50px"></div>
                        <div class="w3-rest">
                            <input class="w3-input w3-border" name="fecha_registro" type="date"  data-date-format="YYYY MM DD" placeholder="Fecha">
                        </div>
                    </div>
                
                 <div class="w3-row w3-section">
                     <label class="w3-text-blue"><b>Hora de Entrada: </b></label>
                        <div class="w3-col" style="width:50px"></div>
                        <div class="w3-rest">
                            <input class="w3-input w3-border" name="hora_entrada" type="time"   placeholder="hora de entrada:">
                        </div>
                    </div>
                
                
                        <input type="hidden" name="estado" value="ocupado">
                

                <p><button class="w3-btn w3-blue">Ingresar</button></p>
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