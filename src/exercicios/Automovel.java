package exercicios;

public class Automovel {

    public static void main(String[] args) {
        Automovel meuCarro = new Automovel();
        meuCarro.velocidade = 0;
        meuCarro.marca = "Fiat";
        meuCarro.cor = "branco";

        // meuCarro.acelerar(10);
        meuCarro.acelerar(20);
        System.out.println("Velocidade atual: " + meuCarro.velocidade);
        meuCarro.reduzir(5);
        System.out.println("Velocidade atual: " + meuCarro.velocidade);
        System.out.println("Meu carro é da " + meuCarro.marca + " cor " + meuCarro.cor);
    }

    String marca;
    String cor;
    int velocidade = 0;

    void buzinar(){
        System.out.println("bip bip");
    }
    void acelerar(int valor){
        velocidade += valor;
    }
    void reduzir(int valor){
        velocidade -= valor;
    }

}
