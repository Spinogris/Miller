package com.millergmbh.miller.entity;

import com.millergmbh.miller.entity.enums.DepartmentRole;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Entity(name = "DepartmentRole")
@Table(name = "department")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "dep_id")
    private UUID departmentId;

    @Column(name = "dep_name")
    private String departmentName;


    private DepartmentRole departmentRole;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Account> users;

    @OneToMany
    @JoinColumn(name = "service_id")
    private List<Service> services;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(users, that.users)
                && Objects.equals(services, that.services)
                && Objects.equals(departmentId, that.departmentId)
                && Objects.equals(departmentName, that.departmentName)
                && departmentRole == that.departmentRole;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                users,
                services,
                departmentId,
                departmentName,
                departmentRole);
    }
}
