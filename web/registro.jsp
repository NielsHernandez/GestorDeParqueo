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

    try{
  String placa="";
  String marca="";
  String color="";
  String tipo="";
  
Conexion miConexion = new Conexion();

String q = request.getParameter("placa").toString();

ResultSet temp = miConexion.resultados(q);

if(temp!=null)
{ while(temp.next())
            
            {
            placa=temp.getString(1);
            marca=temp.getString(2);
            color=temp.getString(3);
            tipo=temp.getString(4);
            
            }
%>
<form class="w3-container w3-card-4" action="controlador" method="GET">
     <input type="hidden" name="peticion" value="registro"/>
    <br/>
<img src="img/parqueo.jpg" class="w3-round-xxlarge" style="width:100%">
  <h2 class="w3-text-blue">Vehiculo validado</h2>
  
  <p><label class="w3-text-blue"><b>No placa: </b></label><input class="w3-input w3-border" name="placa" type="text" value="<%=placa%>"></p>
  <p><label class="w3-text-blue"><b>Marca: </b></label><input class="w3-input w3-border" name="placa" type="text" value="<%=marca%>"></p>
  <p><label class="w3-text-blue"><b>Color: </b></label><input class="w3-input w3-border" name="placa" type="text" value="<%=color%>"></p>
  <p><label class="w3-text-blue"><b>Tipo: </b></label><input class="w3-input w3-border" name="placa" type="text" value="<%=tipo%>"></p>
  
  <div class="w3-row w3-section">
  <div class="w3-col" style="width:50px"></div>
    <div class="w3-rest">
      <select class="w3-select w3-border" name="nivel">
    <option value="" disabled selected>Selecionar id nivel</option>
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
  </select>
    </div>
</div>
  
   <p><label class="w3-text-blue"><b>Numero de parqueo: </b></label><input class="w3-input w3-border" name="numero" type="number"></p>

  <p><button class="w3-btn w3-blue">Ingresar</button></p>
</form>
        
    
<%}
else
{
    
}





    }
    catch(Exception e)
    {
        
    }

%>
   </div>

</body>
</html> 