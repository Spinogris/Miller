package com.millergmbh.miller.entity;

import com.millergmbh.miller.entity.enums.UserRole;
import jakarta.persistence.*;
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
public class Account  {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
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

    @Column(name = "birth_day")
    @Enumerated(EnumType.STRING)
    private Data birthDay;

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
        Account account = (Account) o;
        return Double.compare(age, account.age) == 0 && Objects.equals(userId, account.userId) && Objects.equals(firstName, account.firstName) && Objects.equals(lastName, account.lastName) && Objects.equals(email, account.email) && userRole == account.userRole && Objects.equals(userPhoneNumber, account.userPhoneNumber) && Objects.equals(birthDay, account.birthDay) && Objects.equals(driverCategory, account.driverCategory) && Objects.equals(departmentAccessory, account.departmentAccessory) && Objects.equals(serviceAccessory, account.serviceAccessory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, firstName, lastName, email, userRole, userPhoneNumber, age, birthDay, driverCategory, departmentAccessory, serviceAccessory);
    }

}
