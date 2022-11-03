package br.com.gustavosdelgado.splitplz.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.gustavosdelgado.splitplz.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
