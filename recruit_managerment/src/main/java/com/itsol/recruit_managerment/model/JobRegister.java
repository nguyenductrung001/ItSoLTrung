package com.itsol.recruit_managerment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "job_register")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobRegister implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "job_id", nullable = false)
    private Job job;

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "date_register", nullable = false)
    private Date dateRegister;

    @ManyToOne
    @JoinColumn(name = "profile_status_id")
    private ProfileStatus profileStatus;

    @Column(name = "date_interview")
    private Date dateInterview;

    @Column(name = "method_interview")
    private String methodInterview;

    @Column(name = "cv_file")
    private String cv;

    @Column(name = "reason")
    private String reason;

    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column(name = "is_delete", nullable = false)
    private Boolean isDelete;

}
