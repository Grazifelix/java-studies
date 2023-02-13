package com.digitalinnovation.metodos.ex1_poligonos;

public class Quadrilatero{

    int ladoUm;
    int ladoDois;
    int altura;

    void setLadoUm(int ladoUm){
        this.ladoUm = ladoUm;
    }

    int getLadoUm(){
        return ladoUm;
    }

    void setLadoDois(int ladoDois){
        this.ladoDois = ladoDois;
    }

    int getladoDois(){
        return ladoDois;
    }

    void setAltura(int altura){
        this.altura = altura;
    }

    int getAltura(){
        return altura;
    }

    // Sobrescrita de metodos
    //quadrado
    public int quadrilatero(int ladoUm){
        return ladoUm*2;
    }

    //retangulo
    public int quadrilatero(int ladoUm, int ladoDois){
        return ladoUm*ladoDois;
    }

   //trapezio
    public double quadrilatero(int ladoUm, int ladoDois, int altura){
        double resultado = ((ladoUm+ladoDois)*altura)/2;
        return resultado;
    }
}

