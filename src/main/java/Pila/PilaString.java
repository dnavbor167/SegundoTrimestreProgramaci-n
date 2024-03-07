/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class PilaString {

    //atributos encapsulados
    private final List<String> pila;
    private final int tamañoMax;

    public PilaString(int tamañoMax) {
        this.pila = new ArrayList<>(tamañoMax);
        this.tamañoMax = tamañoMax;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PilaString{");
        sb.append("pila=").append(pila);
        sb.append(", tama\u00f1oMax=").append(tamañoMax);
        sb.append('}');
        return sb.toString();
    }
    
    //método para añadir un elemento a la lista
    public void añadirElemento(String elementoAñadir) {
        if (!estaLlena()) {
            this.pila.add(elementoAñadir);
        }
    }
    
    //método para sacar elemento
    public String sacarElemento() {
        if (!pila.isEmpty()) {
            return pila.remove(pila.size()-1);
        }
        return null;
    }
    
    //método para saber si es está vacío
    public boolean estaVacio() {
        return this.pila.isEmpty();
    }
    
    //saber si está llena
    public boolean estaLlena() {
        if (this.pila.size() == this.tamañoMax) {
            return true;
        }
        return false;
    }
    
    //método para saber el número de elementos que hay
    public int numElemetnos() {
        return this.pila.size();
    }
    
    //saber número máximo de elementos
    public int numMax() {
        return this.tamañoMax;
    }
}
