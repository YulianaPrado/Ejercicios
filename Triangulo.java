
import java.util.Scanner;

public class Triangulo {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        double a, b, c, s, area;
        System.out.println("Ingrese el valor del primer lao: ");
        a= lector.nextDouble();
        System.out.println("Ingrese el valor del segun lao: ");
        b= lector.nextDouble();
        System.out.println("Ingrese el valor del terc lao: ");
        c= lector.nextDouble();
        if(a+b>c && a+b>c && b+c>a){
            System.out.println("Los lados son de triangulo");
            s=(a+b+c)/2;
            area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Area de triangulo es: "+area);
            if (a==b && b==c && a==c){
                System.out.println("equilatero");

            } else if ( a==b || a==c || b==c){
                System.out.println("Isoceles");
            }
        }

    }
}
