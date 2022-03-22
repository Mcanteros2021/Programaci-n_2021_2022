package Agrupacion;

import Municipio.Propiedad;

import java.util.Comparator;

public abstract class Agrupacion{

    String nombre;
    String autor;
    String autor_musica;
    String autor_letra;
    String disfraz;
    int cont = 0;

    public Agrupacion(String nombre, String autor, String autor_musica, String autor_letra, String disfraz) {
        this.nombre = nombre;
        this.autor = autor;
        this.autor_musica = autor_musica;
        this.autor_letra = autor_letra;
        this.disfraz = disfraz;
        cont++;

    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor_musica() {
        return autor_musica;
    }

    public void setAutor_musica(String autor_musica) {
        this.autor_musica = autor_musica;
    }

    public String getAutor_letra() {
        return autor_letra;
    }

    public void setAutor_letra(String autor_letra) {
        this.autor_letra = autor_letra;
    }

    public String getDisfraz() {
        return disfraz;
    }

    public void setDisfraz(String disfraz) {
        this.disfraz = disfraz;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void num_agrup(){

        System.out.println("Hay "+cont+" agrupaciones");
    }

    public void cantarPresentacacion(){

    }
    public void hacer_tipo(){

    }

    @Override
    public String toString() {
        return "Agrupacion{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autor_musica='" + autor_musica + '\'' +
                ", autor_letra='" + autor_letra + '\'' +
                ", disfraz='" + disfraz + '\'' +
                '}';
    }


}
