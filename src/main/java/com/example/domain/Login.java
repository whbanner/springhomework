package com.example.domain;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Login {
    private String username;
    private String password;
}
