package Agrupacion;

import java.util.Arrays;

public abstract class Agrupacion_oficial extends Agrupacion {

    Integrante[]integrantes;
    int cont1;


    public Agrupacion_oficial(String nombre, String autor, String autor_musica,
                              String autor_letra, String disfraz) {
        super(nombre, autor, autor_musica, autor_letra, disfraz);
        integrantes = new Integrante[0];
        cont1++;
    }

    public int getCont1() {
        return cont1;
    }

    public void setCont1(int cont1) {
        this.cont1 = cont1;
    }

    public void insertarIntegrante(Integrante integrante){

        Integrante[] i2 = new Integrante[0];

        i2 = Arrays.copyOf(integrantes , integrantes.length + 1);
        i2[i2.length - 1] = integrante;
        integrantes = i2;

    }

    public boolean eliminarIntegrante(Integrante i){

        Integrante[] i2 = new Integrante[0];
        boolean eliminado = false;


        for (int j = 0; j < integrantes.length; j++) {

            if(i.equals(integrantes[j])){

                eliminado = true;

            } else {
                i2 = Arrays.copyOf(i2, i2.length + 1);
                i2[i2.length - 1] = integrantes[j];

            }

        }

        integrantes = i2;

        return eliminado;

    }

    public void caminitoDelFalla(){


    }


    @Override
    public String toString() {
        return "Agrupacion_oficial{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autor_musica='" + autor_musica + '\'' +
                ", autor_letra='" + autor_letra + '\'' +
                ", disfraz='" + disfraz + '\'' +
                ", integrantes=" + Arrays.toString(integrantes) +
                '}';
    }
}
