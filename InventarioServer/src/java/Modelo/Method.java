/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ferru
 */
public class Method implements CRUD{
    
    PreparedStatement ps;
    ResultSet rs; 
    Connection conn;
    Conexion conex= new Conexion();
    int res;
    String  mensaje;

    @Override
    public List<Producto> listar() {
        List<Producto> datos = new ArrayList<Producto>();
        String sql="select * from productos where deleted != 1";
        try{
            conn=conex.getConnection();
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Producto pro = new Producto();
                pro.setId(rs.getInt("id"));
                pro.setNombre(rs.getString("nombre"));
                pro.setPrecio(rs.getFloat("precio"));
                pro.setStock(rs.getInt("stock"));
                pro.setProveedor(rs.getString("proveedor"));

                datos.add(pro);
            }
        }catch(SQLException e){
            
        }
        return datos;
    }

    @Override
    public String listarDatos() {
        String sql="select * from productos where deleted != 1";
        String cadena="";
        try{
            conn=conex.getConnection();
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
               cadena +="Id: " + rs.getInt("id") + "\tNombre: "+rs.getString("nombre")+"\tPrecio: "+rs.getFloat("precio")+"\tStock: "+rs.getInt("stock")+"\tProveedor: "+rs.getString("proveedor")+"\n";
            }
        }catch(SQLException e){
            
        }
        
        return cadena;
    }

    @Override
    public String add(String nombre, float precio, int stock, String proveedor) {
        String sql = "insert into productos(nombre,precio,stock,proveedor,deleted) values (?,?,?,?,0)";
        try{
            conn = conex.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setFloat(2, precio);
            ps.setInt(3, stock);
            ps.setString(4, proveedor);
            res= ps.executeUpdate();          
            if(res==1){
                mensaje = "Producto agregado!";
            } else{
                mensaje="¡Error al agregar el producto!";
            }           
        }catch(Exception e){
            
        }
        return mensaje;
    }

    @Override
    public String update(int id, String nombre, float precio, int stock, String proveedor) {
        String sql = "UPDATE productos SET nombre = ?, precio = ?, stock = ?, proveedor = ? WHERE id = ?";
        try{
            conn = conex.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setFloat(2, precio);
            ps.setInt(3, stock);
            ps.setString(4, proveedor);
            ps.setInt(5, id);
            res= ps.executeUpdate();          
            if(res==1){
                mensaje = "Producto actualizado exitosamente!!";
            } else{
                mensaje="❌Error al actualizar producto";
            }           
        }catch(Exception e){
            
        }
        return mensaje;
    }

    @Override
    public String delete(int id) {
        String sql = "UPDATE productos SET deleted = '1' WHERE id = " + id;
        try{
            conn = conex.getConnection();
            ps = conn.prepareStatement(sql);
            res= ps.executeUpdate();          
            if(res==1){
                mensaje = "Producto eliminado exitosamente!!";
            } else{
                mensaje="❌Error al eliminar producto";
            }           
        }catch(Exception e){
            
        }
        return mensaje;
    }
    
}
