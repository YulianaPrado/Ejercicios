
import java.util.Scanner;


public class RecibirDatos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int a, b, c;
        System.out.println("Ingrese el primer numero: ");
        a = lector.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        b = lector.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        c = lector.nextInt(); 
        if ( a<b && a<c && b<c){
            
                System.out.println("Estan en orden creciente: ");

            } else{
                System.out.println("Los numeros estan desorganizados ");

            }
        }
    } 


