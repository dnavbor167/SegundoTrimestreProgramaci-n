/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

/**
 *
 * @author daniel
 */
public class Matrices {

    public static void main(String[] args) {
        
        //Mátriz de 2x2 de int
        int [][] matrizInt = new int[2][2];
        
        //Inicialización de valores manualmente
        /*
                        Col1    Col2
            Fila 1 -->  3       5
            Fila 2 -->  1       9
        */
        
        matrizInt[0][0] = 3;
        matrizInt[0][1] = 5;
        matrizInt[1][0] = 1;
        matrizInt[1][1] = 9;
        
        System.out.println("Elemento f1 c1: " + matrizInt[0][0]);
        
        //4 filas y columnas por fila, 12 elementos
        int [][] matriz2 = {
            {3,4,5},
            {6,7,8},
            {9,10,11},
            {0,0,0}
        };
        
        System.out.println("Filas de matriz2 " + matriz2.length);
        System.out.println("Columnas de matriz2 fila 2: " + matriz2[1].length);
        
        //Recorrido de todos los elementos de la matriz
        //Recorremos las filas (matriz2.lenght)
        //En cada fila, recorremos las columnas (matriz2[numfila].lenght)
        for (int i = 0; i < matriz2.length; i++){
            for (int j = 0; j < matriz2[i].length; j++){
                System.out.println("El elemento " + i + ", " + j + ": "
                + matriz2[i][j]);
            }
        }
    }
}
