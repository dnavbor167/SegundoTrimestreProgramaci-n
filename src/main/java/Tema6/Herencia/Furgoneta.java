/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema6.Herencia;

/**
 *
 * @author daniel
 */
public class Furgoneta extends Vehiculo{
    
    private double cargaMax;

    //Constructores sobrecargados
    //Mismo método en la misma clase
    public Furgoneta(double cargaMax, String matricula, String bastidor, String marca, Double tarifa) {
        super(matricula, bastidor, marca, tarifa);
        this.cargaMax = cargaMax;
    }

    public Furgoneta() {
    }
    
    //sobre cargar constructor
    public Furgoneta (double cargaMax, String matricula, String bastidor) {
        super(matricula, bastidor, null, 0.0);
        this.cargaMax = cargaMax;
    }

    public double getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(double cargaMax) {
        this.cargaMax = cargaMax;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.cargaMax) ^ (Double.doubleToLongBits(this.cargaMax) >>> 32));
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
        final Furgoneta other = (Furgoneta) obj;
        return Double.doubleToLongBits(this.cargaMax) == Double.doubleToLongBits(other.cargaMax);
    }

    @Override
    public String toString() {
        return super.toString() + "\nFurgoneta{" + "cargaMax=" + cargaMax + '}';
    }
    
    //Método
    public void aumentarCarga(double cantidad) {
        this.cargaMax += cantidad;
    }
    
    //Sobreescribimos con el override el método padre
    //esto es un método polimórfico
    @Override
    public void pasarItv() {
        System.out.println("Soy una furgoneta y estoy pasando la itv");
    }
}
