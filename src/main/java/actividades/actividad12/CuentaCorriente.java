/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades.actividad12;

/**
 *
 * @author daniel
 */
public class CuentaCorriente extends Cuenta {

    //atritubos encapsulados
    private final double INTERESFIJO = 0.15;
    private double saldoMinimo;

    //insertamos constructor parametrizado
    public CuentaCorriente(double saldoMinimo, Persona cliente) {
        super(cliente);
        this.saldoMinimo = saldoMinimo;
    }

    //insertamos constructor sin parametrizar
    public CuentaCorriente() {
    }

    //Insertamos getter y setter
    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    //insertamos el toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CuentaCorriente{");
        sb.append("Cliente= ").append(super.getCliente());
        sb.append("INTERESFIJO=").append(INTERESFIJO);
        sb.append(", saldoMinimo=").append(saldoMinimo);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void actualizarSaldo() {
        //si el saldo actual es mayor a 1000 se le aplica diferente la fórmula
        if (super.getSaldo() > 1000) {
            //actualizamos el saldo
            super.setSaldo(super.getSaldo() + (saldoMinimo * INTERESFIJO));
        } else {
            //actualizamos el saldo si el saldo es menor a 1000 con fórmula diferente
            super.setSaldo(super.getSaldo() + (saldoMinimo + INTERESFIJO));
        }
    }

    @Override
    public void retirar(double dineroARetirar) {
        //si cuando vayas a retirar el dinero la cuenta es mayor al saldo mínimo
        //se ejecuta el código
        if ((super.getSaldo() - dineroARetirar)>= saldoMinimo) {
            super.setSaldo(super.getSaldo() - dineroARetirar);
        }

    }

}
