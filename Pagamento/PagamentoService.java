public class PagamentoService {
    public void iniciarProcesso(PagamentoFactory fabrica, int valor) {
        // fabrica.criarPagamento().processarPagamento();
        IPagamento pagamento = fabrica.criarPagamento();
        pagamento.processarPagamento(valor);
    }   
}
