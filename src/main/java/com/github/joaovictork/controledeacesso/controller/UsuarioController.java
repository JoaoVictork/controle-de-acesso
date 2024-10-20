package com.github.joaovictork.controledeacesso.controller;

import com.github.joaovictork.controledeacesso.controller.request.UsuarioRequest;
import com.github.joaovictork.controledeacesso.model.Usuario;
import com.github.joaovictork.controledeacesso.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping ("/salvar")
    public Usuario salvar(@RequestBody UsuarioRequest usuarioRequest){
        Usuario usuario = new Usuario();
        usuario.setNome(usuarioRequest.getNome());
        usuario.setEmail(usuario.getEmail());
        return usuarioService.salvar(usuario);
    }
}
