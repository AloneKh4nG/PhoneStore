/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DTO.Common;
import DTO.SanPham;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;

/**
 *
 * @author agond
 */
public class MuaHang extends javax.swing.JFrame {
    private ArrayList<SanPham> list;
    /**
     * Creates new form MuaHang
     */
    public MuaHang() {
        initComponents();
        setLocationRelativeTo(null);
        
        list = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnNav = new javax.swing.JPanel();
        lblPhoneStore = new javax.swing.JLabel();
        btnMuaHang = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnSanPham = new javax.swing.JButton();
        btnKhuyenMai = new javax.swing.JButton();
        btnPhanQuyen = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        pbBody = new javax.swing.JScrollPane();
        pnContent = new javax.swing.JPanel();
        lblSanPham = new javax.swing.JLabel();
        btnThemVaoGio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSanPham = new javax.swing.JTable();
        lblGioHang = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbGioHang = new javax.swing.JTable();
        btnXoaSP = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblTongCong = new javax.swing.JLabel();
        lblTongCong1 = new javax.swing.JLabel();
        lblTongCong2 = new javax.swing.JLabel();
        txtMGG = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblTongCong3 = new javax.swing.JLabel();
        lblTongCong4 = new javax.swing.JLabel();
        lblTongCong5 = new javax.swing.JLabel();
        lblTongCong6 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        pnInfoSP = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtHangSX = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtTenSP = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtLoaiSP = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtChiTietSP = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        txtSoLuongThem = new javax.swing.JLabel();
        btnSub = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PhoneStore: Reset Password");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(null);
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);

        pnNav.setBackground(new java.awt.Color(50, 50, 50));

        lblPhoneStore.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPhoneStore.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneStore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhoneStore.setLabelFor(pnNav);
        lblPhoneStore.setText("Phonestore");

        btnMuaHang.setBackground(new java.awt.Color(60, 90, 180));
        btnMuaHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMuaHang.setForeground(new java.awt.Color(240, 240, 240));
        btnMuaHang.setText("Mua hàng");

        btnThongKe.setBackground(new java.awt.Color(240, 240, 240));
        btnThongKe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThongKe.setForeground(new java.awt.Color(75, 75, 75));
        btnThongKe.setText("Thống kê");

        btnSanPham.setBackground(new java.awt.Color(240, 240, 240));
        btnSanPham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSanPham.setForeground(new java.awt.Color(75, 75, 75));
        btnSanPham.setText("Sản Phẩm");

        btnKhuyenMai.setBackground(new java.awt.Color(240, 240, 240));
        btnKhuyenMai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKhuyenMai.setForeground(new java.awt.Color(75, 75, 75));
        btnKhuyenMai.setText("Khuyến mãi");

        btnPhanQuyen.setBackground(new java.awt.Color(240, 240, 240));
        btnPhanQuyen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPhanQuyen.setForeground(new java.awt.Color(75, 75, 75));
        btnPhanQuyen.setText("Phân quyền");

