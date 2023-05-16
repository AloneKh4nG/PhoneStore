/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.PhieuNhapDAO;
import DTO.PhieuNhap;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class PhieuNhapBUS {
    private ArrayList <PhieuNhap> phieunhap;
    private PhieuNhapDAO phieunhap_DAO;
    
    public PhieuNhapBUS() throws IOException, ClassNotFoundException, SQLException{
        this.phieunhap_DAO = new PhieuNhapDAO();
        readPhieuNhap_BUS();
    }
    
    //Hàm đọc sản phẩm khi khởi chạy chương trình
    public void readPhieuNhap_BUS() throws IOException{
        this.phieunhap = phieunhap_DAO.readData();
    }
    
    //Hàm thêm sản phẩm
    public boolean addPhieuNhap_BUS(PhieuNhap pn){
        phieunhap.add(pn);
        if(phieunhap_DAO.writeData(pn) == true){
            return true;
        } else return false;
    }
    
    //Hàm xóa sản phẩm
    public boolean deletePhieuNhap_BUS(String ma){
        ma = ma.trim().toLowerCase();
        for(PhieuNhap phieun : phieunhap){
            if(phieun.getMaPN().trim().toLowerCase().equals(ma)){
                phieunhap.remove(phieun);
                if(phieunhap_DAO.deleteData(ma) == true){
                    return true;
                }
            }
        }
        return false;
    }
    
    //Hàm sửa sản phẩm
    public boolean updatePhieuNhap_BUS(PhieuNhap pn){
        String ma = pn.getMaPN();
        int i=0;
        ma = ma.trim().toLowerCase();
        for(PhieuNhap phieun : phieunhap){
            if(phieun.getMaPN().trim().toLowerCase().equals(ma)){
                phieunhap.set(i, pn);
                if(phieunhap_DAO.updateData(pn) == true){
                    return true;
                } 
            }
            i++;
        }
        return false;
    }
}
