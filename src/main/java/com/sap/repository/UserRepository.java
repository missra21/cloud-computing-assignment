package com.sap.repository;

import com.sap.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    User findByEmailAndEmpIdAllIgnoreCase(String email, String empId);

    Optional<User> findByEmpIdAllIgnoreCase(String empId);

}
