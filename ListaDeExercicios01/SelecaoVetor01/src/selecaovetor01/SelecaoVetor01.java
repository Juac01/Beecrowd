package selecaovetor01;

import java.util.Scanner;

public class SelecaoVetor01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double valorA[] = new double[5];
        
        for(int i = 0; i < valorA.length; i++){
            valorA[i] = ler.nextInt();
        }

        for (int i = 0; i < valorA.length; i++) {
            if (valorA[i] <= 10) {
                System.out.printf("A[%d] = %.1f%n", i, valorA[i]);
            }
        }

    }

}
