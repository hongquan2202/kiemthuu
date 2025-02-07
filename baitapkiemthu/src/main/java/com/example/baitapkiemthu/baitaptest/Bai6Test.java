package com.example.baitapkiemthu.baitaptest;

import com.example.baitapkiemthu.baitap.Bai6;
import org.junit.Assert;
import org.junit.Test;

public class Bai6Test {
    @Test
    public void testFindMin() {
        int[] arr = {5, 3, 9, 4, 6};
        int result = Bai6.timPhanTuMin(arr);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testFindMinElementWithEmptyArray() {
        int[] arr = {};

        Assert.assertThrows(IllegalArgumentException.class, () -> {
            Bai6.timPhanTuMin(arr);
        });
    }

    @Test
    public void testFindMinElementWithNullArray() {
        int[] arr = null;

        Assert.assertThrows(IllegalArgumentException.class, () -> {
            Bai6.timPhanTuMin(arr);
        });
    }
}
