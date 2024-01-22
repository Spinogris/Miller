package com.millergmbh.miller.entity;

import com.millergmbh.miller.entity.enums.UserRole;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

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
    @Column(name = "user_id")
    private UUID userId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;


    private UserRole userRole;

    @Column(name = "phone_number")
    private String userPhoneNumber;

    @Column(name = "age")
    private double age;

    @Column(name = "driver_category")
    private String driverCategory;

    @Column(name = "department_accessory")
    private String departmentAccessory;

    @Column(name = "service_accessory")
    private String serviceAccessory;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Double.compare(age, user.age) == 0 && Objects.equals(userId, user.userId) && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(email, user.email) && userRole == user.userRole && Objects.equals(userPhoneNumber, user.userPhoneNumber) && Objects.equals(driverCategory, user.driverCategory) && Objects.equals(departmentAccessory, user.departmentAccessory) && Objects.equals(serviceAccessory, user.serviceAccessory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, firstName, lastName, email, userRole, userPhoneNumber, age, driverCategory, departmentAccessory, serviceAccessory);
    }
}
