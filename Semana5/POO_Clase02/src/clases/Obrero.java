/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author d18211
 */
public class Obrero extends EmpleadoBase{

    public Obrero() {
    }

    public void Trabajar(String rutina1){
        System.out.println(rutina1);
    }
    
    public void Trabajar(String rutina1, String rutina2){
        System.out.println(rutina1 + " - " + rutina2);
    }
    
    public void Trabajar(String rutina1, String rutina2, String rutina3){
        System.out.println(rutina1 + " - " + rutina2 + " - " + rutina3);
    }
 
    @Override
    public double getSalario() {
        //return super.getSalario();
        return 2000;
    }

    public void Operaciones(){
        System.out.println("Obreros trabajando....");
    }

}
