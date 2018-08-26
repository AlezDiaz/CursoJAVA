package principal;

import java.util.Scanner;

public class Algoritmo_suma_dos_numeros {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //ENTRADA
            //DECLARACION DE VARIABLES
            int num1;
            int num2;
            int suma;
        //PROCESO
            System.out.println("INGRESE EL PRIMER NUMERO");
            num1 = s.nextInt();
            System.out.println("INGRESE EL SEGUNDO NUMERO");
            num2 =  s.nextInt();
            suma = num1 + num2;
        //SALIDA
            System.out.println("LA SUMA DE LOS NUMEROS ES:"+suma);
        
        
        
    }
    
}
