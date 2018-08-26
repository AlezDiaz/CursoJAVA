
public class Figura {
    protected String nombre;
    protected double area;
    protected double perimetro;
    
    public Figura(String n){
    nombre = n;
    }
    public String getnombre(){
    
    return nombre;
    
    }
    public double getarea(){
    
    return area;
   
    }
    public double getperimetro(){
    return perimetro;
    }
    public void dibujar()
    {
        System.out.println("Nombre: "+this.getnombre());
        System.out.println("Perimetro: "+this.getperimetro());
        System.out.println("Area: "+this.getarea());
        
    }
}
