/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;
import ws.Producto;
import ws.Servicios_Service;
import ws.Servicios;

/**
 *
 * @author ferru
 */
public class ProductoServicio {

    public ProductoServicio() {
    }
    
    public List<Producto> mostrar() {
        Servicios_Service service = new Servicios_Service();
        Servicios port = service.getServiciosPort();
        return port.listar();
    }
    
    public String registrar(String nombre, float precio, int stock, String proveedor) {
        Servicios_Service service = new Servicios_Service();
        Servicios port = service.getServiciosPort();
        return port.add(nombre, precio, stock, proveedor);
    }
    
    public String actualizar(int id, String nombre, float precio, int stock, String proveedor) {
        Servicios_Service service = new Servicios_Service();
        Servicios port = service.getServiciosPort();
        return port.update(id, nombre, precio, stock, proveedor);
    }
    
    public String eliminar(int id){
       Servicios_Service service = new Servicios_Service();
        Servicios port = service.getServiciosPort();
        return port.delete(id);
   }
}
