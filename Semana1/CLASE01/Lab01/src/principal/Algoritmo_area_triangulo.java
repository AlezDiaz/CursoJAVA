/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Algoritmo_area_triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        Scanner s = new Scanner(System.in);
        //ENTRADA
            //DECLARACION DE VARIABLES
            int base;
            int altura;
            int area;
        //PROCESO
            System.out.println("INGRESE LA BASE");
            base = s.nextInt();
            System.out.println("INGRESE LA ALTURA");
            altura =  s.nextInt();
            area = altura * base/2;
        
          //SALIDA
            System.out.println(" EL AREA ES :"+area);
        
        
    }
    
}
