import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args)  {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Orientaçao a objeto");
        cursoJava.setCargaHoraria(15);

        Curso cursoJS = new Curso();
        cursoJS.setTitulo("Curso JS");
        cursoJS.setDescricao("Orientaçao a objeto com Java Script");
        cursoJS.setCargaHoraria(15);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Orientacao a Objetos");
        mentoria.setData(LocalDate.now());


        //Criando bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java e JS");
        bootcamp.setDescricao("Bootcamp Java e JS");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJS);
        bootcamp.getConteudos().add(mentoria);

        Dev devGraziela = new Dev();
        devGraziela.setNome("Graziela");
        devGraziela.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Graziela:" + devGraziela.getConteudosInscritos());

        devGraziela.progredir();
        devGraziela.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devGraziela.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devGraziela.getConteudosConcluidos());
        System.out.println("XP:" + devGraziela.calcularTotalXp());

        System.out.println("\n-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }
}
