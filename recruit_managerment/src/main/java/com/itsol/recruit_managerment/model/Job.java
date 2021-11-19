package com.itsol.recruit_managerment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity(name = "jobs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "job_name", nullable = false)
    @Size(max = 150 )
    private String jobName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_position_id", nullable = false)
    private JobPosition jobPosition;// -	Vị trí công việc (dev, tester, BA, PM, ... ):

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "method_work_id")
    private MethodWork methodWork;

    @Column(name = "address_work", nullable = false)
    @Size(max = 300 )
    private String addressWork;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "academic_level_id")
    private AcademicLevel academicLevel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "level_rank_id")
    private LevelRank levelRank;

    @Column(name = "qty_person", nullable = false)
    private Integer qtyPerson ; // số lượng cần tuyển

    @Column(name = "due_date", nullable = false)
    private Date dueDate ; // hạn nộp hồ sơ

    @Column(name = "skill", nullable = false)
    private String skill ; // kỹ năng VD: java, php, sql, mongo, docker, ….

    @Column(name = "description", nullable = false)
    @Size(max = 2000)
    private String description; //không quá 2000 ký tự

    @Column(name = "interes", nullable = false)
    @Size(max = 2000)
    private String interes; //quyền lợi được hưởng

    @Column(name = "job_requirements", nullable = false)
    @Size(max = 2000)
    private String jobRequirements; //-	Yêu cầu công việc: không quá 2000 ký tự

    @Column(name = "min_salary", nullable = false)
    private Integer minSalary;

    @Column(name = "max_salary", nullable = false)
    private Integer maxSalary;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contact_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_status_id")
    private JobStatus jobStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "create_id")
    private User userCreate;

    private Integer view;

    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column(name = "is_delete", nullable = false)
    private Boolean isDelete;

}
