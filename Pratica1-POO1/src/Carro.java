public class Carro {
    private float precocompra, precovenda;

    public Carro(){
        this.precocompra = 0;
        this.precovenda = 0;
    }
    public void vender(float valor){
        precovenda = valor;
    }
    public float comprar(){
        if(precovenda!=0){
                    precocompra = precovenda + 100;
            return precocompra;
        }
        else return 0;
    }
}
