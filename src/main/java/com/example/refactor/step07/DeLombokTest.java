package com.example.refactor.step07;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class DeLombokTest {

    private Long id;
    private String name;
    private Object obj;

}
