package com.millergmbh.miller.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "logistic")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Logistic {
    @Id
    @Column(name = "auto_id")
    private UUID autoId;

    @Column(name = "auto_name")
    private String autoName;

    @Column(name = "auto_status")
    private String status;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Logistic logistic = (Logistic) o;
        return Objects.equals(autoId, logistic.autoId) && Objects.equals(autoName, logistic.autoName) && Objects.equals(status, logistic.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoId, autoName, status);
    }
}
