package com.example.baitapkiemthu.baitap;

import java.util.List;

public class Bai3 {
    public static double tinhTBC(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new ArithmeticException("Khong the tinh gia tri trung binh cua 1 danh sach rong");
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.size();
    }
}
