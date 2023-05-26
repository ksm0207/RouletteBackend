package com.example.demo.front.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.front.dto.RouletteDTO;

@Mapper
public interface RouletteDao {

    public String maxRoulSeqValue();

    public int onSave(RouletteDTO dto);

    public List<RouletteDTO> rouletteResultMapper();
}
