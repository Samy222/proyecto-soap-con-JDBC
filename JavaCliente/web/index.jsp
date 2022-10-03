<%-- 
    Document   : index
    Created on : 27/09/2022, 07:20:05 PM
    Author     : ferru
--%>

<%@page import="ws.Producto"%>
<%@page import="Modelo.ProductoServicio"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GESTIÓN DE INVENTARIO</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>
        <div class="container mt-4">
            <div class="card">
                <div class="card-header">
                    <a href="Controlador?accion=agregarProducto" class="btn btn-primary">Agregar Producto</a>                    
                </div>
                <div class="card-body">
                    <table class="table table-bordered table table-striped ">
                        <thead>
                            <tr class="dark text-white" style="text-align: center;">
                                <th>Nombre</th>
                                <th>Precio</th>
                                <th>Stock</th>
                                <th>Proveedor</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                            ProductoServicio producto = new ProductoServicio();
                            List<Producto> datos = producto.mostrar();
                            for(Producto p: datos){    
                            
                            %>
                            <tr>
                                <td><%= p.getNombre() %></td>
                                <td><%= p.getPrecio() %></td>
                                <td><%= p.getStock() %></td>
                                <td><%= p.getProveedor() %></td>                                
                            </tr>
                            <%}%>
                        </tbody>
                    </table>
                    
                </div>
                
            </div>
            
        </div>
    </body>
</html>
