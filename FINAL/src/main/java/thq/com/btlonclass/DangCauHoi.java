/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thq.com.btlonclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author DELL
 */
public enum DangCauHoi {
    MULTIPLE_CHOICE { 
        @Override
        public void docCauHoi(QuanLyCauHoi q) throws FileNotFoundException {
            File f = new File("src/main/resources/MultipleChoice.txt");
            try ( Scanner sc = new Scanner(f)) {
                while (sc.hasNext()) {
                    MultipleChoice c = new MultipleChoice();
                    c.setMucDo(sc.nextLine());
                    c.setNoiDung(sc.nextLine());
                    List<PhuongAn> phuongAn = new ArrayList<>();
                    for (int i = 0; i < 4; i++) {
                        PhuongAn a = new PhuongAn(sc.nextLine());
                        phuongAn.add(a);
                    }
                    c.setAns(phuongAn);
                    c.setDapAn(sc.nextLine());
                    c.setGhiChu(sc.nextLine());
                    q.getDs().add(c);
                }
            }
        }
    
        @Override
        public void hienThiDs(QuanLyCauHoi q) {
            q.getDs().forEach(a -> {
                if ( a instanceof MultipleChoice)
                    a.hienThi();
            });
        }

        @Override
        public List<CauHoi> docDsTheoDang(QuanLyCauHoi q) {
            return q.getDs().stream().filter(a -> a instanceof MultipleChoice).collect(Collectors.toList());
        }

        @Override
        public void luyenTap(QuanLyCauHoi q, SinhVien sv) {
            System.out.print("Nhap so luong cau ban muon lam: ");
            int num = CauHinh.sc.nextInt();
            List<CauHoi> ch = this.docDsTheoDang(q);
            List<MultipleChoice> daLam = new ArrayList<>();
            CauHinh.sc.nextLine();
            for (int i = 0; i < num; i++) {
                ch.get(i).lamBai();
                daLam.add((MultipleChoice) ch.get(i));
            }
            System.out.println("\t=== KET QUA ===");
            for (int i = 0; i < num; i++) {
                ch.get(i).hienThiKetQua();
            }
            int soCauDung = q.tinhSoCauDung(daLam);
            sv.getDiem().add(q.tinhDiem(num, soCauDung));
        }  
        
    },
    INCOMPLETE {
        @Override
        public void docCauHoi(QuanLyCauHoi q) throws FileNotFoundException {
            File f = new File("src/main/resources/Incomplete.txt");
            try ( Scanner sc = new Scanner(f)) {
                while (sc.hasNext()) {
                    Incomplete c = new Incomplete();
                    c.setMucDo(sc.nextLine());
                    c.setSoLuong(Integer.parseInt(sc.nextLine()));
                    c.setNoiDung(sc.nextLine()+ "\n" + sc.nextLine()+ "\n" + sc.nextLine());
                    List<MultipleChoice> cauHoi = new ArrayList<>();
                    for ( int i = 0 ; i < c.getSoLuong(); i++){
                        MultipleChoice ch = new MultipleChoice();
                        ch.setNoiDung(sc.nextLine());
                        List<PhuongAn> phuongAn = new ArrayList<>();
                        for (int j = 0; j < 4; j++) {
                            PhuongAn a = new PhuongAn(sc.nextLine());
                            phuongAn.add(a);
                        }
                        ch.setAns(phuongAn);
                        ch.setDapAn(sc.nextLine());
                        cauHoi.add(ch);
                    }
                    c.setCauHoi(cauHoi);
                    q.getDs().add(c);
                }
            }
        }
        @Override
        public void hienThiDs(QuanLyCauHoi q) {
            q.getDs().forEach(a -> {
                if ( a instanceof Incomplete)
                    a.hienThi();
            });
        }
        @Override
        public List<CauHoi> docDsTheoDang(QuanLyCauHoi q) {
            return q.getDs().stream().filter(a -> a instanceof Incomplete).collect(Collectors.toList());
        } 

        @Override
        public void luyenTap(QuanLyCauHoi q, SinhVien sv) {
            List<CauHoi> ch = this.docDsTheoDang(q);
            CauHinh.sc.nextLine();
            System.out.print("Chon muc do( easy / normal / hard ): ");
            String lv = CauHinh.sc.nextLine();
            List<CauHoi> inCom = ch.stream().filter(ic -> ic.getMucDo().compareToIgnoreCase(lv) == 0).collect(Collectors.toList());
            int rd = (int) (Math.random()*(inCom.size()));
            inCom.get(rd).lamBai();
            System.out.println("\t=== KET QUA ===");
            inCom.get(rd).hienThiKetQua();
            List<MultipleChoice> daLam =((Incomplete)inCom.get(rd)).getCauHoi();
            int soCauDung = q.tinhSoCauDung(daLam);
            sv.getDiem().add(q.tinhDiem(daLam.size(), soCauDung));
        }
    },
    CONVERSATION {
        @Override
        public void docCauHoi(QuanLyCauHoi q) throws FileNotFoundException {
            File f = new File("src/main/resources/Conversation.txt");
            try ( Scanner sc = new Scanner(f)) {
                while (sc.hasNext()) {
                    Conversation c = new Conversation();
                    c.setMucDo(sc.nextLine());
                    c.setSoLuong(Integer.parseInt(sc.nextLine()));
                    c.setNoiDung(sc.nextLine()+ "\n" + sc.nextLine()+ "\n" + sc.nextLine() + "\n" + sc.nextLine());
                    List<MultipleChoice> cauHoi = new ArrayList<>();
                    for ( int i = 0 ; i < c.getSoLuong(); i++){
                        MultipleChoice ch = new MultipleChoice();
                        ch.setNoiDung(sc.nextLine());
                        List<PhuongAn> phuongAn = new ArrayList<>();
                        for (int j = 0; j < 4; j++) {
                            PhuongAn a = new PhuongAn(sc.nextLine());
                            phuongAn.add(a);
                        }
                        ch.setAns(phuongAn);
                        ch.setDapAn(sc.nextLine());
                        cauHoi.add(ch);
                    }
                    c.setCauHoi(cauHoi);
                    q.getDs().add(c);
                }
            }
        }
        @Override
        public void hienThiDs(QuanLyCauHoi q) {
            q.getDs().forEach(a -> {
                if ( a instanceof Conversation)
                    a.hienThi();
            });
        }
        
        @Override
        public List<CauHoi> docDsTheoDang(QuanLyCauHoi q) {
            return q.getDs().stream().filter(a -> a instanceof Conversation).collect(Collectors.toList());
        } 

        @Override
        public void luyenTap(QuanLyCauHoi q, SinhVien sv) {
            List<CauHoi> ch = this.docDsTheoDang(q);
            CauHinh.sc.nextLine();
            System.out.print("Chon muc do( easy / normal / hard ): ");
            String lv = CauHinh.sc.nextLine();
            List<CauHoi> con = ch.stream().filter(ic -> ic.getMucDo().compareToIgnoreCase(lv) == 0).collect(Collectors.toList());
            int rd = (int) (Math.random()*(con.size()));
            con.get(rd).lamBai();
            System.out.println("\t=== KET QUA ===");
            con.get(rd).hienThiKetQua();
            List<MultipleChoice> daLam =((Conversation)con.get(rd)).getCauHoi();
            int soCauDung = q.tinhSoCauDung(daLam);
            sv.getDiem().add(q.tinhDiem(daLam.size(), soCauDung));
        }
        
    };

    public void docCauHoi(QuanLyCauHoi q) throws FileNotFoundException  {
    }
    public void hienThiDs(QuanLyCauHoi q){
    }
    public List<CauHoi> docDsTheoDang(QuanLyCauHoi q){
        return null;
    }
    public void luyenTap(QuanLyCauHoi q, SinhVien sv){
    }
}
