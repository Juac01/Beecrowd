package preenchimentovetor01;

import java.util.Scanner;

public class PreenchimentoVetor01 {

    public static void main(String[] args) {
        /*
        Leia um valor e faça um programa que coloque o valor lido na primeira posição de um vetor N[10]. Em cada posição subsequente, coloque o dobro do valor da posição anterior. Por exemplo, se o valor lido for 1, os valores do vetor devem ser 1,2,4,8 e assim sucessivamente. Mostre o vetor em seguida.

        Entrada
        A entrada contém um valor inteiro (V<=50).

        Saída
        Para cada posição do vetor, escreva "N[i] = X", onde i é a posição do vetor e X é o valor armazenado na posição i. O primeiro número do vetor N (N[0]) irá receber o valor de V.

        Exemplo de Entrada	Exemplo de Saída
        1

        N[0] = 1
        N[1] = 2
        N[2] = 4
        ...
         */
        Scanner ler = new Scanner(System.in);

        int valor = ler.nextInt();

        int x[] = new int[10];
        x[0] = valor;

        for (int i = 1; i < x.length; i++) {
            x[i] = x[i - 1] * 2;
        }

        for (int i = 0; i < x.length; i++) {
            System.out.println("N[" + i + "] = " + x[i]);
        }
    }
}
