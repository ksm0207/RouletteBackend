package com.example.demo.front.controller;

import com.example.demo.front.basic.FrontServiceController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guestBook")
public class GuestBookController extends FrontServiceController {

    @PostMapping("/submit")
    public ResponseEntity<Object> guestBookSubmit(){

        return null;
    }
}
