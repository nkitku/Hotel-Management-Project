package pages;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import services.MySQLService;

public class LoginPage extends javax.swing.JFrame {

    private Connection mysqlConnection;
    private MySQLService mySQLService;
    private ResultSet resultSet;
    private final Border bor = new TitledBorder(null, "Check", 2, 0);

    public LoginPage() {
        this.initComponents();
        this.initService();
        this.onInit();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userIdField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel Room Booking System");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/top-aboutus.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(218, 138, 138)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
        jLabel3.setText("<html><font face=\"Californian FB\" size=\"5\">User Name</font></html>");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
        jLabel4.setText("<html><font face=\"Californian FB\" size=\"5\">Password</font></html>");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));
        jPanel1.add(userIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 190, -1));
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 190, -1));

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 90, -1));

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 90, -1));

        jButton3.setBackground(new java.awt.Color(102, 51, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/login.jpg"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 26, 120, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/Hotel_reception.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 650, 210));

        setSize(new java.awt.Dimension(733, 418));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void initService() {
        try {
            this.mySQLService = MySQLService.getInstance();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void onInit() {
        this.getContentPane().setBackground(new java.awt.Color(153, 255, 153));
        try {
            this.jPanel1.setBorder(this.bor);
            this.mysqlConnection = this.mySQLService.getConnection();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.jButton3.setVisible(false);
        this.jPanel1.setVisible(true);
        this.jLabel3.setVisible(true);
        this.jLabel4.setVisible(true);
        this.userIdField.setVisible(true);
        this.passwordField.setVisible(true);
        this.loginBtn.setVisible(true);
        this.cancelBtn.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.jPanel1.setOpaque(true);
        this.jPanel2.setOpaque(true);
        this.jLabel3.setVisible(false);
        this.jLabel4.setVisible(false);
        this.userIdField.setVisible(false);
        this.passwordField.setVisible(false);
        this.loginBtn.setVisible(false);
        this.cancelBtn.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        try {
            final String userId = this.userIdField.getText();
            final String password = new String(this.passwordField.getPassword());
            final String sql = "select * from users where (`username` = ? and `password` = ?);";
            final PreparedStatement smt = this.mysqlConnection.prepareStatement(sql);
            smt.setString(1, userId);
            smt.setString(2, password);
            System.out.println(smt.toString().substring(smt.toString().indexOf(':') + 2));
            this.resultSet = smt.executeQuery();
            this.resultSet.next();
            boolean isUserVerified = (this.resultSet.getRow() > 0
                    && userId.equals(this.resultSet.getString(1))
                    && password.equals(this.resultSet.getString(2)));
            if (isUserVerified) {
                this.jLabel3.setEnabled(false);
                this.jLabel4.setEnabled(false);
                this.userIdField.setEnabled(false);
                this.passwordField.setEnabled(false);
                this.loginBtn.setEnabled(false);
                this.cancelBtn.setEnabled(false);
                new NavigationPage().setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Please check user name / password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (HeadlessException | SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.jLabel3.setVisible(false);
        this.jLabel4.setVisible(false);
        this.userIdField.setVisible(false);
        this.passwordField.setVisible(false);
        this.loginBtn.setVisible(false);
        this.cancelBtn.setVisible(false);
        this.jButton3.setVisible(true);
    }//GEN-LAST:event_cancelBtnActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        {
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Windows".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(LoginPage.class.getName())
                        .log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
        java.awt.EventQueue.invokeLater(() -> {
            new LoginPage().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userIdField;
    // End of variables declaration//GEN-END:variables
}
