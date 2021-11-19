package com.itsol.recruit_managerment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "notifications")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;


    @Column(name = "sender_id", nullable = false)
    private Long senderId;

    @Column(name = "receiver_id", nullable = false)
    private Long receiverId;

    @Column(name = "create_date", nullable = false)
    private Date createDate ;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "res_id", nullable = false)
    private Long resId;

    @ManyToOne
    @JoinColumn(name = "type_id", nullable = false)
    private Types type;

    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column(name = "is_delete", nullable = false)
    private Boolean isDelete;

}
