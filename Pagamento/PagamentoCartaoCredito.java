public class PagamentoCartaoCredito implements IPagamento{
    String numeroCartao;

    public PagamentoCartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public String processarPagamento(int valor) {
        if (this.numeroCartao.length() == 16) {
        System.out.println("Processar pagamento cartao de credito");
        }


        return "Erro no processamento do pagamento por cartao de credito";
    }
    
}
