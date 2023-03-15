package com.mycompany.task1stigneilauracamelia;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Programare = new javax.swing.JPanel();
        lblProgramare = new javax.swing.JLabel();
        Specializare = new javax.swing.JPanel();
        lblSpecializare = new javax.swing.JLabel();
        Medic = new javax.swing.JPanel();
        lblMedic = new javax.swing.JLabel();
        Inchidere = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel1.setText("Digitalizarea Activitatilor in cadrul unei Policlinici");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel2.setText("Manager:Stignei Laura Camelia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Programare.setBackground(new java.awt.Color(0, 204, 204));
        Programare.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        Programare.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProgramareMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProgramareMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProgramareMouseExited(evt);
            }
        });

        lblProgramare.setIcon(new javax.swing.ImageIcon("C:\\Users\\Laura\\Downloads\\iconPr.png")); // NOI18N
        lblProgramare.setText("Programare");
        lblProgramare.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblProgramareMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout ProgramareLayout = new javax.swing.GroupLayout(Programare);
        Programare.setLayout(ProgramareLayout);
        ProgramareLayout.setHorizontalGroup(
            ProgramareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProgramareLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProgramare)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ProgramareLayout.setVerticalGroup(
            ProgramareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProgramareLayout.createSequentialGroup()
                .addComponent(lblProgramare, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        Specializare.setBackground(new java.awt.Color(0, 204, 204));
        Specializare.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        Specializare.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SpecializareMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SpecializareMouseExited(evt);
            }
        });

        lblSpecializare.setText("Specializare");

        javax.swing.GroupLayout SpecializareLayout = new javax.swing.GroupLayout(Specializare);
        Specializare.setLayout(SpecializareLayout);
        SpecializareLayout.setHorizontalGroup(
            SpecializareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpecializareLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblSpecializare, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        SpecializareLayout.setVerticalGroup(
            SpecializareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpecializareLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSpecializare, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Medic.setBackground(new java.awt.Color(0, 204, 204));
        Medic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        Medic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MedicMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MedicMouseExited(evt);
            }
        });

        lblMedic.setText("Medic");

        javax.swing.GroupLayout MedicLayout = new javax.swing.GroupLayout(Medic);
        Medic.setLayout(MedicLayout);
        MedicLayout.setHorizontalGroup(
            MedicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MedicLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lblMedic, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        MedicLayout.setVerticalGroup(
            MedicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MedicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMedic)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Inchidere.setBackground(new java.awt.Color(0, 204, 204));
        Inchidere.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        Inchidere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InchidereMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InchidereMouseExited(evt);
            }
        });

        jLabel3.setText("Inchidere");

        javax.swing.GroupLayout InchidereLayout = new javax.swing.GroupLayout(Inchidere);
        Inchidere.setLayout(InchidereLayout);
        InchidereLayout.setHorizontalGroup(
            InchidereLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InchidereLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        InchidereLayout.setVerticalGroup(
            InchidereLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InchidereLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Programare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Specializare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Medic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(Inchidere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Programare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Specializare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Medic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Inchidere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//programare
    
    private void lblProgramareMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProgramareMouseEntered
        
    }//GEN-LAST:event_lblProgramareMouseEntered

//programare
    private void ProgramareMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProgramareMouseEntered
       Programare.setBackground(java.awt.Color.decode("#dede"));
    }//GEN-LAST:event_ProgramareMouseEntered
//specializare
    private void SpecializareMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SpecializareMouseEntered
        Specializare.setBackground(java.awt.Color.decode("#dede"));
    }//GEN-LAST:event_SpecializareMouseEntered
//medic
    private void MedicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MedicMouseEntered
         Medic.setBackground(java.awt.Color.decode("#dede"));
    }//GEN-LAST:event_MedicMouseEntered
//inchidere
    private void InchidereMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InchidereMouseEntered
        Inchidere.setBackground(java.awt.Color.decode("#dede"));
    }//GEN-LAST:event_InchidereMouseEntered

    //exit programare
    private void ProgramareMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProgramareMouseExited
        Programare.setBackground(java.awt.Color.WHITE);
    }//GEN-LAST:event_ProgramareMouseExited
    //exit specIalizare
    private void SpecializareMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SpecializareMouseExited
         Specializare.setBackground(java.awt.Color.WHITE);
    }//GEN-LAST:event_SpecializareMouseExited
    //exit medic
    private void MedicMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MedicMouseExited
          Medic.setBackground(java.awt.Color.WHITE);
    }//GEN-LAST:event_MedicMouseExited
    //exit inchidere
    private void InchidereMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InchidereMouseExited
          Inchidere.setBackground(java.awt.Color.WHITE);
    }//GEN-LAST:event_InchidereMouseExited

    
    
    //click Programare
    private void ProgramareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProgramareMouseClicked
       Programare programare = new Programare();
       this.setVisible(false);
      // programare.setVisible(true);
    }//GEN-LAST:event_ProgramareMouseClicked

    
    
    
    
    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Inchidere;
    private javax.swing.JPanel Medic;
    private javax.swing.JPanel Programare;
    private javax.swing.JPanel Specializare;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMedic;
    private javax.swing.JLabel lblProgramare;
    private javax.swing.JLabel lblSpecializare;
    // End of variables declaration//GEN-END:variables
}
