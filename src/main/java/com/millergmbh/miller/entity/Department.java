package com.millergmbh.miller.entity;

import com.millergmbh.miller.entity.enums.DepartmentRole;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    List<User> users;

    List<Service> services;

    private UUID departmentId;
    private String departmentName;
    private DepartmentRole departmentRole;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(users, that.users) && Objects.equals(services, that.services) && Objects.equals(departmentId, that.departmentId) && Objects.equals(departmentName, that.departmentName) && departmentRole == that.departmentRole;
    }

    @Override
    public int hashCode() {
        return Objects.hash(users, services, departmentId, departmentName, departmentRole);
    }
}
