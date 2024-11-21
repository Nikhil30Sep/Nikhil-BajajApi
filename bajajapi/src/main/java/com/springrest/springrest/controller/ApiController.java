package com.springrest.springrest.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.model.PostRequest;
import com.springrest.springrest.model.PostResponse;
import com.springrest.springrest.service.ApiService;

@RestController
@RequestMapping("/bfhl")
public class ApiController {
	
	private final ApiService service;

    // Constructor-based injection
    public ApiController(ApiService service) {
        this.service = service;
    }
    
	@GetMapping
	public ResponseEntity<Map<String, Object>> getOperationCode() {
        Map<String, Object> response = new HashMap<>();
        response.put("operation_code", 1);
        return ResponseEntity.ok(response);
    }
	
	@PostMapping
	public ResponseEntity<PostResponse> handlePostRequest(@RequestBody PostRequest request) {
	    PostResponse response = service.processRequest(request); // Call Service Layer
	    return ResponseEntity.ok(response);
	}

}
