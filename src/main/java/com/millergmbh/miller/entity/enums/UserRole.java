package com.millergmbh.miller.entity.enums;

import jakarta.persistence.Entity;
import lombok.Getter;

@Getter
@Entity
public enum UserRole {
    ADMINISTRATOR,
    USER;

    UserRole() {

    }
}
