package com.example.demo.front.service;

import com.example.demo.front.dao.GuestBookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestBookService {

    @Autowired
    private GuestBookDao guestDao;
}
