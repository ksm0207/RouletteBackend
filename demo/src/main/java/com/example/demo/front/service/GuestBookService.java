package com.example.demo.front.service;

import com.example.demo.front.dao.GuestBookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.front.dto.GuestBookDTO;

import java.util.List;


@Service
public class GuestBookService {

    @Autowired
    private GuestBookDao guestDao;

    public int submitGuestBook(GuestBookDTO dto) {
        return guestDao.submitGuestBook(dto);

    }
    public List<GuestBookDTO> getGuestBookAllList() {
        return guestDao.getGuestBookAllList();
    }
}
