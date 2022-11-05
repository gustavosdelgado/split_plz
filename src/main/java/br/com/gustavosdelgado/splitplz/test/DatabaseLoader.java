package br.com.gustavosdelgado.splitplz.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.gustavosdelgado.splitplz.entity.Usuario;
import br.com.gustavosdelgado.splitplz.repository.UsuarioRepository;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final UsuarioRepository repository;

    public DatabaseLoader(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.repository.save(new Usuario("gustavodelgado@pm.me", "Gustavo", "Delgado"));
    }

}
