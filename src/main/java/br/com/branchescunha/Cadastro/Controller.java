package br.com.branchescunha.Cadastro;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/welcome")
    public String welcome() {
        return "This is my first message on this route.";
    }

}
