package com.itsol.recruit_managerment.repositories;

import com.itsol.recruit_managerment.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUserRespository extends JpaRepository<User,Integer> {
    List<User> findAll();
}
