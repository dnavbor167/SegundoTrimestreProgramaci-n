/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades.Actividad15.ParteB;

/**
 *
 * @author daniel
 */
public class Diputado extends Legislador implements DiputadoSenador{
    //insertamso atributo encapsulado
    private int numeroAsiento;
    
    //Insertamos constructor parametrizado
    public Diputado(int numeroAsiento, String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(provincia, partidoPolitico, nombre, apellidos);
        this.numeroAsiento = numeroAsiento;
    }
    //insertamos constructor sin parametros
    public Diputado() {
    }
    
    //insertamos getter y setter
    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }
    
    //insertamos toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Diputado{");
        sb.append("Nombre y apellido: ").append(super.getNombre());
        sb.append(" ").append(super.getApellidos());
        sb.append(", numeroAsiento=").append(numeroAsiento);
        sb.append('}');
        return sb.toString();
    }
    
    //insertamos método de la interface
    @Override
    public String diputadoOSenador() {
        return "Soy Diputado";
    }
}
