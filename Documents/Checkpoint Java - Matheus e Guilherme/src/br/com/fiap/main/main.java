package br.com.fiap.main;

import java.util.Scanner;
import br.com.fiap.bean.DespesaFamiliar;

//Guilherme Ribeiro Matias. RM:573890
//Matheus Nogueira Quintas. RM 572542

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DespesaFamiliar df = new DespesaFamiliar();

        System.out.print("Digite a renda familiar: ");
        df.rendaFamiliar = sc.nextDouble();

        System.out.print("Digite o número de moradores: ");
        df.numeroDeMoradores = sc.nextInt();

        System.out.print("Digite o gasto com luz: ");
        df.gastoComLuz = sc.nextDouble();

        System.out.print("Digite o gasto com água: ");
        df.gastoComAgua = sc.nextDouble();

        System.out.print("Digite o gasto com internet: ");
        df.gastoComInternet = sc.nextDouble();

        System.out.print("Digite o valor da academia: ");
        df.valorMensalidadeDaAcademia = sc.nextDouble();

        double total = df.calcularTotalDeDespesas();
        double liquida = df.calcularRendaFamiliarLiquida();

        System.out.printf("\nRenda: %.3f\n", df.rendaFamiliar);
        System.out.printf("Total de despesas: %.3f\n", total);
        System.out.printf("Renda líquida: %.3f\n", liquida);

    }
}
