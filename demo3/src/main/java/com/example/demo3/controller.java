package com.example.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Students")
public class controller {
    @Autowired
    private gateway.CustomGateway customGateway;
    @PostMapping("/")
    public ResponseEntity<?> adddata(@RequestBody student data1) {
        customGateway.print(data1);
        return ResponseEntity.ok(data1);

    }

}
