package exercitando;

public class UsuarioSmartTv {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        
        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        smartTv.mudarCanal(22);

        System.out.println("TV está ligada ? "+ smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

    }
}
