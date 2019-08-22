package com.example.refactor.step05;

// Refactor > Extract > ExtractMethod
// Refactor > Change Signature
// Refactor > Inline
@SuppressWarnings("unused")
public class ExtractMethod2 {

    int extractMethod() {
        int sum = 10;
        return sum + getSum(30);
    }

    private int getSum(final int size) {
        int sum = 0;
        for (int i = 0; i <= size; i++) {
            System.out.println("i = " + i);
            sum += i;
        }
        return sum;
    }
}
