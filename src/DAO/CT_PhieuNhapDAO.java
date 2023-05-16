/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.CT_PhieuNhap;
import DTO.CT_SanPham;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class CT_PhieuNhapDAO implements Action<CT_PhieuNhap> {
    private ArrayList<CT_PhieuNhap> list = new ArrayList<>();    
    private ArrayList<CT_PhieuNhap> listCTPN_DK = new ArrayList<>();
    private static int soLuong = 0;
    private CT_PhieuNhap ctpn;

    public CT_PhieuNhapDAO() throws ClassNotFoundException, SQLException, IOException {
        MyConnection myConn = new MyConnection();
        read();
    }

    public ArrayList<CT_PhieuNhap> getList() {
        return list;
    }

    public static int getSoLuong() {
        return soLuong;
    }

    @Override
    public ArrayList<CT_PhieuNhap> read() throws IOException{
        try {
            String sql = "Select * from CT_PHIEUNHAP";
            Statement stmt = MyConnection.conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                ctpn.setMaPN(rs.getInt(1));
                ctpn.setMaSP(rs.getInt(2));
                ctpn.setSoLuong(rs.getInt(3));
                ctpn.setThanhTien(rs.getInt(4));
                ctpn.setDonGiaNhap(rs.getInt(5));
                list.add(ctpn);
                soLuong++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CT_PhieuNhapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public boolean write(CT_PhieuNhap data) {
        try {
            String sql = "INSERT INTO CT_PHIEUNHAP (MaPN, MaSP, SoLuong, ThanhTien, DonGiaNhap) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = MyConnection.conn.prepareStatement(sql);
            pstmt.setInt(1, data.getMaPN());
            pstmt.setInt(2, data.getMaSP());
            pstmt.setInt(3, data.getSoLuong());
            pstmt.setInt(4, data.getThanhTien());
            pstmt.setInt(5, data.getDonGiaNhap());
            pstmt.executeUpdate();    
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CT_PhieuNhapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    //Đầu vào là đối tượng, trả về true (xóa thành công) hoặc false (ko thành công)
    @Override
    public boolean delete(CT_PhieuNhap data){
        try {
            String sql = "Delete * from CT_PHIEUNHAP where MaPN = ?";
            PreparedStatement pre = MyConnection.conn.prepareStatement(sql);
            pre.setInt(1, data.getMaPN());
            pre.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CT_PhieuNhapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //Hàm sửa sản phẩm từ db
    //Đầu vào là đố tượng cần sửa, đầu ra là true (sửa thành công) hoặc false (sửa thất bại)
    @Override
    public boolean update(CT_PhieuNhap data){
        try {
            String sql = "Update CT_PHIEUNHAP set "+ "MaSP = ?, "+ "SoLuong = ?, "+ "ThanhTien = ?, "+ "DonGiaNhap = ?, "+ "where MaPN = ?";
            PreparedStatement pre = MyConnection.conn.prepareStatement(sql);
            pre.setInt(1, data.getMaSP());
            pre.setInt(2, data.getSoLuong());
            pre.setInt(3, data.getThanhTien());
            pre.setInt(4, data.getDonGiaNhap());
            pre.setInt(5, data.getMaPN());
            pre.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CT_PhieuNhapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public int searchByID(String ID) {
        int index = -1; // giá trị trả về mặc định nếu không tìm thấy
        for (int i = 0; i < list.size(); i++) {
            if (Integer.toString(list.get(i).getMaPN()).equals(ID)) {
                index = i;
                break;
            }
        }
        return index;
    }
}
