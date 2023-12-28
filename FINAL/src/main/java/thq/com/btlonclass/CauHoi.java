/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thq.com.btlonclass;

//import java.util.ArrayList;
//import java.util.List;

/**
 *
 * @author DELL
 */
public abstract class CauHoi {

    private String danhMuc;
    private String mucDo;
    private String noiDung;
    
    public abstract void hienThi();

    public abstract void lamBai();

    public abstract void hienThiKetQua();
    
    public boolean kiemTraCauDung(){
        return true;
    }
    /**
     * @return the danhMuc
     */
    public String getDanhMuc() {
        return danhMuc;
    }

    /**
     * @param danhMuc the danhMuc to set
     */
    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    /**
     * @return the mucDo
     */
    public String getMucDo() {
        return mucDo;
    }

    /**
     * @param mucDo the mucDo to set
     */
    public void setMucDo(String mucDo) {
        this.mucDo = mucDo;
    }

    /**
     * @return the noiDung
     */
    public String getNoiDung() {
        return noiDung;
    }

    /**
     * @param noiDung the noiDung to set
     */
    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

//    /**
//     * @return the dapAn
//     */
//    public String getDapAn() {
//        return dapAn;
//    }
//
//    /**
//     * @param dapAn the dapAn to set
//     */
//    public void setDapAn(String dapAn) {
//        this.dapAn = dapAn;
//    }
//
//    /**
//     * @return the ans
//     */
//    public List<PhuongAn> getAns() {
//        return ans;
//    }
//
//    /**
//     * @param ans the ans to set
//     */
//    public void setAns(List<PhuongAn> ans) {
//        this.ans = ans;
//    }
//    /**
//     * @return the luaChon
//     */
//    public String getLuaChon() {
//        return luaChon;
//    }
//
//    /**
//     * @param luaChon the luaChon to set
//     */
//    public void setLuaChon(String luaChon) {
//        this.luaChon = luaChon;
//    }

    
    
}
