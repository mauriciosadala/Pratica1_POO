package Questao2;

public class EmpregadoDaFaculdade {
    private String nome;
    private double salario;
    private int horasAula;

    double getGastos(){
        int novoSalario = 40 * this.horasAula;
        return novoSalario + this.salario;
    }
    String getInfo(){
        return "nome:" + this.nome + " com salario " + (this.salario + (40 * this.horasAula));
    }
}
