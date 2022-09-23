/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora_Matriz;

/**
 *
 * @author lenovo
 */
public class Resta extends AAbstract{

    public Resta() {
    }
    public int [][] resta(int [][]ma1, int [][]ma2,int lar, int anch){
        int[][]a=new int[lar][anch];
        for (int i = 0; i < lar; i++) {
            for (int j = 0; j < anch; j++) {
               a[i][j]=ma1[i][j]-ma2[i][j];
            }
        }
        return a;
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
    public int traza(int[][] a, int n, int m) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int determinante(int[][] mat, int n) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
