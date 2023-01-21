package com.digitalinnovation.loopsarrays.loops;

import java.util.Scanner;

/*Faça um programa que leia 5 números
 e informe o maior número e a média desses números. */

public class ex3_MaiorEMedia {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int numero;
        int contador = 0;
        int soma = 0;
        int maiorNumero = 0;

        do {
            System.out.println("Digite um numero: ");
            numero = scanner.nextInt();
            soma = soma + numero;

            //Se o numero digitado for maior que o numero da variavel maiorNumero,
            // então o maiorNumero se torna o numero digitado
            if(numero > maiorNumero){
                maiorNumero = numero;
            }
            contador++;
        } while (contador < 5);

        float media = soma/5;
        System.out.println("A média é: "+ media + "\nE o maior numero é: " + maiorNumero);
        scanner.close();
    }

}
