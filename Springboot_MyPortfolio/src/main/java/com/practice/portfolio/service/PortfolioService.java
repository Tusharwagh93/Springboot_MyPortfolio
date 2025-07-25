package com.practice.portfolio.service;


import java.util.List;

import com.practice.portfolio.model.Project;
import com.practice.portfolio.model.UserProfile;

public interface PortfolioService {
    UserProfile getUserProfile();
    List<Project> getAllProjects();
}
