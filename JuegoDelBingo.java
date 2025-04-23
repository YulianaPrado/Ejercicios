package JuegoDelBingo;
import java.util.Scanner;

public class JuegoDelBingo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos jugadores? ");
        int n = sc.nextInt();
        ICarton[] jugadores = new ICarton[n];

        for (int i = 0; i < n; i++) {
            jugadores[i] = new CartonBingo();
            System.out.println("\nCartón del jugador " + (i + 1) + ":");
            jugadores[i].mostrarCarton();
        }

        boolean[] bolasSacadas = new boolean[91]; // 1 a 90
        boolean hayGanador = false;

        while (!hayGanador) {
            int bola;
            do {
                bola = (int)(Math.random() * 90) + 1;
            } while (bolasSacadas[bola]);
            bolasSacadas[bola] = true;

            System.out.println("\n>> Bola extraída: " + bola);

            for (int i = 0; i < n; i++) {
                boolean acierto = jugadores[i].comprobarNumero(bola);
                if (acierto) {
                    System.out.println("Jugador " + (i + 1) + " ha tachado el número.");
                }

                if (jugadores[i].estaCompleto()) {
                    System.out.println("\n🎉 ¡Jugador " + (i + 1) + " ha ganado el bingo!");
                    hayGanador = true;
                    break;
                }
            }
        }

        System.out.println("\nCartones finales:");
        for (int i = 0; i < n; i++) {
            System.out.println("Jugador " + (i + 1) + ":");
            jugadores[i].mostrarCarton();
        }

        sc.close();
    }
}//YulianaPrado