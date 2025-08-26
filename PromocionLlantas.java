
import java.util.Scanner;

public class PromocionLlantas {
public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    System.out.println("Ingrese la cantidad de llantas que comprara: ");
    int cantidad = in.nextInt();
    double precioDeUno;
    double total;

    if (cantidad<5){
        precioDeUno=100;

    }else if (cantidad<=10){
        precioDeUno=75;

    }else {
        precioDeUno=50;

    }
    total=cantidad*precioDeUno;
    System.out.println("PRECIO POR CADA LLANTA ES:  "+ precioDeUno);
    System.out.println("TOTAL DE COMPRA POR  " + cantidad + "llantas: " + total);
}

}
