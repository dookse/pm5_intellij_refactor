package com.example.refactor.step01;

import lombok.extern.slf4j.Slf4j;

// Refactor Menu
// Actions
//
// Refactor > Rename
// Refactor > Type Migration
@SuppressWarnings("unused")
@Slf4j
public class Rename {

    // get file size
    private static long doSomting() {
        long val = 1024;
        System.out.println(val);
        return val;
    }

    public static void main(String[] args) {
        System.out.println(doSomting());
    }

}

