/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import BD.SQLWebConnection;
import Models.UserModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class UserRepository {
    
    
    public boolean CreateUser(UserModel user){
        boolean result = false;
        try {
            Connection con = SQLWebConnection.getSQLConexion();
            String sql = "usp_crear_usuario ?,?,?,?,?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, user.getUserName());
            statement.setString(2, user.getUserPassword());
            statement.setString(3, user.getDni());
            statement.setString(4, user.getNombre());
            statement.setString(5, user.getApelli());
            int rows = statement.executeUpdate();
            result = (rows == 1);
        } catch (SQLException ex) {
            result = false;
        }
        return result;
    }
    
    public ArrayList<UserModel> GetListUsers(){
       ArrayList<UserModel> result = new ArrayList<>();
       try {
            Connection con = SQLWebConnection.getSQLConexion();
            String sql = "select codusu,nomusu,passusu,estusu from usuarioweb";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                UserModel row = new UserModel();
                row.setUserId(rs.getInt("codusu"));
                row.setUserName(rs.getString("nomusu"));
                row.setUserPassword(rs.getString("passusu"));
                result.add(row);
            }
       } catch (SQLException ex) {
           System.out.println(ex.getMessage());
       }
       return result;
    }
    
    public UserModel GetUserById(int id){
       UserModel result = new UserModel();
       try {
            Connection con = SQLWebConnection.getSQLConexion();
            String sql = "select codusu,nomusu,passusu,estusu from usuarioweb where codusu = " + id;
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();           
            rs.next();
            result.setUserId(rs.getInt("codusu"));
            result.setUserName(rs.getString("nomusu"));
            result.setUserPassword(rs.getString("passusu"));
       }
       catch (SQLException ex) {
           System.out.println(ex.getMessage());
       }
       return result;
    }
    
    
}