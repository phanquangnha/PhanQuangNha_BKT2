package com.example.phanquangnha_bkt2;

public class CayXanh {
    String tenKhoaHoc,tenThuongGoi,dacTinh,mauLa;
    int hinhAnh;

    public CayXanh(String tenKhoaHoc, String tenThuongGoi, String dacTinh, String mauLa, int hinhAnh) {
        this.tenKhoaHoc = tenKhoaHoc;
        this.tenThuongGoi = tenThuongGoi;
        this.dacTinh = dacTinh;
        this.mauLa = mauLa;
        this.hinhAnh = hinhAnh;
    }

    public String getTenKhoaHoc() {
        return tenKhoaHoc;
    }

    public void setTenKhoaHoc(String tenKhoaHoc) {
        this.tenKhoaHoc = tenKhoaHoc;
    }

    public String getTenThuongGoi() {
        return tenThuongGoi;
    }

    public void setTenThuongGoi(String tenThuongGoi) {
        this.tenThuongGoi = tenThuongGoi;
    }

    public String getDacTinh() {
        return dacTinh;
    }

    public void setDacTinh(String dacTinh) {
        this.dacTinh = dacTinh;
    }

    public String getMauLa() {
        return mauLa;
    }

    public void setMauLa(String mauLa) {
        this.mauLa = mauLa;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
