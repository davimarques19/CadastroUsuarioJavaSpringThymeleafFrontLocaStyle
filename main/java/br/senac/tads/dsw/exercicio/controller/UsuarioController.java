package br.senac.tads.dsw.exercicio.controller;

import br.senac.tads.dsw.exercicio.model.Usuario;
import br.senac.tads.dsw.exercicio.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService service;

    @GetMapping("/user/create")
    public ModelAndView cadUser() {
        return new ModelAndView("/criar-usuario.html");
    }

    @PostMapping("/user/create")
    public ModelAndView cadastrar(@ModelAttribute("usuario") Usuario usuario, RedirectAttributes redirAttr) {
        ModelAndView mv = new ModelAndView("redirect:/user/all");
        service.cadastrar(usuario);
        return mv;
    }

    @GetMapping("/user/all")
    public ModelAndView listar() {
        ModelAndView mv = new ModelAndView("/listagem-usuarios.html");
        List<Usuario> listaUsuarios = service.buscar();
        mv.addObject("listaUsuarios", listaUsuarios);
        return mv;
    }

}
