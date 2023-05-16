/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import Connection.MyConnection;
import DAO.CT_PhieuNhapDAO;
import DTO.CT_PhieuNhap;
import DTO.PhieuNhap;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class CT_PhieuNhapBUS {
    private ArrayList<CT_PhieuNhap> list;    
    private int soLuong = 0;
    private CT_PhieuNhapDAO ctpnDAO;
    
    public CT_PhieuNhapBUS() throws ClassNotFoundException, SQLException, IOException{
        MyConnection myConn = new MyConnection();
        ctpnDAO = new CT_PhieuNhapDAO();
        this.list = new ArrayList<>(ctpnDAO.getList());
    }

    public ArrayList<CT_PhieuNhap> getList() {
        return list;
    }

    public int getSoLuong() {
        soLuong = CT_PhieuNhapDAO.getSoLuong();
        return soLuong;
    }

    public boolean write(CT_PhieuNhap data) throws IOException{
        if(ctpnDAO.write(data)){
            list.add(data);
            return true;
        } else return false;     
    }
    
    public boolean delete(CT_PhieuNhap data){
        int maPN = data.getMaPN();
        for (CT_PhieuNhap ctpn : list){
            if(ctpn.getMaPN()==maPN){
                if(ctpnDAO.delete(data)){
                    list.remove(searchIndexByID(Integer.toString(data.getMaPN())));
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean update(CT_PhieuNhap data){
        int maPN = data.getMaPN();
        for (CT_PhieuNhap ctpn : list){
            if(Integer.toString(ctpn.getMaPN()).equals(maPN)){
                if(ctpnDAO.update(data)){
                    list.set(searchIndexByID(Integer.toString(data.getMaPN())), data);
                    return true;
                }
            }
        }        
        return false;
    }

    public int searchIndexByID(String ID) { // ID = MaSP
        int index = -1; // giá trị trả về mặc định nếu không tìm thấy
        for (int i = 0; i < list.size(); i++) {
            if (Integer.toString(list.get(i).getMaPN()).equals(ID)) {
                index = i;
                break;
            }
        }
        return index;
    }
    
    public CT_PhieuNhap getCTPNByPN(PhieuNhap pn){
        for(CT_PhieuNhap ctpn : list){
            if(Integer.toString(ctpn.getMaPN()).equals(pn.getMaPN())){
                return ctpn;
            }
        }
        return null;
    }
}
