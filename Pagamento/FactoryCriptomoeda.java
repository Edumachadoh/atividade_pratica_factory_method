public class FactoryCriptomoeda extends PagamentoFactory {
    private int saldo;

    public FactoryCriptomoeda(int saldo) {
        this.saldo = saldo;
    }


    @Override
    public IPagamento criarPagamento() {
        return new PagamentoCriptomoeda(1);
    }
}
