package com.passwordManagementSystem.appUser.data.repository;

import com.passwordManagementSystem.appUser.data.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser,Long> {
    boolean existsByEmailAddress(String emailAddress);

    boolean existsByPhoneNumber(String phoneNumber);

    AppUser findByEmailAddress(String email);
}
