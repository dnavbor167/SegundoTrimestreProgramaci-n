/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema6.Herencia.actividad3Herencia;

/**
 *
 * @author danielnavasborjas
 */
public class Prueba {
    public static void main(String[] args) {
        //Instanciamos dos objetos de persona
        Persona p1 = new Persona("Daniel", "32457689Q", 19);
        Persona p2 = new Persona("Carla", "23120978N", 18);
        
        //Instanciamos dos objetos de empleado
        Empleado e1 = new Empleado(3450, "Pepe", "87650954H", 20);
        Empleado e2 = new Empleado(5000, "Olga", "12345678Ñ", 34);
        
        //Instanciamos dos objetos de programador
        Programador pro1 = new Programador(Categoria.Seniro, 10000, "Carlos", "12213443Y", 30);
        Programador pro2 = new Programador(Categoria.Analista, 20000, "Pino", "62738496R", 20);
    }
}
