
import java.util.Scanner;

/* Una empresa automotriz necesita un sistema para seleccionar el tipo de carro (auto, SUV o
camioneta) lo cual debe de aparecer en un menú, y el color (negro, blanco o rojo) en otro menú.
Al final se necesita que despliegue la selección realizada. Nota. Debe de anidarse una estructura
de selección múltiple dentro de otra.*/
public class EmpresaAutomotriz {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int test=1;
    String carro="", color=""; 
    while (test<2) {
        System.out.println("Seleccione el tipo de carro: 1. Auto   2. SUV   3. Camioneta");
    int tipocarro=sc.nextInt();
    sc.nextLine();
    switch (tipocarro) {
        case 1:
            carro="auto";
            color=listadecolores();
            test++;
            break;
        case 2:
            carro="SUV";
            color=listadecolores();
            test++;
            break;
        case 3:
            carro="Camioneta";
            color=listadecolores();
            test++;
            break;
    
        default:
        System.out.println("Numero no valido");
            break;
    }
} 
System.out.println("La seleccion es la siguiente: Tipo de Carro: " +carro+ "   Tipo de Color: " +color);

    
} 
public static String listadecolores() {
   Scanner sc=new Scanner(System.in);
    int test=1;
    String autocolor="";
    while (test<2) {
        System.out.println("Seleccione el color del carro: 1. Negro  2. Blanco  3. Rojo");
    int color=sc.nextInt();
    sc.nextLine();
        switch (color) {
            case 1 :
                autocolor="negro";
                test++;
                break;
            case 2 :
                autocolor="blanco";
                test++;
                break; 
            case 3 :
                autocolor="rojo";
                test++;
                break;
        
            default: 
            System.out.println("El numero ingresado no es valido");
                break;  
    }
    
    }
    return autocolor;
}
}
