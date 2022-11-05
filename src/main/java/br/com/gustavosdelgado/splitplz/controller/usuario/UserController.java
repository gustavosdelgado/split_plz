package br.com.gustavosdelgado.splitplz.controller.usuario;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gustavosdelgado.splitplz.entity.Usuario;
import br.com.gustavosdelgado.splitplz.repository.UsuarioRepository;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UsuarioRepository repository;

    @CrossOrigin("http://192.168.1.46:3000")
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> get(@PathVariable("id") Long id) {
        try {
            Optional<Usuario> opt = repository.findById(1L);
            if (opt.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(opt.get(), HttpStatus.OK);
        } catch (RuntimeException e) {
            LOGGER.error("Falha ao buscar pela entidade Wallet: ", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
