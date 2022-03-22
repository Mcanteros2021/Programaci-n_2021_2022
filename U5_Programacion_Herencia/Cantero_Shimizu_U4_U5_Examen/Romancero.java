package Agrupacion;

public class Romancero extends Agrupacion implements amo_a_escucha{

    String tematicaCartelon;

    public Romancero(String nombre, String autor, String autor_musica, String autor_letra,
                     String disfraz, String tematicaCartelon) {
        super(nombre, autor, autor_musica, autor_letra, disfraz);
        this.tematicaCartelon = tematicaCartelon;
    }

    @Override
    public void amo_a_escucha() {
        System.out.println( "Amo a escucha el Romancero"+ nombre);
    }

    @Override
    public void cantarPresentacacion() {
        super.cantarPresentacacion();
        System.out.println("Cantando la presentación del Romancero con nombre "+ nombre);
    }

    @Override
    public void hacer_tipo() {
        super.hacer_tipo();
        System.out.println("El romancero "+ nombre +" va de "+ disfraz);
    }

    @Override
    public String toString() {
        return "Romancero{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autor_musica='" + autor_musica + '\'' +
                ", autor_letra='" + autor_letra + '\'' +
                ", disfraz='" + disfraz + '\'' +
                ", tematicaCartelon='" + tematicaCartelon + '\'' +
                '}';
    }
}
