/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema6.Herencia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class Main {
    public static void main(String[] args) {
//        Vehiculo v1 = new Vehiculo("123", "456Y", "Citroen", 23.56);
//        System.out.println(v1);
        
        Turismo t1 = new Turismo(8, "888", "999P", 
                "Renault", 10.6);
        System.out.println(t1);
        
        Furgoneta f1 = new Furgoneta(100.0, "333", "333E", "Peugeot", 12.9);
        
        //Cuando uso la variable de la subclase tengo acceso a
        //métodos públicos de la superclase
        t1.descontarTarifa(0); //Este método es de vehículo
        t1.añadirRuedaRepuesto(); //Este método es de turismo
        f1.aumentarCarga(10); //Método propio de Furgoneta
        
//      v1.descontarTarifa(0); //Método de vehículo
        //v1 no tiene acceso a los métodos de turismo, ni de furgoneta
        
        //A ESTA LISTA LE PODEMOS AÑADIR TANTO VEHICULOS COMO TURISMOS COMO FURGONETAS
        //PORQUE TODOS SON VEHÍCULOS PORQUE HEREDAN DE VEHÍCULO
        List<Vehiculo> lista = new ArrayList<>();
        //Conversiones implicitas. Casting implícito (invisible)
        //Aunque la variable sea turismo o furgoneta la estoy apuntando a vehículo
        //Lo que implica que solo tengo acceso a los métodos de vehículo
//      lista.add(v1);
        lista.add(t1);
        lista.add(f1);
        
        
        System.out.println("-------------------------------");
        //ejecutaría el toString de vehículo siempre pero como 
        //en las clases hijas se sobre escribe el toString con el @override
        //se ejecuta el toString de la clase hija
        for (Vehiculo v : lista) {
            //Método polimórfico toString
            //En función del tipo al que apunte v, se ejecuta un código u otro
            System.out.println(v.toString());
            
            //EL INSTANCEOF ES PARA MIRAR SI LA LISTA ES DE UN TIPO HERDADO
            if (v instanceof Turismo) {
                //conversión explícita de v a turismo
                ((Turismo) v).añadirRuedaRepuesto();
            }
            v.pasarItv();
        }
        
        //@OVERRIDE = SOBREESCRIBIR ALGÚN MÉTODO PADRE
        
        
    }
}
