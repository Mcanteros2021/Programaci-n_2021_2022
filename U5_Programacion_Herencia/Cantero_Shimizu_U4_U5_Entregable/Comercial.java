package Municipio;

import java.util.Calendar;

public class Comercial extends Local implements mostrarPrecioVenta{

    private String descricpion;

    public Comercial(int year, String direccion, int m2, Persona propietario, double precio, String descricpion) {
        super(year, direccion, m2, propietario, precio);
        this.descricpion = descricpion;
    }

    public String getDescricpion() {
        return descricpion;
    }

    public void setDescricpion(String descricpion) {
        this.descricpion = descricpion;
    }

    public Boolean mostrarPropiedad(){

        System.out.println(toString() + Calendar.getInstance().toString());

        return true;

    }



    @Override
    public String toString() {
        return "Comercial{" +
                "descricpion='" + descricpion + '\'' +
                '}';
    }

    @Override
    public void mostrarPrecioVenta() {

        System.out.println("Soy un LocalComercial que me dedico a "+ getDescricpion() + "y valgo "+getPrecio());


    }
}
