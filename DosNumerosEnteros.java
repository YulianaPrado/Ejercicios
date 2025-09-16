
import java.util.Scanner;

public class DosNumerosEnteros {
    public static void main(String[] args){
        Scanner lector = new Scanner (System.in);
        int a,b;
        System.out.println("Ingrese el primer numero mayor: ");
         a = lector.nextInt();
         System.out.println("Ingrese el numero menor:");
         b = lector.nextInt();
    if(a%b==0){
        System.out.println(b+" es divisor de " +a);

    } else{
        System.out.println( b+ " no es divisor de " +b);

    }

    }
}
