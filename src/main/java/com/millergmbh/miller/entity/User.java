package com.millergmbh.miller.entity;

import com.millergmbh.miller.entity.enums.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private UUID userId;
    private String userName;
    private String userLastName;
    private UserRole userRole;
    private String userPhoneNumber;

    @ManyToOne
    private Department department;

    @ManyToOne
    private Service service;

}
