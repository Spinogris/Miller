package com.millergmbh.miller.entity;

import com.millergmbh.miller.entity.enums.Status;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.UuidGenerator;
import org.hibernate.type.SqlTypes;

import java.util.*;

@Getter
@Setter
@Entity
@Table(name = "logistic")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Logistic {

    @Id
    @UuidGenerator
    @JdbcTypeCode(SqlTypes.BINARY)
    @Column(name = "logistic_id")
    private UUID autoId;

    @Column(name = "auto_name")
    private String autoName;

    @Column(name = "auto_status")
    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToMany(mappedBy = "auto")
    private Set<User> user;

    @ManyToMany(mappedBy = "auto")
    private Set<Department> departments;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Logistic logistic = (Logistic) o;
        return Objects.equals(autoId, logistic.autoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoId);
    }
}
