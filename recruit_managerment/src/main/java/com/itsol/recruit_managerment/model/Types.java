package com.itsol.recruit_managerment.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity(name = "types")
public class Types {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String Name ;

    @Column(name = "description", nullable = false)
    private String description ;

    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column(name = "is_delete", nullable = false)
    private Boolean isDelete;

}
