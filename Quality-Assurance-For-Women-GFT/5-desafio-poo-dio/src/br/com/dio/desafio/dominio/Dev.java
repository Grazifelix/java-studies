package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();  

    //METODOS
    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    };

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo);
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    };

    public double calcularTotalXP(){
        return this.conteudosConcluidos
            .stream()
            .mapToDouble(Conteudo::calcularXP)
            .sum();
    };

    //GETTERS E SETTERS
    //nome
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    } 

    //conteudosEscritos
    public void setconteudosEscritos(Set<Conteudo> conteudosEscritos){
        this.conteudosInscritos = conteudosEscritos;
    }

    public Set<Conteudo> getconteudosEscritos(){
        return conteudosInscritos;
    } 

    //conteudosConcluidos
    public void setconteudosConcluidos(Set<Conteudo> conteudosConcluidos){
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public Set<Conteudo> getconteudosConcluidos(){
        return conteudosConcluidos;
    } 


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
        public int hashCode() {
            return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
  
}
