package com.example.baitapkiemthu.baitap;

public class Bai4 {
    public static int GetElementAtIndex(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            throw new IndexOutOfBoundsException("Chi so nam ngoai pham vi: " + index);
        }
        return arr[index];
    }
}
