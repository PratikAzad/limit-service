package com.example.limitsservice.controller;

import com.example.limitsservice.domain.LimitsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Environment environment;

    @GetMapping("/limits")
    public LimitsConfiguration getLimitCfg(){
        return new LimitsConfiguration(Integer.parseInt(environment.getProperty("limits.maximum")),
                Integer.parseInt(environment.getProperty("limits.minimum")));
    }
}
