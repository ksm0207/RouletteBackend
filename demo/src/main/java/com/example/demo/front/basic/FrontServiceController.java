package com.example.demo.front.basic;

import com.example.demo.front.service.GuestBookService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.front.dto.RouletteDTO;
import com.example.demo.front.service.RouletteService;
import com.example.demo.front.dto.GuestBookDTO;
import java.util.List;


public class FrontServiceController {

    @Autowired
    private RouletteService service;
    @Autowired
    private GuestBookService guestBookService;

    public String roulMaxSeq() {
        return service.maxRoulseq();
    }

    public int onSave(RouletteDTO dto) {
        return service.saveRoulette(dto);
    }

    public List<RouletteDTO> rouletteResult() {
        return service.rouletteResultService();
    }

    public int submitGuestBook(GuestBookDTO dto) {
        return guestBookService.submitGuestBook(dto);
    }

    public List<GuestBookDTO> getGuestBookAllList(){
        return guestBookService.getGuestBookAllList();
    }

}
