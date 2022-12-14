package aula3;

import aula2.JsonParse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtratorDeConteudoIMDB implements ExtratorDeConteudo {

    public List<Conteudo> extraiConteudos (String json) {

        // extrair só os dados que interessem (titulo, poster, classificação)
        JsonParse parser = new JsonParse();
        List<Map<String, String>> listaDeConteudo = parser.parse(json);

        List<Conteudo> conteudos = new ArrayList<>();

        for (Map<String,String> atributos : listaDeConteudo) {

            String titulo = atributos.get("title");
            String urlImagem = atributos.get("image")
                    .replaceAll("(@+)(.*).jpg", "$1.jpg");

            var conteudo = new Conteudo(titulo,urlImagem);

            conteudos.add(conteudo);
        }
        return conteudos;
    }

}
