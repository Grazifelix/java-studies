
public class ControleDeFluxo{

     public static void main(String[] args) {
        int mes = 20;
        String nomeMes = "";

        //Controle de fluxo IF...ELSE
        //Verifique qual mes o numero representa 
        
        if(mes == 1){
            nomeMes = "janeiro";
            System.out.println(nomeMes);
        } else if (mes == 2){
            nomeMes = "Fevereiro";
            System.out.println(nomeMes);
        }else if (mes == 3){
            nomeMes = "Março";
            System.out.println(nomeMes);
        }else if (mes == 4){
            nomeMes = "Abril";
            System.out.println(nomeMes);
        }else if (mes == 5){
            nomeMes = "Maio";
            System.out.println(nomeMes);
        }else if (mes == 6){
            nomeMes = "Junho";
            System.out.println(nomeMes);
        }else if (mes == 7){
            nomeMes = "Julho";
            System.out.println(nomeMes);
        }else if (mes == 8){
            nomeMes = "Agosto";
            System.out.println(nomeMes);
        }else if (mes == 9){
            nomeMes = "Setembro";
            System.out.println(nomeMes);
        }else if (mes == 10){
            nomeMes = "Outubro";
            System.out.println(nomeMes);
        }else if (mes == 11){
            nomeMes = "Novembro";
            System.out.println(nomeMes);
        }else if (mes == 12){
            nomeMes = "Dezembro";
            System.out.println(nomeMes);
        } else {
            System.out.println("Mes invalido.");
         
        }

        //Verifique se o mes é janeiro, julho ou dezembro
        //Se sim, então o mes é de ferias
        if(nomeMes == "Janeiro"){
            System.out.println("Ferias!");
        } else if (nomeMes == "Julho"){
            System.out.println("Ferias!");
        } else if (nomeMes == "Dezembro"){
            System.out.println("Ferias!");
        }

        //Controle de fluxo SWITCH...CASE
        //verificando se o mes é de ferias usando o Switch, que é a melhor opção
        //pois é usada apenas uma variavel para verificação
        switch(nomeMes){
            case "Janeiro":
            case "Julho":
            case "Dezembro":
                System.out.println("Ferias!");
                break;
            default:
                System.out.println("Sem ferias!");
        }

        //verificar o dia da semana e retornar seu numero correspondente
        String diaDaSemana = "Segunda";
        switch(diaDaSemana){
            case "Segunda":
                System.out.println(1);
                break;
            case "Terça":
                System.out.println(2);
                break;
            case "Quarta":
                System.out.println(3);
                break;
            case "Quinta":
                System.out.println(4);
                break;
            case "Sexta":
                System.out.println(5);
                break;
            case "Sabado":
                System.out.println(6);
                break;
            case "Domingo":
                System.out.println(7);
                break;
            default:
                System.out.println("Dia da semana invalido.");
                break;   

        }

        //se o numero estiver entre 1 e 3 print "certo"
        //se o numero for 4 print "errado"
        //se o numero for 5 print "talvez"6
        int numero = 5;
        switch(numero){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido.");
                break;
        } 
        


    }

}