package com.example.library.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Client {
    private Long id;
    private String firstname;
    private String lastname;
}
