<%@page import="java.sql.ResultSet"%>
<%@page import="dbmodelo.Conexion"%>
<!DOCTYPE html>
<html>
    <title>Asignar nivel</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        body,h1,h2,h3,h4,h5,h6 {font-family: "Raleway", sans-serif}
    </style>
    <body class="w3-light-grey w3-content" style="max-width:1600px">

        <!-- Sidebar/menu -->
        <nav class="w3-sidebar w3-collapse w3-white w3-animate-left" style="z-index:3;width:300px;" id="mySidebar"><br>
            <div class="w3-container">
                <a href="#" onclick="w3_close()" class="w3-hide-large w3-right w3-jumbo w3-padding w3-hover-grey" title="close menu">
                    <i class="fa fa-remove"></i>
                </a>
                <img src="img/logo1.png" style="width:45%;" class="w3-round"><br><br>
                <h4><b>Sistema de Parqueos</b></h4>
            </div>
            <div class="w3-bar-block">
                <a href="" onclick="w3_close()" class="w3-bar-item w3-button w3-padding w3-text-teal"><i class="fa fa-th-large fa-fw w3-margin-right"></i>GESTIONES</a> 


            </div>

        </nav>

        <!-- Overlay effect when opening sidebar on small screens -->
        <div class="w3-overlay w3-hide-large w3-animate-opacity" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

        <!-- !PAGE CONTENT! -->
        <div class="w3-main" style="margin-left:300px">

            <!-- Header -->
            <header id="portfolio">
                <a href="#"><img src="img/logo1.png" style="width:65px;" class="w3-circle w3-right w3-margin w3-hide-large w3-hover-opacity"></a>
                <span class="w3-button w3-hide-large w3-xxlarge w3-hover-text-grey" onclick="w3_open()"><i class="fa fa-bars"></i></span>
                <div class="w3-container">

                    <h1><b>Sistema de Parqueos</b></h1>
                    <div class="w3-section w3-bottombar w3-padding-16">

                    </div>
                </div>

            </header>

            <!-- First Photo Grid-->
            <div class="w3-row-padding">
                <!-- formulario agregar vehiculo -->
                <form action="controlador" method="GET" class="w3-container  w3-light-grey w3-text-green w3-margin">
                    <h2 class="w3-center">Asignar Nivel (Empleado)</h2>
                    <input type="hidden" name="peticion" value="asignar_equipo"/>
                    
                    <div class="w3-row w3-section">
                        <label class="w3-text-gray"><b>Nivel: </b></label>
                        <div class="w3-col" style="width:50px"></div>
                        <div class="w3-rest">
                            <select class="w3-select w3-border" name="nivel_asignar">
                                <option value="" disabled selected>Selecionar Nivel a asignar</option>
                                <!-- get data from the db -->
                                <% Conexion con = new Conexion(); %>
                                
                                <%
                                    ResultSet datos = con.getTablaData("nivel");
                                    while (datos.next()) {

                                        out.print("<option value=\"" + datos.getString("Id_nivel") + "\">" + datos.getString("Id_nivel") + " - " + datos.getString("Nombre") + "</option>");
                                    };
                                %>

                               
                                
                                <!-- get data from the db -->
                            </select>
                        </div>
                    </div>
                    
                    <div class="w3-row w3-section">
                        <label class="w3-text-gray"><b>Empleado: </b></label>
                        <div class="w3-col" style="width:50px"></div>
                        <div class="w3-rest">
                            <select class="w3-select w3-border" name="empleado_asignar">
                                <option value="" disabled selected>Selecionar Empleado a asignar</option>
                                <!-- get data from the db -->
                                
                                 <%
                                    ResultSet datosEmpleado = con.getTablaData("empleado");
                                    while (datosEmpleado.next()) {

                                        out.print("<option value=\"" + datosEmpleado.getString("Id_empleado") + "\">" + datosEmpleado.getString("Id_empleado") + " - " + datosEmpleado.getString("Nombre") + " - " + datosEmpleado.getString("Puesto") +"</option>");
                                    };
                                %>
                                
                                <!-- get data from the db -->
                            </select>
                        </div>
                    </div>




                    <div class="w3-row w3-section">
                        <label class="w3-text-gray"><b>Area: </b></label>
                        <div class="w3-col" style="width:50px"></div>
                        <div class="w3-rest">
                            <select class="w3-select w3-border" name="area">
                                <option value="" disabled selected>Selecionar Area a asignar</option>
                                <option value="Limpieza">Limpieza</option>
                                <option value="Seguridad">Seguridad</option>
                                <option value="Mantenimiento">Mantenimiento</option>
                                <option value="Administracion">Administracion</option>
                            </select>
                        </div>
                    </div>






                    <button class="w3-button w3-block w3-section w3-green w3-ripple w3-padding">Guardar</button>

                </form>



            </div>




            <script>
                // Script to open and close sidebar
                function w3_open() {
                    document.getElementById("mySidebar").style.display = "block";
                    document.getElementById("myOverlay").style.display = "block";
                }

                function w3_close() {
                    document.getElementById("mySidebar").style.display = "none";
                    document.getElementById("myOverlay").style.display = "none";
                }
            </script>

    </body>
</html>

