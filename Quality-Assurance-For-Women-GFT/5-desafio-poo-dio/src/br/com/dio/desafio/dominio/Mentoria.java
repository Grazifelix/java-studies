package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    //metodo abstrato da classe mae Conteudo
    @Override
    public Double calcularXP() {
        return XP_PADRAO+20d;
    }

    //construtor
    public Mentoria(){

    }

    //METODOS GETTERS E SETTERS
    //Data
    public void setData(LocalDate data){
        this.data = data;
    }

    public LocalDate getData(){
        return data;
    }

    @Override
    // os getTitulo e getDescrição são da classe Mãe
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + data +
                '}';
    }


}
