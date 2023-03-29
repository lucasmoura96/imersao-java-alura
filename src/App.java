import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {        
        // fazer uma conexão HTTP e buscar os top 10 filmes mais populares
        // String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";
        String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularMovies.json";
        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();    
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers .ofString());
        String body = response.body();
        System.out.println(body);            

        // extrair somente os dados que interessam (título, poster, classificação) 
        var parser =  new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);
        System.out.println(listaDeFilmes.size());
        System.out.println(listaDeFilmes.get(0));

        var diretorio = new File("figurinhas/");
        diretorio.mkdir();
        // exibir e manipular os dados        
        var geradora = new GeradorDeFigurinhas();
        for (int index = 0; index < 5; index++) {   
            var filme = listaDeFilmes.get(index);           
        
            String urlImagem = filme.get("image");
            String titulo = filme.get("title");
            double classificacao = Double.parseDouble(filme.get("imDbRating"));

            String textoFigurinha;
            if (classificacao >= 8.0) {
                textoFigurinha = "PERFEIÇÃO!!";
             } else {
                    textoFigurinha = "DA PRA VER..";
                }            
                       
            InputStream inputStream = new URL(urlImagem).openStream();             
            String nomeArquivo = "figurinhas/" + titulo.replace(":", "-")  + ".png";
            
            geradora.cria(inputStream, nomeArquivo, textoFigurinha);

            System.out.println(titulo);
            System.out.println();
            
        }

    }

}

