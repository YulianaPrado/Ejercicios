package JuegoDelBingo;

public class CartonBingo implements ICarton {
    private int[][] carton; // 3 filas, 9 columnas
    private boolean[][] tachado;

    public CartonBingo() {
        carton = new int[3][9];
        tachado = new boolean[3][9];
        rellenarCarton();
    }

    @Override
    public void rellenarCarton() {
        int[] usados = new int[91]; // para evitar repetir números (1-90)

        for (int fila = 0; fila < 3; fila++) {
            int numerosEnFila = 0;
            while (numerosEnFila < 5) {
                int col = (int)(Math.random() * 9); // columna 0 a 8
                if (carton[fila][col] != 0) continue;

                int min = col == 0 ? 1 : col * 10;
                int max = col == 8 ? 90 : (col + 1) * 10 - 1;
                int num;
                int intentos = 0;

                do {
                    num = (int)(Math.random() * (max - min + 1)) + min;
                    intentos++;
                    if (intentos > 100) break;
                } while (usados[num] == 1);

                if (usados[num] == 0) {
                    carton[fila][col] = num;
                    usados[num] = 1;
                    numerosEnFila++;
                }
            }
        }
    }

    @Override
    public boolean comprobarNumero(int numero) {
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 9; c++) {
                if (carton[f][c] == numero) {
                    tachado[f][c] = true;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean estaCompleto() {
        int tachados = 0;
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 9; c++) {
                if (carton[f][c] != 0 && tachado[f][c]) {
                    tachados++;
                }
            }
        }
        return tachados == 15;
    }

    @Override
    public void mostrarCarton() {
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 9; c++) {
                if (carton[f][c] == 0) {
                    System.out.print("    ");
                } else if (tachado[f][c]) {
                    System.out.printf("[%2d]", carton[f][c]);
                } else {
                    System.out.printf(" %2d ", carton[f][c]);
                }
            }
            System.out.println();
        }
    }
    public static boolean cartonValido(int[][] carton) {
        if (carton.length != 3) return false;
        for (int i = 0; i < 3; i++) {
            if (carton[i].length != 9) return false;
        }
    
        // 1. Verificar que no haya números repetidos
        boolean[] usados = new boolean[91]; // 1-90
    
        for (int fila = 0; fila < 3; fila++) {
            int ceros = 0;
    
            for (int col = 0; col < 9; col++) {
                int num = carton[fila][col];
    
                // 2. Contar ceros y validar rango
                if (num == 0) {
                    ceros++;
                    continue;
                }
    
                if (num < 1 || num > 90) return false;
    
                // 3. Verificar que no se repite
                if (usados[num]) return false;
                usados[num] = true;
    
                // 4. Verificar orden creciente en la fila (entre números)
                // buscar el anterior número en la misma fila
                for (int k = col - 1; k >= 0; k--) {
                    if (carton[fila][k] != 0 && carton[fila][k] > num) {
                        return false;
                    }
                }
            }
    
            // 5. Validar que hay 4 ceros y 5 números en cada fila
            if (ceros != 4) return false;
        }
    
        // 6. Verificar que los números en cada columna estén en orden creciente
        for (int col = 0; col < 9; col++) {
            int last = -1;
            for (int fila = 0; fila < 3; fila++) {
                int num = carton[fila][col];
                if (num != 0) {
                    if (last != -1 && num < last) return false;
                    last = num;
                }
            }
        }
    
        return true;
    }
}//YulianaPrado
