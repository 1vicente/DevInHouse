package semana10.devinhouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/formulario")
public class FormularioController {

    @PostMapping
    public String postFormulario(String nome, Model model){

        model.addAttribute("nome",nome);

        return "";
    };
}
