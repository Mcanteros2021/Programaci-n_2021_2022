package Municipio;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona("54439109H","Mario","Cantero");
        Persona p1b = new Persona("54439109H","Mario","Cantero");
        Persona p2 = new Persona("63439109D","Maria","Durban");
        Persona p3 = new Persona("73439109D","Mario","Cobos");
        Vivienda v1 = new Vivienda(1990,"Ben Alkama n10",120, 5,
                10,20,2000);
        Vivienda v2 = new Vivienda(1991,"Ben Alkama n19",110, 5,
                9,20,2000);
        Industrial i1 = new Industrial(1990,"Ben Alkama n10",2000,p2,
                1000,35.5);
        Comercial c1 = new Comercial(1990,"Ben Alkama n10",120,
                p1,3000,"Muy bonito");
        Equipamiento_servicio e1 = new Equipamiento_servicio(1990,"Ben Alkama n10",
                120,TIPO_SERVICIO.EDUCATIVO);
        Registro r1 = new Registro();
        Vivienda[] viviendas = {v1,v2};


        r1.addPropiedad(v1);
        r1.addPropiedad(i1);
        r1.addPropiedad(c1);
        r1.addPropiedad(e1);

        v1.addPersona(p1);
        v1.addPersona(p2);
        v1.addPersona(p3);
        v1.addPersona(p1b);
        v1.delPersona(p1);


        v1.mostrarPropiedad();

        v1.mostrarPrecioVenta();

        i1.mostrarPropiedad();

        c1.mostrarPropiedad();

        e1.mostrarPropiedad();


        r1.informeAntiguedad();


        Arrays.sort(viviendas);










    }
}
