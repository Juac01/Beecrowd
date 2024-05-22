package acimadiagonalprincipal;

import java.util.Locale;
import java.util.Scanner;

public class AcimaDiagonalPrincipal {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        double soma = 0;

        char O = ler.next().toUpperCase().charAt(0);
        double M[][] = new double[12][12];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                M[j][i] = ler.nextDouble();
            }
        }

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if (j > i) {
                    soma += M[i][j];
                }
            }
        }
        if (O == 'M') {
            soma /= (M.length * M.length - 12) / 4;
        }

        System.out.println(String.format("%.1f", soma));

    }

}
