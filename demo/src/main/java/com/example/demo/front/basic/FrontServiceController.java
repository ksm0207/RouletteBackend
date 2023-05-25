package com.example.demo.front.basic;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.front.dto.RouletteDTO;
import com.example.demo.front.service.RouletteService;
import java.util.List;

public class FrontServiceController {

    @Autowired
    private RouletteService service;

    public int onSave(RouletteDTO dto) {
        return service.saveRoulette(dto);
    }
}
