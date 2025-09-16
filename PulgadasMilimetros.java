
import java.util.Scanner;

public class PulgadasMilimetros {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        int opc;
        double pulgadas, milimetros, yardas, millas, metros, kilometros ;
        System.out.println("Ingrese la opcion que desee: ");
        System.out.println("Opcion 1: pulgadas a milimetros: ");
        System.out.println("Opcion 2: yardas a metros: ");
        System.out.println("Opcion 3: millas a kilometros:");
        opc = lector.nextInt();
        switch (opc){
            case 1:
            System.out.println("Ingrse la cantidad en pulgadas a convertir: ");
            pulgadas = lector.nextDouble();
            milimetros = pulgadas * 25.4;
            System.out.println(pulgadas +"pulgadas equivalen a "+milimetros+ "milimetros");
            break;
            case 2: 
            System.out.println("Ingrse la cantidad en yardas a convertir: ");
            yardas = lector.nextDouble();
            metros = yardas * 0.9144;
            System.out.println(yardas +"yardas equivalen a "+metros+ "metros");
            break;
            case 3: 
            System.out.println("Ingrse la cantidad en millas a convertir: ");
            millas = lector.nextDouble();
            kilometros = millas * 1.63;
            System.out.println(millas +"millas equivalen a "+kilometros+ "kilometros");
            break;
            default:
            System.out.println("Opcion no valida");
    } 


}
}
