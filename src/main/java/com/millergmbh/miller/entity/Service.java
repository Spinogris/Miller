package com.millergmbh.miller.entity;

import com.millergmbh.miller.entity.enums.EnumServices;
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
public class Service {

    private UUID serviceId;

    private EnumServices enumServices;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return Objects.equals(serviceId, service.serviceId) && enumServices == service.enumServices && Objects.equals(department, service.department) && Objects.equals(users, service.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId, enumServices, department, users);
    }

    private Department department;

    private List<User> users;



}
