package com.example.cpu_increace.controller;

import com.example.cpu_increace.service.CpuIntensiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CpuUsageController {

    @Autowired
    private CpuIntensiveService cpuIntensiveService;

    @GetMapping("/increase-cpu")
    public String increaseCpuUsage() {
        cpuIntensiveService.performCpuIntensiveTask();
        return "CPU intensive task completed";
    }

}
