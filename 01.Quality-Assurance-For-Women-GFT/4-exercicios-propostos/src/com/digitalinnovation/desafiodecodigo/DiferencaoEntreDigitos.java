package com.digitalinnovation.desafiodecodigo;

import java.util.Scanner;

public class DiferencaoEntreDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numero = scan.nextInt();
        String numeroString = String.valueOf(numero);
        int multiplicacao = 1;
        int soma = 0;
        for(int cont=0; cont<numeroString.length(); cont++){
          int charNumero = numeroString.charAt(cont);
          charNumero = charNumero - '0';
          soma = soma + charNumero;
          multiplicacao = multiplicacao * charNumero;
        }
        System.out.println(multiplicacao-soma);

        // TODO: Retorne a diferença entre o produto e a soma dos dígitos.
        
    }
}
