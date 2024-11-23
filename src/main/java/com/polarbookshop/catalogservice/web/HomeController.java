package com.polarbookshop.catalogservice.web;

import com.polarbookshop.catalogservice.constant.Route;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {
    @GetMapping
    public ResponseEntity<String> getGreeting() {
        return ResponseEntity.ok("Welcome to the book catalog!");
    }
}
