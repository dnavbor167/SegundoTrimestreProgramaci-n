/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades.actividad7Trabajadores;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author daniel
 */
public class Main {
    
    public static void main(String[] args) {
        ArrayList<Trabajador> lista = new ArrayList();
        //lista.add(new Trabajador("María", "1234"));
        lista.add(new Enfermera("Estepona", "Lucía", "12345"));
        lista.add(new Policia("EE33", "Juana", "777"));
        
        for (Trabajador traba : lista) {
            //Dependiendo del trabajado que elija escogerá un método u otro depende
            //del que apunte
            traba.cotizar();
        }
        
        Set<CursosRecilado> hacenCursos = new HashSet();
        
        hacenCursos.add(new Policia());
        hacenCursos.add(new Profesor());
        
        for (CursosRecilado persona : hacenCursos) {
            persona.hacerCurso(300);
            
            if (persona instanceof Policia) {
                ((Policia) persona).ponerDenuncia();
            }
        }
    }
}
