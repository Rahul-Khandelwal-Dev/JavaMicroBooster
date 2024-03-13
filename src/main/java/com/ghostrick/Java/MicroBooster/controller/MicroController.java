package com.ghostrick.Java.MicroBooster.controller;

import com.ghostrick.Java.MicroBooster.constants.AppConstants;
import com.ghostrick.Java.MicroBooster.service.MicroService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping
public class MicroController {

    @Autowired
    MicroService microService;

    @PostMapping(AppConstants.MICRO_POST_API)
    @Operation(summary = "Micro Post API", description = "Sample Post API")
    @ApiResponse(responseCode = AppConstants.HTTP_STATUS_200, description = AppConstants.HTTP_STATUS_200_DESC, useReturnTypeSchema = true)
    public String hello() {
        return "Hello, world!";
    }
}
