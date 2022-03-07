package Municipio;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Calendar;

public class Vivienda extends Propiedad implements mostrarPrecioVenta{

    private int num_banios;
    private int num_habitaciones;
    private int cap_max;
    private double precio;
    private Persona[] personas;

    public Vivienda(int year, String direccion, int m2, int num_banios, int num_habitaciones, int cap_max, double precio) {
        super(year, direccion, m2);
        this.num_banios = num_banios;
        this.num_habitaciones = num_habitaciones;
        this.cap_max = cap_max;
        this.precio = precio;
        personas = new Persona[0];
    }

    public int getNum_banios() {
        return num_banios;
    }

    public void setNum_banios(int num_banios) {
        this.num_banios = num_banios;
    }

    public int getNum_habitaciones() {
        return num_habitaciones;
    }

    public void setNum_habitaciones(int num_habitaciones) {
        this.num_habitaciones = num_habitaciones;
    }

    public int getCap_max() {
        return cap_max;
    }

    public void setCap_max(int cap_max) {
        this.cap_max = cap_max;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    public boolean addPersona(Persona p){

        if(personas.length < cap_max && !esta(personas,p)){

                personas = Arrays.copyOf(personas,personas.length + 1);
                personas[personas.length - 1] = p;

        }
        return true;
    }

    public boolean delPersona(Persona p){

        if(esta(personas,p)){

            Persona[] personas2 = new Persona[0];

            for (int i = 0; i < personas.length; i++) {
                if(!personas[i].equals(p)){

                    personas2 = Arrays.copyOf(personas2, personas2.length + 1);
                    personas2[personas2.length - 1] = personas[i];

                }
            }

            personas = personas2;
        }
        return true;
    }

    public boolean esta(Persona[]lista,Persona p){

        for (int i = 0; i < lista.length; i++) {
            if(p.equals(lista[i])){

                return true;
            }
        }
        return false;


    }

    public Boolean mostrarPropiedad(){

        System.out.println(toString() + Calendar.getInstance().toString());

        return true;

    }



    @Override
    public String toString() {
        return "Vivienda{" + super.toString() +
                "num_banios=" + num_banios +
                ", num_habitaciones=" + num_habitaciones +
                ", cap_max=" + cap_max +
                ", precio=" + precio +
                ", personas=" + Arrays.toString(personas) +
                '}';
    }

    @Override
    public void mostrarPrecioVenta() {

        System.out.println("Soy una Vivienda con capacidad máxima"+ getCap_max()+ "y valgo "+ getPrecio());


    }


}
