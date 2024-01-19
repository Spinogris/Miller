package com.millergmbh.miller.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Logistic {

    private UUID autoId;

    private String autoName;

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
