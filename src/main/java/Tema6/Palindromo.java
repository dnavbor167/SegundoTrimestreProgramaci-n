/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema6;

/**
 *
 * @author daniel
 */
public class Palindromo {
    
    public static void main(String[] args) {
        System.out.println(palindromoIterativo("oso"));
    }

    //método palíndromo versión iterativa
    public static boolean palindromoIterativo(String palindromo) {
        //pirmero de todo es convertir la palabra en una array de char
        char[] palindromoChar = palindromo.toCharArray();
        
        //bucle para recorrer el array de char
        for (int i = 0; i < palindromoChar.length; i++) {
            //comprobamos que la posición del palíndromo de el principio y el
            //final sea lo mismo y luego vamos sumando y restando
            if (palindromoChar[i] != palindromoChar[palindromoChar.length -1 -i]) {
                //devolvemos false si encuentra algo que no sea igual en
                //cualquier momento
                return false;
            }
        }
        //si ha hecho el bucle correctamente devolverá true
        return true;
    }
    
    //método palíndromo versión recursiva
    public static boolean palindromoRecursivo(String palindromo, int posicion) {
        char[] palindromoChar = palindromo.toCharArray();
        
        if (posicion < palindromoChar.length) {
            
        }
    }
    
    
}
