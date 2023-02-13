public class SmartTv {

    boolean ligada = false;
    int canal = 2;
    int volume = 15;

    public void ligar(){
        ligada = true;
        System.out.println("A tv esta ligada.");
    }

    public void desligar(){
        ligada = false;
        System.out.println("A tv esta desligada.");
    }

    public void proximoCanal(){
        canal++;
        System.out.println("Canal: " + canal);
    }

    public void canalAnterior(){
        canal--;
        System.out.println("Canal: " + canal);
    }

    public void escolherCanal(int canalEscolhido){
        canal = canalEscolhido;
        System.out.println("Canal: " + canal);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume: " + volume);
    }


}
