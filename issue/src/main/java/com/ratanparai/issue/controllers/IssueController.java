package com.ratanparai.issue.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IssueController {

    @GetMapping("/issue")
    public ResponseEntity<?> getIssue() {
        return new ResponseEntity(HttpStatus.OK);
    }
}