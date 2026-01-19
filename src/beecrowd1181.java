import java.util.Locale;
import java.util.Scanner;

public class beecrowd1181 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int linha = sc.nextInt();
        String T = sc.next();

        double [] [] matriz = new double [12][12];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz [i][j] = sc.nextDouble();
            }
        }

        double calculo = 0.0;
        double media = 0.0;
        for (int j = 0; j < matriz.length; j++){

            if (T.equalsIgnoreCase("S")) {
                calculo += matriz[linha][j];
            }
            else if (T.equalsIgnoreCase("M")) {
                media +=  matriz[linha][j];
                calculo = media / 12;
            }
        }

        System.out.printf("%.1f%n", calculo);

        sc.close();
    }
}
