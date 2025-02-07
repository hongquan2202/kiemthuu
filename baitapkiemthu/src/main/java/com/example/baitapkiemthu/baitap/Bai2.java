package com.example.baitapkiemthu.baitap;

public class Bai2 {
    public static int phepChia(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("khong the chia cho 0");
        }
        return a / b;
    }
}
