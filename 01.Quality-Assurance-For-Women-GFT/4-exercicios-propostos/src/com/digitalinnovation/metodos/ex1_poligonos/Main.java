package com.digitalinnovation.metodos.ex1_poligonos;


public class Main{
    public static void main(String[] args) {
        Quadrilatero quadrilatero = new Quadrilatero();
        quadrilatero.setLadoUm(2);
        quadrilatero.setLadoDois(5);
        quadrilatero.setAltura(6);

        double resultado = quadrilatero.quadrilatero(quadrilatero.getLadoUm());
        System.out.println(resultado);

        resultado = quadrilatero.quadrilatero(quadrilatero.getLadoUm(), quadrilatero.getladoDois());
        System.out.println(resultado);

        resultado = quadrilatero.quadrilatero(quadrilatero.getLadoUm(), quadrilatero.getladoDois(), quadrilatero.getAltura());
        System.out.println(resultado);

    } 

}
