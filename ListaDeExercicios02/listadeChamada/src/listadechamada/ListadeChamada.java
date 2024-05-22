package listadechamada;

import java.util.Scanner;

public class ListadeChamada {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int N = ler.nextInt();
        int K = ler.nextInt();

        ler.nextLine();

        String[] alunos = new String[N];

        for (int i = 0; i < N; i++) {
            alunos[i] = ler.nextLine();
        }

        java.util.Arrays.sort(alunos);

        String alunoSorteado = alunos[K - 1];

        System.out.println(alunoSorteado);

    }

}
