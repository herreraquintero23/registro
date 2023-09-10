<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="HelloServlet" method="POST">
    <table>
        <tr>
            <td>NIT de tu empresa</td><td><label>
            <input type="text" placeholder="NIT de tu empresa" name="nit"/>
        </label></td>
        </tr>
        <tr>
            <td>nombre de la empresa</td><td><label>
            <input type="text" placeholder="nombre de la empresa" name="nombre"/>
        </label></td>
        </tr>
        <tr>
            <td>Direccion de correo electronico</td><td><label>
            <input type="text" placeholder="Direccion de correo electronico" name="direccion"/>
        </label></td>
        </tr>
        <tr>
            <td>Confirmar direccion de correo electronico</td><td><label>
            <input type="text" placeholder="Confirmar direccion de correo electronico" name="confirmar_dir"/>
        </label></td>
        </tr>
        <tr>
            <td>Numero de telefono</td><td><label>
            <input type="text" placeholder="Numero de telefono" name="numero"/>
        </label></td>
        </tr>
        <tr>
            <td>Contraseña</td><td><label>
            <input type="text" placeholder="Contraseña" name="contraseña"/>
        </label></td>
        </tr>
        <tr>
            <td>confirmar contraseña</td><td><label>
            <input type="text" placeholder="confirmar contraseña" name="confirmar_C"/>
        </label></td>
        </tr>
        <tr>
            <td>Qué servicio presta la empresa</td><td><label>
            <input type="text" placeholder="Qué servicio presta la empresa" name="servicio"/>
        </label></td>
        </tr>
        <tr>
            <td><button type="submit">Registrarse</button></td>
        </tr>
    </table>
</form>
<br/>
</body>
</html>