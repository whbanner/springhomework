package com.example.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student {
    private String username;
    private Integer sid;
    private Integer sznumber;
    private Integer sztime;
    private Integer sgrade;
}
