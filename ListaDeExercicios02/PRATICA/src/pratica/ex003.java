package pratica;

public class ex003 {

    public static void main(String[] args) {
        int vetor[] = {11, 2, 32, 4, 5, 63};
        bubbleSort(vetor);
    }

    public static void bubbleSort(int[] vetor) {
        int aux = 0;
        int ultimaTroca = vetor.length - 1;

        for (int i = 0; i < vetor.length - 1; i++) {
            int posicaoTroca = -1; // Inicializamos como -1 indicando que ainda não houve troca

            for (int j = 0; j < ultimaTroca; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    posicaoTroca = j;
                }
            }

            // Se não houve trocas, o vetor está ordenado
            if (posicaoTroca == -1) {
                break;
            }

            ultimaTroca = posicaoTroca;
        }
    
    }

}
