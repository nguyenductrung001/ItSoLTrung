package com.itsol.recruit_managerment.controller;


import com.itsol.recruit_managerment.model.User;
import com.itsol.recruit_managerment.service.UserService;
import com.itsol.recruit_managerment.vm.UserVM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getAll(){
        return userService.getData();
    }

    @PostMapping()
    public ResponseEntity<Object> add(@Valid @RequestBody UserVM userVM, BindingResult result) {
        if(result.hasErrors()){
            return  ResponseEntity.badRequest().body(result.getAllErrors());
        }
        try {
            userService.validateUser(userVM);
            userService.add(userVM);
            return  ResponseEntity.ok().body(userVM);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.badRequest().body("failed to create user");
        }

    }
    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable Integer id , @RequestBody UserVM userVM) {
        try {
            userService.validateUser(userVM);
            userService.update(userVM,id);
            return  ResponseEntity.ok().body(userVM);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.badRequest().body("failed to update user");
        }

    }
    @DeleteMapping("/{id}")
    public int delete(@PathVariable Integer id ) {
        return userService.deleteById(id);
    }

}
