package pages;

import java.awt.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import services.MySQLService;

public class BookRoomPage extends javax.swing.JFrame {

    private Connection mysqlConnection;
    private MySQLService mySQLService;
    private ResultSet rs;
    private String roomno, bed, roomt, rate, strdtver1, strdtver2;
    private String cname, cadd, ccity, cstat, ccoun, cph, cproof;
    private String cadult, cchild, cmars, cidno, cnation, cpur, cbill;
    private String diffd;
    private double amount;
    private String bookid;
    private String dt1, dt2;
    private Calendar calendarService;

    public BookRoomPage(Object o1, Object o2, Object o3, Object o4, Date o5, Date o6, String diff) {
        this.initComponents();
        this.initServices();
        this.onInit(o1, o2, o3, o4, o5, o6, diff);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        prpse = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        adult = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        add = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        coun = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        nation = new javax.swing.JTextField();
        state = new javax.swing.JTextField();
        marat = new javax.swing.JTextField();
        proof = new javax.swing.JTextField();
        proofno = new javax.swing.JTextField();
        purpose = new javax.swing.JTextField();
        child = new javax.swing.JTextField();
        adults = new javax.swing.JTextField();
        day = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tax = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        amt = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rno = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        rt = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        bt = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        co = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        ta = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        ci = new javax.swing.JLabel();
        bookbtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Room Booking");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/top-aboutus.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setForeground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Adress");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("City");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("State");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Country");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Contact No.");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Nationality");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Maritial State");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("ID Proof");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("ID No.");

        prpse.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        prpse.setText("Purpose");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("No. of Child");

        adult.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        adult.setText("No. of Adults");

        day.setDisabledTextColor(new java.awt.Color(0, 51, 51));
        day.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Day(s)");

        tax.setDisabledTextColor(new java.awt.Color(0, 51, 51));
        tax.setEnabled(false);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("TAX(12%)");

        amt.setDisabledTextColor(new java.awt.Color(0, 51, 51));
        amt.setEnabled(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Amount");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marat, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(nation, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coun, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(phone, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(prpse)
                    .addComponent(jLabel14)
                    .addComponent(adult)
                    .addComponent(jLabel16)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proof, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tax, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proofno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purpose, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(child, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adults, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {adult, jLabel1, jLabel10, jLabel11, jLabel12, jLabel14, jLabel16, jLabel17, jLabel18, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, prpse});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {add, adults, amt, child, city, coun, day, marat, name, nation, phone, proof, proofno, purpose, state, tax});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(proof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(proofno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prpse)
                    .addComponent(purpose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(child, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(coun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adult)
                    .addComponent(adults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(nation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(tax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(marat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(amt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {adult, jLabel1, jLabel10, jLabel11, jLabel12, jLabel14, jLabel16, jLabel17, jLabel18, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, prpse});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {add, adults, amt, child, city, coun, day, marat, name, nation, phone, proof, proofno, purpose, state, tax});

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Room No.");

        rno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rno.setForeground(new java.awt.Color(204, 255, 204));
        rno.setText("Room No.");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Room Type");

        rt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rt.setForeground(new java.awt.Color(204, 255, 204));
        rt.setText("Room Type");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Bed Type");

        bt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt.setForeground(new java.awt.Color(204, 255, 204));
        bt.setText("Bed Type");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Check Out");

        co.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        co.setForeground(new java.awt.Color(204, 255, 204));
        co.setText("Bed Type");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Tariff");

        ta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ta.setForeground(new java.awt.Color(204, 255, 204));
        ta.setText("Room No.");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Check In");

        ci.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ci.setForeground(new java.awt.Color(204, 255, 204));
        ci.setText("Room Type");

        bookbtn.setText("Book Room");
        bookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookbtnActionPerformed(evt);
            }
        });

        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel25))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rno)
                    .addComponent(ta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rt)
                    .addComponent(ci, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt)
                    .addComponent(co, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bookbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bookbtn, cancelbtn});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel21)
                    .addComponent(bt)
                    .addComponent(jLabel13)
                    .addComponent(rno)
                    .addComponent(jLabel19)
                    .addComponent(rt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel23)
                    .addComponent(co)
                    .addComponent(jLabel25)
                    .addComponent(ta)
                    .addComponent(jLabel27)
                    .addComponent(ci))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookbtn)
                    .addComponent(cancelbtn))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bt, ci, co, jLabel13, jLabel19, jLabel21, jLabel23, jLabel25, jLabel27, rno, rt, ta});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(logo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(logo)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
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

    private void onInit(Object o1, Object o2, Object o3, Object o4, Date o5, Date o6, String diff) {
        Container c = this.getContentPane();
        c.setBackground(new java.awt.Color(153, 255, 153));
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            this.roomno = o1.toString();
            this.bed = o2.toString();
            this.roomt = o3.toString();
            this.rate = o4.toString();
            this.strdtver1 = (String) sdf.format(o5.getTime());
            this.strdtver2 = (String) sdf.format(o6.getTime());
            this.calendarService.setTime(o5);
            this.dt1 = (String) sdf1.format(this.calendarService.getTime());
            this.calendarService.setTime(o6);
            this.dt2 = (String) sdf1.format(this.calendarService.getTime());
            this.mysqlConnection = this.mySQLService.getConnection();
            this.diffd = diff;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.rno.setText(this.roomno);
        this.bt.setText(this.bed);
        this.rt.setText(this.roomt);
        this.ta.setText(this.rate);
        this.ci.setText(this.strdtver1);
        this.co.setText(this.strdtver2);
        this.day.setText(this.diffd + " day(s)");
        final int r = Integer.parseInt(this.rate);
        final int days = Integer.parseInt(this.diffd);
        final double taxs = (r * days) * 12 / 100;
        this.tax.setText(taxs + "");
        this.amount = (r * days) + taxs;
        this.amt.setText(this.amount + "");
    }//GEN-LAST:event_formWindowOpened

    private boolean isAnyEmpty() {
        return Arrays.asList(new javax.swing.JTextField[]{
            this.name,
            this.add,
            this.city,
            this.state,
            this.coun,
            this.phone,
            this.proof,
            this.proofno,
            this.nation,
            this.marat,
            this.purpose,
            this.child,
            this.adults
        }).stream().anyMatch(v -> v.getText().isEmpty());
    }


    private void bookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookbtnActionPerformed
        try {
            if (this.isAnyEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all fields");
            } else {
                // FETCHING DETAILS
                this.cname = this.name.getText();
                this.cadd = this.add.getText();
                this.ccity = this.city.getText();
                this.cstat = this.state.getText();
                this.ccoun = this.coun.getText();
                this.cph = this.phone.getText();
                this.cname = this.name.getText();
                this.cproof = this.proof.getText();
                this.cadult = this.adults.getText();
                this.cchild = this.child.getText();
                this.cmars = this.marat.getText();
                this.cidno = this.proofno.getText();
                this.cnation = this.nation.getText();
                this.cpur = this.purpose.getText();

                int code = JOptionPane.showConfirmDialog(this, "Room No. " + this.roomno + " is booked for Mr./Ms. " + this.cname + " for "
                        + "diffd..!", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if (code == JOptionPane.YES_OPTION) {
                    String sql = "INSERT INTO `booking` (`room_no`, `arrival`, `departure`, `total_days`)"
                            + " VALUES ( '" + this.roomno + "', '" + this.dt1 + "', '" + this.dt2 + "', " + this.diffd + ");";

                    Statement mysqlStatement = this.mysqlConnection.createStatement();
                    mysqlStatement.executeUpdate(sql);
                    sql = "SELECT * FROM booking WHERE ROOM_NO='" + roomno + "' AND arrival='" + dt1 + "' AND departure='" + dt2 + "';";
                    mysqlStatement = this.mysqlConnection.createStatement();
                    this.rs = mysqlStatement.executeQuery(sql);
                    this.rs.next();
                    this.bookid = this.rs.getString(1);
                    sql = "insert into `visitors` (`visitor_name`, `visitor_add`, `visitor_city`, `visitor_state`, `visitor_country`, `visitor_ph`, "
                            + "`visitor_proof`, `total_adults`, `total_childs`, `visitor_mar_stat`, `visitor_id_no`, `visitor_nation`, `visitor_purpos`, "
                            + "`visitor_bill`, `book_id`)"
                            + " values ('" + this.cname + "','" + this.cadd + "', '" + this.ccity + "', '" + this.cstat + "', '" + this.ccoun + "', '" + this.cph + "', '" + this.cproof + "',"
                            + " '" + this.cadult + "', '" + this.cchild + "', '" + this.cmars + "', '" + this.cidno + "', '" + this.cnation + "', '" + this.cpur + "'," + this.amount + ", " + this.bookid + ");";
                    mysqlStatement = mysqlConnection.createStatement();
                    mysqlStatement.executeUpdate(sql);
                    JOptionPane.showMessageDialog(this, "Room Booked!!");
                } else if (code == JOptionPane.NO_OPTION) {
                    // Nothing to do
                }
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_bookbtnActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelbtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add;
    private javax.swing.JLabel adult;
    private javax.swing.JTextField adults;
    private javax.swing.JTextField amt;
    private javax.swing.JButton bookbtn;
    private javax.swing.JLabel bt;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JTextField child;
    private javax.swing.JLabel ci;
    private javax.swing.JTextField city;
    private javax.swing.JLabel co;
    private javax.swing.JTextField coun;
    private javax.swing.JTextField day;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField marat;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nation;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField proof;
    private javax.swing.JTextField proofno;
    private javax.swing.JLabel prpse;
    private javax.swing.JTextField purpose;
    private javax.swing.JLabel rno;
    private javax.swing.JLabel rt;
    private javax.swing.JTextField state;
    private javax.swing.JLabel ta;
    private javax.swing.JTextField tax;
    // End of variables declaration//GEN-END:variables
}
