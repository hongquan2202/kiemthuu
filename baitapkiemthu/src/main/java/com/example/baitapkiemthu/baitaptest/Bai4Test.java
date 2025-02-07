package com.example.baitapkiemthu.baitaptest;

import com.example.baitapkiemthu.baitap.Bai3;
import com.example.baitapkiemthu.baitap.Bai4;
import org.junit.Assert;
import org.junit.Test;

public class Bai4Test {
    @Test
    public void test1() {
        int[] arr = {1, 2, 3, 4, 5};
        Assert.assertEquals(3, Bai4.GetElementAtIndex(arr, 2));
    }

    @Test
    public void test2() {
        int[] arr = {1, 2, 3, 4, 5};
        Assert.assertThrows(IndexOutOfBoundsException.class, () -> {
            Bai4.GetElementAtIndex(arr, -1);
        });
    }

    @Test
    public void test3() {
        int[] arr = {1, 2, 3, 4, 5};
        Assert.assertThrows(IndexOutOfBoundsException.class, () -> {
            Bai4.GetElementAtIndex(arr, 5);
        });
    }

    @Test
    public void test4() {
        int[] arr = {};
        Assert.assertThrows(IndexOutOfBoundsException.class, () -> {
            Bai4.GetElementAtIndex(arr, 0);
        });
    }
}
