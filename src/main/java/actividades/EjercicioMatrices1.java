/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades;

import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class EjercicioMatrices1 {

    public static void main(String[] args) {
        //Pedir al usuario filas y columnas
        int numFilas = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce el número de filas"));
        int numColumnas = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce el número de columnas"));

        int[][] matrizUsuario = new int[numFilas][numColumnas];

        for (int i = 0; i < matrizUsuario.length; i++) {
            for (int j = 0; j < matrizUsuario[i].length; j++) {
                matrizUsuario[i][j] = Integer.parseInt(
                        JOptionPane.showInputDialog("Introduce en la fila "
                                + i + " y en la columna " + j + " un valor"));
            }
        }

        for (int i = 0; i < matrizUsuario.length; i++) {
            for (int j = 0; j < matrizUsuario[i].length; j++) {
                System.out.println("El elemento " + i + ", " + j + ": "
                + matrizUsuario[i][j]);
            }
        }
    }
}
