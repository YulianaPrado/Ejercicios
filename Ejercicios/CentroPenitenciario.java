import java.util.Scanner;
/* Un centro penitenciario tiene N internos registrados y requiere un reporte con el nombre y la
condena (en meses) de los internos con menos de 36 meses de condena. También debe mostrar
la cantidad de internos que cumplen con dicha condición.*/
public class CentroPenitenciario {
    
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Ingrese el numero de internos registrados: ");
    int NumIntReg=sc.nextInt();
    sc.nextLine();
    int Requicito=0;
    String nomInt[]= new String[NumIntReg];
    double NumMes[]= new double[NumIntReg];
    int Contador=0;
    while (Contador<NumIntReg) {
        System.out.println("Ingrese el nombre del interno numero "+ (Contador+1)+ " : ");
        String Nombre= sc.nextLine();
        nomInt[Contador]=Nombre;
        Contador++;
     
    }
    Contador=0;
    while (Contador<NumIntReg) {
        System.out.println("Ingrese el numero de meses de condena "+ (Contador+1)+ " : ");
        int Mes= sc.nextInt();
        sc.nextLine();
        if(Mes<36){
            Requicito++;
        }
        NumMes[Contador]=Mes;
        Contador++;
    }
    Contador=0;
    while (Contador<NumIntReg) {
        System.out.println("El interno numero "+ (Contador+1)+ "   Con nombre "+ nomInt[Contador]+ "   Meses de condena " + NumMes[Contador]);
        Contador++;

    }
    System.out.println("El numero de condenados con menos de 36 meses de condena son: "+Requicito);
    }

}
