public class Operadores {

    public static void main(String [] args){

        //OPERADORES UNÁRIOS
        int numero = 5;
        numero = -numero; //o sinal de - torna o numero positivo em negativo
        System.out.println(numero);
        //para transformar o numero negativo em positivo multiplica por -1
        numero = numero * -1;
        System.out.println(numero);

        //incremento
        numero++;
        System.out.println(numero);
        //decremento
        numero--;
        System.out.println(numero);

        //negação
        boolean teste = true;
        System.out.println(teste);
        //Negação true para false
        teste = !teste;
        System.out.println(teste);
        //negação false para true
        teste = !teste;
        System.out.println(teste);


        //OPERADOR TERNÁRIO
        int a = 5;
        int b = 6;
        // é um operador condicional semelhante a um IF
        String resultado = a == b ? "A e igual a B" : "A e diferente de B"; 
        System.out.println(resultado);

        //OPERADORES RELACIONAIS
        //operadores relacionais ==/ > / >= /< / <=/ !=
        if (a>b){
            System.out.println("A e maior que B");
        }else if(a<b) {
            System.out.println("A e menor que B");
        }else if(a>=b) {
            System.out.println("A e maior ou igual a B");
        }else if(a<=b) {
            System.out.println("A e menor ou igual a B");
        } 
        
        if(a!=b) {
            System.out.println("A e diferente de B");
        }


        //comparando strings
        String nomeUm = "Gabi";
        String nomeDois = "Gabi";
        System.out.println("O nomeUm d igual ao nomeDois? " + nomeUm==nomeDois);

        //Para Objetos usa o .equals
        String nomeTres = new String("Gabi");

        System.out.println("O nomeUm d igual ao nomeTres? " + nomeUm==nomeTres);
        //usando o equals
        System.out.println("O nomeUm d igual ao nomeTres? " + nomeUm.equals(nomeTres));

        //OPERADORES LÓGICOS
        boolean valorUm = true;
        boolean valorDois = true;
    
        if (valorUm && valorDois){
            System.out.println("Valor logico AND");
        } 

        if (valorUm || valorDois){
            System.out.println("Valor logico OR");
        }



    }
}