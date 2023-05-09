/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.PhieuNhap;
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
public class PhieuNhapDAO {
    private ArrayList<PhieuNhap> list = new ArrayList<>();    
    private ArrayList<PhieuNhap> listPN_DK = new ArrayList<>();
    private static int soLuong = 0;
    private PhieuNhap pn;

    public PhieuNhapDAO() throws ClassNotFoundException, SQLException, IOException {
        pn = new PhieuNhap();
        MyConnection myConn = new MyConnection();
    }

    public ArrayList<PhieuNhap> getList() {
        return list;
    }

    public static int getSoLuong() {
        return soLuong;
    }

    public ArrayList<PhieuNhap> readData() throws IOException{
        try {
            String sql = "Select * from PHIEUNHAP";
            Statement stmt = MyConnection.conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                pn.setMaPN(rs.getString(1));
                pn.setNgayLap(rs.getString(2));
                pn.setTongTien(rs.getInt(3));
                pn.setMaNCC(rs.getInt(4));
                pn.setMaNV(rs.getInt(5));
                list.add(pn);
                soLuong++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhieuNhapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public boolean writeData(PhieuNhap data) {
        try {
            String sql = "INSERT INTO PHIEUNHAP (MaPN, NgayLap, TongTien, MaNCC, MaNV) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = MyConnection.conn.prepareStatement(sql);
            pstmt.setString(1, data.getMaPN());
            pstmt.setString(2, data.getNgayLap());
            pstmt.setInt(3, data.getTongTien());
            pstmt.setInt(4, data.getMaNCC());
            pstmt.setInt(4, data.getMaNV());
            pstmt.executeUpdate();    
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PhieuNhapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public ArrayList<PhieuNhap> readDatabyKey(String key) throws IOException { //key = maPN
        try {
            String sql = "Select * from PHIEUNHAP Where MaPN = ?";
            PreparedStatement pre = MyConnection.conn.prepareStatement(sql);
            pre.setString(1, key);
            ResultSet rs = pre.executeQuery();            
            while (rs.next()) {
                pn.setMaPN(rs.getString(1));
                pn.setNgayLap(rs.getString(2));
                pn.setTongTien(rs.getInt(3));
                pn.setMaNCC(rs.getInt(4));
                pn.setMaNV(rs.getInt(5));
                listPN_DK.add(pn);
            }
            return listPN_DK;
        } catch (SQLException e) {
        }
        return null;
    }
}
