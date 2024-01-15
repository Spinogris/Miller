package com.millergmbh.miller.entity;

import com.millergmbh.miller.entity.enums.DepartmentRole;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    @Id
    private UUID departmentId;

    private String departmentName;

    private DepartmentRole departmentRole;

    @OneToMany(mappedBy = "department")
    List<User> users;

    @OneToMany(mappedBy = "department")
    List<Service> services;
}
