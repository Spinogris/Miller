package com.millergmbh.miller.entity;

import com.millergmbh.miller.entity.enums.EnumServices;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Objects;
import java.util.Set;
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
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "service_id")
    private UUID serviceId;

    @Column(name = "service_name")
    private String serviceName;

    private EnumServices enumServices; // не помню для чего создал, может позже удалю

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dep_id", referencedColumnName = "department.dep_id")
    private Department department;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "users.user_id")
    private Set<Account> users;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return Objects.equals(serviceId, service.serviceId)
                && enumServices == service.enumServices;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                serviceId,
                enumServices);
    }


}
