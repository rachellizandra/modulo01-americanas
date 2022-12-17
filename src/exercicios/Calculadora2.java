package exercicios;

public class Calculadora2 {

    public static void main(String[] args){
        Calculadora2 calc = new Calculadora2();
        int valor = calc.Soma(10, 5);

        System.out.println("O resultado da soma é: " + valor);
    }

    int Soma(int a, int b) {
        int resultado = a + b;
        return resultado;
    }
}
