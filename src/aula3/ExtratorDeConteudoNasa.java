package aula3;

import aula2.JsonParse;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtratorDeConteudoNasa implements ExtratorDeConteudo {

    public List<Conteudo> extraiConteudos (String json) {
        // extrair só os dados que interessem (titulo, poster, classificação)
        JsonParse parser = new JsonParse();
        List<Map<String, String>> listaDeConteudo = parser.parse(json);

        List<Conteudo> conteudos = new ArrayList<>();

        for (Map<String,String> atributos : listaDeConteudo) {
            String titulo = atributos.get("title");
            String urlImagem = atributos.get("url");
            var conteudo = new Conteudo(titulo,urlImagem);

            conteudos.add(conteudo);
        }

        return conteudos;
    }
}
