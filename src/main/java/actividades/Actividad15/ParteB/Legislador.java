/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades.Actividad15.ParteB;

/**
 *
 * @author daniel
 */
public abstract class Legislador extends Persona{
    //insertamos atributos encapsulados
    private String provincia;
    private String partidoPolitico;
    
    //insertamos constructor parametriazado
    public Legislador(String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.provincia = provincia;
        this.partidoPolitico = partidoPolitico;
    }
    
    //insertamos constructor sin parametrizar
    public Legislador() {
    }
    
    //insertamos getter y setter
    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }
    
    //insertar toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Legislador{");
        sb.append("Nombre y apellido: ").append(super.getNombre());
        sb.append(super.getApellidos());
        sb.append("provincia=").append(provincia);
        sb.append(", partidoPolitico=").append(partidoPolitico);
        sb.append('}');
        return sb.toString();
    }
    
}
