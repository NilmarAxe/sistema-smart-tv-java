public class Usuário {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        // Exibindo o status da TV
        System.out.println("Status Inicial -> TV Ligada: " + smartTv.ligado);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        // Ligando a TV
        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada: " + smartTv.ligado);

        // Mudando o canal
        smartTv.mudarCanal(12);
        System.out.println("Canal Atual: " + smartTv.canal);

        // Alterando volume
        smartTv.aumentarVolume();  // Aumentando volume
        smartTv.diminuirVolume();  // Diminuindo volume

        // Desligando a TV
        smartTv.desligar();
        System.out.println("Novo Status -> TV Desligada: " + smartTv.ligado);
    }
}
