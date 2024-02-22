package com.millergmbh.miller.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "department")
@NoArgsConstructor
public class Department {

    @Id
    @Column(name = "dep_id")
    private int departmentId;

    @Column(name = "dep_name")
    private String departmentName;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private Set<User> users;

    @OneToOne
    @JoinColumn(name = "service_id")
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
