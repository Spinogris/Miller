package com.millergmbh.miller.entity;

import com.millergmbh.miller.entity.enums.Status;
import jakarta.persistence.*;
import lombok.*;

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
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "auto_id")
    private UUID autoId;

    @Column(name = "auto_name")
    private String autoName;

    @Column(name = "auto_status")
    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToMany
    private Set<Account> user;

    @OneToMany
    private Set<Department> departments;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Logistic logistic = (Logistic) o;
        return Objects.equals(autoId, logistic.autoId)
                && Objects.equals(autoName, logistic.autoName)
                && Objects.equals(status, logistic.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                autoId,
                autoName,
                status);
    }
}
