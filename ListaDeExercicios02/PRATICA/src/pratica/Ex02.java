package pratica;

public class Ex02 {

    public static void main(String[] args) {
        int A[] = {78, 12, 35, 1, 17, 4, 43, 11, 17, 1};
        insertionSort(A);
    }

    public static void insertionSort(int[] vetor) {
        for (int i = 1; i < 4; i++) {
            /* Os demais comandos que implementam o algoritmo de
               ordenação por inserção.
             */
            apresentarVetor(vetor);
        }
    }

    public static void apresentarVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            int j = i;
            int x = v[j];
            while (j > 0 && x < v[j - 1]) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = x;
        }

        // Mover a impressão para fora do loop
        for (int i = 3; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println(); // Adicionar quebra de linha para separar os resultados
    }
}
