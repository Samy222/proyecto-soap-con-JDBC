/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;

/**
 *
 * @author ferru
 */
public interface CRUD {
    
    public List<Producto> listar();
    public String listarDatos();
    public String add(String nombre,float precio,int stock, String proveedor);
    public String update(int id, String nombre,float precio,int stock, String proveedor);
    public String delete(int id);
    
}
