package br.com.fiap.bean;
//Guilherme Ribeiro Matias. RM:573890
//Matheus Nogueira...
public class DespesaFamiliar {

    public double rendaFamiliar;
    public int numeroDeMoradores;
    public double gastoComLuz;
    public double gastoComAgua;
    public double gastoComInternet;
    public double valorMensalidadeDaAcademia;
    public double totalDespesas;

    public void calcularTotalDeDespesas() {
        double totalDespesas =gastoComAgua + gastoComLuz + gastoComInternet + (valorMensalidadeDaAcademia * numeroDeMoradores);
    }
    public void calcularRendaFamiliarLiquida(){
        double rendaFamiliarLiquida= rendaFamiliar- gastoComAgua + gastoComLuz + gastoComInternet + (valorMensalidadeDaAcademia * numeroDeMoradores);


        }


}
