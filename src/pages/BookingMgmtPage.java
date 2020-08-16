package pages;

import java.awt.HeadlessException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

import services.MySQLService;

public class BookingMgmtPage extends javax.swing.JFrame {

    private Connection mysqlConnection;
    private MySQLService mySQLService;
    private Statement mysqlStatement;
    private ResultSet resultSet;
    private SimpleDateFormat sdf, sdf1;

    private List< javax.swing.JTextField> textFields;

    public BookingMgmtPage() {
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bookinIdField = new javax.swing.JTextField();
        roomNoField = new javax.swing.JTextField();
        custNoField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        arrivalField = new javax.swing.JTextField();
        departureField = new javax.swing.JTextField();
        firstBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        lastBtn = new javax.swing.JButton();
        preBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        cancelBookingBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/top-aboutus.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Booked Room Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Book ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Room No.");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Visitor No.");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Visitor Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Booked From");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Booked To");

        bookinIdField.setEditable(false);
        bookinIdField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        roomNoField.setEditable(false);
        roomNoField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        custNoField.setEditable(false);
        custNoField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        nameField.setEditable(false);
        nameField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        arrivalField.setEditable(false);
        arrivalField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        departureField.setEditable(false);
        departureField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

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

        editBtn.setText("Modify Booking Info");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        cancelBookingBtn.setText("Cancel Booking");
        cancelBookingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBookingBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(custNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(roomNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bookinIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(firstBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(preBtn))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lastBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cancelBookingBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(editBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(arrivalField, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(departureField))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(bookinIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(roomNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(custNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstBtn)
                            .addComponent(preBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nextBtn)
                            .addComponent(lastBtn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(arrivalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBookingBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(departureField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(740, 507));
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
            this.sdf = new SimpleDateFormat("dd/MM/yyyy");
            this.sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            this.mysqlConnection = this.mySQLService.getConnection();
            String query = "select booking.book_id, room_no, visitor_no, visitor_name, arrival, departure "
                    + "from visitors, booking "
                    + "where (visitors.book_id = booking.book_id) "
                    + "order by visitor_no;";
            this.mysqlStatement = this.mysqlConnection.createStatement();
            System.out.println(query);
            this.resultSet = this.mysqlStatement.executeQuery(query);
            this.resultSet.next();
            final int totalRows = this.resultSet.getRow();
            if (totalRows > 0) {
                this.displayRecord();
            }
            this.textFields = Arrays.asList(new javax.swing.JTextField[]{
                this.bookinIdField,
                this.roomNoField,
                this.custNoField,
                this.nameField,
                this.arrivalField,
                this.departureField
            });

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private void displayRecord() {
        try {
            if (this.resultSet.getRow() < 1) {
                return;
            }
            this.bookinIdField.setText(this.resultSet.getString(1));
            this.roomNoField.setText(this.resultSet.getString(2));
            this.custNoField.setText(Integer.toString(this.resultSet.getInt(3)));
            this.nameField.setText(this.resultSet.getString(4));
            this.arrivalField.setText("" + this.sdf.format(this.sdf1.parse(this.resultSet.getString(5))));
            this.departureField.setText("" + this.sdf.format(this.sdf1.parse(this.resultSet.getString(6))));
        } catch (SQLException | ParseException ec) {
            ec.printStackTrace();
        }
    }

    private void clearTextF() {
        this.textFields.forEach(v -> {
            v.setText("");
        });
    }

    private void disableTextF() {
        this.textFields.forEach(v -> {
            v.setEnabled(false);
        });
    }

    private void enableTextF() {
        this.textFields.forEach(v -> {
            v.setEnabled(true);
        });
    }

    private void refreshdata() {
        try {
            String query = "select booking.book_id, room_no, visitor_no, visitor_name, arrival, departure "
                    + "from visitors, booking "
                    + "where (visitors.book_id = booking.book_id) "
                    + "order by visitor_no;";
            this.mysqlStatement = mysqlConnection.createStatement();
            System.out.println(query);
            this.resultSet = mysqlStatement.executeQuery(query);
            this.resultSet.next();
            this.displayRecord();

        } catch (SQLException ec) {
            JOptionPane.showMessageDialog(this, ec);
        }
    }

    private void firstBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstBtnActionPerformed
        try {
            this.resultSet.first();
            if (this.resultSet.isFirst()) {
                this.resultSet.first();
            }
            displayRecord();
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_firstBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        try {
            if (this.resultSet.isLast()) {
                this.resultSet.first();
            } else {
                this.resultSet.next();
            }
            this.displayRecord();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_nextBtnActionPerformed

    private void lastBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastBtnActionPerformed
        try {
            this.resultSet.last();
            this.displayRecord();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_lastBtnActionPerformed

    private void preBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preBtnActionPerformed
        try {
            if (this.resultSet.isFirst()) {
                this.resultSet.last();
            } else {
                this.resultSet.previous();
            }
            this.displayRecord();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_preBtnActionPerformed

    private void cancelBookingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBookingBtnActionPerformed
        try {
            if (evt.getActionCommand().equals("Confirm")) {
                String message = "Booking of " + this.nameField.getText() + " will be Canceled from database.";
                int code = JOptionPane.showConfirmDialog(
                        this,
                        message,
                        "Confirmation",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.INFORMATION_MESSAGE
                );
                if (code == JOptionPane.YES_OPTION) {
                    String updatequery = "DELETE FROM visitors WHERE BOOK_ID=" + this.bookinIdField.getText() + ";";
                    Statement statement = this.mysqlConnection.createStatement();
                    System.out.println(updatequery);
                    statement.executeUpdate(updatequery);
                    updatequery = "DELETE FROM booking WHERE BOOK_ID=" + this.bookinIdField.getText() + ";";
                    statement = this.mysqlConnection.createStatement();
                    System.out.println(updatequery);
                    int success = statement.executeUpdate(updatequery);
                    if (success > 0) {
                        JOptionPane.showMessageDialog(this, "Record Deleted");
                        this.cancelBookingBtn.setText("Cancel Booking");
                        clearTextF();
                    } else {
                        JOptionPane.showMessageDialog(this, "Problem in Canceling. Retry");
                    }
                    refreshdata();
                } else if (code == JOptionPane.NO_OPTION) {
                    this.cancelBookingBtn.setText("Cancel Booking");
                }
            } else if (evt.getActionCommand().equals("Cancel Booking")) {
                JOptionPane.showMessageDialog(this, "Your confirmation will cancel the booking of current selected customer");
                this.cancelBookingBtn.setText("Confirm");
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_cancelBookingBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed

    }//GEN-LAST:event_editBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arrivalField;
    private javax.swing.JTextField bookinIdField;
    private javax.swing.JButton cancelBookingBtn;
    private javax.swing.JTextField custNoField;
    private javax.swing.JTextField departureField;
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
    private javax.swing.JButton lastBtn;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton preBtn;
    private javax.swing.JTextField roomNoField;
    // End of variables declaration//GEN-END:variables
}
