<%-- 
    Document   : UserList
    Created on : 29/09/2018, 19:14:46 PM
    Author     : ALEX
--%>

<%@page import="Models.UserModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Repository.UserRepository"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

 <%@include file="Header.jsp" %>

        <% 
            UserRepository userRepo = new UserRepository(); 
            ArrayList<UserModel> list = userRepo.GetListUsers();
        %>
        
        <table class="table">
            <thead>
                <tr>
                    <th>Codigo</th>
                    <th>Nombre</th>
                    <th>Password</th>
                    <th>Dni</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>&nbsp;</th>
                </tr>
            </thead>
            <tbody>
                <% 
                for (int i = 0; i < list.size(); i++) {
                %>
                    <tr>
                        <td><%=list.get(i).getUserId()%></td>
                        <td><%=list.get(i).getUserName()%></td>
                        <td><%=list.get(i).getDni()%></td>
                        <td><%=list.get(i).getNombre()%></td>
                        <td><%=list.get(i).getApelli()%></td>
                        <td><a class="btn btn-info" href="UserDetail.jsp?codigo=<%=list.get(i).getUserId()%>">Ver Detalle</a></td>
                    </tr>
                <%
                }
                %>
                
            </tbody>
        </table>
        <a class="btn btn-primary" href="UserCreate">Crear nuevo usuario</a>
        
 <%@include file="Footer.jsp" %>

