import java.util.Scanner;

public class Cliente {
    Scanner ler = new Scanner(System.in);

    public void negociar(){
        Transacao acao = new Transacao();
        System.out.println("voce quer comprar ou vender? 1 = comprar 0 = vender ");
        int opcao = ler.nextInt();
        switch (opcao){
            case 1:
                System.out.println(acao.comprar());
            case 2:
                System.out.println("digite o valor de venda: ");
                float valor = ler.nextFloat();
                acao.vender(valor);
        }

    }
}
