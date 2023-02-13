public class TagsComentarios {
    //Comentário de linha

    /* Comentário de 
     * várias linhas
    */

    /*Javadoc é um gerador de documentação criado pela 
    Sun Microsystems para documentar a API dos programas em Java, 
    a partir do código-fonte. O resultado é expresso em HTML. 
    É constituído, basicamente, por algumas marcações muitos simples 
    inseridas nos comentários do programa. 

    // No terminal execute o comando abaixo
    javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java

    */


    //TAGS do JavaDoc
    /**
     * @author Graziela Felix
     * @version 1.0
     * @since 2023
     * @param nome varaviavel tipo String
     * @return este metodo nao possui retorno
     * @throws null metodo nao possui execeçoes
     */
    public static void main(String [] args){
        Nome("Julia");
    }

    public static void Nome(String nome){
        System.out.println(nome);
    }

}
