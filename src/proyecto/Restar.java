
package proyecto;

public class Restar implements IInterfacesita{

    public Restar() {
    }
    //La función resta, las otras funciones no realizan ninguna acción
    @Override
    public float resta(float a, float b){
        float c=a-b;
        return c;
    }

    @Override
    public float suma(float a, float b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double multiplicar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double division() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
