import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class RequisicaoTopFilmes {

    public RequisicaoTopFilmes() throws IOException, InterruptedException {
    }

    public static void main(String[] args) throws Exception {
        // Fazer uma conexão HTTP e buscar top 250 filmes

        String url = "https://imdb-api.com/en/API/Top250Movies/k_391f2mk7";
        URI endereco = URI.create(url);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String body = response.body();
        System.out.println(body);

        //Extrair apenas os dados que interessam (titulo, poster, classificação)
        JsonParse parser =  new JsonParse();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);

        // Exibir e manipular os dados

        }
}