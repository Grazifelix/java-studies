package com.digitalinnovation.loopsarrays.arrays;


/*
 * Faça um Programa que leia um vetor de 6 caracteres,
 *  e diga quantas consoantes foram lidas. Imprima as consoantes.
 */
public class ex2_Consoantes {
    public static void main(String [] args){
        String[] letras = {"a", "b", "c", "d", "e"};
        int consoantes = 0;

      for (String letra : letras) {
            if(!(letra.equalsIgnoreCase("a") |
            letra.equalsIgnoreCase("e") |
            letra.equalsIgnoreCase("i") |
            letra.equalsIgnoreCase("o") |
            letra.equalsIgnoreCase("u"))){
                System.out.println(letra);
                consoantes++;
         
        }
        
      }
            
     
        
        

    }
    
}
