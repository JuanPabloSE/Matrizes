import java.util.Scanner;

public class Ex01 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);

        int M = sc.nextInt(); // LINHAS
        int N = sc.nextInt(); // COLUNAS

        int [] [] matriz = new int [M] [N];

        for (int i = 0; i < matriz.length; i++) { // QUANTIDADE DE LINHAS
            for (int j = 0; j < matriz[i].length; j++) { // QUANTIDADE DE COLUNAS DA LINHA I.
                matriz [i][j] = sc.nextInt();
            }
        }

        for (int [] ler : matriz) {
            for (int valor : ler) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
