package br.com.gustavosdelgado.splitplz.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.gustavosdelgado.splitplz.entity.Expense;

public interface ExpenseRepository extends CrudRepository<Expense, Long> {

}
