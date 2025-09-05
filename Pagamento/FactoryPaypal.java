public class FactoryPaypal extends PagamentoFactory {
    private String email;

    public FactoryPaypal(String email) {
        this.email = email;
    }
   

    @Override
    public IPagamento criarPagamento() {
        return new PagamentoPaypal(email);
    }
}
