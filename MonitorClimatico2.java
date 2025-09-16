//Yuliana Prado 20242229090//
import java.util.Random;
public class MonitorClimatico2 {
    public static void main(String[] args) {
        int[] temperaturas = generarTemperaturas(15, 30);
        mostrarTemperaturas(temperaturas);
        System.out.println("\n Análisis:");
        System.out.println("mínima: " + temperaturaMinima(temperaturas));
        System.out.println("máxima: " + temperaturaMaxima(temperaturas));
        System.out.println("media: " + mediaTemperaturas(temperaturas));
        System.out.println("desviación estándar: " + desviacionEstandar(temperaturas));
        System.out.println("\n clasificación:");
        String[] clasificacion = clasificarTemperaturas(temperaturas);
        for (int i = 0; i < clasificacion.length; i++) {
            System.out.println("dia " + i + ": " + clasificacion[i]);
        }
         System.out.println("\n anomalías en días:");
        int[] anomalias = detectarAnomalias(temperaturas);
        for (int dia : anomalias) {
            System.out.println("día " + dia + " (" + temperaturas[dia] + "°C)");
        }
    }
    public static int[] generarTemperaturas(int min, int max) {
        Random random = new Random();
        int[] temperaturas = new int[7]; 
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = random.nextInt(max - min + 1) + min;
        } return temperaturas;
    }
    public static int temperaturaMinima(int[] temperaturas) {
        int min = temperaturas[0];
        for (int tem : temperaturas) {
            if (tem < min) {
                min = tem;
            }
        } return min;
    }
    public static int temperaturaMaxima(int[] temperaturas) {
        int max = temperaturas[0];
        for (int tem : temperaturas) {
            if (tem > max) {
                max = tem;
            }
        } return max;
    }
    public static double mediaTemperaturas(int[] temperaturas) {
        int sumatem = 0;
        for (int tem : temperaturas) {
            sumatem += tem;
        }
        return (double) sumatem / temperaturas.length;
    }
    public static double desviacionEstandar(int[] temperaturas) {
        double media = mediaTemperaturas(temperaturas);
        double sumaCuadrados = 0;
        for (int tem : temperaturas) {
            sumaCuadrados += Math.pow(tem - media, 2); //el Math.pow eleva un numero a la potencia de otro//
        } return Math.sqrt(sumaCuadrados / temperaturas.length); //El math.sqrt calcula la raiz cuadrada de un numero//
    }
    public static boolean hayTemperatura(int[] temperaturas, int valor) {
        for (int tem : temperaturas) {
            if (tem == valor) {
                return true;
            }
        } return false;
    }
    public static int diaDeTemperatura(int[] temperaturas, int valor) {
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] == valor) {
                return i; 
            }
        } return -1; // -1 significa que no se encontro la temperatura//
    }
    public static void invertirTemperaturas(int[] temperaturas) {
        int i = 0, j = temperaturas.length - 1;
        while (i < j) {
            int tem = temperaturas[i];
            temperaturas[i] = temperaturas[j];
            temperaturas[j] = tem;
            i++;
            j--;
        }
    }
     public static void rotarTemperaturasDerecha(int[] temperaturas, int n) {
        n = n % temperaturas.length;
        for (int k = 0; k < n; k++) {
            int resultado = temperaturas[temperaturas.length - 1];
            for (int i = temperaturas.length - 1; i > 0; i--) {
                temperaturas[i] = temperaturas[i - 1];
            }
            temperaturas[0] = resultado;
        }
    }
    public static void rotarTemperaturasIzquierda(int[] temperaturas, int n) {
        n = n % temperaturas.length;
        for (int k = 0; k < n; k++) {
            int izquierda = temperaturas[0];
            for (int i = 0; i < temperaturas.length - 1; i++) {
                temperaturas[i] = temperaturas[i + 1];
            } temperaturas[temperaturas.length - 1] = izquierda;
        }
    } public static String[] clasificarTemperaturas(int[] temperaturas) {
        String[] clasificar = new String[temperaturas.length];
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] < 18) {
                clasificar[i] = "frio";
            } else if (temperaturas[i] <= 25) {
                clasificar[i] = "templado";
            } else {
                clasificar[i] = "caliente";
            }
        } return clasificar;
    }
    public static int[] detectarAnomalias(int[] temperaturas) {
        double media = mediaTemperaturas(temperaturas);
        double desviacion = desviacionEstandar(temperaturas);
        double limite = 1.5 * desviacion;
        int contador = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            if (Math.abs(temperaturas[i] - media) > limite) {
                contador++;
            }
        } int[] dias = new int[contador];
        int j = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            if (Math.abs(temperaturas[i] - media) > limite) { //math.abs sirve pata obtener el valor absoluto//
                dias[j++] = i;
            }
        } return dias;
    }
    public static void mostrarTemperaturas(int[] temperaturas) {
        String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println(dias[i] + ": " + temperaturas[i] + "°C");
        }
    }
}