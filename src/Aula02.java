public class Aula02 {
    public static void main(String[] args) {
        // AULA 02: Tipos primitivos, variáveis e operadores aritméticos e lógicos

        // 4 TIPOS PARA NUMEROS INTEIROS

        // byte (1 byte): -128 a 127
        // byte Pesobyte;

        // short (2 bytes): -32.768 a 32.767
        // short pesoShort;

        // int (4 bytes): -2.147.483.648 a 2.147.483.647
        // int pesoInt;

        // long (8 bytes): -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        // long pesoLong = 10_000l;
        // long a = 4l, b = 2l, c = 6l;

        // 2 TIPOS PARA NUMEROS COM PONTO FLUTUANTE

        // float (4 bytes)
        // float saldoElonMusk = 200_000_000_000.0f;

        // double (8 bytes);
        // double saldoElonMuskDouble = 200_000_000_000.0d;

        // 1 TIPO LOGICO VERDADEIRO/FALSO

        // boolean verdadeiroOuFalso;
        // verdadeiroOuFalso = true;
        // verdadeiroOuFalso = false;

        // 1 TIPO PARA CARACTERES

        // char letra;
        // letra = 'a'

        // String

        // String nome = "Rachel";

        // como declarar uma constante: final double PI = 3.1415926; (constantes são declaradas com letra maiúscula e _)

        // WRAPPER
        // byte -> Byte
        // short -> Short
        // int -> Integer
        // long -> Long
        // float -> Float
        // double -> Double
        // boolean -> Boolean
        // char -> Character

        // Integer idade = 33;
        // int maiorValorDeUmInt = Integer.MAX_VALUE;
        // int menorValorDeUmInt = Integer.MIN_VALUE;

        // String dozeEmHexadecimal = Integer.toHexString(12);

        // Character letraZ = 'z';

        // ENUMS
        // DiaDaSemana hoje = DiaDaSemana.SABADO;

        // OPERADORES ARITMETICOS
        // soma: +
        // subtração: -
        // multiplicação: *
        // divisão: /
        // modulo (resto da divisao): %

        //int resultado = 3 % 2;
        // boolean isPar = (n % 2) == 0;

        // int anoDeNascimento - 2_000;
        // int idade;

        // idade = 2_002 - anoDeNascimento;
        // System.out.println("Idade: " + idade);

        // OPERADORES LOGICOS
        // negação -> !
        // E -> &&
        // OU -> ||

        // RELACIONAIS
        //maior que: >
        // menor que: <
        // igual: ==
        // diferente: !=

        // TERNARIO
        // ? : ;

        //== verificar a igualdade somente de tipos primitivos
        //String nome1 = "jorge";
        //String nome2 = "jorge"; se der um print, irá retornar true
        //String nome2 = new String("jorge"); se der um print, irá retornar false

        // comparação do conteúdo da variavel: método equals
        //String nome1 = new String("jorge");
        //String nome2 = new String("jorge");
        // System.out.println(nome1.equals(nome2));

        // EXERCICIO DE SALA
        /*

        double salariodevJr = 2250d;
        doube salariodevMd = 4800d;
        double salariodevSr = 7100d;

        // media simples

        double media = (devJr + devMd + devSr) / 3;

        // System.out.printf("Media: %.2f\n", media);

        // media ponderada

        int qtdDevJr = 16;
        int qtdDevMd = 8;
        int qtdDevSr = 4;

        double mediaPonderada =
        (salariodevJr * qtdDevJr) +
        (salariodevMd * qtdDevMd) +
        (salariodevSr * qtdDevSr) / (qtdDevJr + qtdDevMd + qtdDevSr);

         // System.out.printf("Media Ponderada: %.2f\n", mediaPonderada);

         */

        final double FATOR_CONVERSAO = 2.20462;

        int pesoEmKg = 100;
        double pesoEmLb = pesoEmKg * FATOR_CONVERSAO;

        System.out.printf( pesoEmKg + "kg são " + pesoEmLb + " lb");


    }
}

//enum DiasDaSemana {
//    DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO;

//}