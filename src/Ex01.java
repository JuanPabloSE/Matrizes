import java.util.Scanner;

public class Ex01 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);

        int M = sc.nextInt(); // LINHAS
        int N = sc.nextInt(); // COLUNAS

        int [] [] matriz = new int [M] [N];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz [i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
