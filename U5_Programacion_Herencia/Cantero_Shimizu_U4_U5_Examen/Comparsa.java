package Agrupacion;

import java.util.Arrays;

public class Comparsa extends Agrupacion_oficial{

    String empresaDeAtrezzo;
    int puntosObtenidos;

    public Comparsa(String nombre, String autor, String autor_musica,
                    String autor_letra, String disfraz, String empresaDeAtrezzo, int puntosObtenidos) {
        super(nombre, autor, autor_musica, autor_letra, disfraz);
        this.empresaDeAtrezzo = empresaDeAtrezzo;
        this.puntosObtenidos = puntosObtenidos;
    }

    @Override
    public void cantarPresentacacion() {
        super.cantarPresentacacion();
        System.out.println("Cantando la presentación de la Comparsa con nombre "+ nombre);
    }

    @Override
    public void caminitoDelFalla() {
        super.caminitoDelFalla();
        System.out.println("La coparsa "+ nombre +" va caminito a la falla");
    }
    @Override
    public void hacer_tipo() {
        super.hacer_tipo();
        System.out.println("La Comparsa"+ nombre +" va de "+ disfraz);
    }

    @Override
    public String toString() {
        return "Comparsa{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autor_musica='" + autor_musica + '\'' +
                ", autor_letra='" + autor_letra + '\'' +
                ", disfraz='" + disfraz + '\'' +
                ", integrantes=" + Arrays.toString(integrantes) +
                ", empresaDeAtrezzo='" + empresaDeAtrezzo + '\'' +
                ", puntosObtenidos=" + puntosObtenidos +
                '}';
    }
}
