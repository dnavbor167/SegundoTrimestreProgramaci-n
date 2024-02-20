/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades.Actividad15.ParteB;

/**
 *
 * @author daniel
 */
public class Senador extends Legislador implements DiputadoSenador {

    //insertamos atributos encapsulados
    private double complemento;

    //insertamos constructor parametrizado
    public Senador(double complemento, String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(provincia, partidoPolitico, nombre, apellidos);
        this.complemento = complemento;
    }

    //insertamos constructor sin parametrizar
    public Senador() {
    }

    //insertamos getter y setters
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Senador{");
        sb.append("Nombre y apellido: ").append(super.getNombre());
        sb.append(" ").append(super.getApellidos());
        sb.append(", complemento=").append(complemento);
        sb.append('}');
        return sb.toString();
    }

    //insertamos método de la interface
    @Override
    public String diputadoOSenador() {
        return "Soy Senador";
    }

    //sobreescribimos el método de compare
    @Override
    public int compareTo(Persona o) {
        if (o instanceof Senador) {
            return Double.compare(this.complemento, ((Senador) o).complemento);
        }
        //llamada al comparable de persona
        return o.compareTo(this);
    }

}
