package com.hospital.management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HospitalController {

    @GetMapping("/getHospital")
    public String getHospitalName()
    {
        return "Krishna Hospital";
    }
}
