package Practica_Recu;

public class Main {
    public static void main(String[] args) {

        Vuelixar vuelixar = new Vuelixar();
        vuelixar.cargarDatos();

        Vuelo v1 = new Vuelo("aaaaa", "sevilla", "valencia", "12/02/2023");
        Vuelo v2 = new Vuelo("bbbbb", "malaga", "madrid", "21/05/2023");

        Pasajero p1 = new Pasajero("Paco", "Lopez", "H5441123");
        Pasajero p2 = new Pasajero("Fran", "Lopez", "I8441123");
        Pasajero p3 = new Pasajero("Alvaro", "Lopez", "K9441123");
        Pasajero p4 = new Pasajero("Paca", "Lopez", "H5441123");
        Pasajero p5 = new Pasajero("Frana", "Lopez", "I8441123");
        Pasajero p6 = new Pasajero("Alvara", "Lopez", "K9441123");

        System.out.println(vuelixar.add_vuelo(v1));
        System.out.println(vuelixar.add_vuelo(v1));
        System.out.println(vuelixar.add_vuelo(v2));
        System.out.println(vuelixar);
        System.out.println(vuelixar.addPasajero("aaaaa", p1));
        System.out.println(vuelixar.addPasajero("aaaaa", p5));
        System.out.println(vuelixar.addPasajero("aaaaa", p2));
        System.out.println(vuelixar.addPasajero("aaaaa", p1));
        System.out.println(vuelixar.addPasajero("bbbbb", p1));
        System.out.println(vuelixar.addPasajero("bbbbb", p2));
        System.out.println(vuelixar.addPasajero("aaaaa", p5));
        System.out.println(vuelixar.addPasajero("aaaaa", p2));
        System.out.println(vuelixar.addPasajero("aaaaa", p3));
        System.out.println(vuelixar);
        System.out.println(vuelixar.removePasajero("aaaaa",p1));
        System.out.println(vuelixar.removePasajero("aaaaa",p1));
        System.out.println(vuelixar);
        System.out.println(" ");
        vuelixar.mostrarXPasajeros();
        vuelixar.guardarDatos();




    }
}
