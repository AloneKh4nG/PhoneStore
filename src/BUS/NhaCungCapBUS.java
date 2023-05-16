/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.NhaCungCapDAO;
import DTO.NhaCungCap;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class NhaCungCapBUS {
    private ArrayList <NhaCungCap> nhacungcap;
    private NhaCungCapDAO nhacungcap_DAO;
    
    public NhaCungCapBUS() throws IOException, ClassNotFoundException, SQLException{
        this.nhacungcap_DAO = new NhaCungCapDAO();
        readNHACUNGCAP_BUS();
    }
    
    //Hàm đọc sản phẩm khi khởi chạy chương trình
    public void readNHACUNGCAP_BUS() throws IOException{
        this.nhacungcap = nhacungcap_DAO.readData();
    }
    
    //Hàm thêm sản phẩm
    public boolean addNHACUNGCAP_BUS(NhaCungCap ncc){
        nhacungcap.add(ncc);
        if(nhacungcap_DAO.writeData(ncc) == true){
            return true;
        } else return false;
    }
    
    //Hàm xóa sản phẩm
    public boolean deleteNHACUNGCAP_BUS(String ma){
        ma = ma.trim().toLowerCase();
        for(NhaCungCap nhacc : nhacungcap){
            if(nhacc.getMaNCC().trim().toLowerCase().equals(ma)){
                nhacungcap.remove(nhacc);
                if(nhacungcap_DAO.deleteData(ma) == true){
                    return true;
                }
            }
        }
        return false;
    }
    
    //Hàm sửa sản phẩm
    public boolean updateNHACUNGCAP_BUS(NhaCungCap ncc){
        String ma = ncc.getMaNCC();
        int i=0;
        ma = ma.trim().toLowerCase();
        for(NhaCungCap nhacc : nhacungcap){
            if(nhacc.getMaNCC().trim().toLowerCase().equals(ma)){
                nhacungcap.set(i, ncc);
                if(nhacungcap_DAO.updateData(ncc) == true){
                    return true;
                } 
            }
            i++;
        }
        return false;
    }
}
