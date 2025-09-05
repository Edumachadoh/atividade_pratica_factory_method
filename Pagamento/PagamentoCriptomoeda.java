import java.nio.file.*;
import java.io.IOException;

public class PagamentoCriptomoeda implements IPagamento {
   int id;

    public PagamentoCriptomoeda(int id) {
        this.id = id;
    }

   
@Override
public void processarPagamento(int valor) {
    try {
        String conteudo = Files.readString(Paths.get("lista_saldo.txt"));
        String[] linhas = conteudo.split(";");

        boolean encontrado = false;

        for (String linha : linhas) {
            String[] partes = linha.trim().split(",");
            if (partes.length == 2 && partes[0].trim().equals(String.valueOf(id))) {
                System.out.println("Saldo do ID " + id + ": " + partes[1].trim());
                encontrado = true;
                break; 
            }
        }

        if (!encontrado) {
            System.out.println("Erro: ID " + id + " não encontrado na lista de saldo.");
        }

    } catch (IOException e) {
        System.out.println("Erro ao acessar o arquivo. Entre em contato com o dono do sistema. " + e);
    }
}

}
