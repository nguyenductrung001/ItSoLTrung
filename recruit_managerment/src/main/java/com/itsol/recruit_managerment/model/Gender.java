package com.itsol.recruit_managerment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity(name = "gender")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column(name = "is_delete", nullable = false)
    private Boolean isDelete;
}
