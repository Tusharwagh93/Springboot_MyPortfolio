package com.practice.portfolio.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.portfolio.model.Project;
import com.practice.portfolio.model.UserProfile;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
 