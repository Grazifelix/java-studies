public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 123;
        short ano = 2023;
        int cep = 123456789;
        long cpf = 987456321L; //Ao usar o tipo long é necessário colocar um L no final para que o java entenda o tipo correto.
        float pi = 3.14F; //ao usar o tipo float se utiliza o F no final.
        double salario = 1257.30;

        //ATENÇÃO A ISSO:
        short numeroCurto = 1;
        int numeroInteiro = numeroCurto;
        //short numeroCurto2 = numeroInteiro; //ocorre um erro porque, a variavel numeroCurto foi convertida para int o que a torna maior que o tipo short suporta.
        //Solução: mudar a variavel para int ou fazer um casting (exemplo abaixo)
        short numeroCurto2 = (short) numeroInteiro; //mas não é coerente usar isso com frequencia.


        //CONSTANTES E VARIAVEIS
        //variaveis podem ser alteradas
        int numero = 5;
        numero = 10;

        //constantes não podem ser alteradas e são escritas em caixa alta
        final int NUMERO = 36;
        NUMERO = 15;

        //STRING
        String nome = "Felipe";



    }
}
