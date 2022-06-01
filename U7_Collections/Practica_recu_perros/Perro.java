package Practica_recu_perros;

import java.util.Objects;

public class Perro {

    String nombre;
    Integer edad;
    Integer peso;
    Boolean vacuna;
    Propietario propietario;
    String raza;

    public Perro(String nombre, Integer edad, Integer peso, Boolean vacuna, Propietario propietario, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vacuna = vacuna;
        this.propietario = propietario;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Boolean getVacuna() {
        return vacuna;
    }

    public void setVacuna(Boolean vacuna) {
        this.vacuna = vacuna;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vacuna=" + vacuna +
                ", propietario=" + propietario +
                ", raza='" + raza + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Perro)) return false;
        Perro perro = (Perro) o;
        return Objects.equals(nombre, perro.nombre) && Objects.equals(edad, perro.edad) && Objects.equals(peso, perro.peso) && Objects.equals(vacuna, perro.vacuna) && Objects.equals(propietario, perro.propietario) && Objects.equals(raza, perro.raza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, peso, vacuna, propietario, raza);
    }
}
