package com.example.baitapkiemthu.baitap;

public class Bai5 {
    private String tenNguoiDung;

    public Bai5(String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
    }

    public String getTenNguoiDung() {
        if (tenNguoiDung == null) {
            throw new NullPointerException("Ten nguoi dung kgong ton tai");
        }
        return tenNguoiDung;
    }
}
