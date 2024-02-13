/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades.actividad8;

import java.util.Random;

/**
 *
 * @author daniel
 */
public class Dado extends Azar {

    @Override
    public int lanzar() {
        Random r = new Random(); 
        return super.posibilidades = r.nextInt(1, 7);
    }
    
}
