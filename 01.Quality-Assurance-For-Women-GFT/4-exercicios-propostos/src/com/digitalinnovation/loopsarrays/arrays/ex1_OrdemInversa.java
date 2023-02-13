package com.digitalinnovation.loopsarrays.arrays;

import java.util.Scanner;

/* Faça um Programa que leia um vetor
 de 5 números inteiros e mostre-os na ordem inversa.
 */


public class ex1_OrdemInversa {
    public static void main(String [] args){
        int[] numeros = new int[5]; 
        Scanner scanner = new Scanner(System.in);
    
        for (int i=0; i <5; i++){
            System.out.println("Digite um numero: ");
            numeros[i] = scanner.nextInt();
        }
    
        for(int j=(numeros.length-1); j >= 0; j--){
            System.out.print(numeros[j]+" ");
        }

        scanner.close();
    } 
}
