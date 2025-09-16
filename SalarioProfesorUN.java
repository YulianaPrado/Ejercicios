import java.util.Scanner;
public class SalarioProfesorUN {
   public static void main(String[]args) {
    Scanner lector = new Scanner(System.in);
    double salario;
    System.out.println("Ingrese el salario del profesor: ");
    salario = lector.nextDouble();
    if (salario <18.000){
        salario += (salario* 0.12);
    }
    else if(salario>=18.000 && salario <=30.000){
        salario += (salario* 0.08);

    }else if (salario<30.000){
        salario +=(salario * 0.07);

    } else{
        salario += (salario * 0.06);

    }
        System.out.println("El nuevo salario sera de:");
        System.out.println(salario);
   }
}
