/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades.actividad12;

/**
 *
 * @author daniel
 */
public class CuentaAhorro extends Cuenta{
    //insertamos los atributos encapsulados
    private double interesVariable;
    private double comisionAnual;
    
    //insertamos el constructor parametrizado
    public CuentaAhorro(double interesVariable, double comisionAnual, Persona cliente) {
        super(cliente);
        this.interesVariable = interesVariable;
        this.comisionAnual = comisionAnual;
    }
    //insertamos constructor sin parametrizar
    public CuentaAhorro() {
    }
    
    //insertamos getters y setters
    public double getInteresVariable() {
        return interesVariable;
    }

    public void setInteresVariable(double interesVariable) {
        this.interesVariable = interesVariable;
    }

    public double getComisionAnual() {
        return comisionAnual;
    }

    public void setComisionAnual(double comisionAnual) {
        this.comisionAnual = comisionAnual;
    }
    
    //insertamos el toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CuentaAhorro{");
        sb.append("Cliente= ").append(super.getCliente());
        sb.append("interesVariable=").append(interesVariable);
        sb.append(", comisionAnual=").append(comisionAnual);
        sb.append('}');
        return sb.toString();
    }
    

    @Override
    public void actualizarSaldo() {
        super.setSaldo(super.getSaldo() + (super.getSaldo()*this.interesVariable));
    }

    @Override
    public void retirar(double dineroARetirar) {
        if (super.getSaldo() > 0 && super.getSaldo() <= dineroARetirar) {
            super.setSaldo(dineroARetirar);
            System.out.println("Dinero retirado con éxito");
        } else {
            System.out.println("No se puede retirar dinero, insuficienci de saldo");
        }
        
    }
    
}
