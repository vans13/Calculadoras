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
public abstract class AAbstract {

    public AAbstract() {
    }

    public abstract int [][] llena(int l, int a);
    public abstract int [][] suma(int [][]ma1, int [][]ma2,int lar, int anch);
    public abstract int [][] resta(int [][]ma1, int [][]ma2,int lar, int anch);
    public abstract int traza(int [][]a, int n, int m);
    public abstract int determinante(int mat[][], int n);
}
