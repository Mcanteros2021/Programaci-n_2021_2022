package Practica_recu_perros;

import java.util.Objects;

public class Propietario {
    String nombre;
    String apellidos;
    Integer num_socio;
    String pais;

    public Propietario(String nombre, String apellidos, Integer num_socio, String pais) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.num_socio = num_socio;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getNum_socio() {
        return num_socio;
    }

    public void setNum_socio(Integer num_socio) {
        this.num_socio = num_socio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", num_socio=" + num_socio +
                ", pais='" + pais + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Propietario)) return false;
        Propietario that = (Propietario) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(apellidos, that.apellidos) && Objects.equals(num_socio, that.num_socio) && Objects.equals(pais, that.pais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, num_socio, pais);
    }


}
