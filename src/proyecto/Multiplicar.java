
package proyecto;


public class Multiplicar implements IInterfacesita{
    //se crean las variables para la clase
    private double a;
    private double b;
    
    //Constructor normal
    public Multiplicar() {
    }
    
    //Se reciben los valores para realizar las operaciones de la clase, es el Constructor sobrecargado
    public Multiplicar(float a, float b) {
        this.a = a;
        this.b = b;
    }
    
    //Getters y Setters
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    ////La función multiplicar, las otras funciones no realizan ninguna acción
    @Override
    public double multiplicar(){
        double c=getA()*getB();
        return c;
    }

    @Override
    public float suma(float a, float b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float resta(float a, float b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double division() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
