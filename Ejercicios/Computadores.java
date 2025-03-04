
import java.util.Scanner;
import javax.xml.transform.SourceLocator;

/*En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
40% de descuento. El precio de cada computadora es de U$500. */
public class Computadores {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double total=0;
        System.out.println("Ingresa la cantidad de equipos que deseas comprar: ");
        int computadoras=sc.nextInt();
        sc.nextLine();
        if (computadoras<5) {
            double resultado=computadoras*500;
             total=resultado-(resultado*0.1);

        } 
        else{
            if (computadoras>=5 && computadoras<10) {
                double resultado=computadoras*500;
                total=resultado-(resultado*0.2);
        
            }
            else{
                if (computadoras>=10) {
                    double resultado=computadoras*500;
                    total=resultado-(resultado*0.4);

                }
            }
        }
        System.out.println("El total de su compra es: "+total);


    }
}
