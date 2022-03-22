package Agrupacion;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Coro coro1 = new Coro("Coro1","Federico Garcia Lorca","Lolito Fdez",
                "Messi","Monstruos S.A",3,5,8);

        Integrante i1 = new Integrante(1,"Alfonso",21,"Brenes");
        Integrante i2 = new Integrante(2,"Rafael",40,"Conchinchina");

        Coro coro2 = new Coro("Coro2","El bromas","EdSheran",
                "El Bicho","Halloween",2,2,9);
        Chirigota chirigota1 = new Chirigota("Siuuuu","Jordan","Pinochet",
                "Chuty","Diosas",4,7);
        Comparsa comparsa1 = new Comparsa("Comparsa1","Caillou","Macaco",
                "Conejito Malo","Dinosaurios","Pizzeria Napoles",
                5);
        Romancero romancero1 = new Romancero("Romancero1","Abu l-Walid al Waqqashi","DJ Sonicko",
                "El Cid Campeador","NFTs","Murcia(No existe)");
        COAC concurso1 = new COAC();


        coro1.insertarIntegrante(i1);
        coro1.insertarIntegrante(i2);


        System.out.println(coro1);

        coro1.eliminarIntegrante(i1);

        System.out.println(coro1);

        concurso1.insertarAgrupacion(coro2);
        concurso1.insertarAgrupacion(chirigota1);
        concurso1.insertarAgrupacion(comparsa1);

        System.out.println(concurso1);

        concurso1.eliminarAgrupacion_oficial(chirigota1);

        System.out.println(concurso1);

        System.out.println(romancero1);

        romancero1.cantarPresentacacion();

        chirigota1.amo_a_escucha();

        comparsa1.hacer_tipo();

        coro1.caminitoDelFalla();

        






    }



}
