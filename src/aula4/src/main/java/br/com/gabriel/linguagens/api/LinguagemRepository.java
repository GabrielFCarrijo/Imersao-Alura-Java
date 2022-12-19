package aula4.src.main.java.br.com.gabriel.linguagens.api;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LinguagemRepository extends MongoRepository<Linguagem, String> {
}
