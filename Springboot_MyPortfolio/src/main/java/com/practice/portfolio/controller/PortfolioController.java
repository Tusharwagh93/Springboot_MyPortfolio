package com.practice.portfolio.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.practice.portfolio.model.Project;
import com.practice.portfolio.model.UserProfile;
import com.practice.portfolio.service.PortfolioService;

import java.util.List;

@Controller
public class PortfolioController {

    @Autowired
    private PortfolioService portfolioService;

    @GetMapping("/")
    public String showPortfolio(Model model) {
        UserProfile user = portfolioService.getUserProfile();
        List<Project> projects = portfolioService.getAllProjects();

        model.addAttribute("user", user);
        model.addAttribute("projects", projects);

        return "index";
    }
}
