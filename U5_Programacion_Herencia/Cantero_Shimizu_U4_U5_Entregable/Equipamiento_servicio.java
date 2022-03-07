package Municipio;

import java.util.Calendar;

public class Equipamiento_servicio extends Propiedad{

    TIPO_SERVICIO servicio;

    public Equipamiento_servicio(int year, String direccion, int m2, TIPO_SERVICIO servicio) {
        super(year, direccion, m2);
        this.servicio = servicio;
    }

    public TIPO_SERVICIO getServicio() {
        return servicio;
    }

    public void setServicio(TIPO_SERVICIO servicio) {
        this.servicio = servicio;
    }

    public Boolean mostrarPropiedad(){

        System.out.println(toString() + Calendar.getInstance().toString());

        return true;

    }


    @Override
    public String toString() {
        return "Equipamiento_servicio{" + super.toString()+
                "servicio=" + servicio +
                '}';
    }
}
