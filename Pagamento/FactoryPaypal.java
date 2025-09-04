public class FactoryPaypal extends PagamentoFactory {
    private String string;

    public FactoryPaypal(String string) {
        this.string = string;
    }
   

    @Override
    public IPagamento criarPagamento() {
        return new PagamentoPaypal(string);
    }
}
