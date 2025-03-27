public class SmartTv {
    boolean ligado = false;

    int canal = 1;
    int volume = 1;

    // Limites do volume e do canal
    final int VOLUME_MAX = 100;
    final int VOLUME_MIN = 0;
    final int CANAL_MAX = 99;
    final int CANAL_MIN = 1;

    // Função para mudar o canal
    public void mudarCanal(int novoCanal) {
        if (ligado) {
            if (novoCanal >= CANAL_MIN && novoCanal <= CANAL_MAX) {
                canal = novoCanal;
                System.out.println("Mudando para o canal: " + canal);
            } else {
                System.out.println("Canal inválido! Deve ser entre " + CANAL_MIN + " e " + CANAL_MAX);
            }
        } else {
            System.out.println("Não é possível mudar o canal, a TV está desligada.");
        }
    }

    // Função para aumentar o volume
    public void aumentarVolume() {
        if (ligado) {
            if (volume < VOLUME_MAX) {
                volume++;
                System.out.println("Aumentando o volume para: " + volume);
            } else {
                System.out.println("Volume já está no máximo.");
            }
        } else {
            System.out.println("Não é possível aumentar o volume, a TV está desligada.");
        }
    }

    // Função para diminuir o volume
    public void diminuirVolume() {
        if (ligado) {
            if (volume > VOLUME_MIN) {
                volume--;
                System.out.println("Diminuindo o volume para: " + volume);
            } else {
                System.out.println("Volume já está no mínimo.");
            }
        } else {
            System.out.println("Não é possível diminuir o volume, a TV está desligada.");
        }
    }

    // Função para ligar a TV
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("TV ligada.");
        } else {
            System.out.println("TV já está ligada.");
        }
    }

    // Função para desligar a TV
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("TV desligada.");
        } else {
            System.out.println("TV já está desligada.");
        }
    }
}
