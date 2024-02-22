package com.millergmbh.miller.entity;

import com.millergmbh.miller.entity.enums.Status;
import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Getter
@Setter
@Entity
@Table(name = "logistic")
@NoArgsConstructor
public class Logistic {

    @Id
    @Column(name = "auto_id")
    private int autoId;

    @Column(name = "auto_name")
    private String autoName;

    @Column(name = "auto_status")
    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToMany(mappedBy = "auto")
    private Set<User> user;

    @ManyToMany
    @JoinColumn(name = "department_id")
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
