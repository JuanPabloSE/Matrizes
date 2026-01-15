import java.util.Locale;
import java.util.Scanner;

public class ExProposto01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt(); // NÚMERO DE LINHAS
        int N = sc.nextInt(); // NÚMERO DE COLUNAS

        int[][] matriz = new int[M][N];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("VALORES NEGATIVOS:");
        for (int [] linha : matriz) {
            for (int valor : linha) {
                if (valor < 0) {
                    System.out.println(valor);
                }
            }
        }

            sc.close();
        }
    }