package com.github.joaovictork.controledeacesso.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "TB_USUARIO")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id")
    private Long id;
    @Column (name = "email")
    private String email;
    @Column (name = "senha")
    private String senha;
    @Column (name = "nome")
    private String nome;
    @Column (name = "data_cadastro")
    private LocalDateTime dataCadastro;
    @Column (name = "data_ultimo_acesso")
    private LocalDateTime dataUltimoAcesso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDateTime getDataUltimoAcesso() {
        return dataUltimoAcesso;
    }

    public void setDataUltimoAcesso(LocalDateTime dataUltimoAcesso) {
        this.dataUltimoAcesso = dataUltimoAcesso;
    }
}
