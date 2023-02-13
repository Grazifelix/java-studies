package com.digitalinnovation.loopsarrays.loops;

import java.util.Scanner;

/*Faça um programa que peça uma nota, entre zero e dez. 
Mostre uma mensagem caso o valor seja inválido e continue 
pedindo até que o usuário informe um valor válido. */
public class ex2_Nota {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        //RESOLUÇÃO DO OFICIAL DO EXERCICIO
        int nota;

        System.out.println("Digite sua nota: ");
        nota = scanner.nextInt();

        while(nota < 0 || nota > 10){
            System.out.println("Valor Inválido. Tente novamente: ");
            nota = scanner.nextInt();
        }
        System.out.println("Valor válido. Obrigada!");
        scanner.close();

        //  MINHA SOLUÇÃO INICIAL
        // while(true){
        //     System.out.println("Digite sua nota: ");
        //     String nota = scanner.next();
        //     boolean validade = false;
        //     switch(nota){
        //         case "0":
        //         case "1":
        //         case "2":
        //         case "3":
        //         case "4":
        //         case "5":
        //         case "6":
        //         case "7":
        //         case "8":
        //         case "9":
        //         case "10":
        //             System.out.println("Valor válido");
        //             validade = true;
        //             break;
        //         default:
        //             System.out.println("Valor Inválido");
        //             break;
        //     }

            
        //     if(validade){
        //         System.out.println("Fim do programa.");
        //         break;
        //     }

        // }
    }

    
}
