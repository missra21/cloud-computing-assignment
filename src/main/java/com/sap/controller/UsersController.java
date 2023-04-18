package com.sap.controller;

import com.sap.dtos.response.DemoApplicationResponse;
import com.sap.entities.User;
import com.sap.exceptions.UserAlreadyExistsException;
import com.sap.exceptions.UserNotFoundException;
import com.sap.service.UserService;
import com.sap.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("users")
public class UsersController {

    @Autowired
    UserService userService;

    @GetMapping("")
    public ResponseEntity<DemoApplicationResponse<List<User>>> getUsers() {
        List<User> users = userService.fetchAll();
        if (null == users || users.isEmpty()) {
            return DemoApplicationResponse.noContent();
        }
        return DemoApplicationResponse.ok(users);
    }

    @GetMapping("/{uuid}")
    public ResponseEntity<DemoApplicationResponse<User>> getUser(@PathVariable UUID uuid) {
        try {
            return DemoApplicationResponse.ok(userService.findById(uuid));
        } catch (UserNotFoundException e) {
            return DemoApplicationResponse.badRequest(e.getMessage());
        }
    }

    @GetMapping("/empId/{id}")
    public ResponseEntity<DemoApplicationResponse<User>> getUserbyEmpId(@PathVariable String id) {
        User user = userService.findByEmpId(id);
        if (null == user) {
            return DemoApplicationResponse.notFound(Constants.ErrorMessages.USER_NOT_FOUND);
        }
        return DemoApplicationResponse.ok(user);
    }

    @PostMapping("")
    public ResponseEntity<DemoApplicationResponse<String>> addUser(@RequestBody User request) {
        try {
            userService.addUser(request);
        } catch (UserAlreadyExistsException e) {
            return DemoApplicationResponse.badRequest(Constants.ErrorMessages.USER_ALREADY_EXISTS);
        }
        return DemoApplicationResponse.created("User Added successfully");
    }

    @DeleteMapping("/{uuid}")
    public ResponseEntity<DemoApplicationResponse<User>> deleteUser(@PathVariable UUID uuid) {
        if (userService.deleteById(uuid)) {
            return DemoApplicationResponse.noContent(Constants.ResponseMessages.USER_DELETED);
        }
        return DemoApplicationResponse.notFound(Constants.ErrorMessages.USER_NOT_FOUND);
    }

}
