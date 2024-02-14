package com.millergmbh.miller.repository;

import com.millergmbh.miller.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID> {


}
