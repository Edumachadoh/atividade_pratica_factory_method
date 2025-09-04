public class FactoryCartaoCredito extends PagamentoFactory {
     private String numeroCartao;

    public FactoryCartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
   

    @Override
    public IPagamento criarPagamento() {
        return new PagamentoCartaoCredito(numeroCartao);
    }
}
