package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.ValidationInput;

@RestController
@RequestMapping(value = "/validator")
public class ValidatorController {
		
	@PostMapping(path = "/validate")
    public String Save(@RequestBody ValidationInput input) {

        return "Customer information saved successfully ::." + input.getName() + " -- Input: " + input.getInput();
    }
}

