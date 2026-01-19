import java.util.Locale;
import java.util.Scanner;

public class ExProposto07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt(); // NÚMERO DE FILAS
        int N = sc.nextInt(); // QUANTIDADE DE SOLDADOS

        int [] [] matriz = new int [M][N];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt(); // CADA SOLDADO (SEU NÚMERO)
            }
        }

        // GIRA FILA
        int fila = sc.nextInt();
        fila = fila - 1;

        int ultimoDaFila = matriz[fila][N - 1];

        for (int j = N - 1; j > 0; j--) {
            matriz[fila][j] = matriz[fila][j - 1];
        }

        matriz[fila][0] = ultimoDaFila;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
