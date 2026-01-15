import java.util.Scanner;

public class ExProposto04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int [] [] matriz = new int[N][N];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j > i) {
                    soma += matriz[i][j];
                }
            }
        }
        System.out.println(soma);

        sc.close();
    }
}
