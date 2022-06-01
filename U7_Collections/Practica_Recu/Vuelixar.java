package Practica_Recu;


import java.io.*;
import java.util.*;

public class Vuelixar  {

    private TreeMap<String,Vuelo> vuelos;

    public Vuelixar() {

        vuelos = new TreeMap<>();

    }

    public boolean add_vuelo(Vuelo v1){

        if(vuelos.containsKey(v1.getCod())){

            return false;

        } else {

            vuelos.put(v1.getCod(),v1);
            return true;

        }

    }

    public boolean addPasajero (String cod, Pasajero p1){

        if(vuelos.containsKey(cod) && !vuelos.get(cod).getPasajeros().contains(p1)){

            vuelos.get(cod).getPasajeros().add(p1);
            return true;

        } else {

            return false;

        }

    }

    public boolean removePasajero(String cod, Pasajero p1) {

        if (vuelos.containsKey(cod) && vuelos.get(cod).getPasajeros().contains(p1)) {

            vuelos.get(cod).getPasajeros().remove(p1);
            return true;


        } else {

            return false;
        }
    }
    public void mostrarXPasajeros(){
            Collection<Vuelo> v = vuelos.values();
            Set<Vuelo> vuelosOrd = new TreeSet<>(v);
            System.out.println(vuelosOrd);

        }
    public void guardarDatos(){

        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sae.dat"));
            Iterator it = vuelos.values().iterator();

            while(it.hasNext()){

                Vuelo v = (Vuelo) it.next();
                oos.writeObject(v);

            }
            oos.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public void cargarDatos() {

        try {

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sae.dat"));

            while (true) {

                Vuelo v = (Vuelo) ois.readObject();
                add_vuelo(v);


            }


        } catch (Exception e){

        }
    }



    @Override
    public String toString() {
        return "Vuelixar{" +
                "Vuelos=" + vuelos +
                '}';
    }
}
