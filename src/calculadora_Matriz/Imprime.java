/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora_Matriz;

import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class Imprime extends AAbstract{

    public Imprime() {
    }
    @Override
    public int [][] llena(int l, int a){
        int [][]mat=new int [l][a];
        int cont=0;
        String cad = JOptionPane.showInputDialog("Ingrese los valores de la Matriz separados por espacio");
        String [] cadena=cad.split(" ");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < a; j++) {
                if (cont>=cadena.length) {
                    break;
                }
                mat[i][j]=Integer.parseInt(cadena[cont]);
                cont++;
            }
        }
        return mat;
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
    public int traza(int[][] a, int n, int m) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int determinante(int[][] mat, int n) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
