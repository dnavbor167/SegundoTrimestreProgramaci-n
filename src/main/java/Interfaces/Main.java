/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class Main {
    public static void main(String[] args) {
        Animal a = new Terrestres("Ovíparo");
        Animal b = new Acuaticos("Peces");
        
        if (a instanceof Animal) {
            System.out.println("Soy animal");
        }
        if (a instanceof Terrestres) {
            System.out.println("Soy terrestre");
        }
        if (a instanceof Acuaticos) {
            System.out.println("Soy acuático");
        }
        
        List<Depredador> listaCazadores = new ArrayList<>();
        listaCazadores.add(b);
        listaCazadores.add(a);
        for (Depredador anima : listaCazadores) {
            anima.cazar(new Acuaticos("Ballena"));
        }
    }
}
