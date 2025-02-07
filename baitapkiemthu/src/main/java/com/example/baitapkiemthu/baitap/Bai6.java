package com.example.baitapkiemthu.baitap;

public class Bai6 {
    public static int timPhanTuMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Mang khong the rong");
        }
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}
