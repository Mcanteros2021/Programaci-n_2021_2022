package Municipio;

import java.util.Objects;

public class Persona {
    private String nif;
    private String nombre;
    private String apellido;
   private static int auto_increment = 1;
   private int id;

    public Persona(String nif, String nombre, String apellido) {

        this.nif = nif;
        this.nombre = nombre;
        this.apellido = apellido;
        id = auto_increment;
        auto_increment++;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public static int getAuto_increment() {
        return auto_increment;
    }

    public static void setAuto_increment(int auto_increment) {
        Persona.auto_increment = auto_increment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return id == persona.id && nif.equals(persona.nif);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, id);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id=" + id +
                '}';
    }
}
