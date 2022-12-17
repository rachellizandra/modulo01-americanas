package Aulas;
import java.util.Scanner;


public class Aula05_CalcularData {

    /**
     * Desenvolva um programa que leia do console os seguintes parametros:
     *
     * ano, mes, dia, hora, minuto e segundo (essa leitura pode ser feita da forma como o desenvolvedor achar melhor).
     *
     * após, leia uma quantidade para adicionar, junto com um paramêtro [y, m, d, h, M, s];
     *
     * depois adicione o valor a data informada e imprima a nova data;
     *
     * ex.:
     *
     * informe o ano: 2022
     * informe o mes: 12
     * informe o dia: 12
     * informe a hora: 20
     * informe o minuto: 15
     * informe o segundo: 33
     *
     * agora informe o valor a adicionar e o parametro [y, m, d, h, M, s]: 1m
     *
     * a nova data é: 12/01/2023 20:15:33
     *
     * Obs.:
     * y = ano, m = mes, d = dia, h = hora, M = minuto, s = segundo
     *
     * Requisitos:
     * deve-se criar uma classe tempo com métodos e atributo.
     */
    public static void main(String[] args) {
        Tempo tempo = new Tempo();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("hora: ");
//        tempo.hora = scanner.nextInt();
//
//        System.out.println("minuto:");
//        tempo.min = scanner.nextInt();
//
//        System.out.println("segundo:");
//        tempo.seg = scanner.nextInt();
//
//        System.out.println("dia:");
//        tempo.dia = scanner.nextInt();
//
//        System.out.println("mês:");
//        tempo.mes = scanner.nextInt();
//
//        System.out.println("ano:");
//        tempo.ano = scanner.nextInt();

        tempo.ano = 2020;
        tempo.mes = 12;
        tempo.dia = 31;

        tempo.hora = 23;
        tempo.min = 59;
        tempo.seg = 59;

        imprimirData(tempo);

        //tempo.addAnos(2);
        //tempo.addMeses(2);
        //tempo.addDias(2);
        //tempo.addHoras(2);
        //tempo.addMinutos(120);
        tempo.addSegundos(88);

        imprimirData(tempo);

    }

    public static void imprimirData(Tempo tempo) {
        System.out.printf("%02d/%02d/%d %02d:%02d:%02d\n",
                tempo.dia, tempo.mes, tempo.ano, tempo.hora, tempo.min, tempo.seg);
    }

}

class Tempo {
    int ano;
    int mes;
    int dia;
    int hora;
    int min;
    int seg;


    public void addAnos(int anos) {
        // o ano não pode ser negativo
        if(anos > 0) {
            this.ano += anos;
        }
    }

    private int qtdDiasMes(){
        return switch (this.mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> calcularAnoBissexto();
            default -> -1;
        };
    }

    private int calcularAnoBissexto() {
        if (((this.ano % 4 == 0) && !(this.ano % 100 == 0))
                || (this.ano % 400 == 0)) {
            return 29;
        }
        return 28;
    }

    public void addMeses(int meses){
    // os meses não podem ser negativos
        if(meses > 0) {
            if((this.mes + meses) > 12) {
                int difAnos = (this.mes + meses) / 12;
                addAnos(difAnos);
                int difMeses = (this.mes + meses) % 12; // diferença entre os meses
                this.mes = difMeses;
            } else {
                this.mes += meses;
            }
        }
    }

    public void addDias(int dias){
    // os dias não podem ser negativos
        if(dias > 0) {
            int novoDia = this.dia + dias;

            // contagem dos dias considerando se é um mês de 30, 31, 29 ou 28 dias com a lógica usada no método qtdDiasMes()
            if(novoDia > qtdDiasMes()) {
                int diasMes = qtdDiasMes();

                while(novoDia > diasMes) {
                    addMeses(1);
                    novoDia -= diasMes;
                    diasMes = qtdDiasMes();
                }
            }
            this.dia = novoDia;
        }
    }

    public void addHoras(int horas){
    // as horas não podem ser negativas
        if(horas > 0) {
            int novaHora = this.hora + horas;

            if(novaHora > 24) {
                int difDias = (this.hora + horas) / 24;
                addDias(difDias);
            }
            this.hora = novaHora % 24;
        }

    }

    public void addMinutos(int minutos){
        // os minutos não podem ser negativos
        if(minutos > 0) {

            int novoMinuto = this.min + minutos;

            if(novoMinuto >= 60) {
                int difHora = novoMinuto / 60;
                addHoras(difHora);
            }
            this.min = novoMinuto % 60;
        }

    }

    public void addSegundos(int segundos){

        if (segundos > 0) {

            int novoSegundo = this.seg + segundos;

            if (novoSegundo >= 60) {
                int difMinuto = novoSegundo / 60;
                addMinutos(difMinuto);
            }

            this.seg = novoSegundo % 60;

        }
    }

}