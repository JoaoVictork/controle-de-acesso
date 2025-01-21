package com.github.joaovictork.controledeacesso.controller.request;

import com.github.joaovictork.controledeacesso.model.Usuario;

public class UsuarioRequest {
    private String nome;
    private String email;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {return senha;}

    public void setSenha(String senha) {this.senha = senha;}

    public static Usuario toUsuario(UsuarioRequest usuarioRequest) {
        Usuario usuario = new Usuario();
        usuario.setNome(usuarioRequest.getNome());
        usuario.setEmail(usuario.getEmail());
        return usuario;
    }
}
