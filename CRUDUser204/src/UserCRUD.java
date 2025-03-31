/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;


public class UserCRUD {
    
    private Connection conexion;
    
    //Constructor de la clase arranca la conexion a BD
    public UserCRUD (){
        conexion = ConexionMySQL.conectar();
    }
    
    public boolean InsertUsuario (String nombre, String correo, String contra){
        
        String insertSQL = "INSERT INTO usuarios(nombre, correo, contraseña) VALUES(?,?,?)";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(insertSQL);
            ps.setString(1, nombre);
            ps.setString(2, correo);
            ps.setString(3, contra);
            return ps.executeUpdate() > 0;
        }
        
        catch (SQLException e){
            System.out.println("Error al crear un usuario" + e.getMessage());
            return false;
        }
    
    }// Fin del insert
    
    // Metodo para consultar por ID
    
    public ResultSet buscarporID(int id){
        String sqlBuscar = "SELECT * FROM usuarios WHERE idUsuarios= ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sqlBuscar);
            ps.setInt(1, id);
            return ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error al buscar por ID" + e.getMessage());
            return null;
        }
    } // Fin del consultar ID
    
    public ResultSet obtenerTodos (){
    
        String sqlTodos = "SELECT * FROM usuarios";
        
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlTodos);
            return ps.executeQuery();
        }
        catch(SQLException s){
            System.out.println("Error al consultar todos" + s.getMessage());
            return null;
        }    
            
    }// fin obtener todos
    
    public boolean Updateusuarios(int id,String nombre,String correo,String contrasena){
        
        String sqlActualizar = "UPDATE usuarios SET Nombre = ?, Correo = ?, Contraseña = ? WHERE idUsuarios =?";
        try(PreparedStatement ps = conexion.prepareStatement(sqlActualizar)){
           
            
           ps.setInt(4, id);
           ps.setString(1, nombre);
           ps.setString(2, correo);
           ps.setString(3, contrasena);
          
           
            return ps.executeUpdate()>0;
           
            
        }catch(SQLException e){
            System.out.println("Error al intentar actualizar el usuaraio:" + e.getMessage());
            return false;
        }// fin actualizar
        
    }
    
    public boolean dropusuarios(int id){
    
    String sqlEliminar = "DELETE FROM usuarios WHERE idUsuarios = ?";
        try(PreparedStatement ps = conexion.prepareStatement(sqlEliminar)){
               
           ps.setInt(1, id);
             
            return ps.executeUpdate()>0;
           
            
        }catch(SQLException e){
            System.out.println("Error al intentar eliminar el usuaraio:" + e.getMessage());
            return false;
        }// fin actualizar
        
    }

}
