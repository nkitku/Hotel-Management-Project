package pages;

import java.awt.Container;
import java.util.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.*;

import services.MySQLService;

public class AvailabilityPage extends javax.swing.JFrame {

    /**
     * Creates new form Availability
     */
    private Connection mysqlconnection;
    private MySQLService mySQLService;
    private Statement mysqlStatement;
    private ResultSet resultSet;
    private java.util.Date dt1, dt2, dt3;
    private Object obj1, obj2, obj3, obj4;
    private String diffday;
    private Calendar calendarService;

    public AvailabilityPage() {
        this.initComponents();
        this.initServices();
        this.onInit();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bookRoomBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        totalDaysField = new javax.swing.JTextField();
        closeBtn = new javax.swing.JButton();
        checkRoomBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        arrivalDateChooser = new com.toedter.calendar.JDateChooser();
        departureDateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Availability Checking Form");
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Departure Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, 20));

        jTable1.setBackground(new java.awt.Color(153, 153, 255));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room No.", "Room Type", "Bed Type", "Tariff Per Room"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(90);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 560, 241));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("List of Available Room");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Arrival Date");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        bookRoomBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bookRoomBtn.setText("Book Room");
        bookRoomBtn.setEnabled(false);
        bookRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookRoomBtnActionPerformed(evt);
            }
        });
        jPanel1.add(bookRoomBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 110, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Booking for");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, -1));

        totalDaysField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        totalDaysField.setEnabled(false);
        jPanel1.add(totalDaysField, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 75, -1));

        closeBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 110, -1));

        checkRoomBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkRoomBtn.setText("Check Room");
        checkRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRoomBtnActionPerformed(evt);
            }
        });
        jPanel1.add(checkRoomBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 110, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/top-aboutus.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(arrivalDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 140, -1));
        jPanel1.add(departureDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(720, 518));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void initServices() {
        try {
            this.mySQLService = MySQLService.getInstance();
            this.calendarService = Calendar.getInstance();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void onInit() {
        Container c = this.getContentPane();
        c.setBackground(new java.awt.Color(153, 255, 153));
        try {
            this.mysqlconnection = this.mySQLService.getConnection();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            this.dt3 = sdf2.parse(((String) sdf1.format(this.calendarService.getTime())) + " 00:00:00");
            this.arrivalDateChooser.setDate(this.calendarService.getTime());
        } catch (SQLException | ParseException e) {
            e.printStackTrace();
        }
    }

    static final long ONE_HOUR = 60 * 60 * 1000L;
    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    // CHECKS THE ROOM AVAILABILITY AFTER ENTERING DATES 
    private void checkRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRoomBtnActionPerformed
        final java.util.Date arrivalDate = this.arrivalDateChooser.getDate();
        final java.util.Date departureDate = this.departureDateChooser.getDate();

        if (arrivalDate == null || departureDate == null) {
            JOptionPane.showMessageDialog(this, "Select Arrival and Departure Dates");
        } else if (arrivalDate.before(dt3) || departureDate.before(arrivalDate)) {
            final String message = "Check, Arrival and Departure Date should not be older than today\n"
                    + "or Departure Date should not be older than Arrival Date";
            JOptionPane.showMessageDialog(this, message);
        } else {
            final Object[] columnNames = new String[]{"Room No.", "Room Type", "Bed Type", "Tariff Per Room"};
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            DefaultTableModel dtm = new DefaultTableModel(columnNames, 0);
            this.dt1 = arrivalDate;
            this.dt2 = departureDate;
            String strdtver1 = (String) sdf.format(arrivalDate);
            String strdtver2 = (String) sdf.format(departureDate);
            long diff = ((departureDate.getTime() - arrivalDate.getTime() + ONE_HOUR) / (ONE_HOUR * 24));
            this.diffday = Long.toString(diff);
            this.totalDaysField.setText(this.diffday + "  day(s)");
            String sql = "SELECT room_no, room_type, room_bed, room_rate FROM roomdetail "
                    + "where room_no NOT IN (SELECT room_no FROM bookingtable WHERE DATE(date_to) >= '"
                    + strdtver1 + "' AND DATE(date_fro) <= '" + strdtver2 + "');";
            try {
                this.mysqlStatement = this.mysqlconnection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                this.resultSet = this.mysqlStatement.executeQuery(sql);
                int i = 0;
                while (resultSet.next()) {
                    final String var1 = this.resultSet.getString(1);
                    final String var2 = this.resultSet.getString(2);
                    final String var3 = this.resultSet.getString(3);
                    final String var4 = Integer.toString(this.resultSet.getInt(4));

                    dtm.addRow(new Vector());
                    dtm.setValueAt(var1, i, 0);
                    dtm.setValueAt(var2, i, 1);
                    dtm.setValueAt(var3, i, 2);
                    dtm.setValueAt(var4, i, 3);
                    i++;
                }
                this.jTable1.setModel(dtm);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_checkRoomBtnActionPerformed

    private Object getValueAt(JTable table, int rowIndex, int colIndex) {
        return table.getModel().getValueAt(rowIndex, colIndex);
    }

    // OPENS THE BOOKING FRAME FOR BOOKING CONFIRMATION    
    private void bookRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookRoomBtnActionPerformed
        new BookRoomPage(this.obj1, this.obj2, this.obj3, this.obj4, this.dt1, this.dt2, this.diffday).setVisible(true);
    }//GEN-LAST:event_bookRoomBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int rno = jTable1.getSelectedRow();
        this.obj1 = getValueAt(jTable1, rno, 0);
        this.obj2 = getValueAt(jTable1, rno, 1);
        this.obj3 = getValueAt(jTable1, rno, 2);
        this.obj4 = getValueAt(jTable1, rno, 3);
        this.bookRoomBtn.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.jTable1.setToolTipText("Select the Room want to reserve");
        this.bookRoomBtn.setToolTipText("Select the Room from the list and click this button for Room Booking");
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser arrivalDateChooser;
    private javax.swing.JButton bookRoomBtn;
    private javax.swing.JButton checkRoomBtn;
    private javax.swing.JButton closeBtn;
    private com.toedter.calendar.JDateChooser departureDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField totalDaysField;
    // End of variables declaration//GEN-END:variables
}
