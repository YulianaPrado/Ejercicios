 /*En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste
en lo siguiente:
• Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se
compran de cinco a 10 y de U$50 si se compran más de 10.
• Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas
que compra y la que tiene que pagar por el total de la compra. */

import java.util.Scanner;

public class Llantaspintachas {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Ingresa la cantidad de llantas que deseas comprar: ");
       int llantas=sc.nextInt();
       sc.nextLine();
       if (llantas<5) {
        double resultado=llantas*100;
        System.out.println("El precio de cada llanta es:  "+100+" el total a pagar es: "+resultado);

       }
       else{
        if(llantas>=5 && llantas<=10){
            double resultado=llantas*75;
             System.out.println("El precio de cada llanta es:  "+75+" el total a pagar es: "+resultado);

        }
        else{
            if(llantas>10){
                double resultado=llantas*50;
                System.out.println("El precio de cada llanta es:  "+50+" el total a pagar es: "+resultado);
            }
        }
       }
    }
}
