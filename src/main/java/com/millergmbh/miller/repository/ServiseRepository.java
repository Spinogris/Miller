package com.millergmbh.miller.repository;

import com.millergmbh.miller.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ServiseRepository extends JpaRepository<Service, UUID> {
}
