package com.example.tecnico.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/tecnico")
public class TecnicoController {

    private final RestTemplate restTemplate;

    public TecnicoController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/ver-ticket/{id}")
    public ResponseEntity<String> verTicket(@PathVariable Long id) {
        String url = "http://principal-service:8085/api/tickets/" + id;
        String response = restTemplate.getForObject(url, String.class);
        return ResponseEntity.ok(response);
    }
}
