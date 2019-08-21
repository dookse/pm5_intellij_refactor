package com.example.refactor.step05;

// Refactor > Extract > ExtractMethod
// Refactor > Change Signature
// Refactor > Inline
@SuppressWarnings("unused")
public class ExtractMethod {

    int extractMethod() {
        int sum = 0;
        int size = 30;
        for (int i = 0; i <= size; i++) {
            System.out.println("i = " + i);
            sum += i;
        }
        return sum;
    }

}
