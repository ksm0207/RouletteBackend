package com.example.demo.front.dao;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.front.dto.GuestBookDTO;

import java.util.List;

@Mapper
public interface GuestBookDao {
    public int submitGuestBook(GuestBookDTO dto);

    public List<GuestBookDTO> getGuestBookAllList();
}
