/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cola;

/**
 *
 * @author daniel
 */
public class Main {
    public static void main(String[] args) {
        //instanciamos la cola
        ColaFifo<String> cola = new ColaFifo(5);
        
        //insertamos elementos a la cola
        cola.añadirElemento("1");
        cola.añadirElemento("2");
        cola.añadirElemento("3");
        cola.añadirElemento("4");
        cola.añadirElemento("5");
        //añadimos un elementos más para mostrar de que no se añade
        cola.añadirElemento("6");
        
        //mostramos los números de elementos que hay en la cola
        System.out.println("Número de elementos en la lista: " + cola.numElemetnos());
        
        //mostramos el número máximo de elementos que puede haber en la cola
        System.out.println("El número máximo de elementos es " + cola.numElemetnos());
        
        //sacamos 2 elementos
        System.out.println("Sacamos el elemento " + cola.sacarElemento());
        System.out.println("Sacamos el elemento " + cola.sacarElemento());
        
        //número de elementos de la cola
        System.out.println("Número de elementos en la lista: " + cola.numElemetnos());
        
        //añadimos elemento
        cola.añadirElemento("6");
        
        //número de elementos de la cola
        System.out.println("Número de elementos en la lista: " + cola.numElemetnos());
        
        //mostramos toda la cola
        cola.toString();
        
    }
}
