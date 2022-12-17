package exercicios;

public class Conta {

    public static void main(String[] args) {

        //INSTANCIA A CLASSE
        Conta conta = new Conta();

        //DEFINE UM VALOR DE SALDO
        conta.setSaldo(633.00);

        //DEFINE VALOR PARA DEPOSITAR
        conta.depositar(555.0);

        //RESGATA VALOR
        conta.verificaSaldo();
    }

    private Double saldo;

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void depositar(Double valor) {
        saldo += valor;
    }

    public void verificaSaldo() {
        System.out.println("Valor do saldo: " + getSaldo());
    }
}
