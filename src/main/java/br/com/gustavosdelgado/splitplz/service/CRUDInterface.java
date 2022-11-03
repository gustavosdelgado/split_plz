package br.com.gustavosdelgado.splitplz.service;

public interface CRUDInterface<R, T> {

    public void create(R entity);

    public T read(Long id);

    public void update(R entity);

    public void delete(Long id);
}
