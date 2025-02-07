package com.example.baitapkiemthu.baitaptest;

import com.example.baitapkiemthu.baitap.Bai5;
import org.junit.Assert;
import org.junit.Test;

public class Bai5Test {
    @Test
    public void test1() {
        Bai5 hoSo = null;
        Assert.assertThrows(NullPointerException.class, () -> {
            hoSo.getTenNguoiDung();
        });
    }

    @Test
    public void testGetTenNguoiDungWithValidName() {
        Bai5 hoSo = new Bai5("Nguyen Hong Quan");
        Assert.assertEquals("Nguyen Hong Quan", hoSo.getTenNguoiDung());
    }
}
