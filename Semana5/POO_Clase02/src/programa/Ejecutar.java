/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import clases.Director;
import clases.EmpleadoBase;
import clases.Obrero;
/**
 *
 * @author d18211
 */
public class Ejecutar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        Director directorTI = new Director("Luis", "aaa");
        //directorTI.setNombre("Luis");
        //directorTI.setApellido("Gomez");
        directorTI.setProfesion("Ing. Sistemas");
        directorTI.setTipoDocumento("DNI");
        directorTI.setNumeroDocumento("12345678");
        //directorTI.Presentarse();
        
        Obrero obreroConstruccion = new Obrero();
        obreroConstruccion.setNombre("Jorge");
        obreroConstruccion.Presentarse();
        obreroConstruccion.Trabajar("Limpiar", "Planchar", "Cocinar");
        obreroConstruccion.Trabajar("Limpiar", "Cocinar");
        obreroConstruccion.Trabajar("Cocinar");
  
    }
}
