package Agrupacion;

import java.util.Arrays;

public class COAC {

    Agrupacion_oficial [] agrupacionesOficiales;

    public COAC() {
        this.agrupacionesOficiales = new Agrupacion_oficial[0];
    }

    public void insertarAgrupacion(Agrupacion_oficial grupoPro){

        Agrupacion_oficial[] i2 = new Agrupacion_oficial[0];

        i2 = Arrays.copyOf(agrupacionesOficiales, agrupacionesOficiales.length + 1);
        i2[i2.length - 1] = grupoPro;
        agrupacionesOficiales = i2;

    }

    public boolean eliminarAgrupacion_oficial(Agrupacion_oficial i){

        Agrupacion_oficial[] i2 = new Agrupacion_oficial[0];
        boolean eliminado = false;


        for (int j = 0; j < agrupacionesOficiales.length; j++) {

            if(i.equals(agrupacionesOficiales[j])){

                eliminado = true;

            } else {
                i2 = Arrays.copyOf(i2, i2.length + 1);
                i2[i2.length - 1] = agrupacionesOficiales[j];
            }
        }

        agrupacionesOficiales = i2;

        return eliminado;

    }



    @Override
    public String toString() {
        return "COAC{" +
                "agrupacionesOficiales=" + Arrays.toString(agrupacionesOficiales) +
                '}';
    }
}
