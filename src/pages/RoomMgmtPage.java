package pages;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import services.MySQLService;

public class RoomMgmtPage extends javax.swing.JFrame {

    private Connection mysqlConnection;
    private MySQLService mySQLService;
    private ResultSet resultSet, rs2;
    private String rno, rtype, rbed, rrate;

    public RoomMgmtPage() {
        this.initComponents();
        this.initServices();
        this.onInit();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        roomField = new javax.swing.JTextField();
        firstBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        lastBtn = new javax.swing.JButton();
        preBtn = new javax.swing.JButton();
        roomRateField = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        roomTypeField = new javax.swing.JComboBox();
        bedTypeField = new javax.swing.JComboBox();
        showBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        searchBtn = new javax.swing.JButton();
        searchRoomField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        refreshBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/top-aboutus.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Room Management Form", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Room No.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("<html>Room Type<br /> (AC/NON AC)</html>");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Room Rate");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("<html>Bed Type <br/>(Single/Double)</html>");

        roomField.setEditable(false);
        roomField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        roomField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        roomField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                roomFieldCaretUpdate(evt);
            }
        });

        firstBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        firstBtn.setText("First <<");
        firstBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstBtnActionPerformed(evt);
            }
        });

        nextBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nextBtn.setText("Next >");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        lastBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lastBtn.setText("Last >>");
        lastBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastBtnActionPerformed(evt);
            }
        });

        preBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        preBtn.setText("Previous <");
        preBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preBtnActionPerformed(evt);
            }
        });

        roomRateField.setEditable(false);
        roomRateField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        roomRateField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        createBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        createBtn.setText("New");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        editBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));

        roomTypeField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "NON AC" }));
        roomTypeField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        roomTypeField.setEnabled(false);

        bedTypeField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Single", "Double" }));
        bedTypeField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bedTypeField.setEnabled(false);

        showBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        showBtn.setText("Show all");
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Search"));

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        jLabel7.setText("Room No.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchRoomField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(searchBtn))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(searchRoomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        refreshBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roomField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roomTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roomRateField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBtn))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(preBtn)
                                    .addComponent(lastBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(showBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(bedTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(roomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(roomTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(roomRateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(createBtn)
                        .addGap(6, 6, 6)
                        .addComponent(editBtn)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteBtn)
                            .addComponent(showBtn)
                            .addComponent(refreshBtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(firstBtn)
                        .addGap(6, 6, 6)
                        .addComponent(nextBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(preBtn)
                        .addGap(6, 6, 6)
                        .addComponent(lastBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(bedTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(742, 388));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void initServices() {
        try {
            this.mySQLService = MySQLService.getInstance();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void onInit() {
        this.getContentPane().setBackground(new java.awt.Color(153, 255, 153));
        try {
            this.mysqlConnection = this.mySQLService.getConnection();
            final String query = "SELECT * FROM roomdetail ORDER BY room_no;";
            final Statement smt = this.mysqlConnection.createStatement();
            System.out.println(query);
            this.resultSet = smt.executeQuery(query);
            this.resultSet.next();
            this.displayRecord();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // FETCH THE VALUES FROM DATABASE TO TEXT FIELDS AND TEXT AREA
    private void displayRecord() {
        try {
            this.roomField.setText(this.resultSet.getString(1));
            if (this.resultSet.getString(2).equals("AC")) {
                this.roomTypeField.setSelectedIndex(0);
            } else if (this.resultSet.getString(2).equals("Non AC")) {
                this.roomTypeField.setSelectedIndex(1);
            }
            this.roomRateField.setText(Integer.toString(this.resultSet.getInt(3)));
            if (this.resultSet.getString(4).equals("Single")) {
                this.bedTypeField.setSelectedIndex(0);
            } else if (this.resultSet.getString(4).equals("Double")) {
                this.bedTypeField.setSelectedIndex(1);
            }

        } catch (SQLException ec) {
        }
    }

    // GET THE VALUES FROM TEXT FIELDS AND AREA
    private void fetchFromTextF() {
        this.rno = this.roomField.getText();
        this.rtype = (String) this.roomTypeField.getSelectedItem();
        this.rrate = this.roomRateField.getText();
        this.rbed = (String) this.bedTypeField.getSelectedItem();
    }

    // DISABLE TEXT FIELDS AND AREA
    private void disableTextF() {
        this.roomField.setEditable(false);
        this.roomTypeField.setEnabled(false);
        this.roomRateField.setEditable(false);
        this.bedTypeField.setEnabled(false);
    }

    // CLEAR TEXT FIELDS AND AREA
    private void clearTextF() {
        try {
            this.roomField.setText(null);
            this.roomRateField.setText(null);
        } catch (Exception ec) {
        }
    }

    // ENABLE TEXT FIELDS AND AREA
    private void enableTextF() {
        this.roomField.setEditable(true);
        this.roomTypeField.setEnabled(true);
        this.roomRateField.setEditable(true);
        this.bedTypeField.setEnabled(true);
    }

    private void refresh() {
        try {
            final String query = "SELECT * FROM roomdetail ORDER BY room_no;";
            final Statement smt = this.mysqlConnection.createStatement();
            System.out.println(query);
            this.resultSet = smt.executeQuery(query);
            this.resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private boolean noblankTF() {
        return !(this.roomField.getText().isEmpty()
                || this.roomRateField.getText().isEmpty());
    }

    // MOVE ON FIRST ROOM
    private void firstBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstBtnActionPerformed
        try {
            this.resultSet.first();
            this.displayRecord();
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_firstBtnActionPerformed
    // MOVE ON NEXT ROOM
    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        try {
            if (this.resultSet.isLast()) {
                this.resultSet.first();
            } else {
                this.resultSet.next();
            }
            this.displayRecord();
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_nextBtnActionPerformed
    // MOVE ON LAST ROOM
    private void lastBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastBtnActionPerformed
        try {
            this.resultSet.last();
            this.displayRecord();
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_lastBtnActionPerformed
    // MOVE ON PREVIOUS ROOM
    private void preBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preBtnActionPerformed
        try {
            if (this.resultSet.isFirst()) {
                this.resultSet.last();
            } else {
                this.resultSet.previous();
            }
            this.displayRecord();
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_preBtnActionPerformed
    // ADD NEW ROOM
    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        final String action = evt.getActionCommand();
        this.enableTextF();
        try {
            if (action.equals("Save")) {
                this.fetchFromTextF();
                final String message = "Information of Room No." + rno + " will be added in database.";
                int code = JOptionPane.showConfirmDialog(
                        this,
                        message,
                        "Confirmation",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.INFORMATION_MESSAGE
                );
                if (code == JOptionPane.YES_OPTION) {
                    if (this.noblankTF()) {
                        final String insertquery = "insert into roomdetail"
                                + "(room_no,room_type,room_rate,room_bed) values"
                                + "('" + rno + "','" + rtype + "'," + rrate + ",'" + rbed + "');";
                        final Statement smt = this.mysqlConnection.createStatement();
                        System.out.println(insertquery);
                        final int success = smt.executeUpdate(insertquery);
                        if (success > 0) {
                            JOptionPane.showMessageDialog(this, "Record Saved");
                            this.createBtn.setText("New");
                            this.refresh();
                            this.disableTextF();
                        } else {
                            JOptionPane.showMessageDialog(this, "Problem in Saving. Retry");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Fill all Fields");
                    }
                } else if (code == JOptionPane.NO_OPTION) {
                    this.createBtn.setText("New");
                    this.displayRecord();
                }
            } else if (action.equals("New")) {
                this.clearTextF();
                this.createBtn.setText("Save");
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_createBtnActionPerformed
    // EDIT AND UPDATE EXISTING ROOM
    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        final String action = evt.getActionCommand();
        this.enableTextF();
        this.roomField.setEnabled(false);
        try {
            if (action.equals("Update")) {
                this.fetchFromTextF();
                final String message = "Information of Room No." + rno + " will change in database.";
                final int code = JOptionPane.showConfirmDialog(
                        this,
                        message, "Confirmation",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.INFORMATION_MESSAGE
                );
                if (code == JOptionPane.YES_OPTION) {
                    if (this.noblankTF()) {
                        String updatequery = "update roomdetail set "
                                + "room_type='" + rtype + "',"
                                + "room_rate=" + rrate + ","
                                + "room_bed='" + rbed + "' "
                                + "WHERE ROOM_no ='" + rno + "';";
                        final Statement smt = this.mysqlConnection.createStatement();
                        System.out.println(updatequery);
                        int success = smt.executeUpdate(updatequery);
                        if (success > 0) {
                            JOptionPane.showMessageDialog(this, "Record Modified");
                            this.editBtn.setText("Edit");
                            this.refresh();
                            this.disableTextF();
                        } else {
                            JOptionPane.showMessageDialog(this, "Problem in mofifying. Retry");
                        }
                    }
                } else if (code == JOptionPane.NO_OPTION) {
                    this.editBtn.setText("Edit");
                    this.refresh();
                    this.displayRecord();
                }
            } else if (action.equals("Edit")) {
                JOptionPane.showMessageDialog(this, "You are about to change the existing information of current selected room");
                this.editBtn.setText("Update");
            }
        } catch (HeadlessException | SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_editBtnActionPerformed
    // DELETE EXISTING ROOM
    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        final String action = evt.getActionCommand();
        try {
            if (action.equals("Confirm")) {
                this.fetchFromTextF();
                final String msg = "Room No" + rno + " will be deleted from database.";
                final int code = JOptionPane.showConfirmDialog(
                        this,
                        msg,
                        "Confirmation",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.INFORMATION_MESSAGE
                );
                if (code == JOptionPane.YES_OPTION) {
                    final String updatequery = "DELETE from roomdetail where room_no like '" + rno + "';";
                    final Statement smt = this.mysqlConnection.createStatement();
                    System.out.println(updatequery);
                    final int success = smt.executeUpdate(updatequery);
                    if (success > 0) {
                        JOptionPane.showMessageDialog(this, "Record Deleted");
                        this.deleteBtn.setText("Delete");
                    } else {
                        JOptionPane.showMessageDialog(this, "Problem in deletion. Retry");
                    }
                } else if (code == JOptionPane.NO_OPTION) {
                    this.deleteBtn.setText("Delete");
                }

            } else if (action.equals("Delete")) {
                JOptionPane.showMessageDialog(this, "Your confirmation will delete the record of current selected room");
                this.deleteBtn.setText("Confirm");
            }
        } catch (HeadlessException | SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void changePanelBorder(String title) {
        this.jPanel1.setBorder(
                javax.swing.BorderFactory.createTitledBorder(
                        javax.swing.BorderFactory.createBevelBorder(
                                javax.swing.border.BevelBorder.RAISED
                        ),
                        title,
                        javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                        javax.swing.border.TitledBorder.DEFAULT_POSITION,
                        new java.awt.Font("Arial", 1, 14)
                )
        );
    }

    // SEARCH ROOM NO
    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        this.disableTextF();
        final String srno = this.searchRoomField.getText();
        if (srno.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter Room No. you want to search");
        } else {
            try {
                final String query = "SELECT * FROM roomdetail where room_no LIKE '" + srno + "';";
                final Statement smt = this.mysqlConnection.createStatement();
                System.out.println(query);
                this.resultSet = smt.executeQuery(query);
                if (this.resultSet.next()) {
                    this.displayRecord();
                    this.changePanelBorder("Room Management Form of Room no. " + searchRoomField.getText() + " .");
                } else {
                    JOptionPane.showMessageDialog(this, "Not Avialable");
                }
            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void roomFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_roomFieldCaretUpdate
        if ("Save".equals(this.createBtn.getText())) {
            try {
                final String query = "SELECT * FROM roomdetail where room_no like '" + this.roomField.getText() + "';";
                final Statement smt1 = this.mysqlConnection.createStatement();
                System.out.println(query);
                this.rs2 = smt1.executeQuery(query);
                if (this.rs2.next()) {
                    this.jLabel6.setText("Room No. already used, Give another Room No.");
                    this.createBtn.setEnabled(false);
                } else {
                    this.createBtn.setEnabled(true);
                    this.jLabel6.setText("");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_roomFieldCaretUpdate

    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
        this.changePanelBorder("Room Management Form");
        this.refresh();
        this.displayRecord();
    }//GEN-LAST:event_showBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        this.changePanelBorder("Room Management Form");
        this.refresh();
        this.displayRecord();
    }//GEN-LAST:event_refreshBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox bedTypeField;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton firstBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton lastBtn;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton preBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JTextField roomField;
    private javax.swing.JTextField roomRateField;
    private javax.swing.JComboBox roomTypeField;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchRoomField;
    private javax.swing.JButton showBtn;
    // End of variables declaration//GEN-END:variables
}
