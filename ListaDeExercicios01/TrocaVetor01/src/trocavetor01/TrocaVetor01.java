package trocavetor01;
import java.util.Scanner;

public class TrocaVetor01 {

    public static void main(String[] args) {
          Scanner ler = new Scanner(System.in);
          int N[] = new int[20];
       
          for(int i = 0; i < N.length; i++){
              N[i] = ler.nextInt();
          }
          
          for(int i = 0; i < N.length; i++){
              int Y ;
             Y = N[N.length - 1 -i ];
             N[N.length - 1 -i ]   = Y;
             System.out.println("N["+i+"] = "+Y);
          }
    }
    
}
