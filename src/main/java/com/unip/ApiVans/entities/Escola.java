package com.unip.ApiVans.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "escola")
public class Escola implements Serializable {

    public Escola(Long id, String nome, String cnpj, String telefone, String bairro, String rua, Integer numero,
                  String complemento) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "rua")
    private String rua;

    @Column(name = "numero")
    private Integer numero;

    @Column(name = "complemento")
    private String complemento;

    @ManyToMany(mappedBy = "escolas", cascade = CascadeType.PERSIST)
    private Set<Van> vans = new LinkedHashSet<>();

    @OneToMany(mappedBy = "escola", cascade = CascadeType.ALL)
    private Set<Registro> registros = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Escola escola = (Escola) o;
        return id != null && Objects.equals(id, escola.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}