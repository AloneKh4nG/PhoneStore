/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DTO.Loai_SP;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import DAO.LoaiSanPhamDAO;

/**
 *
 * @author duong
 */
public class LOAI_SP_BUS {
    private ArrayList<Loai_SP> listLoaisp;
    private LoaiSanPhamDAO loaisp_DAO = new LoaiSanPhamDAO();
    
    public LOAI_SP_BUS(){
        readLOAI_SP_BUS();
    }
    
    public void readLOAI_SP_BUS(){
        try {
            listLoaisp = loaisp_DAO.readLOAI_SP();
        } catch (IOException ex) {
            Logger.getLogger(LOAI_SP_BUS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
