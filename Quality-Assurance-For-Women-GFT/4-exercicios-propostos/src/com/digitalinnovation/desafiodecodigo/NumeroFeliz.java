package com.digitalinnovation.desafiodecodigo;

import java.util.*;


public class NumeroFeliz
{
	public static void main(String[] args) {
	  
	     Scanner scan = new Scanner(System.in);
             int n = scan.nextInt();
             boolean feliz = true;
             int endWhile = 0;

             while(n != 1){
                int soma = 0;
                String stringNumeros = String.valueOf(n);

                for(int i = 0; i<stringNumeros.length(); i++){
                    char charNumero = stringNumeros.charAt(i);
                    int numero = charNumero - '0';
                    soma = soma + (int) Math.pow(numero, 2);
                    //  System.out.println(numero);
                 }
                
                if(endWhile == 100){
                    System.out.println(!feliz);
                    break;
                }
                endWhile++;
                n = soma;
                System.out.println(soma);
                
            }
            if(endWhile != 100){
                System.out.println(feliz);
                scan.close();
            }
            
    	}
}
