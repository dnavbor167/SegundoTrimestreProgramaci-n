/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author daniel
 */
public class Acuaticos extends Animal {

    public Acuaticos(String nombre) {
        super(nombre);
    }

    @Override
    public void cazar(Animal a) {
        System.out.println("El animal caza a " + a.getNombre());
    }
    
}
