/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP-PC
 */
import java.util.Scanner;
public class Principal {
    public static void main(String[] args)
    {
    Scanner entrada = new Scanner(System.in);
    double wlado, walt, wbas;
        System.out.print("Lado del cuadrado.....:");
        wlado=entrada.nextDouble();
        System.out.print("Base del Rectangulo.....:");
        wbas=entrada.nextDouble();
        System.out.print("Altura del Rectangulo.....:");
        walt=entrada.nextDouble();
        Cuadrado objcuad = new Cuadrado(wlado);
        Rectangulo objrect = new Rectangulo(wbas, walt);
        objcuad.setarea();
        objcuad.setperimetro();
        objcuad.dibujar();
        objcuad.setarea();
        objcuad.setperimetro();
        objcuad.dibujar();
        
        
    }
}
