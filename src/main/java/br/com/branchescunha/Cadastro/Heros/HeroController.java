package br.com.branchescunha.Cadastro.Heros;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class HeroController {

    @GetMapping("/welcome")
    public String welcome() {
        return "This is my first message on this route.";
    }

}
