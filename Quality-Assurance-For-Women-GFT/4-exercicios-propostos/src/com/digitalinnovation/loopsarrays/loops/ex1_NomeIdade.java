package com.digitalinnovation.loopsarrays.loops;

import java.util.Scanner;

/*
 * Faça um programa que leia conjuntos de dois valores,
 * o primeiro representando o nome do aluno e o segundo
 * representando a sua idade. (Pare o programa inserindo o valor 0 no campo nome)
 */

public class ex1_NomeIdade {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Digite seu nome: ");
            String nome = scanner.next();
            if(nome.equals("0")){
                break;
            } 
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
        }
        System.out.println("Programa encerrado.");
        scanner.close();
    }
    
}
