package com.sap.service;

import com.sap.entities.User;
import com.sap.exceptions.UserAlreadyExistsException;
import com.sap.exceptions.UserNotFoundException;
import com.sap.repository.UserRepository;
import com.sap.util.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public List<User> fetchAll() {
        return userRepository.findAll();
    }

    public User findById(UUID id) throws UserNotFoundException {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(Constants.ErrorMessages.USER_NOT_FOUND));
    }

    public User findByEmpId(String empId) {
        return userRepository.findByEmpIdAllIgnoreCase(empId).orElse(null);
    }

    public User addUser(User request) throws UserAlreadyExistsException {
        User user = userRepository.findByEmailAndEmpIdAllIgnoreCase(request.getEmail(), request.getEmpId());
        if (null != user){
            throw new UserAlreadyExistsException(Constants.ErrorMessages.USER_ALREADY_EXISTS);
        }
        return upsertUser(request);
    }

    public User upsertUser(User user) {
        return userRepository.save(user);
    }

}