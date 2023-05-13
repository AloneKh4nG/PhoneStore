/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Loai_SP;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import Connection.MyConnection;

/**
 *
 * @author duong
 */
public class LoaiSanPhamDAO implements Action<Loai_SP> {
    private ArrayList<Loai_SP> list = new ArrayList<>();    
    private ArrayList<Loai_SP> listLoaiSP_DK = new ArrayList<>(); 
    private static int soLuong = 0;
    private Loai_SP loaiSP;
    
    public LoaiSanPhamDAO() throws IOException, ClassNotFoundException, SQLException{
        loaiSP = new Loai_SP();
        MyConnection myConn = new MyConnection();        
    }
    
    public ArrayList<Loai_SP> getList() {
        return list;
    }

    public static int getSoLuong() {
        return soLuong;
    }
    
    public ArrayList<Loai_SP> readData() throws IOException{
        try {
            String sql = "Select * from LOAI_SP";
            Statement stmt = MyConnection.conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){   
                loaiSP.setMaLoai(rs.getString(1));
                loaiSP.setTenLoai(rs.getString(2));
                list.add(loaiSP);
                soLuong++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    //Hàm thêm loại sản phẩm
    public boolean writeData(Loai_SP data) { 
        try {
            String sql = "INSERT INTO LOAI_SP (MaLoai, TenLoai) VALUES (?, ?)";
            PreparedStatement pstmt = MyConnection.conn.prepareStatement(sql);
            pstmt.setString(1, data.getMaLoai());
            pstmt.setString(2, data.getTenLoai());
            pstmt.executeUpdate();    
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public ArrayList<Loai_SP> readDatabyKey(String key) throws IOException { //key = maLoai
        try {
            String sql = "Select * from LOAI_SP Where MaLoai = ?";
            PreparedStatement pre = MyConnection.conn.prepareStatement(sql);
            pre.setString(1, key);
            ResultSet rs = pre.executeQuery();            
            while (rs.next()) {
                loaiSP.setMaLoai(rs.getString(1));
                loaiSP.setTenLoai(rs.getString(2));
                listLoaiSP_DK.add(loaiSP);
            }
            return listLoaiSP_DK;
        } catch (SQLException e) {
        }
        return null;
    }

    //Hàm xóa loại sản phẩm
    public boolean deleteData(String ma){
        try {
            String sql = "Delete * from LOAI_SP where MaLoai = ?";
            PreparedStatement pre = MyConnection.conn.prepareStatement(sql);
            pre.setString(1, ma);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(LoaiSanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //Hàm sửa loại sản phẩm
    public boolean updateData(Loai_SP lsp){
        try {
            String sql = "Update LOAI_SP set "
                    + "TenLoai = ? "
                    + "where MaLoai = ?";
            PreparedStatement pre = MyConnection.conn.prepareStatement(sql);
            pre.setString(1, lsp.getTenLoai());
            pre.setString(2, lsp.getMaLoai());
            pre.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(LoaiSanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
