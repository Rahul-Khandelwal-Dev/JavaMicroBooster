package com.ghostrick.Java.MicroBooster.controller;

import com.ghostrick.Java.MicroBooster.constants.AppConstants;
import com.ghostrick.Java.MicroBooster.service.MicroService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping
public class MicroController {

    @Autowired
    MicroService microService;

    @PostMapping(AppConstants.MICRO_API)
    public String hello() {
        return "Hello, world!";
    }
}
