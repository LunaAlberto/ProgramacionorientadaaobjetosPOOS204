/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author albertoluna
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserCRUD {
    //constructor de la clase arranca la conexion a BD 
    private Connection conexion;
    public UserCRUD(){
    conexion = ConexionMYSQL.conectar();
            }
    
    public boolean InsertUsuario(String nombre,String correo,String contra){
        String insertSQL="Insert into usuarios(nombre,correo,contrasena) VALUES(?,?,?)";
        try{
            PreparedStatement ps=conexion.prepareStatement(insertSQL);
                    ps.setString(1,nombre );
                     ps.setString(2,correo );
                      ps.setString(3,contra );
                      return ps.executeUpdate()>0;
        }
        catch(SQLException e){
            System.out.println("Error al crear el usuaruio:" +e.getMessage());
            return false;
        }
        
        
    }
    
}
