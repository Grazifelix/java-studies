package com.digitalinnovation.loopsarrays.loops;

import java.util.Scanner;

/*
 * Faça um programa que peça N números inteiros. 
 * Calcule e mostre a quantidade de números pares
 * e a quantidade de números impares.
 */

public class ex4_ParInpar {
    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos numeros deseja verificar? ");

        int quantidadeNumeros = scanner.nextInt();
        int numero;
        int par = 0;
        int impar = 0;
        int contador = 0;
        do {
            System.out.println("Digite um numero: ");
            numero = scanner.nextInt();
            if ((numero%2) == 0){
                par++;
            }else{
                impar++;
            }
            contador++;
        } while(contador < quantidadeNumeros);
        System.out.println("Numeros Pares: " + par);
        System.out.println("Numeros Impares: " + impar);
        scanner.close();
    }
}
