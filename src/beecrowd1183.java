import java.util.Locale;
import java.util.Scanner;

public class beecrowd1183 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String entrada = sc.next();

        double [] [] matriz = new double [12][12];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }

        double calculo = 0.0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i + 1; j < matriz[i].length; j++) {
                calculo += matriz[i][j];
            }
        }

        if (entrada.equalsIgnoreCase("M")) {
            calculo = calculo / 66;
        }

        System.out.printf("%.1f%n", calculo);

        sc.close();
    }
}
