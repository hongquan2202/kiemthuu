package com.example.baitapkiemthu.baitaptest;

import com.example.baitapkiemthu.baitap.Bai2;
import org.junit.Assert;
import org.junit.Test;

public class Bai2Test {
    @Test
    public void testSoDuong() {
        Assert.assertEquals(4, Bai2.phepChia(20, 5));
    }

    @Test
    public void testSoAm() {
        Assert.assertEquals(5, Bai2.phepChia(-10, -2));
    }

    @Test
    public void testDuongVaAm() {
        Assert.assertEquals(-5, Bai2.phepChia(20, -5));
    }

    @Test
    public void testSo() {
        Assert.assertEquals(0, Bai2.phepChia(0, 5));
    }


    @Test
    public void testSoNguyenMax() {
        Assert.assertEquals(Integer.MAX_VALUE, Bai2.phepChia(Integer.MAX_VALUE, 1));
    }

    @Test
    public void testSoNguyenMin() {
        Assert.assertEquals(Integer.MIN_VALUE, Bai2.phepChia(Integer.MIN_VALUE, 1));
    }

    @Test
    public void testSoNguyenMaxAndMin() {
        Assert.assertEquals(Integer.MIN_VALUE, Bai2.phepChia(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }


    @Test
    public void testDivideByZero() {
        ArithmeticException exception = Assert.assertThrows(ArithmeticException.class, () -> Bai2.phepChia(6, 0));
        Assert.assertEquals("Khong the chia cho 0", exception.getMessage());
    }


    @Test
    public void testDivideByOne() {
        Assert.assertEquals(10, Bai2.phepChia(10, 1));
    }


    @Test
    public void testDivideNegativeByZero() {
        ArithmeticException exception = Assert.assertThrows(ArithmeticException.class, () -> Bai2.phepChia(-11, 0));
        Assert.assertEquals("Khong the chia cho 0", exception.getMessage());
    }
}
