import java.nio.file.*;
import java.io.IOException;

public class PagamentoCriptomoeda implements IPagamento {
   int id;

    public PagamentoCriptomoeda(int id) {
        this.id = id;
    }

   

    @Override
    public String processarPagamento(int valor) {
        try {
            String conteudo = Files.readString(Paths.get("saldos.txt"));
            String[] linhas = conteudo.split(";");

            for (String linha : linhas) {
                String[] partes = linha.trim().split(",");
                if (partes.length == 2 && partes[0].trim().equals(id)) {
                    return "Saldo do ID " + id + ": " + partes[1].trim();
                }
            }

            return "Erro no ID";

        } catch (IOException e) {
            return "Erro";
        }
    }
}
