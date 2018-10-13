/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Administrador
 */
public class UserModel {

    /**
     * @return the Dni
     */
    public String getDni() {
        return Dni;
    }

    /**
     * @param Dni the Dni to set
     */
    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apelli
     */
    public String getApelli() {
        return Apelli;
    }

    /**
     * @param Apelli the Apelli to set
     */
    public void setApelli(String Apelli) {
        this.Apelli = Apelli;
    }

    /**
     * @return the UserId
     */
    public int getUserId() {
        return UserId;
    }

    /**
     * @param UserId the UserId to set
     */
    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    /**
     * @return the UserName
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * @param UserName the UserName to set
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * @return the UserPassword
     */
    public String getUserPassword() {
        return UserPassword;
    }

    /**
     * @param UserPassword the UserPassword to set
     */
    public void setUserPassword(String UserPassword) {
        this.UserPassword = UserPassword;
    }
    
    private int UserId;
    private String UserName;
    private String UserPassword;
    private String Dni;
    private String Nombre;
    private String Apelli;   
}
