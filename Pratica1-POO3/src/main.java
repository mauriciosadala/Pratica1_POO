import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("digite nome");
        String nome = ler.nextLine();
        System.out.println("digite matricula");
        String matricula = ler.nextLine();
        System.out.println("digite curso");
        String curso = ler.nextLine();
        System.out.println("digite periodo");
        String periodo = ler.nextLine();
        System.out.println("digite notaAV1");
        double notaAV1 = ler.nextDouble();
        System.out.println("digite notaAV2");
        double notaAV2 = ler.nextDouble();

        Aluno x = new Aluno(nome, matricula, curso, periodo, notaAV1, notaAV2);
        x.avaliarAluno();
        System.out.println("digite notaAE");
        double notaAE = ler.nextDouble();
        x.avaliarRecuperacao(notaAE);
    }
}
