package br.com.gustavosdelgado.splitplz.controller.wallet.request.adapter;

import org.springframework.stereotype.Component;

import br.com.gustavosdelgado.splitplz.adapter.Adaptable;
import br.com.gustavosdelgado.splitplz.controller.wallet.request.WalletRequest;
import br.com.gustavosdelgado.splitplz.entity.Wallet;

@Component
public class WalletRequestAdapter implements Adaptable<WalletRequest, Wallet> {

    @Override
    public Wallet adapt(WalletRequest request) {
        Wallet wallet = new Wallet();
        wallet.setName(request.getName());
        return wallet;
    }

}
