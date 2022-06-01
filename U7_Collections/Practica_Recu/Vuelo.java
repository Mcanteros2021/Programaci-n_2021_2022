package Practica_Recu;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;

public class Vuelo implements Comparable<Vuelo>, Serializable {

    private String cod;
    private String origen;
    private String destino;
    private String fecha;
    private HashSet<Pasajero> Pasajeros;


    public Vuelo(String cod, String origen, String destino, String fecha) {
        this.cod = cod;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.Pasajeros = new HashSet<>();
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public HashSet<Pasajero> getPasajeros() {
        return Pasajeros;
    }

    public void setPasajeros(HashSet<Pasajero> pasajeros) {
        Pasajeros = pasajeros;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vuelo)) return false;
        Vuelo vuelo = (Vuelo) o;
        return cod.equals(vuelo.cod) && Objects.equals(origen, vuelo.origen) && Objects.equals(destino, vuelo.destino) && Objects.equals(fecha, vuelo.fecha) && Objects.equals(Pasajeros, vuelo.Pasajeros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cod, origen, destino, fecha, Pasajeros);
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "cod='" + cod + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }


    @Override
    public int compareTo(Vuelo vuelo) {
        return this.getPasajeros().size() - vuelo.getPasajeros().size();
    }
}
