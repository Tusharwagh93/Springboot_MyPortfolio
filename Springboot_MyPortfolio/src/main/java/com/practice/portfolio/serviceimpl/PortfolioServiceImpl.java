package com.practice.portfolio.serviceimpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.portfolio.model.Project;
import com.practice.portfolio.model.UserProfile;
import com.practice.portfolio.repository.ProjectRepository;
import com.practice.portfolio.repository.UserProfileRepository;
import com.practice.portfolio.service.PortfolioService;

import java.util.List;

@Service
public class PortfolioServiceImpl implements PortfolioService {

    @Autowired
    private UserProfileRepository userProfileRepo;

    @Autowired
    private ProjectRepository projectRepo;

    @Override
    public UserProfile getUserProfile() {
        return userProfileRepo.findById(1L).orElse(null); // default ID 1
    }

    @Override
    public List<Project> getAllProjects() {
        return projectRepo.findAll(); 
    } 
}  
