/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cola;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class ColaFifo<E> {
    //insertamos atributos encapsulados
    private final List<E> cola;
    private final int tamañoMax;

    public ColaFifo(int tamañoMax) {
        this.cola = new ArrayList<>(tamañoMax);
        this.tamañoMax = tamañoMax;
    }

    //insertamos toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColaFifo{");
        sb.append("cola=").append(cola);
        sb.append(", tama\u00f1oMax=").append(tamañoMax);
        sb.append('}');
        return sb.toString();
    }
    
    //método para añadir un elemento
    //método para añadir un elemento a la lista
    public void añadirElemento(E elementoAñadir) {
        if (!estaLlena()) {
            this.cola.add(elementoAñadir);
        }
    }
    
    //método para sacar elemento
    public E sacarElemento() {
        if (!estaVacio()) {
            return cola.remove(0);
        }
        return null;
    }
    
    //método para saber si es está vacío
    public boolean estaVacio() {
        return this.cola.isEmpty();
    }
    
    //saber si está llena
    public boolean estaLlena() {
        return this.cola.size() == this.tamañoMax;

    }
    
    //método para saber el número de elementos que hay
    public int numElemetnos() {
        return this.cola.size();
    }
    
    //saber número máximo de elementos
    public int numMax() {
        return this.tamañoMax;
    }

    
}
