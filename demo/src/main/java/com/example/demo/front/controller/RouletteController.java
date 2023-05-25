package com.example.demo.front.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.front.basic.FrontServiceController;
import com.example.demo.front.dto.RouletteDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
@RequestMapping("/roule")
public class RouletteController extends FrontServiceController {

    @PostMapping("/front/roulette")
    public ResponseEntity<Object> saveOnRouletteData(@RequestBody RouletteDTO dto) {
        int result = super.onSave(dto);
        System.out.println("Status >>>> " + result);

        return new ResponseEntity<Object>(result, null, HttpStatus.OK);
    }
}
