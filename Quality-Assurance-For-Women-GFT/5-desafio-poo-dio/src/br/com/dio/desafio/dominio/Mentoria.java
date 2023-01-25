package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate data;

    //construtor
    public Mentoria(){

    }

    //METODOS GETTERS E SETTERS
    //Titulo
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    } 

    //Decricao
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    } 

    //Data
    public void setData(LocalDate data){
        this.data = data;
    }

    public LocalDate getData(){
        return data;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + data +
                '}';
    }
}
