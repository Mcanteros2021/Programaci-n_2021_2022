import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer num = 0;
        String asteriscos = "";
        String cadena = "";
        System.out.println("Introduzca una cifra");
         num = sc.nextInt();

         int numa = num;

        do{
            int y = num%10;

            if(y != 0){
                for (int i = 0; i < y; i++) {
                    asteriscos = asteriscos+"*";
                }
                asteriscos = asteriscos+"_";
            } else {
                asteriscos = asteriscos+"_";
            }
            cadena = asteriscos+cadena;
            num = num/10;
            asteriscos="";
        }while(num > 0);
        System.out.println("El número "+numa+" traducido a asteriscos es:");
        System.out.println(cadena);
    }
}
