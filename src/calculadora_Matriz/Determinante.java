/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora_Matriz;

/**
 *
 * @author lenovo
 */

//made by:KANCHAN_RAY
//From: https://es.acervolima.com/programa-java-para-encontrar-el-determinante-de-una-matriz/#:~:text=El%20determinante%20de%20una%20matriz%20es%20un%20n%C3%BAmero%20real%20que,inversa%20de%20la%20matriz%20indicada.
// Java program to find
// Determinant of a matrix
public class Determinante extends AAbstract{

    // Dimension of input square matrix

    // Function to get cofactor of
    // mat[p][q] in temp[][]. n is
    // current dimension of mat[][]
    public static void getCofactor(int mat[][], int temp[][],
            int p, int q, int n) {
        int i = 0, j = 0;

        // Looping for each element
        // of the matrix
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                // Copying into temporary matrix
                // only those element which are
                // not in given row and column
                if (row != p && col != q) {
                    temp[i][j++] = mat[row][col];
                    // Row is filled, so increase
                    // row index and reset col index
                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    /* Recursive function for finding determinant
    of matrix. n is current dimension of mat[][]. */
    public int determinante(int mat[][], int n) {
        int D = 0; // Initialize result

        // Base case : if matrix
        // contains single element
        if (n == 1) {
            return mat[0][0];
        }

        // To store cofactors
        int temp[][] = new int[n][n];

        // To store sign multiplier
        int sign = 1;

        // Iterate for each element of first row
        for (int f = 0; f < n; f++) {
            // Getting Cofactor of mat[0][f]
            getCofactor(mat, temp, 0, f, n);
            D += sign * mat[0][f]
                    * determinante(temp, n - 1);

            // terms are to be added
            // with alternate sign
            sign = -sign;
        }

        return D;
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
    public int traza(int[][] a, int n, int m) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
