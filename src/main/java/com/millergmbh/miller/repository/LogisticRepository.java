package com.millergmbh.miller.repository;

import com.millergmbh.miller.entity.Logistic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LogisticRepository extends JpaRepository<Logistic, UUID> {
}
