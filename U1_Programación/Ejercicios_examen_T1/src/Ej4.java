import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la altura");
        Double altura = sc.nextDouble();
        System.out.println("Introduzca el ancho");
        Double ancho = sc.nextDouble();
        sc.nextLine();
        System.out.println("¿ Quiere bordado escriba s/n? ");
        String bordado = sc.nextLine();

        Double tamaño = (altura * ancho);
        Double Preciot =  tamaño * 0.01;
        Double PrecioTotal = Preciot;
        if(bordado.equals("s")){
            PrecioTotal+= 2.50 + 3.25;
        } else {
            PrecioTotal+= 3.25;
        }
        System.out.println("Gracias. Aquí tienes el desglose de su cuenta");
        System.out.println("Bandera de "+tamaño+" cm2: "+Preciot+" €" );
        if(bordado.equals("s")){
            System.out.println("Con escudo: 2.50€");
        } else {
            System.out.println("Sin escudo: 0.00€");
        }
        System.out.println("Gastos de envío: 3.25€");
        System.out.println("Total: "+PrecioTotal+"€");



    }
}
