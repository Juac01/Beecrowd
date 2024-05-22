package linhamatriz;

import java.util.Locale;
import java.util.Scanner;

public class LinhaMatriz {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        //CRIANDO VARIAVEIS     
        double soma = 0;
        char T;
        int L = ler.nextInt();
        T = ler.next().toUpperCase().charAt(0);
        double M[][] = new double[12][12];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                M[i][j] = ler.nextDouble();
            }
        }
        for (int j = 0; j < M.length; j++) {
            soma += M[L][j];
        }
        if (T == 'M') {
            soma /= M.length;
        }
        System.out.println(String.format("%.1f", soma));
    }

}
