/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades.Actividad15.ParteB;

/**
 *
 * @author daniel
 */
public class Alcalde extends Legislador{
    //insertamos atributo encapsulado
    private String ciudad;
    
    //insertamos constructor parametrizado
    public Alcalde(String ciudad, String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(provincia, partidoPolitico, nombre, apellidos);
        this.ciudad = ciudad;
    }
    
    //insertamos constructor sin parametros
    public Alcalde() {
    }
    
    //insertamos getter y setter
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    //insertamos toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alcalde{");
        sb.append("Nombre y apellido: ").append(super.getNombre());
        sb.append(super.getApellidos());
        sb.append("ciudad=").append(ciudad);
        sb.append('}');
        return sb.toString();
    }
    
    
}
