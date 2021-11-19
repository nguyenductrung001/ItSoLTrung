package com.itsol.recruit_managerment.model;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity(name = "level_rank")
@Data

public class LevelRank {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "level_name", nullable = false)
    private String levelName ;

    @Column(name = "description", nullable = false)
    private String description ;

    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column(name = "is_delete", nullable = false)
    private Boolean isDelete;


}
