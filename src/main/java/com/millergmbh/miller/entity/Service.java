package com.millergmbh.miller.entity;

import com.millergmbh.miller.entity.enums.EnumServices;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.UuidGenerator;
import org.hibernate.type.SqlTypes;

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
    @UuidGenerator
    @JdbcTypeCode(SqlTypes.BINARY)
    @Column(name = "service_id")
    private UUID serviceId;

    @Column(name = "service_name")
    private String serviceName;

    private EnumServices enumServices; // не помню для чего создал, может позже удалю

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dep_id", referencedColumnName = "dep_id",insertable=false, updatable=false)
    private Department department;

    @OneToMany(mappedBy = "service", cascade = CascadeType.ALL)
    private Set<User> users;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return Objects.equals(serviceId, service.serviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId);
    }
}
