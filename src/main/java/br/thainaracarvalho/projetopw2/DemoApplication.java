package br.thainaracarvalho.projetopw2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/aula")
    public String hello(@RequestParam(value = "aluno", defaultValue = "thainara") String aluno) {
        return String.format("Olá %s! bem-vinda a disciplina de PWEBII", aluno);
    }

}

