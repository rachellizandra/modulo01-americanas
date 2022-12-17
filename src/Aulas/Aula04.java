import java.util.Scanner;

public class Aula04 {
    public static void main(String[] args) {
//    Desenvolva um programa que vai pedir a hora e o minuto,
//    depois solicite quantidade de minutos para adicionar
//    e imprima a nova hora (com os minutos adicionados) em 3 fusos diferentes;
//    ex.:
//
//    ENTRADA ->
//
//    informe a hora: 10
//    informe o minuto: 12
//
//    informe a quantidade de minutos para adicionar: 40
//    SAIDA ESPERADA ->
//
//    Brasil, 10 h 52 min
//    Mexico, 07 h 52 min
//    Londres, 13 h 52 min

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora: ");
        int hora = scanner.nextInt();

        System.out.println("Digite o minuto: ");
        int minuto = scanner.nextInt();

        System.out.println("Digite quantos minutos adicionados: ");
        int minutoAdd = scanner.nextInt();

        addMinuto(hora, minuto, minutoAdd);
    }

    public static void addMinuto(int hora, int minuto, int minAdd) {
        int minutoRestante = (minuto + minAdd) % 60;
        int horaAdicionada = (hora + (minuto + minAdd) / 60);
        fusoHorario(horaAdicionada, minutoRestante);
    }

    private static void fusoHorario(int hora, int minuto) {
        System.out.printf("Brasil: %dh%dmin\n", hora % 24, minuto);
        System.out.printf("Mexico: %dh%dmin\n", ((hora - 3) + 24) % 24, minuto);
        System.out.printf("Londres: %dh%dmin\n", ((hora + 3) + 24) % 24, minuto);

    }
}
