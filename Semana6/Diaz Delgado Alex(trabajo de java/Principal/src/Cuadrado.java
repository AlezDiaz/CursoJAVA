
public class Cuadrado extends Figura
{
    private  double lado;
    
    public  Cuadrado(double l)
     
    {
    super("Cuadrado");
    lado=l;
    }
    public void setarea()
    {
        this.area=lado*lado;
    }
    public void setperimetro()
    {
        this.perimetro=lado*4;
    }
    public void dibujar()
    {
    super.dibujar();
        System.out.println("Dibujar");
        for(int i=0; i<lado;i++)
        {
          for(int j=0; j<lado; j++)
            System.out.print("*");
            System.out.println();
            
    }
    
   }
}
