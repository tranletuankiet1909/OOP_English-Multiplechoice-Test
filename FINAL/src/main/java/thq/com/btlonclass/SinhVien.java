/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thq.com.btlonclass;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.DoubleStream;

/**
 *
 * @author HP
 */
public class SinhVien {
    private static int dem;
    private String soSinhVien;
    private String hoTen;
    private String gioiTinh;
    private String queQuan;
    private Date ngaySinh;
    private Calendar ngayGiaNhap;
    private List<Double> diem = new ArrayList<>();
    private List<CauHoi> dsLuyenTap = new ArrayList<>();
    {
        soSinhVien = String.format("%d", ++dem);
        ngayGiaNhap = new GregorianCalendar();

    }
    public SinhVien() {
        this.diem = new ArrayList<>();
    }
    public SinhVien(String hoTen, String gioiTinh, String queQuan, Date ngaySinh) {
        this.diem = new ArrayList<>();
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
    }

    public SinhVien(String hoTen, String gioiTinh, String queQuan, String ngaySinh) throws ParseException {
        this(hoTen, gioiTinh, queQuan, CauHinh.f.parse(ngaySinh));
        this.diem = new ArrayList<>();
    }

    public void nhapSv() throws ParseException{
        System.out.print("Ho ten: ");
        this.hoTen = CauHinh.sc.nextLine();
        System.out.print("Gioi tinh: ");
        this.gioiTinh = CauHinh.sc.nextLine();
        System.out.print("Que quan: ");
        this.queQuan = CauHinh.sc.nextLine();
        System.out.print("Ngay sinh: ");
        this.ngaySinh = CauHinh.f.parse(CauHinh.sc.nextLine());
    }
    
    public void hienthi() {
        System.out.printf("So sinh vien: %s\nTen sinh vien: %s\nGioi tinh: %s\nQue quan: %s\nNgay sinh: %s\nNgay tao tai khoan: %s\n",
                this.soSinhVien, this.hoTen, this.gioiTinh, this.queQuan,
                CauHinh.f.format(this.ngaySinh),CauHinh.f.format(this.ngayGiaNhap.getTime()));
    }

    public double tinhTrungBinh(){
        double[] diem = new double[this.diem.size()];
        System.out.println(diem.length);
        for ( int i = 0; i < diem.length; i++)
            diem[i] = this.getDiem().get(i);
        return DoubleStream.of(diem).average().getAsDouble();
    }
    public void thongKe(){
            System.out.printf("Ten sinh vien: %s\nGioi tinh: %s\nQue quan: %s\nNgay sinh: %s\nSo lan kiem tra: %d\nDiem trung binh: %.2f",
                    this.hoTen, this.gioiTinh, this.queQuan,
                    CauHinh.f.format(this.ngaySinh), this.diem.size(), this.tinhTrungBinh());
            System.out.print("\nDiem cac lan thi: ");
            this.diem.forEach(p -> {
                System.out.print(p + " ");
            });
            System.out.println();
    }
    /**
     * @return the id
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the id to set
     */
    public static void setDem(int aDem) {
        dem = aDem;
    }
    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /**
     * @return the ngaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the ngayGiaNhap
     */
    public Calendar getNgayGiaNhap() {
        return ngayGiaNhap;
    }

    /**
     * @param ngayGiaNhap the ngayGiaNhap to set
     */
    public void setNgayGiaNhap(Calendar ngayGiaNhap) {
        this.ngayGiaNhap = ngayGiaNhap;
    }

    /**
     * @return the soSinhVien
     */
    public String getSoSinhVien() {
        return soSinhVien;
    }

    /**
     * @param soSinhVien the soSinhVien to set
     */
    public void setSoSinhVien(String soSinhVien) {
        this.soSinhVien = soSinhVien;
    }

    /**
     * @return the diem
     */
    public List<Double> getDiem() {
        return diem;
    }

    /**
     * @param diem the diem to set
     */
    public void setDiem(List<Double> diem) {
        this.diem = diem;
    }

    /**
     * @return the dsLuyenTap
     */
    public List<CauHoi> getDsLuyenTap() {
        return dsLuyenTap;
    }

    /**
     * @param dsLuyenTap the dsLuyenTap to set
     */
    public void setDsLuyenTap(List<CauHoi> dsLuyenTap) {
        this.dsLuyenTap = dsLuyenTap;
    }
    
}
