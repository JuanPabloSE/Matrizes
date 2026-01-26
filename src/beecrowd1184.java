import java.util.Locale;
import java.util.Scanner;

public class beecrowd1184 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String T = sc.next();
        double [] [] matriz = new double [12][12];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }

        double calculo = 0.0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j < i) {
                    calculo += matriz[i][j];
                }
            }
        }

        if (T.equalsIgnoreCase("M")) {
            calculo = calculo / 66;
        }

        System.out.printf("%.1f%n", calculo);

        sc.close();
    }
}
