/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades.actividad12;

/**
 *
 * @author daniel
 */
public class CuentaCorriente extends Cuenta{

    //atritubos encapsulados
    private final double INTERESFIJO = 1.5;
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
        sb.append()
        sb.append("INTERESFIJO=").append(INTERESFIJO);
        sb.append(", saldoMinimo=").append(saldoMinimo);
        sb.append('}');
        return sb.toString();
    }
    
    
    @Override
    public void actualizarSaldo() {
    }

    @Override
    public void retirar(double dineroARetirar) {
    }
    
}
