<%-- 
    Document   : UserList
    Created on : 29/09/2018, 19:14:46 PM
    Author     : ALEX
--%>

<%@page import="Models.UserModel"%>
<%@page import="Repository.UserRepository"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Usuario Seleccionado</h1>
        <%
            int codigoUsuario = Integer.parseInt(request.getParameter("codigo"));
            UserRepository userRepo = new UserRepository(); 
            UserModel usuarioSeleccionado = userRepo.GetUserById(codigoUsuario);
        %>
        
        <label>Codigo:</label> 
        <input readonly="readonly" type="text" value="<%= usuarioSeleccionado.getUserId() %>"  />
        <label>Nombre usuario:</label> 
        <input type="text" value="<%= usuarioSeleccionado.getUserName()%>"  />
        <label>Password:</label> 
        <input type="password" value="<%= usuarioSeleccionado.getUserPassword()%>"  />        
        <label>Dni:</label> 
        <input type="text" value="<%= usuarioSeleccionado.getDni()%>"  />        
        <label>Nombre:</label> 
        <input type="text" value="<%= usuarioSeleccionado.getNombre()%>"  />        
        <label>Apellido:</label> 
        <input type="text" value="<%= usuarioSeleccionado.getApelli()%>"  />        
        
        <button>Editar</button>
    </body>
</html>
