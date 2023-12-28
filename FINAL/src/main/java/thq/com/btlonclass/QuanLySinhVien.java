
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thq.com.btlonclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/**
 *
 * @author HP
 */
public class QuanLySinhVien {

    private List<SinhVien> ds = new ArrayList<>();

    public void themSv(SinhVien sv) {
        this.ds.add(sv);
    }

    public void xoaSv(int index) {
        this.ds.remove(index);
        for (int i = index; i < ds.size(); i++) {
            SinhVien sv = ds.get(i);
            sv.setSoSinhVien(String.format("%d", i + 1));
        }
        SinhVien.setDem(ds.size());
    }

    public void suaSv(int index) throws ParseException {
        if (index <= ds.size()) {
            int chon;
            do {
                System.out.println("\tThong tin muon chinh sua:");
                System.out.println("1. Ho ten");
                System.out.println("2. Gioi tinh");
                System.out.println("3. Que quan");
                System.out.println("4. Ngay sinh");
                System.out.println("5. Thoat");
                System.out.printf("Ban chon: ");
                chon = CauHinh.sc.nextInt();
                CauHinh.sc.nextLine();
                switch (chon) {
                    case 1 -> {
                        System.out.print("Ho ten: ");
                        String hoTen = CauHinh.sc.nextLine();
                        this.ds.get(index).setHoTen(hoTen);
                    }
                    case 2 -> {
                        System.out.print("Gioi tinh: ");
                        String gioiTinh = CauHinh.sc.nextLine();
                        this.ds.get(index).setGioiTinh(gioiTinh);
                    }
                    case 3 -> {
                        System.out.print("Que quan: ");
                        String queQuan = CauHinh.sc.nextLine();
                        this.ds.get(index).setQueQuan(queQuan);
                    }
                    case 4 -> {
                        System.out.print("Ngay sinh: ");
                        Date ngaySinh = CauHinh.f.parse(CauHinh.sc.nextLine());
                        this.ds.get(index).setNgaySinh(ngaySinh);
                    }
                }
            } while (chon >= 1 && chon <= 4);
        } else {
            System.out.println("So thu tu khong ton tai");
        }
    }

    /**
     * Nhập thông tin người học
     *
     * @param n Số lượng sinh viên
     * @throws ParseException
     */
    public void nhapDs(int n) throws ParseException {
        System.out.println("\t DANH SACH SINH VIEN ");
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap thong tin sinh vien thu %d\n", i + 1);
            SinhVien a = new SinhVien();
            a.nhapSv();
            this.getDs().add(a);
        }
    }

    public void hienThiDs() {
        this.ds.forEach(sv -> sv.hienthi());
    }

    public List<SinhVien> traCuuHoTen(String tuKhoa) {
        return this.ds.stream().filter(sv -> sv.getHoTen().contains(tuKhoa)).collect(Collectors.toList());
    }

    public List<SinhVien> traCuuQueQuan(String tuKhoa) {
        return this.ds.stream().filter(sv -> sv.getQueQuan().contains(tuKhoa)).collect(Collectors.toList());
    }

    public List<SinhVien> traCuuGioiTinh(String tuKhoa) {
        return this.ds.stream().filter(sv -> sv.getGioiTinh().contains(tuKhoa)).collect(Collectors.toList());
    }

    public List<SinhVien> traCuuNgaySinh(String ngaySinh) throws ParseException {
        List<SinhVien> kq = new ArrayList<>();
        for (SinhVien sv : ds) {
            if (sv.getNgaySinh().equals(CauHinh.f.parse(ngaySinh))) {
                kq.add(sv);
            }
        }
        return kq;
    }

    public void docDS() throws FileNotFoundException, ParseException {
        File f = new File("src/main/resources/inSinhVien.txt");
        Scanner sc = new Scanner(f);
        while (sc.hasNext()) {
            SinhVien h = new SinhVien();
            h.setHoTen(sc.nextLine());
            h.setGioiTinh(sc.nextLine());
            h.setQueQuan(sc.nextLine());
            h.setNgaySinh(CauHinh.f.parse(sc.nextLine()));
            this.getDs().add(h);
        }
        sc.close();
    }

    public void ghiDS() throws FileNotFoundException {
        File f = new File("src/main/resources/thongKe.txt");
        PrintWriter w = new PrintWriter(f);
        this.ds.forEach(sv -> {
            w.format("Ten sinh vien: %s\nGioi tinh: %s\nQue quan: %s\nNgay sinh: %s\nSo lan kiem tra: %d\nDiem trung binh: %.2f",
                    sv.getHoTen(), sv.getGioiTinh(), sv.getQueQuan(),
                    CauHinh.f.format(sv.getNgaySinh()), sv.getDiem().size(), sv.tinhTrungBinh());
        });
        w.close();
    }

    /**
     * @return the ds
     */
    public List<SinhVien> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(ArrayList<SinhVien> ds) {
        this.ds = ds;
    }
}
