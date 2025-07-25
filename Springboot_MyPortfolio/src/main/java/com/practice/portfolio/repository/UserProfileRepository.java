package com.practice.portfolio.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.portfolio.model.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
}
