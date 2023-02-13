package com.digitalinnovation.desafiodecodigo;

import java.util.Scanner;

public class EmboscadaRpg {
    public static void main(String[] args){ 
        Scanner leitor = new Scanner(System.in); 
 
        int dados = leitor.nextInt(); 
        int vidaDoJogador = leitor.nextInt(); 
        int ataqueDoJogador= leitor.nextInt(); 
        int defesaDoJogador = leitor.nextInt(); 
        int vidaDoInimigo= leitor.nextInt(); 
        int ataqueDoInimigo = leitor.nextInt();
        
    
        
        while(true){
          vidaDoJogador = danoJogador(vidaDoJogador, ataqueDoInimigo, defesaDoJogador, dados);
          vidaDoInimigo = danoInimigo(vidaDoInimigo, ataqueDoJogador, dados);
          if(vidaDoJogador <= 0){
            System.out.println("Jogador nao sobreviveu" );
            break;
          } else {
            if(vidaDoInimigo <= 0){
                System.out.println("Jogador sobreviveu e derrotou o inimigo" );
                break;
            } else {
                System.out.println("Jogador sobreviveu e nao derrotou o inimigo" );
                break;
            }
          }
          
        }

     //TODO: Crie as condições necessárias para verificar se o jogador vai sobreviver, e contra-atacar, ou morrer;
     }

     public static int calculaDado(int dados){
        if(dados > 8 && dados < 10){
          int valor = dados*2;
          return valor;
        } else {
          return dados;
        }
      }

      public static int danoJogador(int vidaDoJogador, int ataqueInimigo, int defesaDoJogador, int dados){
        int defesaAumentada = calculaDado(dados);
        vidaDoJogador = vidaDoJogador - (ataqueInimigo - (defesaDoJogador + defesaAumentada));
        return vidaDoJogador;
      }

      public static int danoInimigo(int vidaDoInimigo, int ataqueDoJogador, int dados){
        int ataqueAumentado = calculaDado(dados);
        vidaDoInimigo = vidaDoInimigo - (ataqueDoJogador + ataqueAumentado);
        return vidaDoInimigo;
        
      }
    
}
