/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import Modelo.Method;
import Modelo.Producto;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author ferru
 */
@WebService(serviceName = "Servicios")
public class Servicios {
    
    Method method = new Method();

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "listar")
    public List<Producto> listar() {
        List<Producto> cadena =method.listar();  
        return cadena;
    }
    
    @WebMethod(operationName = "listarDatos")
    public String listarDatos() {
        String cadena =method.listarDatos();  
        return cadena;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "add")
    public String add(@WebParam(name = "nombre") String nombre, @WebParam(name = "precio") float precio, @WebParam(name = "stock") int stock, @WebParam(name = "proveedor") String proveedor) {
        //TODO write your implementation code here:
        String datos=method.add(nombre, precio, stock, proveedor);
        return datos;
    }
    
    @WebMethod(operationName = "update")
    public String update(@WebParam(name = "id") int id, @WebParam(name = "nombre") String nombre, @WebParam(name = "precio") float precio, @WebParam(name = "stock") int stock, @WebParam(name = "proveedor") String proveedor) {
        //TODO write your implementation code here:
        String datos=method.update(id, nombre, precio, stock, proveedor);
        return datos;
    }
    
    @WebMethod(operationName = "delete")
    public String delete(@WebParam(name = "id") int id) {
        String datos=method.delete(id);
        return datos;
    }
    
}
