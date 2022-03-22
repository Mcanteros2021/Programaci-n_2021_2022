package Agrupacion;

import java.util.Objects;

public class Integrante {

    int num_participante;
    String nombre;
    int edad;
    String localidad;

    public Integrante(int num_participante, String nombre, int edad, String localidad) {
        this.num_participante = num_participante;
        this.nombre = nombre;
        this.edad = edad;
        this.localidad = localidad;
    }


    @Override
    public String toString() {
        return "Integrante{" +
                "num_participante='" + num_participante + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", localidad='" + localidad + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Integrante)) return false;
        Integrante that = (Integrante) o;
        return num_participante == that.num_participante && edad == that.edad && nombre.equals(that.nombre) && localidad.equals(that.localidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num_participante, nombre, edad, localidad);
    }
}
