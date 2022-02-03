import java.util.Arrays;

public class Examen {

    private Sedes sede;
    private String convocatoria;
    private Preguntas[] preguntas;
    private int max_preguntas;

    public Examen(Sedes sede, String convocatoria) {
        this.sede = sede;
        this.convocatoria = convocatoria;
        preguntas = new Preguntas[0];
        max_preguntas = 100;
    }
    public boolean add_pregunta(Preguntas pregunta) {

        if(esta(pregunta)){

            if(preguntas.length < 100){
                preguntas = Arrays.copyOf(preguntas,preguntas.length + 1);
                preguntas[preguntas.length - 1] = pregunta;

            }

        }

        return true;
    }

    public boolean delete_pregunta(Preguntas pregunta){

        Preguntas[] preguntasResultado = new Preguntas[0];

        for (int i = 0; i < preguntas.length; i++) {
            if(!pregunta.equals(preguntas[i]) ){

                preguntasResultado = Arrays.copyOf(preguntas,preguntas.length + 1);
                preguntas[preguntas.length - 1] = preguntas[i];

            }

        }

        preguntas = preguntasResultado;


        return true;
    }

    public boolean esta(Preguntas pregunta){

        boolean esta = true;

        for (int i = 0; i < preguntas.length; i++) {
            if(pregunta.equals(preguntas[i])){
                esta = false;
            }
        }
        return esta;
    }
    


    public Sedes getSede() {
        return sede;
    }

    public void setSede(Sedes sede) {
        this.sede = sede;
    }

    public String getConvocatoria() {
        return convocatoria;
    }

    public void setConvocatoria(String convocatoria) {
        this.convocatoria = convocatoria;
    }

    public Preguntas[] getPregunta() {
        return preguntas;
    }

    public void setPregunta(Preguntas[] pregunta) {
        this.preguntas = pregunta;
    }

    public int getMax_preguntas() {
        return max_preguntas;
    }

    public void setMax_preguntas(int max_preguntas) {
        this.max_preguntas = max_preguntas;
    }

    public boolean mostrar_informacion(){

        System.out.println(toString());
        return true;

    }

    @Override
    public String toString() {
        return "Examen{" +
                "sede=" + sede +
                ", convocatoria='" + convocatoria + '\'' +
                ", pregunta=" + Arrays.toString(preguntas) +
                ", max_preguntas=" + max_preguntas +
                '}';
    }
}
