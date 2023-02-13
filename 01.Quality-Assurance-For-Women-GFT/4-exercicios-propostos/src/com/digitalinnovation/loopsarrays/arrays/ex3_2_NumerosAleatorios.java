package com.digitalinnovation.loopsarrays.arrays;

import java.util.Random;

/*
 * Faça um Programa que leia 20 números
 *  inteiros aleatórios (entre 0 e 100) armazene-os num vetor. 
 * Ao final, mostre os números e seus sucessores.
 */

public class ex3_2_NumerosAleatorios {
    public static void main(String [] args){
        Random random = new Random();
        int[] numeros = new int[20];
        int contador = 0;
        do {
            numeros[contador] = random.nextInt(100);
            contador++;
        } while(contador < 20);

        System.out.println("ANTECESSOR | NÚMERO | SUCESSOR");
        for (int numero : numeros) {
            System.out.println((numero-1)+" | "+ numero +" | "+ (numero+1));
        }
    }
    
    
}
