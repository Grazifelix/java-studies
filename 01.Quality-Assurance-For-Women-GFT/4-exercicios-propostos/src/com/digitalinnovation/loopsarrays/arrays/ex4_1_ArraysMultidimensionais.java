package com.digitalinnovation.loopsarrays.arrays;

import java.util.Scanner;

/*
 * Gere e imprima uma matriz M 4x4 com valores 
 * aleatórios entre 0-9. Após isso determine o menor
 * número da matriz e a sua posição(linha, coluna).
 */

public class ex4_1_ArraysMultidimensionais {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int[] menorNumero = new int[3];
        for(int linha=0; linha<4; linha++){

            for(int coluna=0; coluna<4; coluna++){
                System.out.println("Digite um numero entre 0-9");
                System.out.println("Adicione um numero a matriz ["+linha+"]["+coluna+"]: ");
                matriz[linha][coluna] = scanner.nextInt();

               //verificar se o numero digitado esta entre 0 e 9
                while(matriz[linha][coluna] < 0 || matriz[linha][coluna] > 9){
                    System.out.println("Valor inválido! Digite um numero entre 0-9");
                    System.out.println("Adicione um numero a matriz ["+linha+"]["+coluna+"]: ");
                    matriz[linha][coluna] = scanner.nextInt();
                }
                  
                //Se for a posição [0][0] na matriz OU
                // se o numero da matriz for menos que o numero dentro da variavel "menorNumero"
                if (linha == 0 && coluna==0 || matriz[linha][coluna]< menorNumero[0]){
                    menorNumero[0] = matriz[linha][coluna];
                    menorNumero[1] = linha;
                    menorNumero[2] = coluna;
                }
            }
        }
        System.out.println("\n------------------------");
        System.out.println("Menor numero: "+menorNumero[0]);
        System.out.println("Posição na matriz: ["+menorNumero[1]+"]["+menorNumero[2]+"]");
        scanner.close();
    }
    
}
