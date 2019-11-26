<%-- 
    Document   : index
    Created on : 25/11/2019, 10:14:37 PM
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
        <h1>Hello World!</h1>
        <input type="button" onClick="window.location='AltaUsuario.jsp'" value="Registrarme" /><br>
        <label>Nombre</label>
        <input type="text" name="usuario"/><br>
        <label>Contraseña</label>
        <input type="password" name="pass"/><br>
        <input type="submit" value="Login"/><br>
        <hr>
        <label>Ciudad</label>
        <select name="ciudad">

            <option value="i">text</option>

        </select><br>
        <label>Fecha</label>
        <input type="date" name="fecha"/><br>
        <table>
            <tr>
                <td rowspan="2">
                    <img src="estrella-svg.svg" alt="Estrella SVG">

                </td>
                <td colspan="2">Ciudad</td>
                <td colspan="2">Fecha</td>
            </tr>
            <tr>
                <td>Temp_min</td>
                <td>20</td>
                <td>Temp_max</td>
                <td>30</td>
            </tr>
        </table>

    </body>
</html>
