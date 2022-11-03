package br.com.gustavosdelgado.splitplz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gustavosdelgado.splitplz.controller.wallet.request.WalletRequest;
import br.com.gustavosdelgado.splitplz.controller.wallet.request.adapter.WalletRequestAdapter;
import br.com.gustavosdelgado.splitplz.controller.wallet.response.WalletResponse;
import br.com.gustavosdelgado.splitplz.entity.Wallet;
import br.com.gustavosdelgado.splitplz.repository.WalletRepository;

@Service
public class WalletService implements CRUDInterface<WalletRequest, WalletResponse> {

    @Autowired
    WalletRepository repository;

    @Autowired
    WalletRequestAdapter adapter;

    @Override
    public void create(WalletRequest request) {
        Wallet wallet = adapter.adapt(request);
        repository.save(wallet);
    }

    @Override
    public WalletResponse read(Long id) {
        // return repository.findById(id);
        return null;
    }

    @Override
    public void update(WalletRequest request) {
        // repository.findById(entity.getId());
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
    }

}
