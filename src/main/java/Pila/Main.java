/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;

/**
 *
 * @author daniel
 */
public class Main {
    public static void main(String[] args) {
        PilaString pila = new PilaString(10);
        
        pila.añadirElemento("1");
        pila.añadirElemento("2");
        pila.añadirElemento("3");
        pila.añadirElemento("4");
        pila.añadirElemento("5");
        pila.añadirElemento("6");
        pila.añadirElemento("7");
        pila.añadirElemento("8");
        pila.añadirElemento("9");
        pila.añadirElemento("10");
        
        System.out.println(pila.sacarElemento());;
        
        pila.estaVacio();
        
        pila.estaLlena();
        
        System.out.println(pila.numElemetnos());
        
        pila.numMax();
    }
}
