package com.example.refactor.step01;

import lombok.extern.slf4j.Slf4j;

// Refactor > Rename
// Refactor > Type Migration
@SuppressWarnings("unused")
@Slf4j
public class Rename {

    // get file size
    private static int getFileSize() {
        int fileSize = 1024;
        System.out.println(fileSize);
        return fileSize;
    }

    public static void main(String[] args) {
        System.out.println(getFileSize());
    }

}

