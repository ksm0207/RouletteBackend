package com.example.demo.front.controller;

import com.example.demo.front.basic.FrontServiceController;
import com.example.demo.front.dto.GuestBookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/guestBook")
public class GuestBookController extends FrontServiceController {

    @PostMapping("/submit")
    public ResponseEntity<Object> guestBookSubmit(@RequestBody GuestBookDTO dto){
        int result = super.submitGuestBook(dto);
        System.out.println("Insert Result : " + result);
        return new ResponseEntity<Object>(result,null, HttpStatus.OK);
    }

    @PostMapping("/getGuestBookAllList")
    public ResponseEntity<Object> guestBookAllList(){
        List<GuestBookDTO> selectList = super.getGuestBookAllList();
        return new ResponseEntity<Object>(selectList,HttpStatus.OK);
    }

    @PostMapping("/secretGuestBook")
    public ResponseEntity<Object> secretGuestBook(@RequestBody GuestBookDTO dto){
        GuestBookDTO secretData = super.getSecretGuestBook(dto.getGuest_seq() , dto.getPasswd());
        return new ResponseEntity<Object>(secretData,HttpStatus.OK);
    }
}
