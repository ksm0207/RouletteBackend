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

        StringBuilder sb = new StringBuilder();
        String maxSeqValue = super.roulMaxSeq();
        String defaultAnonymousUser = "익명사용자1";

        if (maxSeqValue == null) {
            dto.setName(defaultAnonymousUser);
        }else {
            defaultAnonymousUser = "익명사용자";
            sb.append(defaultAnonymousUser);
            sb.append(maxSeqValue);
            dto.setName(sb.toString());
        }
        int result = super.onSave(dto);
        return new ResponseEntity<Object>(result, null, HttpStatus.OK);
    }

    @PostMapping("/front/roulette/result")
    public ResponseEntity<Object> rouletteResultView() {
        List<RouletteDTO> result = super.rouletteResult();
        for (int i = 0; i < result.size(); i++) {
            System.out.println("Result : " + result.get(i));
        }
        return new ResponseEntity<Object>(result, null, HttpStatus.OK);
    }
}
