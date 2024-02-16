package com.millergmbh.miller.entity;

import com.millergmbh.miller.entity.enums.Data;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.UuidGenerator;
import org.hibernate.type.SqlTypes;

import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    @Id
    @UuidGenerator
    @JdbcTypeCode(SqlTypes.BINARY)
    @Column(name = "user_id")
    private UUID userId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String userPhoneNumber;

    @Column(name = "age")
    private double age;

    @Column(name = "birth_day")
    @Enumerated(EnumType.STRING)
    private Data birthDay;

    @Column(name = "driver_category")
    private String driverCategory;

    @Column(name = "department_accessory")
    private String departmentAccessory;

    @Column(name = "service_accessory")
    private String serviceAccessory;

    @ManyToOne
    @JoinColumn(name = "logistic_id", referencedColumnName = "logistic_id", insertable=false, updatable=false)
    private Logistic auto;

    @ManyToOne
    @JoinColumn(name = "department_accessory", referencedColumnName = "dep_id", insertable=false, updatable=false)
    private Department department;

    @ManyToOne
    @JoinColumn(name = "service_accessory", referencedColumnName = "service_id", insertable=false, updatable=false)
    private Service service;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }
}
