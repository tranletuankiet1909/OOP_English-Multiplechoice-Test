/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thq.com.btlonclass;

/**
 *
 * @author DELL
 */
public class PhuongAn {

    private MultipleChoice cauHoi;
    private String noiDung;
    private String luaChon;
    private String dapAn;
    private String ghiChu;

    public PhuongAn(String noiDung) {
        this.noiDung = noiDung;
    }

    public PhuongAn(MultipleChoice cauHoi, String noiDung, String luaChon, String dapAn, String ghiChu) {
        this.cauHoi = cauHoi;
        this.noiDung = noiDung;
        this.luaChon = luaChon;
        this.dapAn = dapAn;
        this.ghiChu = ghiChu;
    }

    public void hienThi() {
        System.out.println(this.noiDung);
    }

    /**
     * @return the cauHoi
     */
    public MultipleChoice getCauHoi() {
        return cauHoi;
    }

    /**
     * @param cauHoi the cauHoi to set
     */
    public void setCauHoi(MultipleChoice cauHoi) {
        this.cauHoi = cauHoi;
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
     * @return the noidung
     */
    public String getNoiDung() {
        return noiDung;
    }

    /**
     * @param noiDung
     */
    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
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

}
