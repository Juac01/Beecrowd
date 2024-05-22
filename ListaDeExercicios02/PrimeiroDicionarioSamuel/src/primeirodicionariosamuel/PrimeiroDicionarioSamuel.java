package primeirodicionariosamuel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class PrimeiroDicionarioSamuel {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileReader numocorrencias = new FileReader("D:/ExerciciosBeecrowd/ListaDeExercicios02/PrimeiroDicionarioSamuel/src/primeirodicionariosamuel/ProjetodeAlgoritmos.txt");
        BufferedReader numerode = new BufferedReader(numocorrencias);
        String linha;
        
         String recebeNomes = "";
         int notaAluno = 0;
         
         int alunos = 0;
         String nome = "";
         float somaNotas = 0;
         int mediaNotas = 0;
         float maiorNota = 0;
        while((linha = numerode.readLine()) != null){
            String []valor = linha.split(";");
           
            if( valor.length == 2){
                 nome = valor[0];
                 notaAluno += Integer.parseInt(valor[1]);
                 alunos++;
            }
       
        }
        
        mediaNotas = notaAluno / alunos;
        System.out.printf("Alunos ........... %d\n", alunos);
      
        System.out.printf("Media da Classe .. %d\n", mediaNotas);
        
    }
}
