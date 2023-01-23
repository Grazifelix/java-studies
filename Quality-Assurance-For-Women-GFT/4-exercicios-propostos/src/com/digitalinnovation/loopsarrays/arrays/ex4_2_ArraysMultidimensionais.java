package com.digitalinnovation.loopsarrays.arrays;

import java.util.Random;

/*
 * Gere e imprima uma matriz M 4x4 com valores 
 * aleatórios entre 0-9. Após isso determine o menor
 * número da matriz e a sua posição(linha, coluna).
 */
public class ex4_2_ArraysMultidimensionais {

    public static void main(String [] args){
        Random random = new Random();
        int[][] matriz = new int[4][4];
        for(int linha=0; linha<matriz.length; linha++){
            for(int coluna=0; coluna<4; coluna++){
                matriz[linha][coluna] = random.nextInt(9);
            }
        }
        for(int linha=0; linha<4; linha++){
            for(int coluna=0; coluna<4; coluna++){
                System.out.print(matriz[linha][coluna]+" ");
            }
            System.out.println();
        }
    }      
}
