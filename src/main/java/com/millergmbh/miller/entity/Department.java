package com.millergmbh.miller.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.UuidGenerator;
import org.hibernate.type.SqlTypes;

import java.util.Objects;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "department")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Department {

    @Id
    @UuidGenerator
    @JdbcTypeCode(SqlTypes.BINARY)
    @Column(name = "dep_id")
    private UUID departmentId;

    @Column(name = "dep_name")
    private String departmentName;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private Set<User> users;

    @OneToOne(mappedBy = "department")
    @JoinColumn(name = "service_id", referencedColumnName = "service_id")
    private Service services;

    @ManyToMany(mappedBy = "departments")
    private Set<Logistic> auto;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(departmentId, that.departmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentId);
    }
}
