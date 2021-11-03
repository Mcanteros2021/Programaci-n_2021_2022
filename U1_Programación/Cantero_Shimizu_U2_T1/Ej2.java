import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ponga un número entero positivo");
        Integer num = sc.nextInt();
        System.out.println("Ponga una cifra del 0 al 9");
        Integer cifra = sc.nextInt();
        Integer contador = 0;
        Integer contPos = 1;
        String pos = "";

        do{

            if(num%10 == cifra){
                contador++;
                pos = contPos+" "+pos;
            }
            num = num/10;
            contPos++;

        } while(num > 0);
        System.out.println(contador+" ocurrencias");
        if(contador != 0){
            System.out.println("Posiciones : "+ pos );
        } else {
            System.out.println("Posición : Ninguna");
        }

    }
}
