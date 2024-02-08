/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema6.Herencia;

/**
 *
 * @author daniel
 */
public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("123", "456Y", "Citroen", 23.56);
        System.out.println(v1);
        
        Turismo t1 = new Turismo(8, "888", "999P", 
                "Renault", 10.6);
        System.out.println(t1);
        
        //Cuando uso la variable de la subclase tengo acceso a
        //métodos públicos de la superclase
        t1.descontarTarifa(0); //Este método es de vehículo
        t1.añadirRuedaRepuesto(); //Este método es de turismo
        
        v1.descontarTarifa(0); //Método de vehículo
        //v1 no tiene acceso a los métodos de turismo
    }
}
