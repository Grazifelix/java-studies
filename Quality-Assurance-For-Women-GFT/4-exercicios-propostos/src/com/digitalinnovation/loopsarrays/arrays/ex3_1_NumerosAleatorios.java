package com.digitalinnovation.loopsarrays.arrays;

import java.util.Scanner;

/*
 * Faça um Programa que leia 20 números
 *  inteiros aleatórios (entre 0 e 100) armazene-os num vetor. 
 * Ao final, mostre os números e seus sucessores.
 */
public class ex3_1_NumerosAleatorios {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        int contador = 0;
        do {
            System.out.println("Digite um numero ("+contador+"/19): " );
            numeros[contador] = scanner.nextInt();
            contador++;
        } while(contador < 20);

        System.out.println("NÚMERO | SUCESSOR");
        for (int numero : numeros) {
            System.out.println(numero +" | "+ (numero+1));
        }
        scanner.close();
    }
    
}
