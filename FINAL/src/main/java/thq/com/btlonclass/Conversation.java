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
public class Conversation extends CauHoi {
    private List<MultipleChoice> cauHoi = new ArrayList<>();
    private int soLuong;

    @Override
    public void hienThi() {
        System.out.println("Level: " + this.getMucDo());
        System.out.println(this.getNoiDung());
        this.cauHoi.forEach(ch ->{
            System.out.println("CAU HOI: " + ch.getNoiDung());
            ch.getAns().forEach(a -> a.hienThi());
        });       
    }

    @Override
    public void lamBai() {
       System.out.println("Level: " + this.getMucDo());
        System.out.println(this.getNoiDung());
        this.cauHoi.forEach(ch ->{
            System.out.println("CAU HOI: " + ch.getNoiDung());
            ch.getAns().forEach(a -> a.hienThi());
            System.out.print("Lua chon: ");
            ch.setLuaChon(CauHinh.sc.nextLine());
        });       
    }

    @Override
    public void hienThiKetQua() {
        System.out.println("Level: " + this.getMucDo());
        System.out.println(this.getNoiDung());
        this.cauHoi.forEach(ch -> {
            System.out.println("CAU HOI: " + ch.getNoiDung());
            ch.getAns().forEach(a -> a.hienThi());
            if (ch.getLuaChon().compareToIgnoreCase(ch.getDapAn()) == 0) {
                System.out.println(ch.getLuaChon() + " Dung");
            } else {
                System.out.println(ch.getLuaChon() + " Sai");
            }
        });
    }
    

    /**
     * @return the cauHoi
     */
    public List<MultipleChoice> getCauHoi() {
        return cauHoi;
    }

    /**
     * @param cauHoi the cauHoi to set
     */
    public void setCauHoi(List<MultipleChoice> cauHoi) {
        this.cauHoi = cauHoi;
    }

    /**
     * @return the soLuong
     */
    public int getSoLuong() {
        return soLuong;
    }

    /**
     * @param soLuong the soLuong to set
     */
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
    
   
    
}
