package principal;

import java.util.Scanner;

public class Algortimo_area_circulo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //ENTRADA
        //DEC. DE VARIABLES
        int radio;
        double pi = 3.1416;
        double area;
        //PROCESO
        System.out.println("INGRESE EL RADIO");
        radio = s.nextInt();
        area = pi*radio*radio;
        //SALIDA
        System.out.println("EL AREA ES:"+area);
    }

}
