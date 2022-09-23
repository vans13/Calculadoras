
package proyecto;

public class Dividir implements IInterfacesita{
    
    //Declarar las variables usadas en la clase
    private double a;
    private double b;

    //Constructor normal
    public Dividir() {
    }
    
    //Constructor Sobrecargado
    public Dividir(float a, float b) {
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
    
    //Función división, las otras funciones no realizan ninguna acción
    @Override
    public double division(){
        double c=a/b;
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
    public double multiplicar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}

