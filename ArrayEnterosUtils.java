

import java.util.Random;

public class ArrayEnterosUtils {
    
    public static int[] generaArrayInt(int n, int min, int max) { //generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro//
        Random rand = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(max - min + 1) + min; //rand.nextInt genera número aleatorio//
        }
        return array;
    }

    public static int minimoArrayInt(int[] array) { // minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro//
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }


    public static int maximoArrayInt(int[] array) { // maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.//
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static double mediaArrayInt(int[] array) { //mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return (double) suma / array.length; //array.lenght tamaño del array//
    }
    public static boolean estaEnArrayInt(int[] array, int numero) { // estaEnArrayInt: Dice si un número está o no dentro de un array.//
        for (int num : array) {
            if (num == numero) {
                return true;
            }
        }
        return false;
    }
    public static int posicionEnArray(int[] array, int numero) { // posicionEnArray: Busca un número en un array y devuelve la posición (el índice) en la que se encuentra.//
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return i;
            }
        }
        return -1;
    }
    public static int[] volteaArrayInt(int[] array) { //volteaArrayInt: Le da la vuelta a un array. //
        int[] invertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            invertido[i] = array[array.length - 1 - i]; // el -1 significa que no se encontro//
        }
        return invertido;
    }

    public static int[] rotaDerechaArrayInt(int[] array, int n) { //rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array. //
        int[] resultado = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            resultado[(i + n) % array.length] = array[i];
        }
        return resultado;
    }

    public static int[] rotaIzquierdaArrayInt(int[] array, int n) { // rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de un array.//
        int[] resultado = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            resultado[i] = array[(i + n) % array.length];
        }
        return resultado;
    }

    public static void imprimirArray(int[] array) { //Imprime los elementos del array en consola separados por espacios y añade una línea nueva al final //
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
public static void main(String[] args) { //ejemplo//
        int[] miArray = generaArrayInt(12, 1, 60);
        System.out.print("Array generado: ");
        imprimirArray(miArray);

        System.out.println("Mínimo: " + minimoArrayInt(miArray));
        System.out.println("Máximo: " + maximoArrayInt(miArray));
        System.out.println("Media: " + mediaArrayInt(miArray));
        System.out.println("¿Esta el número 22 ? " + estaEnArrayInt(miArray, 22));
        System.out.println("Posición del número 22: " + posicionEnArray(miArray, 22));

        System.out.print("Array invertido: ");
        imprimirArray(volteaArrayInt(miArray));

        System.out.print("Array rotado 3 a la derecha: ");
        imprimirArray(rotaDerechaArrayInt(miArray, 3));

        System.out.print("Array rotado 2 a la izquierda: ");
        imprimirArray(rotaIzquierdaArrayInt(miArray, 2));
    }
    
}

