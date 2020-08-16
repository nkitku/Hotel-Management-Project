package pages;

import java.awt.HeadlessException;
import java.sql.*;
import java.util.Arrays;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;
import services.MySQLService;

public class StaffMgmtPage extends javax.swing.JFrame {

    private Connection mysqlConnection;
    private MySQLService mySQLService;
    private ResultSet resultSet, rs1, rs2;
    private String sid, spass, spass1, sfname, slname, sdesig, sadd, snum;
    private List<JTextComponent> textFields;
    private List<JComponent> textFields2;

    public StaffMgmtPage() {
        this.initComponents();
        this.initServices();
        this.onInit();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        createBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        firstBtn = new javax.swing.JButton();
        preBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        lastBtn = new javax.swing.JButton();
        userIdField = new javax.swing.JTextField();
        pwdField = new javax.swing.JTextField();
        confPwdField = new javax.swing.JTextField();
        designationField = new javax.swing.JTextField();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressField = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        contactField = new javax.swing.JTextField();
        searchUserIdField = new javax.swing.JTextField();
        searchFNameField = new javax.swing.JTextField();
        searchLNameField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        closeBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Staff Managemetnt");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Staff Management Form", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

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

        searchBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Enter User ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Enter Password");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Re Enter Password");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Enter First Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Enter Last Name");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Enter Contact No.");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Enter Address");

        firstBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        firstBtn.setText("First <<");
        firstBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstBtnActionPerformed(evt);
            }
        });

        preBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        preBtn.setText("Previous <");
        preBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preBtnActionPerformed(evt);
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

        userIdField.setEditable(false);
        userIdField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        userIdField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                userIdFieldCaretUpdate(evt);
            }
        });

        pwdField.setEditable(false);
        pwdField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        confPwdField.setEditable(false);
        confPwdField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        designationField.setEditable(false);
        designationField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        firstNameField.setEditable(false);
        firstNameField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lastNameField.setEditable(false);
        lastNameField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        addressField.setEditable(false);
        addressField.setColumns(20);
        addressField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addressField.setRows(5);
        jScrollPane1.setViewportView(addressField);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Enter Designation");

        contactField.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Search Specific Staff by his/ her");

        jLabel11.setText("User ID");

        jLabel12.setText("First Name");

        jLabel13.setText("Last Name");

        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(47, 47, 47)
                        .addComponent(userIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(firstBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(preBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(36, 36, 36)
                        .addComponent(pwdField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lastBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(confPwdField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(24, 24, 24)
                        .addComponent(designationField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(deleteBtn)
                        .addGap(32, 32, 32)
                        .addComponent(searchBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(30, 30, 30)
                        .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(30, 30, 30)
                        .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(21, 21, 21)
                        .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel11)
                        .addGap(25, 25, 25)
                        .addComponent(searchUserIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel13)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchFNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchLNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(closeBtn)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(userIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(firstBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(preBtn)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(pwdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nextBtn)
                    .addComponent(lastBtn))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(confPwdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(createBtn)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(editBtn)))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(designationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deleteBtn)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(searchBtn)))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel11))
                    .addComponent(searchUserIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel12)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(searchFNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(searchLNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(closeBtn))))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/top-aboutus.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(494, 494, 494))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(740, 606));
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
            this.textFields = Arrays.asList(new JTextComponent[]{
                this.userIdField, this.pwdField, this.confPwdField,
                this.designationField, this.firstNameField, this.lastNameField,
                this.contactField, this.addressField
            });
            this.textFields2 = Arrays.asList(new JComponent[]{
                this.createBtn, this.editBtn, this.deleteBtn, this.searchBtn,
                this.firstBtn, this.preBtn, this.nextBtn, this.lastBtn,
                this.searchUserIdField, this.searchFNameField, this.searchLNameField
            });
            this.mysqlConnection = this.mySQLService.getConnection();
            this.refreshdata();
            this.displayRecord();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    // FETCH THE VALUES FROM DATABASE TO TEXT FIELDS AND TEXT AREA
    private void displayRecord() {
        try {
            if (this.resultSet.getRow() < 1) {
                return;
            }
            final int[] order = {1, 2, 2, 3, 4, 5, 7, 6};
            int i = 0;
            for (JTextComponent field : this.textFields) {
                field.setText(resultSet.getString(order[i++]));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //ENABLE TEXT FIELDS AND AREA
    private void enableTextF() {
        this.textFields.forEach(v -> {
            v.setEditable(true);
        });
    }

    //ENABLE BUTTONS AND SEARCH AREA
    private void enableTextF2() {
        this.textFields2.forEach(v -> {
            v.setEnabled(true);
        });
    }

    // DISABLE TEXT FIELDS AND AREA
    private void disableTextF() {
        this.textFields.forEach(v -> {
            v.setEditable(false);
        });
    }

    // DISABLE BUTTONS AND SEARCH AREA
    private void disableTextF2() {
        this.textFields2.forEach(v -> {
            v.setEnabled(false);
        });
    }

    // CLEAR TEXT FIELDS AND AREA
    private void clearTextF() {
        this.textFields.forEach(v -> {
            v.setText(null);
        });
    }

    // GET THE VALUES FROM TEXT FIELDS AND AREA
    private void fetchFromTextF() {
        this.sid = userIdField.getText();
        this.spass = pwdField.getText();
        this.spass1 = confPwdField.getText();
        this.sdesig = designationField.getText();
        this.sfname = firstNameField.getText();
        this.slname = lastNameField.getText();
        this.snum = contactField.getText();
        this.sadd = addressField.getText();
    }

    //REFRESH THE DATABASE
    private void refreshdata() {
        try {
            final String query = "SELECT userid, password, staff_desig, staff_first_name, staff_last_name, staff_address, staff_contact "
                    + "FROM login "
                    + "ORDER BY userid;";
            final Statement smt = mysqlConnection.createStatement();
            this.resultSet = smt.executeQuery(query);
            System.out.println(query);
            this.resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private boolean isFieldsEmpty() {
        return this.textFields.stream().anyMatch(v -> v.getText().isEmpty());
    }

    //EDIT STAFF RECORD
    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        final String action = evt.getActionCommand();
        this.enableTextF();
        this.userIdField.setEnabled(false);
        try {
            if (action.equals("Update")) {
                this.fetchFromTextF();
                final String message = "Information of " + sfname + " will change in database.";
                final int code = JOptionPane.showConfirmDialog(
                        this,
                        message,
                        "Confirmation",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.INFORMATION_MESSAGE
                );
                if (code == JOptionPane.YES_OPTION) {
                    if (this.isFieldsEmpty()) {
                        JOptionPane.showMessageDialog(this, "Fill all fields for save");
                    } else if (!spass.equals(spass1)) {
                        JOptionPane.showMessageDialog(this, "Re-entered password is not same");
                    } else {
                        final String updatequery = "update login set "
                                + "password='" + spass + "',"
                                + "staff_desig='" + sdesig + "',"
                                + "staff_first_name='" + sfname + "',"
                                + "staff_last_name='" + slname + "',"
                                + "staff_address='" + sadd + "',"
                                + "staff_contact='" + snum + "' "
                                + "where userid = '" + sid + "';";
                        final Statement smt = mysqlConnection.createStatement();
                        final int success = smt.executeUpdate(updatequery);
                        System.out.println(updatequery);
                        if (success > 0) {
                            JOptionPane.showMessageDialog(this, "Record Modified!!");
                            this.editBtn.setText("Edit");
                        } else {
                            JOptionPane.showMessageDialog(this, "Problem in mofifying. Retry/Fill all FIELDS");
                        }
                    }
                } else if (code == JOptionPane.NO_OPTION) {
                    this.disableTextF();
                    this.enableTextF2();
                    this.editBtn.setText("Edit");
                    try {
                        final String query = "SELECT * FROM LOGIN WHERE USERID = '" + this.userIdField.getText() + "';";
                        final Statement smt2 = this.mysqlConnection.createStatement();
                        this.rs2 = smt2.executeQuery(query);
                        System.out.println(query);
                        this.rs2.next();
                        this.displayRecord();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                this.refreshdata();
            } else if (action.equals("Edit")) {
                JOptionPane.showMessageDialog(this, "You are about to change the existing information of current selected staff");
                this.disableTextF2();
                this.editBtn.setEnabled(true);
                this.editBtn.setText("Update");
            }
        } catch (HeadlessException | SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_editBtnActionPerformed
    //SEARCH STAFF RECORD
    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        this.disableTextF();
        final String userId = this.searchUserIdField.getText();
        final String firstName = this.searchFNameField.getText();
        final String lastName = this.searchLNameField.getText();

        if (userId.isEmpty() && firstName.isEmpty() && lastName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill at least one field for search");
        } else {
            String q = "SELECT *FROM LOGIN WHERE (1=1)";
            if (!userId.isEmpty()) {
                q = q + " AND userid='" + userId + "'";
            }
            if (!firstName.isEmpty()) {
                q = q + " AND SATFFFNAME='" + firstName + "'";
            }
            if (!lastName.isEmpty()) {
                q = q + " AND staff_last_name='" + lastName + "'";
            }
            q = q + " order by staff_first_name;";
            try {
                final Statement smt = this.mysqlConnection.createStatement();
                System.out.println(q);
                this.resultSet = smt.executeQuery(q);
                System.out.println(q);
                this.resultSet.next();
                this.displayRecord();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed
    //MOVE ON LAST RECORD
    private void lastBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastBtnActionPerformed
        try {
            this.resultSet.last();
            this.displayRecord();
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_lastBtnActionPerformed
    //MOVE ON PREVIOUS RECORD
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
    //MOVE ON FIRST RECORD
    private void firstBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstBtnActionPerformed
        try {
            this.resultSet.first();
            this.displayRecord();
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_firstBtnActionPerformed
    //MOVE ON NEXT RECORD
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
    //TOOL TIPS SETTING
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.userIdField.setToolTipText("This is an Unique ID");
        this.confPwdField.setToolTipText("Re Enter the same Password");
        this.searchBtn.setToolTipText("First fill any field for searching");
        this.searchUserIdField.setToolTipText("User ID is case sensitive");
        this.searchFNameField.setToolTipText("First Name is case sensitive");
        this.searchLNameField.setToolTipText("Last Name is case sensitive");
        this.deleteBtn.setToolTipText("Current Selected Staff Record will be DELETED");
        this.closeBtn.setToolTipText("Close Window");
    }//GEN-LAST:event_formWindowOpened
    //ADD RECORD OF STAFF
    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        final String action = evt.getActionCommand();
        this.enableTextF();
        try {
            if (action.equals("Save")) {
                this.fetchFromTextF();
                final String msg = "Information of " + this.sfname + " will be added in database.";
                final int code = JOptionPane.showConfirmDialog(this,
                        msg,
                        "Confirmation",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.INFORMATION_MESSAGE
                );
                if (code == JOptionPane.YES_OPTION) {
                    if (this.isFieldsEmpty()) {
                        JOptionPane.showMessageDialog(this, "Fill all fields for save");
                    } else if (this.spass.equals(this.spass1) == false) {
                        JOptionPane.showMessageDialog(this, "Re-entered password is not same");
                    } else {
                        final String insertquery = "insert into login"
                                + "(userid, password, staff_desig, staff_first_name, staff_last_name, staff_address, staff_contact) values "
                                + "(?, ?, ?, ?, ?, ?, ?);";
                        final PreparedStatement smt = this.mysqlConnection.prepareStatement(insertquery);
                        smt.setString(1, this.sid);
                        smt.setString(2, this.spass);
                        smt.setString(3, this.sdesig);
                        smt.setString(4, this.sfname);
                        smt.setString(5, this.slname);
                        smt.setString(6, this.sadd);
                        smt.setString(7, this.snum);
                        final int success = smt.executeUpdate();
                        System.out.println(smt);
                        if (success > 0) {
                            JOptionPane.showMessageDialog(this, "Record Saved");
                            this.createBtn.setText("New");
                            this.disableTextF();
                            this.confPwdField.setText("");
                        } else {
                            JOptionPane.showMessageDialog(this, "Problem in Saving. Retry/Fill all FIELDS");
                        }
                    }
                } else if (code == JOptionPane.NO_OPTION) {
                    this.createBtn.setText("New");
                    this.clearTextF();
                    this.refreshdata();
                    this.displayRecord();
                    this.disableTextF();
                    this.enableTextF2();
                }
                this.refreshdata();

            } else if (action.equals("New")) {
                this.clearTextF();
                this.disableTextF2();
                this.createBtn.setEnabled(true);
                this.createBtn.setText("Save");
            }
        } catch (HeadlessException | SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_createBtnActionPerformed
    //DELETE RECORD OF STAFF
    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        final String action = evt.getActionCommand();
        try {
            if (action.equals("Confirm")) {
                fetchFromTextF();
                final String msg = "Information of " + this.sfname + " will be deleted from database.";
                final int code = JOptionPane.showConfirmDialog(
                        this,
                        msg,
                        "Confirmation",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.INFORMATION_MESSAGE
                );
                if (code == JOptionPane.YES_OPTION) {
                    final String updatequery = "DELETE from login where userid = '" + sid + "';";
                    final Statement smt = this.mysqlConnection.createStatement();
                    final int success = smt.executeUpdate(updatequery);
                    System.out.println(updatequery);
                    if (success > 0) {
                        JOptionPane.showMessageDialog(this, "Record Deleted");
                        this.deleteBtn.setText("Delete");
                        this.clearTextF();
                    } else {
                        JOptionPane.showMessageDialog(this, "Problem in deletion. Retry");
                    }
                    this.refreshdata();
                } else if (code == JOptionPane.NO_OPTION) {
                    this.deleteBtn.setText("Delete");
                }
            } else if (action.equals("Delete")) {
                JOptionPane.showMessageDialog(this, "Your confirmation will delete the record of current selected staff");
                this.deleteBtn.setText("Confirm");
            }
        } catch (HeadlessException | SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_deleteBtnActionPerformed
    //CLOSE BUTTON
    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    private String lastUserIdEntered = "";
    private void userIdFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_userIdFieldCaretUpdate
        final String action = this.createBtn.getText();
        if ("Save".equals(action) || "Cancel".equals(action)) {
            final String userId = this.userIdField.getText();
            if (userId.isEmpty() || this.lastUserIdEntered.equals(userId)) {
                return;
            }
            this.lastUserIdEntered = userId;
            try {
                final String q = "SELECT * FROM LOGIN WHERE USERID ='" + userId + "'";
                final Statement smt1 = mysqlConnection.createStatement();
                this.rs1 = smt1.executeQuery(q);
                System.out.println(q);

                if (this.rs1.next()) {
                    this.createBtn.setEnabled(false);
                    this.jLabel14.setForeground(new java.awt.Color(153, 0, 0));
                    this.jLabel14.setText("THIS USERID ALREADY USED. Try another");
                } else {
                    this.createBtn.setEnabled(true);
                    this.jLabel14.setText("");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_userIdFieldCaretUpdate

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressField;
    private javax.swing.JButton closeBtn;
    private javax.swing.JTextField confPwdField;
    private javax.swing.JTextField contactField;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField designationField;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton firstBtn;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lastBtn;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton preBtn;
    private javax.swing.JTextField pwdField;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchFNameField;
    private javax.swing.JTextField searchLNameField;
    private javax.swing.JTextField searchUserIdField;
    private javax.swing.JTextField userIdField;
    // End of variables declaration//GEN-END:variables
}
