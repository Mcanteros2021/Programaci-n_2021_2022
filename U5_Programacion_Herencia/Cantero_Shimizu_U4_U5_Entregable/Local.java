package Municipio;

public abstract class Local extends Propiedad{

    private Persona propietario;
    private double precio;

    public Local(int year, String direccion, int m2, Persona propietario, double precio) {
        super(year, direccion, m2);
        this.propietario = propietario;
        this.precio = precio;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Local{"+ super.toString() +
                "propietario=" + propietario +
                ", precio=" + precio +
                '}';
    }
}
