package subtitucaovetor01;

import java.util.Scanner;
public class SubtitucaoVetor01 {

    public static void main(String[] args) {
        /*
        Faça um programa que leia um vetor X[10]. Substitua a seguir, todos os valores nulos e negativos do vetor X por 1. Em seguida mostre o vetor X.

Entrada
A entrada contém 10 valores inteiros, podendo ser positivos ou negativos.

Saída
Para cada posição do vetor, escreva "X[i] = x", onde i é a posição do vetor e x é o valor armazenado naquela posição.

Exemplo de Entrada	Exemplo de Saída
0
-5
63
0
...

X[0] = 1
X[1] = 1
X[2] = 63
X[3] = 1
        */
        Scanner ler = new Scanner(System.in);
        int y = 0;
        int z = 0;
        int x[] = new int[10];
 
        for(int i = 0; i < x.length; i++){
            x[i] = ler.nextInt(); 
        }
            for(int j = 0; j < x.length; j++){ 
                if(x[j]<= 0){
                    x[j] = 1;
                }                       
            } 
                for(int i = 0; i < x.length; i++){
                     System.out.println("X[" +i+ "] = "+ x[i] );
                }
         
       
            
        
    }


}
