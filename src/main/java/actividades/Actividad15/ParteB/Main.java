/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades.Actividad15.ParteB;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class Main {
    public static void main(String[] args) {
        Diputado d1 = new Diputado(1, "Cádiz", "PP", "Manolo", "Dama");
        Diputado d2 = new Diputado(2, "Málaga", "PSOE", "YOYO", "yeye");
        Diputado d3 = new Diputado(3, "Sevilla", "VOX", "pincho", "pancho");
        
        Senador s1 = new Senador(4.0, "Mérida", "VOX", "Ciervo", "Cervatín");
        Senador s2 = new Senador(5.0, "Pascal", "PP", "Pop", "Pap");
        Senador s3 = new Senador(6.0, "Mercho", "Yunts", "Nano", "Neno");
        
        List<DiputadoSenador> listaLegisladores = new ArrayList<>();
        listaLegisladores.add(d1);
        listaLegisladores.add(d2);
        listaLegisladores.add(d3);
        listaLegisladores.add(s1);
        listaLegisladores.add(s2);
        listaLegisladores.add(s3);
        
        for (DiputadoSenador listaLegisladore : listaLegisladores) {
            System.out.println(listaLegisladore.toString());
            System.out.println(listaLegisladore.diputadoOSenador());
            System.out.println("");
        }
    }
}
