/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thq.com.btlon;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.List;
import thq.com.btlonclass.CauHinh;
import thq.com.btlonclass.CauHoi;
import thq.com.btlonclass.DangCauHoi;
import thq.com.btlonclass.QuanLyCauHoi;
import thq.com.btlonclass.QuanLySinhVien;
import thq.com.btlonclass.SinhVien;

/**
 *
 * @author HP
 */
public class Demo {

    public static void main(String[] args) throws ParseException, FileNotFoundException {
        int choice, choice1, choice2, index;
        QuanLySinhVien q1 = new QuanLySinhVien();
        QuanLyCauHoi q2 = new QuanLyCauHoi();
        q2.docFile(DangCauHoi.MULTIPLE_CHOICE);
        q2.docFile(DangCauHoi.INCOMPLETE);
        q2.docFile(DangCauHoi.CONVERSATION);
        System.out.println("\t === DANG KY THANH VIEN ====");
        SinhVien sv = new SinhVien();
        sv.nhapSv();
        q1.themSv(sv);
        System.out.println("Dang ky thanh cong!");
        do {
            System.out.println("\t=== HE THONG TRAC NGHIEM TIENG ANH ===\t");
            System.out.println("\t1. Quan ly nguoi hoc\t");
            System.out.println("\t2. Quan ly cau hoi\t");
            System.out.println("\t3. Luyen tap\t");
            System.out.println("\t4. Thong ke ket qua hoc tap\t");
            System.out.println("\t5. Thoat\t");
            System.out.print("Ban chon: ");
            choice = CauHinh.sc.nextInt();
            CauHinh.sc.nextLine();
            switch (choice) {
                case 1 -> {
                    do {
                        System.out.println("\t=== QUAN LY NGUOI HOC ===\t");
                        System.out.println("\t1. Xem danh sach nguoi hoc\t");
                        System.out.println("\t2. Tra cuu nguoi hoc\t");
                        System.out.println("\t3. Them thong tin nguoi hoc\t");
                        System.out.println("\t4. Cap nhat thong tin nguoi hoc\t");
                        System.out.println("\t5. Xoa thong tin nguoi hoc\t");
                        System.out.println("\t6. Thoat");
                        System.out.print("Ban chon: ");
                        choice1 = CauHinh.sc.nextInt();

                        switch (choice1) {
                            case 1 -> {
                                System.out.println("\t=== DANH SACH NGUOI HOC ===\t");
                                q1.hienThiDs();
                            }
                            case 2 -> {
                                do {
                                    System.out.println("\t=== TRA CUU ===\t");
                                    System.out.println("\t1. Ho ten \n\t2. Gioi tinh\n\t3. Que Quan\n\t4. Ngay Sinh\n\t5. Thoat");
                                    System.out.print("Ban chon: ");
                                    choice2 = CauHinh.sc.nextInt();
                                    CauHinh.sc.nextLine();
                                    switch (choice2) {
                                        case 1 -> {
                                            System.out.print("Nhap tu khoa: ");
                                            String name = CauHinh.sc.nextLine();
                                            List<SinhVien> s = q1.traCuuHoTen(name);
                                            s.forEach(a -> a.hienthi());
                                        }
                                        case 2 -> {
                                            System.out.print("Nhap tu khoa: ");
                                            String gt = CauHinh.sc.nextLine();
                                            List<SinhVien> s = q1.traCuuGioiTinh(gt);
                                            s.forEach(a -> a.hienthi());
                                        }
                                        case 3 -> {
                                            System.out.print("Nhap tu khoa: ");
                                            String country = CauHinh.sc.nextLine();
                                            List<SinhVien> s = q1.traCuuQueQuan(country);
                                            s.forEach(a -> a.hienthi());
                                        }
                                        case 4 -> {
                                            System.out.print("Nhap ngay sinh: ");
                                            String date = CauHinh.sc.nextLine();
                                            List<SinhVien> s = q1.traCuuNgaySinh(date);
                                            s.forEach(a -> a.hienthi());
                                        }
                                    }
                                } while (choice2 >= 1 && choice2 <= 4);
                            }
                            case 3 -> {
                                do {
                                    System.out.println("\t=== THEM THONG TIN SINH VIEN ===\t");
                                    System.out.println("1. Nhap truc tiep");
                                    System.out.println("2. Nhap tu file");
                                    System.out.println("3. Thoat");
                                    System.out.print("Ban chon: ");
                                    choice2 = CauHinh.sc.nextInt();
                                    CauHinh.sc.nextLine();
                                    switch (choice2) {
                                        case 1 -> {
                                            System.out.print("So luong sinh vien muon them: ");
                                            int n = CauHinh.sc.nextInt();
                                            CauHinh.sc.nextLine();
                                            q1.nhapDs(n);
                                            System.out.println("Da them thanh cong!");
                                        }
                                        case 2 -> {
                                            q1.docDS();
                                            System.out.println("Da them thanh cong!");
                                        }
                                    }
                                } while (choice2 >= 1 && choice2 <= 2);

                            }
                            case 4 -> {
                                System.out.println("\t=== CAP NHAT THONG TIN SINH VIEN ===\t");
                                System.out.print("Nhap so thu tu sinh vien muon chinh sua: ");
                                index = CauHinh.sc.nextInt();
                                q1.suaSv(index - 1);
                                System.out.println("Cap nhat thanh cong!");
                            }
                            case 5 -> {
                                System.out.println("\t=== XOA THONG TIN SINH VIEN ===\t");
                                System.out.print("Nhap so thu tu sinh vien muon xoa: ");
                                index = CauHinh.sc.nextInt();
                                q1.xoaSv(index - 1);
                                System.out.println("Xoa thanh cong!");
                            }
                        }
                    } while (choice1 >= 1 && choice1 <= 5);
                }
                case 2 -> {
                    do {
                        System.out.println();
                        System.out.println("\t=== QUAN LY CAU HOI ===\t");
                        System.out.println("\t1. Xem danh sach cau hoi\t");
                        System.out.println("\t2. Tra cuu cau hoi\t");
                        System.out.println("\t3. Thoat");
                        System.out.print("Ban chon: ");
                        choice1 = CauHinh.sc.nextInt();
                        CauHinh.sc.nextLine();
                        switch (choice1) {
                            case 1 -> {
                                do {
                                    System.out.println("\t=== DANG CAU HOI ===");
                                    System.out.println("\t1. Multiple choice");
                                    System.out.println("\t2. Incomplete");
                                    System.out.println("\t3. Conversation");
                                    System.out.println("\t4. Thoat");
                                    System.out.print("Ban chon: ");
                                    choice2 = CauHinh.sc.nextInt();
                                    switch (choice2) {
                                        case 1 -> {
                                            q2.hienThiDs(DangCauHoi.MULTIPLE_CHOICE);
                                        }
                                        case 2 -> {
                                            q2.hienThiDs(DangCauHoi.INCOMPLETE);
                                        }
                                        case 3 -> {
                                            q2.hienThiDs(DangCauHoi.CONVERSATION);
                                        }
                                    }
                                } while (choice2 >= 1 && choice2 <= 3);
                            }
                            case 2 -> {
                                System.out.print("Nhap tu de tim kiem: ");
                                String kw = CauHinh.sc.nextLine();
                                List<CauHoi> ch = q2.traCuu(kw);
                                ch.forEach(a -> a.hienThi());
                            }
                        }
                    } while (choice1 >= 1 && choice1 <= 2);
                }
                case 3 -> {
                    System.out.println();
                    System.out.println("\t=== DANG CAU HOI ===");
                    System.out.println("\t1. Multiple choice");
                    System.out.println("\t2. Incomplete");
                    System.out.println("\t3. Conversation");
                    System.out.print("Ban chon: ");
                    choice2 = CauHinh.sc.nextInt();
                    switch (choice2) {
                        case 1 -> {
                            DangCauHoi.MULTIPLE_CHOICE.luyenTap(q2, sv);  
                        }
                        case 2 -> {
                            DangCauHoi.INCOMPLETE.luyenTap(q2, sv);                    
                        }
                        case 3 -> {
                            DangCauHoi.CONVERSATION.luyenTap(q2, sv);
                        }
                    }
                }
                case 4 -> {
                    System.out.println("\t=== THONG KE KET QUA HOC TAP ===");
                    sv.thongKe();
                }
            }
        } while (choice >= 1 && choice <= 4);
    }
}
