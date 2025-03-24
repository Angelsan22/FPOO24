/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


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
    
    }
}
