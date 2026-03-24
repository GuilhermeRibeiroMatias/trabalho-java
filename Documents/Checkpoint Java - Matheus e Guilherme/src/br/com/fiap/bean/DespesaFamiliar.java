package br.com.fiap.bean;

//Guilherme Ribeiro Matias. RM:573890
//Matheus Nogueira Quintas. RM 572542

public class DespesaFamiliar {

    public double rendaFamiliar;
    public int numeroDeMoradores;
    public double gastoComLuz;
    public double gastoComAgua;
    public double gastoComInternet;
    public double valorMensalidadeDaAcademia;

    public double calcularTotalDeDespesas() {
        return gastoComAgua + gastoComLuz + gastoComInternet
                + (valorMensalidadeDaAcademia * numeroDeMoradores);
    }

    public double calcularRendaFamiliarLiquida() {
        return rendaFamiliar - calcularTotalDeDespesas();
    }
}