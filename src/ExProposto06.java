import java.util.Locale;
import java.util.Scanner;

public class ExProposto06 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double [] [] matriz = new double [N] [N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz [i][j] = sc.nextDouble();
            }
        }

        // SOMA DOS NÚMEROS POSITIVOS
        double somaPositivos = 0.0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz [i][j] > 0.0) {
                    somaPositivos += matriz [i][j];
                }
            }
        }
        System.out.printf("SOMA DOS POSITIVOS: %.1f%n", somaPositivos);

        // LEITURA DO ÍNDICE DA LINHA ESCOLHIDA.
        int linha = sc.nextInt();
        System.out.print("LINHA ESCOLHIDA: ");
        for (int j = 0; j < N; j++) {
            System.out.printf("%.1f ", matriz[linha][j]);
        }
        System.out.println();

        // LEITURA DO ÍNDICE DA COLUNA ESCOLHIDA.
        int coluna = sc.nextInt();
        System.out.print("COLUNA ESCOLHIDA: ");
        for (int i = 0; i < N; i++) {
            System.out.printf("%.1f ", matriz[i][coluna]);
        }
        System.out.println();

        // DIAGONAL PRINCIPAL
        System.out.print("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < N; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        // MATRIZ ALTERADA - ELEVAÇÃO AO QUADRADO
        System.out.println("MATRIZ ALTERADA:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = Math.pow(matriz[i][j], 2);
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
