package br.com.senai.pessoa.controlle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaControlle {

    /* para testar criamos este meotod aqui depois vamos mudar */

    @GetMapping("/")
    public String rota() {
        return "cadastro de pessoas funciona !!!";
    }

}

