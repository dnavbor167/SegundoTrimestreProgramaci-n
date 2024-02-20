/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author daniel
 */
public class Terrestres extends Animal{

    public Terrestres(String nombre) {
        super(nombre);
    }

    @Override
    public void cazar(Animal a) {
        System.out.println("Me estoy comiendo un animal");
    }
    
}
