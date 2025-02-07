package com.example.baitapkiemthu.baitaptest;

import com.example.baitapkiemthu.baitap.Bai1;
import org.junit.Assert;
import org.junit.Test;

public class Bai1Test {
    @Test
    public void test1() {
        Assert.assertEquals(20, Bai1.multiply(4, 5));
    }

    @Test
    public void test2() {
        Assert.assertEquals(6,Bai1.multiply(-2, -3));
    }

    @Test
    public void test3() {
        Assert.assertEquals(-15, Bai1.multiply(5, -3));
    }

    @Test
    public void test4() {
        Assert.assertEquals(0, Bai1.multiply(0, 7));
    }

    // Test giá trị biên
    @Test
    public void test5() {
        Assert.assertEquals((long) Integer.MAX_VALUE * Integer.MAX_VALUE,
                (long) Bai1.multiply(Integer.MAX_VALUE, 1));
    }

    @Test
    public void test6() {
        Assert.assertEquals((long) Integer.MIN_VALUE * 1,
                (long) Bai1.multiply(Integer.MIN_VALUE, 1));
    }

    @Test
    public void test7() {
        Assert.assertEquals((long) Integer.MAX_VALUE * Integer.MIN_VALUE,
                (long) Bai1.multiply(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }


    @Test
    public void test8() {
        Assert.assertTrue(Bai1.isInteger(5));
    }

    @Test
    public void test9() {
        Assert.assertTrue(Bai1.isInteger("Hello"));
    }

    @Test
    public void test10() {
        Assert.assertTrue(Bai1.isInteger(5.5));
    }
}
