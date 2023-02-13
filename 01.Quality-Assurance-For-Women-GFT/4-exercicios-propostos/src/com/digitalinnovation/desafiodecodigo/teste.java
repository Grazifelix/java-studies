package com.digitalinnovation.desafiodecodigo;

import java.util.Scanner;

public class teste {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int V = 0;
        
        //Use While to read values til V is greater then R
        
        while (V < R){
          V = scanner.nextInt();
        }
        
        int cont=0;
        while(R <= V) {
          if(R < 0){
            R = R + (R+1);
            //System.out.println(cont);
          } else {
            R++;
          }
          cont++;
        }
        
        System.out.println(cont);
    }
}
