package com.digitalinnovation.loopsarrays.loops;

import java.util.Scanner;

/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número 
inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. 
A saída deve ser conforme o exemplo abaixo: */
public class ex6_Tabuada {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja ver a tabuada de qual numero?");
        int numeroTabuada = scanner.nextInt();
        
        System.out.println("TABUADA DE "+numeroTabuada);
        for (int contador = 1; contador<=10; contador++){
            System.out.println(numeroTabuada +" x "+ contador + " = " + numeroTabuada*contador);
        }

        scanner.close();

    }
    
}
