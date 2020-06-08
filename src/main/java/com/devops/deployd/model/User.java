package com.devops.deployd.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="user")
@Data
@Builder
public class User {
    @Id
    private Long id;
    private String name;
    private Boolean active;
}
