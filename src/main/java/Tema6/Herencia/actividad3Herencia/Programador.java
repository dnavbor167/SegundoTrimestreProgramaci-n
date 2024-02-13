/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema6.Herencia.actividad3Herencia;

/**
 *
 * @author danielnavasborjas
 */
public class Programador extends Empleado {
    //Insertamos el atributo encapsulado específico de esta clase
    private Categoria categoriaProgram;
    
    //Insertamos constructor parametrizado
    public Programador(Categoria categoriaProgram, double salario, String nombre, String dni, int edad) {    
        super(salario, nombre, dni, edad);
        this.categoriaProgram = categoriaProgram;
    }

    //insertamos constructor por defecto
    public Programador() {
    }
    
    //Insertamos getter y setter
    public Categoria getCategoriaProgram() {
        return categoriaProgram;
    }

    public void setCategoriaProgram(Categoria categoriaProgram) {
        this.categoriaProgram = categoriaProgram;
    }
    
    //insertamos el toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Programador{");
        sb.append("Nombre=").append(super.getNombre());
        sb.append(", Edad=").append(super.getEdad());
        sb.append(", NIF=").append(super.getDni());
        sb.append(", Salario=").append(super.getSalario());
        sb.append("categoriaProgram=").append(categoriaProgram);
        sb.append('}');
        return sb.toString();
    }
    
}
