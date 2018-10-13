<%-- 
    Document   : UserList
    Created on : 29/09/2018, 19:14:46 PM
    Author     : ALEX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Header.jsp" %>

        <h1>Crear Usuario</h1>
        
        <form id="frmUserCreate" method="POST" action="UserCreate">
            
            <div class="row">
                <div class="col-md-4">
                    <label>Usuario:</label>
                    <input class="form-control" type="text" placeholder="Ingrese el nombre de usuario" 
                           id="txtUsuario" name="txtUsuario" /><!-- required.- valida que el campo sea requerido -->                
                </div>
            </div>
               
            <div class="row">
                <div class="col-md-4">
                    <label>Password:</label>
                    <input class="form-control" type="password" placeholder="Ingrese el password de usuario" 
                           id="txtPassword" name="txtPassword" />
                </div>
            </div>
            
            <div class="row">
                <div class="col-md-4">
                    <label>DNI:</label>
                    <input class="form-control" type="text" placeholder="Ingrese el DNI" 
                           id="txtDni" name="txtDni" /><!-- required.- valida que el campo sea requerido -->                
                </div>
            </div>
            
            <div class="row">
                <div class="col-md-4">
                    <label>Nombre:</label>
                    <input class="form-control" type="text" placeholder="Ingrese el Nombre" 
                           id="txtNombre" name="txtNombre" /><!-- required.- valida que el campo sea requerido -->                
                </div>
            </div>
            
            <div class="row">
                <div class="col-md-4">
                    <label>Apellido:</label>
                    <input class="form-control" type="text" placeholder="Ingrese el Apellido" 
                           id="txtApellido" name="txtApellido" /><!-- required.- valida que el campo sea requerido -->                
                </div>
            </div>
            
            <div class="row">
                <div class="col-md-12">
                    <input class="btn btn-primary" type="submit" value="Grabar" />
                    <input class="btn btn-success" type="button" id="btnGrabarAJAX" value="Grabar Ajax" />
                    <a class="btn btn-warning" href="UserList.jsp">Ir a Listado</a>
                </div>
            </div>
        </form>
        
        <script>
            $.validator.addMethod("hardpass", function(value) {
                return /^[A-Za-z0-9\d=!\-@._*]*$/.test(value) // consists of only these
                    && /[a-z]/.test(value) // has a lowercase letter
                    && /\d/.test(value) // has a digit
             });
            
            $.validator.addMethod("accept", function(value, element, param) {
                return value.match(new RegExp("." + param + "$"));
              });
            
            $("#frmUserCreate").validate({
                rules:{
                    txtUsuario : {
                        required : true,
                        email : true
                    },
                    txtPassword : {
                        required : true,
                        hardpass : true
                    },
                    txtDni : {
                        required : true,
                        digits : true,
                        accept: "[0-9]+",
                        rangelength : [8,8]
                    },
                    txtNombre:{
                        required : true,
                        accept: "[a-zA-Z]+"
                    },
                    txtApellido:{
                        required : true,
                        accept: "[a-zA-Z]+"
                    }
                },
                messages: {
                    txtUsuario : {
                      required : "Ingrese su correo corporativo"  
                    },
                    txtPassword:{
                        hardpass : "Ingrese una contraseña considerando letras y numeros"
                    },
                    txtDni:{
                        required : "Ingrese el Dni del usuario",
                        digits : "Ingrese solo numeros",
                        rangelength : "Ingrese 8 numeros"
                    },
                    txtNombre:{
                        required : "Ingrese el Nombre del usuario",
                        accept : "Ingrese solo letras"
                    },
                    txtApellido:{
                        required : "Ingrese el Apellido del usuario",
                        accept : "Ingrese solo letras"
                    }
                }
            });
            
            $(document).ready(function(){
                //Esto se ejecuta cuando la pagina esta LISTA.
                $("#btnGrabarAJAX").click(function(){
                    var frm = $("frmUserCreate");
                    if(!frm.valid()){
                        return;
                    }
                    //Esto se ejecuta cuando alguien hace CLick en btnGrabarAJAX
                    if(confirm("¿Esta seguro que desea crear un Usuario?")){
                        var nombreUsuario = $("#txtUsuario").val();
                        var password = document.getElementById("txtPassword").value;
                        
                        if(nombreUsuario == ""){
                            alert("Debe ingresar el nombre del usuario");
                            return;//AQUI SE QUEDA Y NO EJECUTA MAS CODIGO
                        }
                        
                        if(password == ""){
                            alert("Debe ingresar una contraseña");
                            return;
                        }
                        
                        var url = "/WebApp03/UserCreateAjax?user=" + nombreUsuario + "&pass=" + password;
                        $.get(url, function(data) {
                            alert(data);
                        });
                    }
                });               
            });
        </script>
<%@include file="Footer.jsp" %>

