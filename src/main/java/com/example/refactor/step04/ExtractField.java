package com.example.refactor.step04;

// Refactor > Extract > ExtractField
// 1. Current ExtractMethod
// 2. ExtractField Declaration
// 3. Constructor

// Refactor > Extract > Parameter
// Delegate via overloading method

// Create Constructor in TDD

@SuppressWarnings({"unused"})
public class ExtractField {

    public int anInt = 3;

    private void stringExtractConstant() {
        System.out.println(anInt - 1);
    }

}
