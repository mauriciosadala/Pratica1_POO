public class Transacao {
    private float valor;
    private Carro Carro1 = new Carro();

    public Transacao() {
        this.valor = 0;
    }
    public void vender(float valor){
        Carro1.vender(valor);

    }
    public String comprar(){
        String comprar = Float.toString(Carro1.comprar());
        return comprar;

    }
}
