/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PooCalculadora;

/**
 *
 * @author Administrador
 */
public class Calculadora {
    private String digito;
    private double resultado;
    private boolean suma;
    private boolean resta;
    private boolean multiplicacion;
    private boolean divicion;
    
    public Calculadora()
    {
    digito = "";
    resultado = 0;
    suma = false;
    resta = false;
    multiplicacion = false;
    divicion = false;
    
    }
    //getter y 

    public String getDigitos() {
        return digito;
    }
    
    public void setDigitos(String digitos) {
        this.digito = digitos;
    }
    public void agregarNum(int num)
    {
    setDigitos(digito+num );
    }

    public void suma(String num)
    {
     this.resultado = Double.parseDouble(num);
     suma = true;
      setDigitos("");

    }
       public void resta(String num)
    {
     this.resultado = Double.parseDouble(num);
     resta = true;
      setDigitos("");
    }
        public double calculo (String numero)
        {
            if(suma == true)
            {
                resultado = resultado + Double.parseDouble(numero);
            }
            if (resta == true)
            {
                resultado = resultado + Double.parseDouble(numero);           
            }
            suma = false;
            resta = false;
            return resultado;

        }
}   
        

