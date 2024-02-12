/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema6.Herencia;

/**
 *
 * @author daniel
 */
//Clase Turismo hereda de Vehículo,Turismo es la subclase y Vehículo la superclase
public class Turismo extends Vehiculo {
    
    //Atributo de turismo, no lo tiene vehículo
    private int numeroPuertas;

    public Turismo(int numeroPuertas, String matricula, String bastidor, String marca, Double tarifa) {
        //LLamada al constructor de Vehículo(String, String, String, Double)
        super(matricula, bastidor, marca, tarifa);
        //Una vez el vehículo está creado se inicializan los atributos propios
        //del turismo
        this.numeroPuertas = numeroPuertas;
    }

    public Turismo() {
        //La llamada al constructor sin parámetros está implícita
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Turismo{");
        sb.append("numeroPuertas=").append(numeroPuertas);
        sb.append(", Marca= ").append(super.getMarca());
        sb.append(", Matricula= ").append(super.getMatricula());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.numeroPuertas;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Turismo other = (Turismo) obj;
        return this.numeroPuertas == other.numeroPuertas;
    }
    
    //Este método no podrá acceder a la clase padre
    public void añadirRuedaRepuesto() {
        System.out.println("Añadiendo rueda...");
    }
    
    //Sobreescribimos con el override el método padre
    //esto es un método polimórfico
    @Override
    public void pasarItv() {
        System.out.println("Soy un turismo y estoy pasando la itv"); 
    }
    
}
