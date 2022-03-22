package Agrupacion;

import java.util.Arrays;

public class Cuarteto extends Agrupacion_oficial implements amo_a_escucha{

    int numero_de_miembros;
    int puntos_obtenidos;

    public Cuarteto(String nombre, String autor,
                    String autor_musica, String autor_letra, String disfraz, int numero_de_miembros, int puntos_obtenidos) {
        super(nombre, autor, autor_musica, autor_letra, disfraz);
        this.numero_de_miembros = numero_de_miembros;
        this.puntos_obtenidos = puntos_obtenidos;
    }

    @Override
    public void amo_a_escucha() {
        System.out.println( "Amo a escucha el Cuarteto "+ nombre);
    }

    @Override
    public void cantarPresentacacion() {
        super.cantarPresentacacion();
        System.out.println("Cantando la presentación del cuarteto con nombre "+ nombre);
    }

    public void caminitoDelFalla() {
        super.caminitoDelFalla();
        System.out.println("El cuarteto "+ nombre +" va caminito a la falla");
    }

    @Override
    public void hacer_tipo() {
        super.hacer_tipo();
        System.out.println("El cuarteto "+ nombre +" va de "+ disfraz);
    }

    @Override
    public String toString() {
        return "Cuarteto{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autor_musica='" + autor_musica + '\'' +
                ", autor_letra='" + autor_letra + '\'' +
                ", disfraz='" + disfraz + '\'' +
                ", integrantes=" + Arrays.toString(integrantes) +
                ", numero_de_miembros=" + numero_de_miembros +
                ", puntos_obtenidos=" + puntos_obtenidos +
                '}';
    }
}
