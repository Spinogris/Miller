package com.millergmbh.miller.entity;

import com.millergmbh.miller.entity.enums.DepartmentRole;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    @Id
    @UuidGenerator
    private UUID departmentId;

    private String departmentName;

    private DepartmentRole departmentRole;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @OneToMany(mappedBy = "department")
    List<User> users;

    @OneToMany(mappedBy = "department")
    List<Service> services;
}
