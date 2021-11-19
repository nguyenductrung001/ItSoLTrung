package com.itsol.recruit_managerment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity(name = "method_work")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MethodWork {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "method_name", nullable = false)
    private String methodName ;

    @Column(name = "description", nullable = false)
    private String description ;

    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column(name = "is_delete", nullable = false)
    private Boolean isDelete;

}
