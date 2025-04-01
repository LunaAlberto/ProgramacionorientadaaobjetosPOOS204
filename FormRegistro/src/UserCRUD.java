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
import java.sql.ResultSet;//aqui estara la lista de los resultados
import javax.swing.JOptionPane;

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
        
        
    }//usuarios
    
    //consultar por id
    public ResultSet buscarPorID(int id){
        String sqlBuscar="SELECT * FROM usuarios WHERE id=?";
        try{
            PreparedStatement ps=conexion.prepareStatement(sqlBuscar);
            ps.setInt(1, id);
            return ps.executeQuery();
        }catch(SQLException e){
            System.out.println("Error al buscar por id"+e.getMessage());
            return null;
        }
    
    }//fin de la comnsulta
    
    public ResultSet obtenerTodos(){
        String sqlTodos="SELECT * FROM usuarios";
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlTodos);
            return ps.executeQuery();
        }
        catch(SQLException s){
        System.out.println("Error al consultar todos "+ s.getMessage());
        return null;
        }
    }
    
    public boolean Updateusuarios(int id,String nombre,String correo,String contrasena){
        String aqlActualizar = "UPDATE usuarios SET nombre = ?,correo = ?,contrasena = ? WHERE id =?";
        try(PreparedStatement ps = conexion.prepareStatement(aqlActualizar)){
           ps.setInt(4, id);
            ps.setString(1, nombre);
            ps.setString(2, correo);
            ps.setString(3, contrasena);
    
            return ps.executeUpdate()>0;
           
            
        }catch(SQLException e){
            System.out.println("Error al actualizar el usuaraio:"+e.getMessage());
            return false;
        }
        
    }
    
    public boolean deleteusuario(int id){
       String sqlEliminar = "DELETE FROM usuarios WHERE id = ?";
       try{
           PreparedStatement ps = conexion.prepareStatement(sqlEliminar);
           ps.setInt(1, id);
           return ps.executeUpdate()>0;
           
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null,"Error al eliminar"+e.getMessage());
           return false;
       }
       
       
       
    }//fin de llame de eliminar
    
    
}
