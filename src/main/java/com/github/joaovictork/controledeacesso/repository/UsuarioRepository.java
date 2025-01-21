package com.github.joaovictork.controledeacesso.repository;

import com.github.joaovictork.controledeacesso.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    //nativeQuery = true significa a tabela de usuario está sendo referenciada diretamente do banco de dados
    @Query(value = "SELECT * FROM TB_USUARIO WHERE NOME LIKE %:nome% AND EMAIL LIKE %:email%", nativeQuery = true)
    List<Usuario> consultarUsuarios(@Param("nome") String nome, @Param("email") String email);
}
