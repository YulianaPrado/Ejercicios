
import java.util.Scanner;

public class Descuentos {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        double compra;
        System.out.println("Ingrese el valor de la compra: ");
        compra = lector.nextDouble();
        if (compra >= 800 && compra <= 1.500){
            compra = compra - (compra * 0.1);

        } 
        else if (compra >1.500 && compra <=5.000){
            compra = compra - (compra* 0.15);

        } 
        else if (compra>5.000){
            compra = compra - (compra* 0.20);

        } else{
            compra = compra;

        }
        System.out.println("El valor de compra es: " +compra);
    }
}
