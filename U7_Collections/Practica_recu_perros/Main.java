package Practica_recu_perros;

public class Main {
    public static void main(String[] args) {

        Concurso concurso = new Concurso();

        Propietario prop = new Propietario("Alfonso","jamaica",123,"españa");

        Perro p1 = new Perro("Agustin", 3,20,false,prop,"caniche");


        concurso.adddog("caniche",p1);
        System.out.println(concurso);

    }
}
