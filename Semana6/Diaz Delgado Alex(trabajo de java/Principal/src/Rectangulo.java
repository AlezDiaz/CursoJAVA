/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP-PC
 */
public class Rectangulo  extends Figura{
    private double base;
    private double altura;
    
    public Rectangulo(double b, double a)
    {
       super("Rectangulo");
        base=b;
        altura=a;
    }
        public void setarea()
        {
            this.area=base*altura;        
        }
        public void setperimetro()
        {
        this.perimetro=(base*2)+(altura*2);
        }
        public void dibujar()
        {
            super.dibujar();
            System.out.println("Dibujo");
             for(int i=0; i<altura; i++)
        {
          for(int j=0; j<base; j++)
            System.out.print("*");
            System.out.println();
            
        }
    }
}
