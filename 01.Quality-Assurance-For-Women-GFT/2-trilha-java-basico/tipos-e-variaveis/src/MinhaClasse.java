public class MinhaClasse {
    public static void main(String [] args){
        System.out.println("Fui executado pelo terminal.");

        //os argumentos podem ser passados executando pelo CMD o executavel da pasta bin, 
        //e/ou os parametros podem ser passados no launch.json 
        String nome = args[0];
        int idade = Integer.valueOf(args[1]);

        System.out.println("Ola "+ nome + " cuja idade e "+ idade);
    }
    
}
