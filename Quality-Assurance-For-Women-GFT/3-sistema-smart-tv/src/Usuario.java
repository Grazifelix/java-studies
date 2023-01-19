import java.util.Scanner;

public class Usuario {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        SmartTv smartTv = new SmartTv();

        if (smartTv.ligada){
            System.out.println("A tv esta ligada.");

            System.out.println("Canal: " + smartTv.canal);
            System.out.println("Volume: " + smartTv.volume);

        } else {
            System.out.println("A tv esta desligada. Deseja ligar? [s]");
            String resposta = sc.next();
            if(resposta.equals("s")){
                smartTv.ligar();
                smartTv.aumentarVolume();
                smartTv.aumentarVolume();
                smartTv.proximoCanal();
                smartTv.canalAnterior();
                smartTv.diminuirVolume();
                System.out.println("Escolha um canal: ");
                int canalEscolhido = sc.nextInt();
                smartTv.escolherCanal(canalEscolhido);
                smartTv.desligar();

            } else {
                System.out.println("Opção inválida.");
            }

        

        }
        
    }
}
