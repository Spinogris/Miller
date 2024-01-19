package com.millergmbh.miller.entity;

import com.millergmbh.miller.entity.enums.UserRole;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private UUID userId;
    private String userName;
    private String userLastName;
    private UserRole userRole;
    private String userPhoneNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) && Objects.equals(userName, user.userName) && Objects.equals(userLastName, user.userLastName) && userRole == user.userRole && Objects.equals(userPhoneNumber, user.userPhoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userLastName, userRole, userPhoneNumber);
    }
}
