package com.ds.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ds.service.CustomAuthenticationFilter;

@RestController
@RequestMapping("/")
public class PinggyController {

	@GetMapping
    public String getValueFromHeader() {
        String authHeaderValue = CustomAuthenticationFilter.getAuthHeaderValue();
        if (authHeaderValue != null) {
            return authHeaderValue;
        }
		return null;
	}
}
