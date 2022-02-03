

public class Opositor {

    private String nombre;
    private String apellidos;
    private Integer anio_nacimiento;
    private Boolean adaptacion;
    private String descripcion;
    private static Integer num_opositores = 0;
    private static Integer num_adaptados = 0;

    public Opositor(String nombre, String apellidos, Integer anio_nacimiento, Boolean adaptacion, String descripcion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anio_nacimiento = anio_nacimiento;
        this.adaptacion = adaptacion;
        this.descripcion = descripcion;

        if(this.adaptacion.equals(true)){
            this.descripcion = descripcion;
            num_adaptados++;
        } else {
            this.descripcion = null;
        }

        num_opositores++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getAnio_nacimiento() {
        return anio_nacimiento;
    }

    public void setAnio_nacimiento(Integer anio_nacimiento) {
        this.anio_nacimiento = anio_nacimiento;
    }

    public Boolean getAdaptacion() {
        return adaptacion;
    }

    public void setAdaptacion(Boolean adaptacion) {
        this.adaptacion = adaptacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public static void setNum_opositores(Integer num_opositores) {
        Opositor.num_opositores = num_opositores;
    }

    public static void setNum_adaptados(Integer num_adaptados) {
        Opositor.num_adaptados = num_adaptados;
    }

    public static Integer getNum_opositores() {
        return num_opositores;
    }

    public static Integer getNum_adaptados() {
        return num_adaptados;
    }

    public boolean mostrar_informacion(){


        System.out.println(toString());
       return true;

    }

    @Override
    public String toString() {
        return "Opositor{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", anio_nacimiento=" + anio_nacimiento +
                ", adaptacion=" + adaptacion +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
