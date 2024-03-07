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
        PilaLifo<String> pila = new PilaLifo(10);
        
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
        
        //mostramos los números de elementos que hay en la pila
        System.out.println("Número de elementos en la lista: " + pila.numElemetnos());
        
        //mostramos el número máximo de elementos que puede haber en la pila
        System.out.println("El número máximo de elementos es " + pila.numElemetnos());
        
        //sacamos 2 elementos
        System.out.println("Sacamos el elemento " + pila.sacarElemento());
        System.out.println("Sacamos el elemento " + pila.sacarElemento());
        
        //número de elementos de la pila
        System.out.println("Número de elementos en la pila: " + pila.numElemetnos());
        
        //añadimos elemento
        pila.añadirElemento("6");
        
        //número de elementos de la pila
        System.out.println("Número de elementos en la pila: " + pila.numElemetnos());
    }
}
