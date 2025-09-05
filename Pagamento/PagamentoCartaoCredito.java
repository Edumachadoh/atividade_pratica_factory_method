public class PagamentoCartaoCredito implements IPagamento{
    String numeroCartao;

    public PagamentoCartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento(int valor) {
        if (this.numeroCartao.length() == 16) {
        System.out.println("Processar pagamento cartao de credito");
        } else {
                 System.out.println("Não processou pagamento cartao de credito");
        }


       
    }
}
