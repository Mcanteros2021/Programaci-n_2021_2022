import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer altura = 0;

        do{
            System.out.println("Introduzca la altura");
            altura = sc.nextInt();
        }while(altura < 4);

        Integer espacio = altura/2 + 1;
        Integer vacio = 1;
        Integer ancho = altura;

        for (int i = 0; i < altura/2 + 2; i++) {
            System.out.print(" ");
        }
        System.out.print("*");

        for (int i = 0; i <= altura - 3; i++) {
            System.out.println(" ");
            if(i == 0){
                for (int j = 0; j < altura/2 + 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("^");
            } else if(i != 0 && i != altura - 3){
                for (int j = 0; j < espacio ; j++) {
                    System.out.print(" ");
                }
                espacio--;
                System.out.print("^");
                for (int j = 0; j < vacio; j++) {
                    System.out.print(" ");
                }
                System.out.print("^");
                vacio+=2;
            } else if(i == altura - 3 ){
                for (int j = 0; j < espacio; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < vacio + 2; j++) {
                    System.out.print("^");
                }

            }

        }
        System.out.println("");
        for (int i = 0; i < altura/2 + 2; i++) {
            System.out.print(" ");
        }
        System.out.print("Y");
    }
}
