/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema6.Herencia.Actividad3Herencia;

/**
 *
 * @author danielnavasborjas
 */
public class Empleado extends Persona {
    //Insertamos el atributo único de empleado
    private double salario;

    //Insertamos constructor parametrizado
    public Empleado(double salario, String nombre, String dni, int edad) {
        super(nombre, dni, edad);
        this.salario = salario;
    }
    
    //constructor sin parámetros
    public Empleado() {
    }
    
    //insertamos getter y setter
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //Insertamos método toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("Nombre=").append(super.getNombre());
        sb.append(", Edad=").append(super.getEdad());
        sb.append(", nif=").append(super.getDni());
        sb.append(", salario=").append(salario);
        sb.append('}');
        return sb.toString();
    }
    
    //Método que permita aumentar el salario en una cantidad que sería pasada
    //como parámetro
    public double aumentoSueldo(double cantidadAumentar) {
        //aumenta el salario
        return this.salario += cantidadAumentar;
    }
    
}
