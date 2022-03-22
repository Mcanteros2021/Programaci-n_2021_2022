package Agrupacion;

import java.util.Arrays;

public class Coro extends Agrupacion_oficial {

    int num_bandurrias;
    int num_guitarras;
    int puntos_obtenidos;

    public Coro(String nombre, String autor, String autor_musica, String autor_letra,
                String disfraz, int num_bandurrias, int num_guitarras, int puntos_obtenidos) {
        super(nombre, autor, autor_musica, autor_letra, disfraz);

        this.num_bandurrias = num_bandurrias;
        this.num_guitarras = num_guitarras;
        this.puntos_obtenidos = puntos_obtenidos;
    }

    @Override
    public void caminitoDelFalla() {
        super.caminitoDelFalla();
        System.out.println("El coro "+ nombre +" va caminito a la falla");
    }

    @Override
    public void cantarPresentacacion() {
        super.cantarPresentacacion();
        System.out.println("Cantando la presentación del coro con nombre "+ nombre);
    }

    @Override
    public void hacer_tipo() {
        super.hacer_tipo();
        System.out.println("El coro " + nombre +" va de "+ disfraz);
    }

    @Override
    public String toString() {
        return "Coro{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autor_musica='" + autor_musica + '\'' +
                ", autor_letra='" + autor_letra + '\'' +
                ", disfraz='" + disfraz + '\'' +
                ", integrantes=" + Arrays.toString(integrantes) +
                ", num_bandurrias=" + num_bandurrias +
                ", num_guitarras=" + num_guitarras +
                ", puntos_obtenidos=" + puntos_obtenidos +
                '}';
    }
}
