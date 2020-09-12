<!DOCTYPE html>
<html>
<title>Reportes</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
html,body,h1,h2,h3,h4,h5 {font-family: "Raleway", sans-serif}
</style>
<body class="w3-light-grey">

<!-- Top container -->


<!-- !PAGE CONTENT! -->
<div class="w3-main" style="margin-left:30px;margin-top:43px;">


  <div class="w3-row-padding w3-margin-bottom">
    <div class="w3-quarter">
      <div class="w3-container w3-red w3-padding-16">
        <div class="w3-left"><i class="fa fa-car w3-xxxlarge"></i></div>
        <div class="w3-right">
          <h3>1500</h3>
        </div>
        <div class="w3-clear"></div>
        <h4>Ocupados</h4>
      </div>
    </div>
    <div class="w3-quarter">
      <div class="w3-container w3-green w3-padding-16">
        <div class="w3-left"><i class="fa fa-car w3-xxxlarge"></i></div>
        <div class="w3-right">
          <h3>1500</h3>
        </div>
        <div class="w3-clear"></div>
        <h4>Libres</h4>
      </div>
    </div>
    <div class="w3-quarter">
      <div class="w3-container w3-teal w3-padding-16">
        <div class="w3-left"><i class="fa fa-building w3-xxxlarge"></i></div>
        <div class="w3-right">
          <h3>3</h3>
        </div>
        <div class="w3-clear"></div>
        <h4>Niveles</h4>
      </div>
    </div>
    <div class="w3-quarter">
      <div class="w3-container w3-orange w3-text-white w3-padding-16">
        <div class="w3-left"><i class="fa fa-users w3-xxxlarge"></i></div>
        <div class="w3-right">
          <h3>50</h3>
        </div>
        <div class="w3-clear"></div>
        <h4>Empleados</h4>
      </div>
    </div>
  </div>

  <div class="w3-panel">
    <div class="w3-row-padding" style="margin:0">
      
      <div class="w3-twothird">
        <h5>Ganacia y Perdida</h5>
        <table class="w3-table w3-striped w3-white">
        
          <tr>
            <td><i class="fa fa-car w3-text-blue w3-large"></i></td>
            <td>Ganancia de hoy</td>
            <td><i>Q 150000</i></td>
          </tr>
          
          <tr>
            <td><i class="fa fa-car w3-text-red w3-large"></i></td>
            <td>Perdida de hoy</td>
            <td><i>Q 15000</i></td>
          </tr>
          
          
           <tr>
            <td><i class="fa fa-car w3-text-blue w3-large"></i></td>
            <td>Ganancia del mes</td>
            <td><i>Q 4,500,000</i></td>
          </tr>
          
          <tr>
            <td><i class="fa fa-car w3-text-red w3-large"></i></td>
            <td>Perdida del mes</td>
            <td><i>Q 4,500,000</i></td>
          </tr>
          
           <tr>
            <td><i class="fa fa-car w3-text-blue w3-large"></i></td>
            <td>Ganancia del trimestre</td>
            <td><i>Q 13,500,000</i></td>
          </tr>
          
          <tr>
            <td><i class="fa fa-car w3-text-red w3-large"></i></td>
            <td>Perdida del trimestre</td>
            <td><i>Q 4,555,000</i></td>
          </tr>
          
            <tr>
            <td><i class="fa fa-car w3-text-blue w3-large"></i></td>
            <td>Ganancia Anual</td>
            <td><i>Q 108,000,000</i></td>
          </tr>
          
          <tr>
            <td><i class="fa fa-car w3-text-red w3-large"></i></td>
            <td>Perdida Anual</td>
            <td><i>Q 54,000,000</i></td>
          </tr>
          
          
         
          <tr>
            <td><i class="fa fa-users w3-text-yellow w3-large"></i></td>
             <td>Costo del personal mensual</td>
            <td><i>Q 155,000</i></td>
          </tr>
        
        </table>
      </div>
      
    </div>
  </div>
  
  <hr>
  


  



  <!-- End page content -->
</div>

<script>
// Get the Sidebar
var mySidebar = document.getElementById("mySidebar");

// Get the DIV with overlay effect
var overlayBg = document.getElementById("myOverlay");

// Toggle between showing and hiding the sidebar, and add overlay effect
function w3_open() {
  if (mySidebar.style.display === 'block') {
    mySidebar.style.display = 'none';
    overlayBg.style.display = "none";
  } else {
    mySidebar.style.display = 'block';
    overlayBg.style.display = "block";
  }
}

// Close the sidebar with the close button
function w3_close() {
  mySidebar.style.display = "none";
  overlayBg.style.display = "none";
}
</script>

</body>
</html>
