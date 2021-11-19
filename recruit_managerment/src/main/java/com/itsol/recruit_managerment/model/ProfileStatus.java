package com.itsol.recruit_managerment.model;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity(name = "profile_status")
@Data
public class ProfileStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column(name = "is_delete", nullable = false)
    private Boolean isDelete;

}
