package com.digitalinnovation.loopsarrays.loops;

import java.util.Scanner;

/*
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
 */
public class ex5_fatorial {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja ver o fatorial de qual numero?");
        int numeroFatorial = scanner.nextInt();
        int fatorial = 1;

        for(int contador = numeroFatorial; contador>=1; --contador){
            fatorial = fatorial*contador;
        }
        System.out.println("O fatorial de "+ numeroFatorial +" é igual a " + fatorial);
        scanner.close();
    }
    
}
