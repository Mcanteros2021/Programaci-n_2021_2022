import java.util.Arrays;

public class Sedes {

    private String cod_sede;
    private Ciudades_capitales ciudad;
    private Opositor[] opositores;

    public Sedes(String cod_sede, Ciudades_capitales ciudad) {
        this.cod_sede = cod_sede;
        this.ciudad = ciudad;
        opositores = new Opositor[0];
    }





    public boolean add_opositor(Opositor opositor) {

    if(esta(opositor)){

        opositores = Arrays.copyOf(opositores,opositores.length + 1);
        opositores[opositores.length - 1] = opositor;

    }

        return true;
    }

    public boolean delete_opositor(Opositor opositor){

        Opositor[] opositoresResultado = new Opositor[0];

        for (int i = 0; i < opositores.length; i++) {
            if(!opositor.equals(opositores[i]) ){

                opositoresResultado = Arrays.copyOf(opositores,opositores.length + 1);
                opositores[opositores.length - 1] = opositores[i];

            }

        }

        opositores = opositoresResultado;


        return true;
    }

    public boolean esta(Opositor opositor){

        boolean esta = true;

        for (int i = 0; i < opositores.length; i++) {
            if(opositor.equals(opositores[i])){
                esta = false;
            }
        }
        return esta;
    }

    public String getCod_sede() {
        return cod_sede;
    }

    public void setCod_sede(String cod_sede) {
        this.cod_sede = cod_sede;
    }

    public Ciudades_capitales getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudades_capitales ciudad) {
        this.ciudad = ciudad;
    }

    public Opositor[] getOpositores() {
        return opositores;
    }

    public void setOpositores(Opositor[] opositores) {
        this.opositores = opositores;
    }

    public boolean mostrar_informacion(){

        System.out.println(toString());
        return true;

    }

    @Override
    public String toString() {
        return "Sedes{" +
                "cod_sede='" + cod_sede + '\'' +
                ", ciudad=" + ciudad +
                ", opositores=" + Arrays.toString(opositores) +
                '}';
    }
}