        btnDangXuat.setBackground(new java.awt.Color(50, 50, 50));
        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(240, 240, 240));
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnNavLayout = new javax.swing.GroupLayout(pnNav);
        pnNav.setLayout(pnNavLayout);
        pnNavLayout.setHorizontalGroup(
            pnNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNavLayout.createSequentialGroup()
                .addGroup(pnNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnNavLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMuaHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThongKe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKhuyenMai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(btnPhanQuyen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDangXuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnNavLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lblPhoneStore, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator3)
        );
        pnNavLayout.setVerticalGroup(
            pnNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNavLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblPhoneStore)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnMuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPhanQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pbBody.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        pbBody.setHorizontalScrollBar(null);
        pbBody.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                pbBodyMouseWheelMoved(evt);
            }
        });

        lblSanPham.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblSanPham.setForeground(new java.awt.Color(60, 90, 180));
        lblSanPham.setText("Sản phẩm");

        btnThemVaoGio.setBackground(new java.awt.Color(60, 90, 180));
        btnThemVaoGio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemVaoGio.setForeground(new java.awt.Color(240, 240, 240));
        btnThemVaoGio.setText("Thêm vào giỏ");
        btnThemVaoGio.setBorderPainted(false);
        btnThemVaoGio.setFocusPainted(false);
        btnThemVaoGio.setFocusable(false);

        tbSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên sản phẩm", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbSanPham.setMinimumSize(new java.awt.Dimension(12, 0));
        tbSanPham.setShowGrid(false);
        jScrollPane1.setViewportView(tbSanPham);
        if (tbSanPham.getColumnModel().getColumnCount() > 0) {
            tbSanPham.getColumnModel().getColumn(0).setPreferredWidth(8);
            tbSanPham.getColumnModel().getColumn(2).setPreferredWidth(8);
        }

        lblGioHang.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblGioHang.setForeground(new java.awt.Color(60, 90, 180));
        lblGioHang.setText("Giỏ hàng");
        lblGioHang.setToolTipText("");

        tbGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên sản phẩm", "Nhà sản xuất", "Giá", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbGioHang);
        if (tbGioHang.getColumnModel().getColumnCount() > 0) {
            tbGioHang.getColumnModel().getColumn(0).setPreferredWidth(12);
            tbGioHang.getColumnModel().getColumn(2).setPreferredWidth(52);
            tbGioHang.getColumnModel().getColumn(3).setPreferredWidth(12);
            tbGioHang.getColumnModel().getColumn(4).setPreferredWidth(12);
        }

        btnXoaSP.setBackground(new java.awt.Color(220, 65, 65));
        btnXoaSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaSP.setForeground(new java.awt.Color(240, 240, 240));
        btnXoaSP.setText("Xóa sản phẩm");

        lblTongCong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTongCong.setForeground(new java.awt.Color(75, 75, 75));
        lblTongCong.setText("Giảm giá:");
        lblTongCong.setToolTipText("");

        lblTongCong1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTongCong1.setForeground(new java.awt.Color(75, 75, 75));
        lblTongCong1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTongCong1.setText("0");
        lblTongCong1.setToolTipText("");

        lblTongCong2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTongCong2.setForeground(new java.awt.Color(75, 75, 75));
        lblTongCong2.setText("Mã giảm giá");
        lblTongCong2.setToolTipText("");

        lblTongCong3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTongCong3.setForeground(new java.awt.Color(75, 75, 75));
        lblTongCong3.setText("Tổng cộng:");
        lblTongCong3.setToolTipText("");

        lblTongCong4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTongCong4.setForeground(new java.awt.Color(220, 65, 65));
        lblTongCong4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTongCong4.setText("-0");
        lblTongCong4.setToolTipText("");

        lblTongCong5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTongCong5.setForeground(new java.awt.Color(75, 75, 75));
        lblTongCong5.setText("Thành tiền:");
        lblTongCong5.setToolTipText("");

        lblTongCong6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTongCong6.setForeground(new java.awt.Color(60, 90, 180));
        lblTongCong6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTongCong6.setText("-0");
        lblTongCong6.setToolTipText("");

        txtSearch.setBackground(new java.awt.Color(242, 242, 242));
        txtSearch.setForeground(new java.awt.Color(75, 75, 75));
        txtSearch.setText("Tìm kiếm");
        txtSearch.setToolTipText("Tìm kiếm");
        txtSearch.setMargin(new java.awt.Insets(3, 12, 3, 12));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Hãng");

        txtHangSX.setEditable(false);
        txtHangSX.setToolTipText("Hãng sản xuất");
        jScrollPane3.setViewportView(txtHangSX);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Sản phẩm");

        txtTenSP.setEditable(false);
        txtTenSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTenSP.setToolTipText("Tên sản phẩm");
        jScrollPane4.setViewportView(txtTenSP);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Loại");

        txtLoaiSP.setEditable(false);
        txtLoaiSP.setToolTipText("Loại sản phẩm");
        jScrollPane5.setViewportView(txtLoaiSP);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Thông tin");

        txtChiTietSP.setEditable(false);
        txtChiTietSP.setToolTipText("Thông tin chi tiết");
        jScrollPane6.setViewportView(txtChiTietSP);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Số lượng:");

        btnAdd.setBackground(new java.awt.Color(242, 242, 242));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdd.setText("+");
        btnAdd.setToolTipText("");
        btnAdd.setMargin(new java.awt.Insets(0, 0, 0, 0));

        txtSoLuongThem.setBackground(new java.awt.Color(255, 255, 255));
        txtSoLuongThem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtSoLuongThem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSoLuongThem.setText("0");

        btnSub.setBackground(new java.awt.Color(242, 242, 242));
        btnSub.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSub.setText("-");
        btnSub.setToolTipText("");
        btnSub.setMargin(new java.awt.Insets(0, 0, 0, 0));

        javax.swing.GroupLayout pnInfoSPLayout = new javax.swing.GroupLayout(pnInfoSP);
        pnInfoSP.setLayout(pnInfoSPLayout);
        pnInfoSPLayout.setHorizontalGroup(
            pnInfoSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfoSPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnInfoSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnInfoSPLayout.createSequentialGroup()
                        .addGroup(pnInfoSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnInfoSPLayout.createSequentialGroup()
                                .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSoLuongThem, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(74, Short.MAX_VALUE))
                    .addComponent(jScrollPane4)
                    .addGroup(pnInfoSPLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane3))
                    .addGroup(pnInfoSPLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane5))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        pnInfoSPLayout.setVerticalGroup(
            pnInfoSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfoSPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnInfoSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnInfoSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnInfoSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSoLuongThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout pnContentLayout = new javax.swing.GroupLayout(pnContent);
        pnContent.setLayout(pnContentLayout);
        pnContentLayout.setHorizontalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(pnContentLayout.createSequentialGroup()
                                            .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btnXoaSP)
                                                .addComponent(lblTongCong2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtMGG, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(213, 213, 213)
                                            .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(pnContentLayout.createSequentialGroup()
                                                    .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lblTongCong, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblTongCong3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblTongCong1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblTongCong4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(pnContentLayout.createSequentialGroup()
                                                    .addComponent(lblTongCong5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lblTongCong6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(pnContentLayout.createSequentialGroup()
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6))))
                                .addGap(0, 27, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnInfoSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnContentLayout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(btnThemVaoGio, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContentLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnContentLayout.setVerticalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSanPham)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addComponent(pnInfoSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThemVaoGio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblGioHang)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaSP)
                    .addComponent(lblTongCong1)
                    .addComponent(lblTongCong3))
                .addGap(18, 18, 18)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTongCong2)
                    .addComponent(lblTongCong)
                    .addComponent(lblTongCong4))
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTongCong5)
                            .addComponent(lblTongCong6)))
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMGG, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78))
        );

        pbBody.setViewportView(pnContent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(667, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 253, Short.MAX_VALUE)
                    .addComponent(pbBody, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnNav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pbBody, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        Index indexForm = new Index(); 
        indexForm.setVisible(true); 
        this.dispose(); 
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void pbBodyMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_pbBodyMouseWheelMoved
        int notches = evt.getWheelRotation();
        JScrollBar scrollBar = pbBody.getVerticalScrollBar();
        int currentValue = scrollBar.getValue();
        int scrollValue = scrollBar.getBlockIncrement() * notches;
        scrollBar.setValue(currentValue + scrollValue);
    }//GEN-LAST:event_pbBodyMouseWheelMoved

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MuaHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MuaHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MuaHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MuaHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MuaHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnKhuyenMai;
    private javax.swing.JButton btnMuaHang;
    private javax.swing.JButton btnPhanQuyen;
    private javax.swing.JButton btnSanPham;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton btnThemVaoGio;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnXoaSP;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblGioHang;
    private javax.swing.JLabel lblPhoneStore;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblTongCong;
    private javax.swing.JLabel lblTongCong1;
    private javax.swing.JLabel lblTongCong2;
    private javax.swing.JLabel lblTongCong3;
    private javax.swing.JLabel lblTongCong4;
    private javax.swing.JLabel lblTongCong5;
    private javax.swing.JLabel lblTongCong6;
    private javax.swing.JScrollPane pbBody;
    private javax.swing.JPanel pnContent;
    private javax.swing.JPanel pnInfoSP;
    private javax.swing.JPanel pnNav;
    private javax.swing.JTable tbGioHang;
    private javax.swing.JTable tbSanPham;
    private javax.swing.JTextPane txtChiTietSP;
    private javax.swing.JTextPane txtHangSX;
    private javax.swing.JTextPane txtLoaiSP;
    private javax.swing.JTextField txtMGG;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtSoLuongThem;
    private javax.swing.JTextPane txtTenSP;
    // End of variables declaration//GEN-END:variables
}
