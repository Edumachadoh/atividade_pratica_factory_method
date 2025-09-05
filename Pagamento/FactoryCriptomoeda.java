public class FactoryCriptomoeda extends PagamentoFactory {
    private int id;

    public FactoryCriptomoeda(int id) {
        this.id = id;
    }


    @Override
    public IPagamento criarPagamento() {
        return new PagamentoCriptomoeda(id);
    }
}
