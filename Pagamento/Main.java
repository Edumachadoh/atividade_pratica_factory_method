public class Main {
    public static void main(String[] args) {
        PagamentoService service = new PagamentoService();

        service.iniciarProcesso(new FactoryCartaoCredito("213254352345243"), 150);
        
    }
}
