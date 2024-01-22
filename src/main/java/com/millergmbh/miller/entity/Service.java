package com.millergmbh.miller.entity;

import com.millergmbh.miller.entity.enums.EnumServices;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "services")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Service {
    @Id
    @Column(name = "service_id")
    private UUID serviceId;

    @Column(name = "service_name")
    private String serviceName;

    private EnumServices enumServices;

    private Department department;

    private List<User> users;

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


}
