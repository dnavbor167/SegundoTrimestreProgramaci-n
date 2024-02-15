/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades.actividad12;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author daniel
 */
public abstract class Cuenta {

    private String numeroCuenta;
    private double saldo;
    private Persona cliente;
    public static Set<String> setNumeroCuenta = new HashSet<>();

    //Metemos constructor parametrizado
    public Cuenta(Persona cliente) {
        String contra;
        do {
            contra = contraseña();
            this.numeroCuenta = contra;
        } while (numeroCuenta.contains(contra));

        this.saldo = 0.0;
        this.cliente = cliente;
    }

    //constructor vacio
    public Cuenta() {
    }

    //Metemos getter y sette
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    //insertamos toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuenta{");
        sb.append("numeroCuenta=").append(numeroCuenta);
        sb.append(", saldo=").append(saldo);
        sb.append(", cliente=").append(cliente);
        sb.append('}');
        return sb.toString();
    }

    //Insertamos equals y hashcode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.numeroCuenta);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.saldo) ^ (Double.doubleToLongBits(this.saldo) >>> 32));
        hash = 79 * hash + Objects.hashCode(this.cliente);
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
        final Cuenta other = (Cuenta) obj;
        if (Double.doubleToLongBits(this.saldo) != Double.doubleToLongBits(other.saldo)) {
            return false;
        }
        if (!Objects.equals(this.numeroCuenta, other.numeroCuenta)) {
            return false;
        }
        return Objects.equals(this.cliente, other.cliente);
    }

    //Método para contraseña aleatoria
    public String contraseña() {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        sb.append("ES");
        do {
            for (int i = 0; i < 18; i++) {
                sb.append(r.nextInt(0, 10));
            }
            if (setNumeroCuenta.contains(sb)) {
                sb.delete(2, 20);
            }
        } while (setNumeroCuenta.contains(sb));
        return sb.toString();
    }

    //Métodos abstractos
    public abstract void actualizarSaldo();

    public abstract void retirar(double dineroARetirar);

}
