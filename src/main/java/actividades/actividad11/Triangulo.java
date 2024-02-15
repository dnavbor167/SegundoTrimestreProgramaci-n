/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades.actividad11;

/**
 *
 * @author danielnavasborjas
 */
public class Triangulo extends Figura{
    
    //insertamos el constructor parametrizado
    public Triangulo(int base, int altura) {
        super(base, altura);
    }    

    @Override
    public int calcularArea() {
        return super.calcularArea()/2;
    }    
}
