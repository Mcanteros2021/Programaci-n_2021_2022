import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        String palos = "pcdt";
        String cartas = "23456789dJQKA";
        double num = Math.random() * 4;
        num = Math.round(num);

        double numc = Math.random() * 13;
        numc = Math.round(numc);

        for (int i = 0; i <= num; i++) {
            if (i == num) {
                char paloAleatorio = palos.charAt(i);
                if (paloAleatorio == 'p') {
                    System.out.println("Palo - pica");
                } else if (paloAleatorio == 'c') {
                    System.out.println("Palo - corazones");
                } else if (paloAleatorio == 'd') {
                    System.out.println("Palo - diamantes");
                } else if (paloAleatorio == 't') {
                    System.out.println("Palo - trébol");
                }
            }
        }
        for (int i = 0; i <= numc; i++) {
            if (i == numc) {
                char cartaAleatorio = cartas.charAt(i);
                if (cartaAleatorio == 'd') {
                    System.out.println("Carta: 10");
                } else{
                    System.out.println("Carta: "+cartaAleatorio);
                }

            }


        }
    }
}