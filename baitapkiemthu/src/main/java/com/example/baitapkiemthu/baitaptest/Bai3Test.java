package com.example.baitapkiemthu.baitaptest;

import com.example.baitapkiemthu.baitap.Bai3;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Bai3Test {
    @Test
    public void testCacSoHopLe() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double expected = 3;
        Assert.assertEquals(expected, Bai3.tinhTBC(numbers));
    }


    @Test
    public void testDanhSachTrong() {
        List<Integer> numbers = Collections.emptyList();
        ArithmeticException exception = Assert.assertThrows(ArithmeticException.class, () -> {
            Bai3.tinhTBC(numbers);
        });
        Assert.assertEquals("khong the tinh trung binh danh sach rong", exception.getMessage());
    }


    @Test
    public void testDSCoMotPhanTu() {
        List<Integer> numbers = Collections.singletonList(13);
        double expected = 13;
        Assert.assertEquals(expected,Bai3.tinhTBC(numbers));
    }

    @Test
    public void testSoAm() {
        List<Integer> numbers = Arrays.asList(-1, -2, -3, -4, -5);
        double expected = -1;
        Assert.assertEquals(expected, Bai3.tinhTBC(numbers));
    }
}
