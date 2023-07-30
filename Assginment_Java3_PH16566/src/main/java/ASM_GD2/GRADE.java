/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM_GD2;

/**
 *
 * @author Admin
 */
public class GRADE {
    String maSV;
    String hoTen;
    int tiengAnh;
    int tinHoc;
    int gdtc;
    double diemTB;

    public GRADE() {
    }

    public GRADE(String maSV, String hoTen, int tiengAnh, int tinHoc, int gdtc, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tiengAnh = tiengAnh;
        this.tinHoc = tinHoc;
        this.gdtc = gdtc;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTiengAnh() {
        return tiengAnh;
    }

    public void setTiengAnh(int tiengAnh) {
        this.tiengAnh = tiengAnh;
    }

    public int getTinHoc() {
        return tinHoc;
    }

    public void setTinHoc(int tinHoc) {
        this.tinHoc = tinHoc;
    }

    public int getGdtc() {
        return gdtc;
    }

    public void setGdtc(int gdtc) {
        this.gdtc = gdtc;
    }

    public double getDiemTB() {
        return (this.tinHoc + this.tiengAnh + this.gdtc)/3.0;
    }

//    public void setDiemTB(double diemTB) {
//        this.diemTB = diemTB;
//    }

    
 
}
