package com.itsol.recruit_managerment.service;


import com.itsol.recruit_managerment.model.User;
import com.itsol.recruit_managerment.repositories.IUserRespository;
import com.itsol.recruit_managerment.utils.CommonConst;
import com.itsol.recruit_managerment.vm.UserVM;
import org.apache.el.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class UserService {
    @Autowired
    IUserRespository iUserRespository;

    public List<User> getData() {
        return iUserRespository.findAll();
    }

    public int add(UserVM userVM) {
        User newUser = new User();
        try {
            boolean check = validateUser(userVM);
            if (!check) {
                System.out.println("........");
                return 0;
            }
            newUser.setGender(userVM.getGender());
            newUser.setEmail(userVM.getEmail());
            newUser.setHomeTown(userVM.getHomeTown());
            newUser.setPhoneNumber(userVM.getPhoneNumber());
            newUser.setFullName(userVM.getFullName());
            newUser.setUserName(userVM.getUserName());
            newUser.setPassword(userVM.getPassword());
            newUser.setUserStatus(userVM.getUserStatus());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                newUser.setBirthDay(sdf.parse(userVM.getBirthDay()));
            } catch (java.text.ParseException e) {
                e.printStackTrace();
            }
            iUserRespository.save(newUser);
            return CommonConst.SUCCESS;
        } catch (Exception e) {
            return CommonConst.ERROR;
        }
    }

    public boolean validateUser(UserVM userVM) {
        return true;
    }

    public int update(UserVM userVM,Integer id) {
        User newUser = new User();
        try {
            boolean check = validateUser(userVM);
            if (!check) {
                System.out.println("........");
                return 0;
            }
            newUser.setId(id);
            newUser.setGender(userVM.getGender());
            newUser.setEmail(userVM.getEmail());
            newUser.setHomeTown(userVM.getHomeTown());
            newUser.setPhoneNumber(userVM.getPhoneNumber());
            newUser.setFullName(userVM.getFullName());
            newUser.setUserName(userVM.getUserName());
            newUser.setPassword(userVM.getPassword());
            newUser.setUserStatus(userVM.getUserStatus());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                newUser.setBirthDay(sdf.parse(userVM.getBirthDay()));
            } catch (java.text.ParseException e) {
                e.printStackTrace();
            }
            iUserRespository.save(newUser);
            return CommonConst.SUCCESS;
        } catch (Exception e) {
            return CommonConst.ERROR;
        }
    }
    public int deleteById(Integer deletepcId) {
        try {
            iUserRespository.deleteById(deletepcId);
            return CommonConst.SUCCESS;
        } catch (Exception e) {
            // TODO: handle exception
            return CommonConst.ERROR;
        }
    }
}
