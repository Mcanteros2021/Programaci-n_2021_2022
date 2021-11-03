import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer contador = 0;
        Integer contador2 = 0;
        String num;
        boolean primo = true;

        do{
            System.out.println("Ponga un número con la cantidad de numeros par");
            num = sc.nextLine();

        } while(num.length() % 2 != 0 );

        do{
            Integer.parseInt(num);
            Integer y = num%100;
            for (int i = 2; i < y; i++) {
                if(y%i == 0){
                    primo = false;
                }
            }
            if(primo){
                System.out.println(y+ " No es primo");
            } else {
                System.out.println(y+ " Es primo");
            }

            num = num/100;
        }while( contador < 0);
    }
}
