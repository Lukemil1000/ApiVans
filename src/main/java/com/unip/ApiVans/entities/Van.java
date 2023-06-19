package com.unip.ApiVans.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "van")
public class Van implements Serializable {

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
    @JoinTable(name = "van_motoristas",
            joinColumns = @JoinColumn(name = "van_id"),
            inverseJoinColumns = @JoinColumn(name = "motoristas_id"))
    private Set<Motorista> motoristas = new LinkedHashSet<>();

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
