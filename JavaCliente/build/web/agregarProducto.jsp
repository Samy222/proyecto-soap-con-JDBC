<%-- 
    Document   : agregarProducto
    Created on : 27/09/2022, 07:24:07 PM
    Author     : ferru
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Producto</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>
         <div class="container mt-4">
            <div class="card">
                <div class="card-header">
                    <h5>Agregar Nuevo Producto</h5>                   
                </div>
                <div class="card-body">
                    <form action="Controlador">
                        <label>Nombre: </label>
                        <input type="text" name="txtnombre" class="form-control">
                        <label>Precio: </label>
                        <input type="number" name="txtprecio" class="form-control">
                        <label>Stock: </label>
                        <input type="number" name="txtstock" class="form-control">
                        <label>Proveedor: </label>
                        <input type="text" name="txtproveedor" class="form-control">
                        <br>
                        <center>
                        <input type="submit" name="accion" value="Registrar" class="btn btn-success">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="Controlador?accion=index" class="btn btn-info"><font style="color: white">Regresar</font></a>
                        </center>
                    </form>                    
                </div>
                
            </div>
            
        </div>
    </body>
</html>
