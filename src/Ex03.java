import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        double [][] matriz = new double [N][N];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }

        double [] vet = new double [N];

        for (int i = 0; i < matriz.length; i++) {
            double soma = 0.0;
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
            vet[i] = soma;
        }

        for (int i = 0; i < vet.length; i++)  {
        System.out.printf("%.1f%n", vet[i]);
        }

        sc.close();
    }
}
