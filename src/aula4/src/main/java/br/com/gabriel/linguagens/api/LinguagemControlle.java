package aula4.src.main.java.br.com.gabriel.linguagens.api;

import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LinguagemControlle {

    @Autowired
    private LinguagemRepository repository;


    @GetMapping("/rankingLinguagens")
    public List<Linguagem> obterLinguagem() {
        List<Linguagem> linguagems = repository.findAll();
        return linguagems;
    }
}
