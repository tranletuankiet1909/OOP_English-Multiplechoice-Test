/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thq.com.btlonclass;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLyCauHoi {
    private List<CauHoi> ds = new ArrayList<>();
    
    public void docFile(DangCauHoi a) throws FileNotFoundException{
         a.docCauHoi(this);
    }
    public void hienThiDs(DangCauHoi a){
        a.hienThiDs(this);
    }
    public List<CauHoi> traCuu(String tuKhoa){
        return this.getDs().stream().filter(ch -> ch.getNoiDung().contains(tuKhoa) || ch.getMucDo().contains(tuKhoa) ).collect(Collectors.toList());
    }
    public int tinhSoCauDung(List<MultipleChoice> mc){
        int dem = 0;
        for ( int i = 0; i < mc.size(); i++)
            if (mc.get(i).kiemTraCauDung())
                dem++;
        return dem;
    }
    public double tinhDiem(int soCauLam, int soCauDung){
        return (double) Math.round(10.0/soCauLam * 100)/100 * soCauDung;
    }
    /**
     * @return the ds
     */
    public List<CauHoi> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<CauHoi> ds) {
        this.ds = ds;
    }
    
}
