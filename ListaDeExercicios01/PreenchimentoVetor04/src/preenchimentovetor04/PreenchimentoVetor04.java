package preenchimentovetor04;

import java.util.Scanner;

public class PreenchimentoVetor04 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int X[] = new int[15];
        int[] par = new int[5];
        int[] impar = new int[5];
        int contadorPar = 0;
        int contadorImpar = 0;

        for (int i = 0; i < X.length; i++) {
            X[i] = Scanner.nextInt(); // vai ler os 15 numeros de entrada

            if (X[i] % 2 == 0) { //verificamos se é para
                par[contadorPar] = X[i];
                contadorPar++;
                if (contadorPar == par.length) {
                    for (int j = 0; j < par.length; j++) {
                        System.out.println("par[" + j + "] = " + par[j]);
                    }
                    contadorPar = 0;
                }
            } else {
                impar[contadorImpar] = X[i];
                contadorImpar++;
                if (contadorImpar == impar.length) {
                    for (int j = 0; j < impar.length; j++) {
                        System.out.println("impar[" + j + "] = " + impar[j]);
                    }
                    contadorImpar = 0;
                }
            }
        }

        for (int i = 0; i < contadorImpar; i++) {
            System.out.println("impar[" + i + "] = " + impar[i]);
        }

        for (int i = 0; i < contadorPar; i++) {
            System.out.println("par[" + i + "] = " + par[i]);
        }

    }
}
