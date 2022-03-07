package Municipio;

import java.util.Arrays;
import java.util.Comparator;

public class Registro{

    Propiedad[] propiedades;

    public Registro() {

        propiedades = new Propiedad[0];

    }

    public Propiedad[] getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(Propiedad[] propiedades) {
        this.propiedades = propiedades;
    }

    public boolean addPropiedad(Propiedad p) {

        propiedades = Arrays.copyOf(propiedades, propiedades.length + 1);
        propiedades[propiedades.length - 1] = p;


        return true;
    }

    public boolean eliminarPropiedad(Propiedad p) {


        Propiedad[] propiedades2 = new Propiedad[0];

        if (esta(propiedades, p)) {
            for (int i = 0; i < propiedades.length; i++) {
                if (!propiedades[i].equals(p)) {

                    propiedades2 = Arrays.copyOf(propiedades2, propiedades2.length + 1);
                    propiedades2[propiedades2.length - 1] = propiedades[i];

                }

                propiedades = propiedades2;
            }
            return true;

        }
        return false;


    }


    public boolean esta(Propiedad[] lista, Propiedad p) {

        for (int i = 0; i < lista.length; i++) {
            if (p.equals(lista[i])) {

                return true;
            }
        }
        return false;

    }


    public void informeSuperficie() {

        Arrays.sort(propiedades);
        System.out.println(Arrays.toString(propiedades));

    }

    public void informeAntiguedad() {

        Arrays.sort(propiedades, new Comparator<Propiedad>() {
            @Override
            public int compare(Propiedad propiedad, Propiedad t1) {
                if(propiedad.getYear() == t1.getYear()){
                    return  t1.getM2() - propiedad.getM2() ;

                }
                return  t1.getYear() - propiedad.getYear();
            }
        });

        System.out.println(Arrays.toString(propiedades));

    }


    @Override
    public String toString() {
        return "Registro{" +
                "propiedades=" + Arrays.toString(propiedades) +
                '}';
    }


}
