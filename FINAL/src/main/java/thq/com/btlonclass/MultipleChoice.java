/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thq.com.btlonclass;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class MultipleChoice extends CauHoi {
    private List<PhuongAn> ans = new ArrayList<>();
    private String ghiChu;
    private String dapAn;
    private String luaChon;
    
    @Override
    public void hienThi() {
        System.out.println("\nLevel: " + this.getMucDo());
        System.out.println("CAU HOI: " + this.getNoiDung());
        this.ans.forEach(q -> q.hienThi());
    }
    @Override
    public void lamBai() {
        this.hienThi();
        System.out.print("Lua chon: ");
        this.setLuaChon(CauHinh.sc.nextLine());
    }
    @Override
    public void hienThiKetQua(){
        this.hienThi();
        if (this.luaChon.compareToIgnoreCase(this.dapAn) == 0){
            System.out.println(this.luaChon + " Dung");
        }
        else{
            System.out.println(this.luaChon + " Sai");
        } 
        System.out.println("Ghi chu: " + this.ghiChu);
    }

    @Override
    public boolean kiemTraCauDung() {
        return this.luaChon.compareToIgnoreCase(this.dapAn) == 0;
    }
    
    
    /**
     * @return the ghiChu
     */
    public String getGhiChu() {
        return ghiChu;
    }

    /**
     * @param ghiChu the ghiChu to set
     */
    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    /**
     * @return the ans
     */
    public List<PhuongAn> getAns() {
        return ans;
    }

    /**
     * @param ans the ans to set
     */
    public void setAns(List<PhuongAn> ans) {
        this.ans = ans;
    }

    /**
     * @return the dapAn
     */
    public String getDapAn() {
        return dapAn;
    }

    /**
     * @param dapAn the dapAn to set
     */
    public void setDapAn(String dapAn) {
        this.dapAn = dapAn;
    }

    /**
     * @return the luaChon
     */
    public String getLuaChon() {
        return luaChon;
    }

    /**
     * @param luaChon the luaChon to set
     */
    public void setLuaChon(String luaChon) {
        this.luaChon = luaChon;
    }
    
}
