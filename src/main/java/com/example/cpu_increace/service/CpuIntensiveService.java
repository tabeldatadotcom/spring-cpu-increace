package com.example.cpu_increace.service;

import org.springframework.stereotype.Service;

@Service
public class CpuIntensiveService {

    public void performCpuIntensiveTask() {
        long start = System.currentTimeMillis();
        // Run the task for a certain period of time, e.g., 10 seconds
        while (System.currentTimeMillis() - start < 10000) {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                Math.sqrt(i);
            }
        }
    }

}
