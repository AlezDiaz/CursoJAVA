
package principal;

import java.util.Scanner;

public class Algoritmo_area_rectangulo {

   
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
