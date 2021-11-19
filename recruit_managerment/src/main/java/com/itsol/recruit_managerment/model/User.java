package com.itsol.recruit_managerment.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "Users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User implements Serializable {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USERS_SEQ")
    @SequenceGenerator(name = "USERS_SEQ", sequenceName = "USERS_SEQ", allocationSize = 1, initialValue = 1)
    Integer id;
    @NotBlank(message = "fullName không được để trống")
    String  fullName;
    @Column(name = "EMAIL")
    String  email;
    @Column(name = "USER_NAME")
    String  userName;
    @Column(name = "PASSWORD")
    String  password;
    @Column(name = "PHONE_NUMBER")
    String  phoneNumber;
    @Column(name = "HOME_TOWN")
    String  homeTown;
    @Column(name = "GENDER")
    String  gender;
    @Column(name = "BIRTH_DAY")
    Date birthDay;
    @Column(name = "USER_STATUS")
    String  userStatus;
    @Column(name = "IS_DELETE")
    int  IS_DELETE;
}
