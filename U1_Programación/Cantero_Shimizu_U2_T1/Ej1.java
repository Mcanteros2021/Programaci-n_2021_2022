import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ponga la altura que quiera que tenga su Z");
        Integer altura = sc.nextInt();
        Integer ancho = altura - 1;
        if(altura > 3 && altura%2 != 0){
            for (int i = 0; i < altura; i++) {
                System.out.println();
                ancho--;
                if(i == altura - 1 || i == 0 ){
                    for (int j = 0; j < altura; j++) {
                        System.out.print("*");
                    }
                    for (int j = 0; j < 3; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < altura; j++) {
                        System.out.print("*");
                    }
                } else{
                    for (int j = 0; j <= ancho; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for (int j = 0; j <= 3 + altura - 2 ; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");

                }


            }
        } else {
            System.out.println("Datos incorrectos");
        }


    }
}
