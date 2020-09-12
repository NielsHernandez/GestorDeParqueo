<%-- 
    Document   : inicio
    Created on : 8/09/2020, 03:15:40 PM
    Author     : niels
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <h1>Pagina inicio</h1>
        <form action="" class="w3-container w3-card-4 w3-light-grey w3-text-blue w3-margin">
<h2 class="w3-center">Registro Vehiculo</h2>
 
<div class="w3-row w3-section">
  <div class="w3-col" style="width:50px"><i class="w3-xxlarge fa fa-user"></i></div>
    <div class="w3-rest">
      <input class="w3-input w3-border" name="placa" type="text" placeholder="placa">
    </div>
</div>

<div class="w3-row w3-section">
  <div class="w3-col" style="width:50px"><i class="w3-xxlarge fa fa-color"></i></div>
    <div class="w3-rest">
      <select class="w3-select w3-border" name="marca">
    <option value="" disabled selected>Selecione la Marca</option>
    <option value="Toyota">Toyota</option>
    <option value="Honda">Honda</option>
    <option value="Mazda">Mazda</option>
    <option value="Kia">Kia</option>
    <option value="Chevy">Chevy</option>
  </select>
    </div>
</div>




<div class="w3-row w3-section">
  <div class="w3-col" style="width:50px"><i class="w3-xxlarge fa fa-color"></i></div>
    <div class="w3-rest">
      <select class="w3-select w3-border" name="color">
    <option value="" disabled selected>Selecione el color</option>
    <option value="Negro">Negro</option>
    <option value="Azul">Azul</option>
    <option value="Rojo">Rojo</option>
    <option value="Blanco">Blanco</option>
  </select>
    </div>
</div>


<div class="w3-row w3-section">
  <div class="w3-col" style="width:50px"><i class="w3-xxlarge fa fa-car"></i></div>
    <div class="w3-rest">
      <select class="w3-select w3-border" name="tipo">
    <option value="" disabled selected>Selecione el tipo</option>
    <option value="Sedan">Sedan</option>
    <option value="Camioneta">Camioneta</option>
    <option value="Pick Up">Pick Up</option>
  </select>
    </div>
</div>






<button class="w3-button w3-block w3-section w3-blue w3-ripple w3-padding">Ingresar</button>

</form>
    </body>
</html>
