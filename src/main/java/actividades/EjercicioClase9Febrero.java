/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 *
 * @author daniel
 */
public class EjercicioClase9Febrero {
    public static void main(String[] args) {
        int[] array = {7,9,10,5,3,7,7,9,10,1,5,4};
        System.out.println(cuantoRepite(array));
        System.out.println(listaSinDuplicados(array));
    }
    
    //Método que indique para cada número cuantas veces se repite
    public static Map<Integer, Integer> cuantoRepite(int[] array) {
        Map<Integer, Integer> nuevoMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (nuevoMap.containsKey(array[i])) {
                nuevoMap.put(array[i], nuevoMap.get(array[i])+1);
            } else {
                nuevoMap.put(array[i], 1);
            }
        }
        return nuevoMap;
    }
    
    //Lista sin duplicados
    public static List listaSinDuplicados(int[] array) {
        List lista = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            if (!lista.contains(array[i])) {
                lista.add(array[i]);
            }  
        }
        return lista;
    }
    
    //Recursivo posición busqueda de un elemento (lista sin duplicados)
    public static int busquedaRecursiva(List listaSinDupli) {
        
    }
    
}
