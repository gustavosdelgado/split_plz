package br.com.gustavosdelgado.splitplz.controller.wallet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gustavosdelgado.splitplz.controller.wallet.request.WalletRequest;
import br.com.gustavosdelgado.splitplz.service.WalletService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/wallet")
public class WalletController {

    private static final Logger LOGGER = LoggerFactory.getLogger(WalletController.class);

    @Autowired
    WalletService service;

    @PostMapping
    public HttpStatus create(@Valid @RequestBody WalletRequest request) {
        try {
            service.create(request);
        } catch (RuntimeException e) {
            LOGGER.error("Falha ao criar a entidade Wallet: ", e);
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return HttpStatus.CREATED;
    }

    // @GetMapping("/{id}")
    // public ResponseEntity<Wallet> get(@PathVariable("id") Long id) {
    // try {
    // Optional<Wallet> opt = service.read(id);
    // if (opt.isEmpty()) {
    // return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    // }
    // return new ResponseEntity<>(opt.get(), HttpStatus.OK);
    // } catch (RuntimeException e) {
    // LOGGER.error("Falha ao buscar pela entidade Wallet: ", e);
    // return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    // }
    // }
}
