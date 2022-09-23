/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora_Matriz;

/**
 *
 * @author lenovo
 */
public class Traza extends AAbstract{

    public Traza() {
    }
    public int traza(int [][]a, int n, int m){
        int result=0;
        for (int i = 0; i < n; i++) {
            result+=a[i][i];
        }
        return result;
    }

    @Override
    public int[][] llena(int l, int a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int[][] suma(int[][] ma1, int[][] ma2, int lar, int anch) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int[][] resta(int[][] ma1, int[][] ma2, int lar, int anch) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int determinante(int[][] mat, int n) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
