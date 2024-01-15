package com.millergmbh.miller.entity;

import com.millergmbh.miller.entity.enums.EnumServices;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Service {

    @Id
    private UUID serviceId;

    private EnumServices enumServices;

    @ManyToOne
    private Department department;

    @OneToMany(mappedBy = "service")
    private List<User> users;
}
