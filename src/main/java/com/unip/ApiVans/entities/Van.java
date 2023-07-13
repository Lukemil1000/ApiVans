package com.unip.ApiVans.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "van")
public class Van implements Serializable {

    public Van(Long id, String placa, String modelo, String cor, String documento, String qrcode) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.documento = documento;
        this.qrcode = qrcode;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "placa")
    private String placa;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "cor")
    private String cor;

    @Column(name = "documento")
    private String documento;

    @Column(name = "qrcode")
    private String qrcode;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "vans_motoristas",
            joinColumns = @JoinColumn(name = "van_id"),
            inverseJoinColumns = @JoinColumn(name = "motorista_id"))
    private Set<Motorista> motoristas = new LinkedHashSet<>();

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "vans_escolas",
            joinColumns = @JoinColumn(name = "van_id"),
            inverseJoinColumns = @JoinColumn(name = "escola_id"))
    private Set<Escola> escolas = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Van van = (Van) o;
        return id != null && Objects.equals(id, van.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
