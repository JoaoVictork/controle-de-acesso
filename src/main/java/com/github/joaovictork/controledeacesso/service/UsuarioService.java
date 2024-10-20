package com.github.joaovictork.controledeacesso.service;

import com.github.joaovictork.controledeacesso.model.Usuario;
import com.github.joaovictork.controledeacesso.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    public Usuario salvar(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}
