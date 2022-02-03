public class Opcion {

    private String texto;
    private boolean correcto;

    public Opcion(String texto, boolean correcto) {
        this.texto = texto;
        this.correcto = correcto;
    }




    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isCorrecto() {
        return correcto;
    }

    public void setCorrecto(boolean correcto) {
        this.correcto = correcto;
    }

    public boolean mostrar_informacion(){

        System.out.println(toString());
        return true;

    }

    @Override
    public String toString() {
        return "Opcion{" +
                "texto='" + texto + '\'' +
                ", correcto=" + correcto +
                '}';
    }
}
