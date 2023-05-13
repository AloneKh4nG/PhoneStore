/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.CT_SanPham;
import java.util.ArrayList;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author duong
 */
public class CT_SanPham_DAO implements Action<CT_SanPham> {
    private ArrayList<CT_SanPham> list = new ArrayList<>();
    private ArrayList<CT_SanPham> listSP_DK = new ArrayList<>();
    private static int soLuong = 0;
    private CT_SanPham ctsp;
    
    public CT_SanPham_DAO() throws ClassNotFoundException, SQLException{
        ctsp = new CT_SanPham();
        MyConnection myConn = new MyConnection();
    }
    
    public ArrayList<CT_SanPham> getList() {
        return list;
    }

    public static int getSoLuong() {
        return soLuong;
    }
    
    public ArrayList<CT_SanPham> readData() throws IOException{
        try {
            String sql = "Select * from CT_SP";
            Statement stmt = MyConnection.conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){   
                ctsp.setMaSP(rs.getString("MaSP"));
                ctsp.setMaLoai(rs.getString("MaLoai"));
                ctsp.setMoTaSP(rs.getString("MoTaSP"));
                ctsp.setMaHang(rs.getString("MaHang"));
                list.add(ctsp);
                soLuong++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    //Hàm thêm sản phẩm vào db
    //Đầu vào là đối tượng sản phẩm, trả về true (thêm thành công) hoặc false (thêm thất bại)
    public boolean writeData(CT_SanPham data) {
        try {
            String sql = "INSERT INTO CT_SP (MaSP, MaLoai, MaHang, MoTaSP) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = MyConnection.conn.prepareStatement(sql);
            pstmt.setString(1, data.getMaSP());
            pstmt.setString(2, data.getMaLoai());
            pstmt.setString(3, data.getMaHang());   
            pstmt.setString(4, data.getMoTaSP());
            pstmt.executeUpdate();    
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public ArrayList<CT_SanPham> readDatabyKey(String key) throws IOException { //key = maSP
        try {
            String sql = "Select * from CT_SP Where MaSP = ?";
            PreparedStatement pre = MyConnection.conn.prepareStatement(sql);
            pre.setString(1, key);
            ResultSet rs = pre.executeQuery();            
            while (rs.next()) {
                ctsp.setMaSP(rs.getString("MaSP"));
                ctsp.setMaLoai(rs.getString("MaLoai"));
                ctsp.setMoTaSP(rs.getString("MoTaSP"));
                ctsp.setMaHang(rs.getString("MaHang"));
                listSP_DK.add(ctsp);
            }
            return listSP_DK;
        } catch (SQLException e) {
        }
        return null;
    }
    
    //Hàm xóa chi tiết sản phẩm
    //Đầu vào là đối tượng, đầu ra là true (thêm thành công) hoặc false (thêm thất bại)
    public boolean deleteData(String ma){
        try {
            String sql = "Delete * from CT_SP where MaSP = ?";
            PreparedStatement pre = MyConnection.conn.prepareStatement(sql);
            pre.setString(1, ma);
            pre.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CT_SanPham_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //Hàm cập nhật chi tiết hóa đơn
    //Đầu vào là đối tượng, đầu ra là true (thêm thành công) hoặc false (thêm thất bại)
    public boolean updateData(CT_SanPham ctsp){
        try {
            String sql = "Update CT_SP set "
                    + "MaLoai = ?, "
                    + "MaHang = ?, "
                    + "MoTaSP = ?, "
                    + "values (?, ?, ?) "
                    + "where MaSP = ?";
            PreparedStatement pre = MyConnection.conn.prepareStatement(sql);
            pre.setString(1, ctsp.getMaLoai());
            pre.setString(2, ctsp.getMaHang());
            pre.setString(3, ctsp.getMoTaSP());
            pre.setString(4, ctsp.getMaSP());
            pre.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CT_SanPham_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
