package br.senac.tads.dsw.exercicio.service;

import br.senac.tads.dsw.exercicio.model.Usuario;
import br.senac.tads.dsw.exercicio.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;

    public Usuario cadastrar(Usuario usuario) {
        return repository.save(usuario);
    }

    public List<Usuario> buscar() {
        return repository.findAll();
    }

}
