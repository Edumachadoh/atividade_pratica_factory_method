public class Main {
    public static void main(String[] args) {
        PagamentoService service = new PagamentoService();

        // Nesse exercício é criado um objeto do tipo service, esse objeto tem a função iniciarProcesso(). Essa função irá levar dois parâmetros. Um é uma PagamentoFactory e o outro é o valor passado da operação;

        // Essa função cria um objeto do tipo IPagamento que recebe a fabrica passada no parâmetro.criarPagamento(), ou seja fabrica.criarPAgamento() retorna um pagamento do tipo que foi selecionado, podendo ser FactoryPaypal, FacttoryCriptomoeda ou FactoryCartaoCredito. Logo o objetivo de IPagamento pagamento = fabrica.criarPagamento(); é criar um pagamento. 

        // Isso tudo explica porque na Main é necessário passar no parâmetro a fábrica (que retorna o pagamento da fábrica), como parâmetro da fábrica o atributo específico dela, pois a fábrica retorna o pagamento dela com o parâmetro exigido no construtor e também o valor da operação como segundo parâmetro da função

        // Agora tem de fazer o processo desse pagamento, que significa pegar o pagamento criado e dar o método processarPagamento() para fazer as operações necessárias.

        // O atributo específico de paypal é o email, então dependendo se o email está presente no arquivo lista_email ou não é processado o pagamento
        // O atributo específico de cartao de credito é o numero do cartão, se o cartão for diferente de 16 digitos ele não processa o pagamento
        // O atributo específico de criptomoeda é o id, então é procurado o id no arquivo lista_saldo, então se esse id tiver saldo a operação de pagamento é processada 

        service.iniciarProcesso(new FactoryPaypal("eduardo@gmail.com"), 200);
        service.iniciarProcesso(new FactoryPaypal("dudu@gmail.com"), 1000);

        service.iniciarProcesso(new FactoryCartaoCredito("12325342341234312"), 9100);
        service.iniciarProcesso(new FactoryCartaoCredito("1111111111111111"), 3500);

        service.iniciarProcesso(new FactoryCriptomoeda(-1), 200);
        service.iniciarProcesso(new FactoryCriptomoeda(10), 1000);
        
    }
}
