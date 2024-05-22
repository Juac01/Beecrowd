package areadireta;

import java.util.Locale;
import java.util.Scanner;

public class AreaDireta {

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
                if (j > i && j > M.length - i - 1) {
                    soma += M[i][j];
                }
            }
        }
        if (O == 'M') {
            soma /= 30;
        }

        System.out.println(String.format("%.1f", soma));

    }

}
