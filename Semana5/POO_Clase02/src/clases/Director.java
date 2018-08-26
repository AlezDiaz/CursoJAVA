/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author d18211
 * MiPrimerCodigo
 * Mi_Primer_Codigo;
 * miPrimerCodigo
 * MiFuncion
 */
public class Director extends EmpleadoBase {

    
    //Director directo1 = new Director();
    public Director(){}
    
    
    //Director director3 = new Director("Nombre");
    public Director(String nombre){
        this.setNombre(nombre);
    }
    
    //Director directorArray = new Director(new double[]{ 100, 201, 20000 });
    public Director (double[] salario){
        
    }
 
    //Director director2 = new Director("nombre", "Apellido");
    public Director(String nombre, String apellido){
        this.setNombre(nombre);
        this.setApellido(apellido);
    }
    
    
    
    
    @Override    
    public void Presentarse() {
        super.Presentarse(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Hola bienvenidos a todos");
    }

    @Override
    public double getSalario() {
        //return super.getSalario() + 100; 
        return 20000;
    }

    /**
     * @return the codigoSocio
     */
    public String getCodigoSocio() {
        return codigoSocio;
    }
    /**
     * @param codigoSocio the codigoSocio to set
     */
    public void setCodigoSocio(String codigoSocio) {
        this.codigoSocio = codigoSocio;
    }

    public void ConsultarAcciones(){
        System.out.println("Accion del Director, Consultar Acciones");
    }
    
    private String codigoSocio;
}
