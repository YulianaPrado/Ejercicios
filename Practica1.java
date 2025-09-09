
    import java.util.Scanner;
public class Practica1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1, Sumar");
        System.out.println("2, Restar");
        System.out.println("3, Multiplicar");
        System.out.println("4, Dividir");
        System.out.println("5, resto de la division");
        System.out.println("Ingrese la opcion: ");
        int opcion1 = in.nextInt();
        System.out.println("Ingrese el primer numero: ");
        double num1 = in.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        double num2 = in.nextDouble();
        int opcion = in.nextInt();

        switch(opcion) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;

            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;

            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;

            case 4:
                System.out.println("Resultado: " + (num1 / num2));
                break;

            case 5:
                System.out.println("Resultado: " + (num1 % num2));
                break;

            default:
                System.out.println("NO ES VALIDO");
        }

        in.close();
    }
}

