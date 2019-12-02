<%-- 
    Document   : Admin
    Created on : 26/11/2019, 01:11:22 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ADMIN</h1>
        <form action="nuevaciudad" method="post">
        <label>idCiudad</label>
        <input type="text" name="idciudad"/><br>
        <label>Ciudad</label>
        <input type="text" name="ciudad"/><br>
        <input type="submit" value="Alta"/><br>
        </form>
        <hr>
        <h1>TIEMPO:</h1>
        <form action="nuevoTiempo" method="post">
            <label>IDTiempo</label>
        <input type="text" name="idtiempo"/><br>
        <label>Ciudad</label>
        <select name="ciudad">
            <option value="i">text</option>
        </select><br>
        <label>Fecha_Inicio</label>
        <input type="text" name="inicio"/><br>
        <label>Fecha_Fin</label>
        <input type="text" name="fin"/><br>
        <label>Temp_Max</label>
        <select name="tempmax">
            <option value="i">text</option>
        </select><br>
        <label>Temp_Min</label>
        <select name="tempmin">
            <option value="i">text</option>
        </select><br>
        <label>Meteorologia</label>
        <select name="estado">
            <option value="i">text</option>
        </select><br>
        <input type="submit" value="Alta"/><br>
        </form>
    </body>
</html>
