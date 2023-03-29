import java.util.List;
import java.util.Map;

public class ExtratorDeConteudoDoIMDB implements ExtratorDeConteudo {

    public List<Conteudo> extraiConteudos(String json) {
        // extrair somente os dados que interessam (título, poster, classificação) 
        var parser =  new JsonParser();
        List<Map<String, String>> listaDeAtributos = parser.parse(json);

        return listaDeAtributos.stream()
            .map(atributos -> new Conteudo (atributos.get("title"), atributos.get("image")))            
            .toList();                  
    }
}
