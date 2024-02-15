/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades.actividad11;

/**
 *
 * @author danielnavasborjas
 */
public abstract class Figura {
    //atributos encapsulados
    private int base;
    private int altura;
    
    //insertamos constructor parametrizado
    public Figura(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    //insertamos constructor sin parametrizar
    public Figura() {
    }
    
    //inertamos getter y setter
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    //insertamos toString
    //¿PREGUNTAR A VICO SI HACE FALTA PONER TOSTRING Y EQUALS Y HASHCODE EN LA PADRE SI ES ABSTRACTA?
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figura{");
        sb.append("base=").append(base);
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
    }
    
    //hashcode y equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.base;
        hash = 61 * hash + this.altura;
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
        final Figura other = (Figura) obj;
        if (this.base != other.base) {
            return false;
        }
        return this.altura == other.altura;
    }
    
    //insertamos el método de calcular área en dos de ellos es multiplicando
    //base por altura y en solo el del triangulo es diferente por lo 
    //que en el triangulo lo sobreescribiremos
    public int calcularArea() {
        return this.base*this.altura;
    }
}
