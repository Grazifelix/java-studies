package br.com.dio.desafio.dominio;

//CLASSE ABSTRATA 
public abstract class Conteudo {

    //variavel final
    protected static final Double XP_PADRAO = 10d;

    //variaveis
    private String titulo;
    private String descricao;
    

    //METODO ABSTRATO
    public abstract Double calcularXP();


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


}
