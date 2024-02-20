/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author daniel
 */

//SI UNA CLASE ES ABSTRACTA Y LE IMPLEMENTAMOS UNA INTERFAZ ES DE OBLIGADO TENERLA
//EN LOS HIJOS, NO EN LA CLASE ABSTRACTA PADRE
public abstract class Animal implements Depredador{
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public Animal() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Animal{");
        sb.append("nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }
}
