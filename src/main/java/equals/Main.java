/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equals;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class Main {
    public static void main(String[] args) {
        List<Ordenador> lista = new ArrayList();
        Ordenador o1 = new Ordenador(12, "Dell");
        Ordenador o2 = new Ordenador(12, "Dell");
        //Da true porque en el método equals y hashcode le pasamos los dos parámetros
        System.out.println(o1.equals(o2));
        
        Portatil port1 = new Portatil(true, 11, "Asus");
        Portatil port2 = new Portatil(true, 12, "Asus");
        //hemos modificado el equals de la clase portatil para que tenga en cuenta
        //el equals de la clase padre
        System.out.println(port1.equals(port2));
    }
}
