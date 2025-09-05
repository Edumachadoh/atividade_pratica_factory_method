import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class PagamentoPaypal implements IPagamento {
    String email;

    public PagamentoPaypal(String email) {
        this.email = email;
    }

    @Override
    public void processarPagamento(int valor) {
       
        try {
            // Lê o conteúdo do arquivo como uma única string
            String conteudo = Files.readString(Paths.get("lista_emails.txt"));

            // Divide os e-mails por vírgula e remove espaços extras
            String[] listaEmails = conteudo.split(",");

            // Verifica se o e-mail está presente
            boolean emailEncontrado = Arrays.stream(listaEmails)
                                            .map(String::trim)
                                            .anyMatch(e -> e.equalsIgnoreCase(this.email));

            if (emailEncontrado) {
                 System.out.println("Processou pagamento paypal\nValor: "+valor+"\nEmail: "+this.email);
            } else {
                System.out.println("Processamento com erro de pagamento paypal\nValor: "+valor+"\nEmail: "+this.email);
            }

        } catch (IOException e) {
             System.out.println("Erro na operação, contate o suporte do sistema!");
        }

         
    }
}
