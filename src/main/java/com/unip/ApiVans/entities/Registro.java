package com.unip.ApiVans.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.sql.Timestamp;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "registro")
public class Registro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "id_van")
    private Long idVan;

    @Column(name = "horario")
    private Timestamp horario;

    @Column(name = "id_escola")
    private Long idEscola;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Registro registro = (Registro) o;
        return id != null && Objects.equals(id, registro.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}