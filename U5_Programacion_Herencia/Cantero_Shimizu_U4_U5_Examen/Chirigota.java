package Agrupacion;

import java.util.Arrays;
import java.util.Objects;

public class Chirigota extends Agrupacion_oficial implements amo_a_escucha{

    int num_cumples;
    int puntos_obtenidos;

    public Chirigota(String nombre, String autor,
                     String autor_musica, String autor_letra, String disfraz, int num_cumples, int puntos_obtenidos) {
        super(nombre, autor, autor_musica, autor_letra, disfraz);
        this.num_cumples = num_cumples;
        this.puntos_obtenidos = puntos_obtenidos;
    }

    @Override
    public void amo_a_escucha() {

        System.out.println( "Amo a escucha la Chirigota "+ nombre);

    }


    @Override
    public void cantarPresentacacion() {
        super.cantarPresentacacion();
        System.out.println("Cantando la presentación de la Chirigota con nombre "+ nombre);
    }

    public void caminitoDelFalla() {
        super.caminitoDelFalla();
        System.out.println("La chirigota "+ nombre +" va caminito a la falla");
    }

    @Override
    public void hacer_tipo() {
        super.hacer_tipo();
        System.out.println("La Chirigota"+ nombre +" va de "+ disfraz);
    }

    @Override
    public String toString() {
        return "Chirigota{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autor_musica='" + autor_musica + '\'' +
                ", autor_letra='" + autor_letra + '\'' +
                ", disfraz='" + disfraz + '\'' +
                ", integrantes=" + Arrays.toString(integrantes) +
                ", num_cumples=" + num_cumples +
                ", puntos_obtenidos=" + puntos_obtenidos +
                '}';
    }
}
