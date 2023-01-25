package com.digitalinnovation.orientacaoaobjetos;


//Crie uma classe Carro 
public class ex1_ClasseCarro {
    String modelo;
    String cor;
    int capacidadeTanque;


    //metodo construtor e sobrecarga de metodos
    ex1_ClasseCarro(){

    }

    ex1_ClasseCarro(String modelo, String cor, int capacidadeTanque){
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
    }
    
    //metodos get e set para cada atributo da classe
    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    //calcular o preço do combustivel
    double totalValorTanque(int precoCombustivel){
        int valor = capacidadeTanque * precoCombustivel;
        return valor;
    }
}
