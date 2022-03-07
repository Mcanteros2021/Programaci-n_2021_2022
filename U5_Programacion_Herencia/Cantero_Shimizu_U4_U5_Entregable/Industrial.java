package Municipio;

import java.util.Calendar;

public class Industrial extends Local implements mostrarPrecioVenta{

    private double consumo_energetico;

    public Industrial(int year, String direccion, int m2, Persona propietario, double precio, double consumo_energetico) {
        super(year, direccion, m2, propietario, precio);
        this.consumo_energetico = consumo_energetico;
    }

    public double getConsumo_energetico() {
        return consumo_energetico;
    }

    public void setConsumo_energetico(double consumo_energetico) {
        this.consumo_energetico = consumo_energetico;
    }

    public Boolean mostrarPropiedad(){

        System.out.println(toString() + Calendar.getInstance().toString());

        return true;

    }



    @Override
    public String toString() {
        return "Industrial{"+ super.toString() +
                "consumo_energetico=" + consumo_energetico +
                '}';
    }


    @Override
    public void mostrarPrecioVenta() {

        System.out.println("Soy un local industrial con un consumo máximo de "+ getConsumo_energetico() + "y valgo "+ getPrecio());


    }
}
