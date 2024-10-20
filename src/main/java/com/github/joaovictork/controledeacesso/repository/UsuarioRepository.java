package com.github.joaovictork.controledeacesso.repository;

import com.github.joaovictork.controledeacesso.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
