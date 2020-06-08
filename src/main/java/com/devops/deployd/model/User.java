package com.devops.deployd.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="user")
@Data
@Builder
public class User {
    @Id
    @GeneratedValue()
    private Long id;
    @Column(columnDefinition = "text")
    private String name;
    @Column(columnDefinition = "boolean")
    private Boolean active;
}
