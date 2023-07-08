package com.unip.ApiVans.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "motorista")
public class Motorista implements Serializable {

    public Motorista(Long id, String nome, String telefone, String rg, String cpf, String cnh, String bairro,
                     String rua, Integer numero, String complemento) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.rg = rg;
        this.cpf = cpf;
        this.cnh = cnh;
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

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "rg")
    private String rg;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "cnh")
    private String cnh;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "rua")
    private String rua;

    @Column(name = "numero")
    private Integer numero;

    @Column(name = "complemento")
    private String complemento;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "van_motoristas",
            joinColumns = @JoinColumn(name = "motoristas_id"),
            inverseJoinColumns = @JoinColumn(name = "van_id"))
    private Set<Van> vans = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Motorista motorista = (Motorista) o;
        return id != null && Objects.equals(id, motorista.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}