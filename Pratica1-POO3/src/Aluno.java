public class Aluno {
    private String nome, matricula, curso, periodo;
    private double notaAV1, notaAV2, notaAE;
    public Aluno(String nome, String matricula, String curso, String periodo,
                 double notaAV1, double notaAV2) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.periodo = periodo;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
    }
    public void alteraNotaAV1(double notaAV1){
        this.notaAV1 = notaAV1;
    }
    public void alteraNotaAV2(double notaAV2){
        this.notaAV2 = notaAV2;
    }
    public void alteraNotaAE(double notaAE){
        this.notaAE = notaAE;
    }
    public void avaliarAluno(){
        if (notaAV1 + notaAV2 >= 60){
            System.out.println("aprovado");
        }
        else System.out.println("recuperacao");
    }
    public void avaliarRecuperacao(double notaAE){
        if (notaAV1 + notaAE + notaAV2 >=60){
            System.out.println("Aprovado");
        }
        else System.out.println("Reprovado");

    }
}

