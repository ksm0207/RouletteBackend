package com.example.demo.front.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.front.dao.RouletteDao;
import com.example.demo.front.dto.RouletteDTO;
import java.util.List;

@Service
public class RouletteService {

    @Autowired
    private RouletteDao rDao;

    public String maxRoulseq() {
        return rDao.maxRoulSeqValue();
    }

    public int saveRoulette(RouletteDTO dto) {
        return rDao.onSave(dto);
    }

    public List<RouletteDTO> rouletteResultService() {
        return rDao.rouletteResultMapper();
    }
}
