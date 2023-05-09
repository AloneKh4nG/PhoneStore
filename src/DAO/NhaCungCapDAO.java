/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.NhaCungCap;
import DTO.NhanVien;
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
public class NhaCungCapDAO implements DataTranfer<NhaCungCap>{
    private ArrayList<NhaCungCap> list = new ArrayList<>();    
    private ArrayList<NhaCungCap> listNCC_DK = new ArrayList<>();
    private static int soLuong = 0;
    private NhaCungCap ncc;

    public NhaCungCapDAO() throws ClassNotFoundException, SQLException, IOException {
        ncc = new NhaCungCap();
        MyConnection myConn = new MyConnection();
    }

    public ArrayList<NhaCungCap> getList() {
        return list;
    }

    public static int getSoLuong() {
        return soLuong;
    }

    public ArrayList<NhaCungCap> readData() throws IOException{
        try {
            String sql = "Select * from NHACUNGCAP";
            Statement stmt = MyConnection.conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                ncc.setMaNCC(rs.getString(1));
                ncc.setTenNCC(rs.getString(2));
                ncc.setDiaChi(rs.getString(3));
                ncc.setSDT(rs.getString(4));
                list.add(ncc);
                soLuong++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public boolean writeData(NhaCungCap data) {
        try {
            String sql = "INSERT INTO NHACUNGCAP (MaNCC, TenNCC, DiaChi, SDT) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = MyConnection.conn.prepareStatement(sql);
            pstmt.setString(1, data.getMaNCC());
            pstmt.setString(2, data.getTenNCC());
            pstmt.setString(3, data.getDiaChi());
            pstmt.setString(4, data.getSDT());
            pstmt.executeUpdate();    
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public ArrayList<NhaCungCap> readDatabyKey(String key) throws IOException { //key = maNV
        try {
            String sql = "Select * from NHACUNGCAP Where MaNCC = ?";
            PreparedStatement pre = MyConnection.conn.prepareStatement(sql);
            pre.setString(1, key);
            ResultSet rs = pre.executeQuery();            
            while (rs.next()) {
                ncc.setMaNCC(rs.getString(1));
                ncc.setTenNCC(rs.getString(2));
                ncc.setDiaChi(rs.getString(3));
                ncc.setSDT(rs.getString(4));
                listNCC_DK.add(ncc);
            }
            return listNCC_DK;
        } catch (SQLException e) {
        }
        return null;
    }
}
