package br.com.gustavosdelgado.splitplz.adapter;

public interface Adaptable<R, T> {

    public T adapt(R request);

}
