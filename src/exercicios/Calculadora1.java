package exercicios;

public class Calculadora1 {
    public static void main(String[] args) {
        Calculadora1 calc = new Calculadora1();
        calc.Soma(10,5);
        calc.Divisao(10,5);
    }
    void Soma(int a, int b) {
        int resultado = a + b;
        System.out.println("O resultado da soma é: " + resultado);
    }
    void Subtracao(int a, int b) {
        int resultado = a - b;
        System.out.println("O resultado da subtracao é: " + resultado);

    }
    void Multiplicacao(int a, int b) {
        int resultado = a * b;
        System.out.println("O resultado da multiplicação é: " + resultado);

    }
    void Divisao(int a, int b){
        if(b == 0) {
            int resultado = 0;
        }
           int resultado = a / b;
        System.out.println("O resultado da divisão é: " + resultado);

    }
}
