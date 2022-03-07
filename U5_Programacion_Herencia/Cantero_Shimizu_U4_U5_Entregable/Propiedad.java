package Municipio;

import java.util.Objects;

public abstract class Propiedad implements Comparable<Propiedad> {

    private int year;
    private String direccion;
    private int m2;

    public Propiedad(int year, String direccion, int m2) {
        this.year = year;
        this.direccion = direccion;
        this.m2 = m2;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }






    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Propiedad)) return false;
        Propiedad propiedad = (Propiedad) o;
        return direccion.equals(propiedad.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direccion);
    }

    @Override
    public String toString() {
        return "Propiedad{" +
                "year=" + year +
                ", direccion='" + direccion + '\'' +
                ", m2=" + m2 +
                '}';
    }

    @Override
    public int compareTo(Propiedad p) {
        return p.getM2() - getM2();
    }
}
