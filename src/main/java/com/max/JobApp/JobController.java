package com.max.JobApp;

import com.max.JobApp.model.JobPost;
import com.max.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobController {

    @Autowired
    JobService service;

    @GetMapping({"/", "home"})
    public String home() {
        return "home";
    }

    @GetMapping("addjob")
    public String addJob(JobPost jobPost) {
        service.addJob(jobPost);
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost) {

        return "success";
    }
}
