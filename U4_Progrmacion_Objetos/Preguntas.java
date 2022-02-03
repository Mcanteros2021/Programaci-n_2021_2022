import java.util.Arrays;

public class Preguntas {

    private String enuncidado;
    private int max_op;
    private Opcion[] Opcion;

    public Preguntas(String enuncidado) {
        this.enuncidado = enuncidado;
        this.max_op = 3;
        this.Opcion = new Opcion[0];
    }

    public boolean add_opcion(Opcion opcion) {

        if(esta(opcion)){

            if(Opcion.length < 3){

                Opcion = Arrays.copyOf(Opcion,Opcion.length + 1);
                Opcion[Opcion.length - 1] = opcion;

            }



        }

        return true;
    }

    public boolean delete_opcion(Opcion opcion){

        Opcion[] OpcionResultado = new Opcion[0];

        for (int i = 0; i < Opcion.length; i++) {
            if(!opcion.equals(Opcion[i]) ){

                OpcionResultado = Arrays.copyOf(Opcion,Opcion.length + 1);
                Opcion[Opcion.length - 1] = Opcion[i];

            }

        }

        Opcion = OpcionResultado;


        return true;
    }

    public boolean esta(Opcion opcion){

        boolean esta = true;

        for (int i = 0; i < this.Opcion.length; i++) {
            if(opcion.equals(this.Opcion[i])){
                esta = false;
            }
        }
        return esta;
    }
    

    public String getEnuncidado() {
        return enuncidado;
    }

    public void setEnuncidado(String enuncidado) {
        this.enuncidado = enuncidado;
    }

    public int getMax_op() {
        return max_op;
    }

    public void setMax_op(int max_op) {
        this.max_op = max_op;
    }

    public Opcion[] getOpcion() {
        return Opcion;
    }

    public void setOpcion(Opcion[] Opcion) {
        this.Opcion = Opcion;
    }

    public boolean mostrar_informacion(){

        System.out.println(toString());
        return true;

    }

    @Override
    public String toString() {
        return "Preguntas{" +
                "enuncidado='" + enuncidado + '\'' +
                ", max_op=" + max_op +
                ", Opcion=" + Arrays.toString(Opcion) +
                '}';
    }
}
