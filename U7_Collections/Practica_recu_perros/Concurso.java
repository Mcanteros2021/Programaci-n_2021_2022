package Practica_recu_perros;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Concurso {

    Map<String, Set<Perro>> perros;

    public Concurso() {
        perros = new HashMap<>();
    }

    public boolean adddog(String raza, Perro p){
        if(raza.equals(p.raza)){

            if(!perros.containsKey(raza)){

                perros.put(raza,new TreeSet<Perro>());

            }

            perros.get(raza).add(p);

            return true;

        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Concurso{" +
                "perros=" + perros +
                '}';
    }
}
