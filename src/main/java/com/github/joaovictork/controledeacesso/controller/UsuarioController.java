package com.github.joaovictork.controledeacesso.controller;

import com.github.joaovictork.controledeacesso.model.Usuario;
import com.github.joaovictork.controledeacesso.service.UsuarioService;
import com.github.joaovictork.controledeacesso.controller.request.UsuarioRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> consultar(@RequestParam String nome, @RequestParam String email){
        usuarioService.obter()
        return ;
    }

    @PostMapping ("/salvar")
    public Usuario salvar(@RequestBody UsuarioRequest usuarioRequest){
        Usuario usuario = UsuarioRequest.toUsuario(usuarioRequest);
        return usuarioService.salvar(usuario);
    }
}
