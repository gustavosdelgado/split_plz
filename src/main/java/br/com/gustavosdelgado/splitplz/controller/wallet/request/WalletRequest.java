package br.com.gustavosdelgado.splitplz.controller.wallet.request;

import jakarta.validation.constraints.NotNull;

public class WalletRequest {

    @NotNull(message = "Name cannot be null")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
