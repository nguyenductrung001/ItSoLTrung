package com.itsol.recruit_managerment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "profiles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profiles implements Serializable {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "skill", nullable = false)
    private String Skill;

    @Column(name = "number_year_experience", nullable = false)
    private Integer numberYearExperience;

    @Column(name = "expected_salary", nullable = false)
    private Integer expectedSalary;

    @Column(name = "expected_place_work", nullable = false)
    private String expectedPlaceWork;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "expected_method_work_id", nullable = false)
    private MethodWork expectedMethodWork;

    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column(name = "is_delete", nullable = false)
    private Boolean isDelete;

}
