package br.com.gustavosdelgado.splitplz.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.apache.commons.lang3.math.Fraction;

@Entity
public class Split {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Usuario usuario;

    private Fraction percentage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Fraction getPercentage() {
        return percentage;
    }

    public void setPercentage(Fraction percentage) {
        this.percentage = percentage;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
