package com.example.demo.front.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GuestBookDTO {
    private String guest_seq;   // 방명록 SEQ
    private String message;     // 방명록 메세지
    private String passwd;      // 방명록 비밀번호
    private String SecretYn;    // 방명록 공개여부
    private String deleteYn;    // 방명록 삭제여부
    private int like;           // 방명록 좋아요 수
    private String insert_date; // 방명록 작성시간
}
