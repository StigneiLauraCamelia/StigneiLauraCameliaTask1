package com.mycompany.task1stigneilauracamelia;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProgramareJFrame extends javax.swing.JFrame {

    ArrayList<Programare> allProgramare = new ArrayList<>();
     ArrayList<Specializare> allSpecializari = new ArrayList<>();
    public ProgramareJFrame() {
        initComponents();
        readAllData();
        WriteAllData();
    }
//return "Programare{" + ", IdProgramare=" + IdProgramare + "NumePacient=" + NumePacient + ", PrenumePacient=" + PrenumePacient + ", Sex=" + Sex + ", Email=" + Email + ", TipProgramare=" + TipProgramare  + ", NrTelefon=" + NrTelefon + ", Varsta=" + Varsta + ", specializare=" + specializareId + '}';
    void WriteAllData(){
       allPData.setText("");
        for(int i = 0; i<allProgramare.size();i++){
            
  //          allPData.append(allProgramare.get(i).getIdProgramare()+" "+allProgramare.get(i).getNumePacient()+" "+allProgramare.get(i).getPrenumePacient()+" "+allProgramare.get(i).getSex()+" "+allProgramare.get(i).getEmail()+" "+allProgramare.get(i).getTipProgramare()+" "+allProgramare.get(i).getNrTelefon()+" "+allProgramare.get(i).getVarsta()+" "+allProgramare.get(i).getspecializareId()+" ");
        }
    }
    
    void readAllData(){
        try{
            File pfile = new File("");
            Scanner scanner = new Scanner(pfile);
            
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                String[] curData = data.split(";");
                Programare programare = new Programare();
                programare.setIdProgramare(Integer.parseInt(curData[0]));
                programare.setNumePacient(curData[1]);
                programare.setPrenumePacient(curData[2]);
                programare.setSex(curData[3]);
                programare.setEmail(curData[4]);
                programare.setTipProgramare(curData[5]);
                programare.setNrTelefon(Integer.parseInt(curData[6]));
                programare.setVarsta(Integer.parseInt(curData[7]));
            //    programare.setspecializareId(Integer.parseInt(curData[8]));
                allProgramare.add(programare);
            }
        }catch (Exception e){
            
        }
    }
    
    
    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        IdProgramare = new javax.swing.JLabel();
        NumePacient = new javax.swing.JLabel();
        PrenumePacient = new javax.swing.JLabel();
        Sex = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        TipProgramare = new javax.swing.JLabel();
        NrTelefon = new javax.swing.JLabel();
        Varsta = new javax.swing.JLabel();
        Specializare = new javax.swing.JLabel();
        txtIdProgramare = new javax.swing.JTextField();
        txtNumePacient = new javax.swing.JTextField();
        txtPrenumePacient = new javax.swing.JTextField();
        txtSex = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTipProgramare = new javax.swing.JTextField();
        txtNrTelefon = new javax.swing.JTextField();
        txtVarsta = new javax.swing.JTextField();
        btnSalveaza = new javax.swing.JButton();
        btnCauta = new javax.swing.JButton();
        cbSpecializare = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        allPData = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        jLabel1.setText("Programare");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel1)
                .addContainerGap(206, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        IdProgramare.setText("IdProgramare :");

        NumePacient.setText("NumePacient :");

        PrenumePacient.setText("PrenumePacient :");

        Sex.setText("Sex :");

        Email.setText("Email :");

        TipProgramare.setText("TipProgramare :");

        NrTelefon.setText("NrTelefon :");

        Varsta.setText("Varsta :");

        Specializare.setText("Specializare");

        txtIdProgramare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProgramareActionPerformed(evt);
            }
        });

        btnSalveaza.setText("Salveaza");
        btnSalveaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalveazaActionPerformed(evt);
            }
        });

        btnCauta.setText("Cauta");

        cbSpecializare.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PrenumePacient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NumePacient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(IdProgramare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Sex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Varsta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TipProgramare, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(NrTelefon)
                            .addComponent(Specializare))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdProgramare)
                            .addComponent(txtNumePacient)
                            .addComponent(txtPrenumePacient)
                            .addComponent(txtSex)
                            .addComponent(txtEmail)
                            .addComponent(txtTipProgramare)
                            .addComponent(txtNrTelefon)
                            .addComponent(txtVarsta)
                            .addComponent(cbSpecializare, 0, 164, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnSalveaza)
                        .addGap(33, 33, 33)
                        .addComponent(btnCauta)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdProgramare)
                    .addComponent(txtIdProgramare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumePacient)
                    .addComponent(txtNumePacient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrenumePacient)
                    .addComponent(txtPrenumePacient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sex)
                    .addComponent(txtSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipProgramare)
                    .addComponent(txtTipProgramare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NrTelefon)
                    .addComponent(txtNrTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Varsta)
                    .addComponent(txtVarsta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Specializare)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cbSpecializare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalveaza)
                    .addComponent(btnCauta))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(0, 204, 204));
        jScrollPane1.setForeground(new java.awt.Color(0, 102, 102));
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        allPData.setColumns(20);
        allPData.setRows(5);
        jScrollPane1.setViewportView(allPData);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdProgramareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProgramareActionPerformed
     
    }//GEN-LAST:event_txtIdProgramareActionPerformed

    private void btnSalveazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalveazaActionPerformed
 
        if(IdProgramare.getText().equals("")||NumePacient.getText().equals("")||PrenumePacient.getText().equals("")||Sex.getText().equals("")||Email.getText().equals("")||TipProgramare.getText().equals("")||NrTelefon.getText().equals("")||Varsta.getText().equals("")){
            JOptionPane.showMessageDialog(null, "All Fields Required");
        }
        else if(checkIDC()){
             JOptionPane.showMessageDialog(null, "Id-ul exista deja");
        }
        else{
           try{
            Programare programare = new Programare();
                programare.setIdProgramare(Integer.parseInt(IdProgramare.getText()));
                
                programare.setNumePacient(NumePacient.getText());
                programare.setPrenumePacient(PrenumePacient.getText());
                programare.setSex(Sex.getText());
                programare.setEmail(Email.getText());
                programare.setTipProgramare(TipProgramare.getText());
               // programare.setSpecializare(ArrayListcurData[6]);
                programare.setNrTelefon(Integer.parseInt(NrTelefon.getText()));
                programare.setVarsta(Integer.parseInt(Varsta.getText()));
              //  programare.setspecializareId(Integer.parseInt(specializareId.getText()));
                allProgramare.add(programare);
                
                IdProgramare.setText("");
                NumePacient.setText(""); 
                PrenumePacient.setText("");
                Sex.setText("");
                Email.setText("");
                TipProgramare.setText("");
                NrTelefon.setText("");
                Varsta.setText("");
                WriteAllData();
                
            }catch(Exception e){
              JOptionPane.showMessageDialog(null, "Id-ul, NrTelefon,Varsta pot sa fie doar numere!");  
            }
            
            }
    }//GEN-LAST:event_btnSalveazaActionPerformed

        boolean checkIDC(){
        for(int i = 0 ; i<allProgramare.size(); i++){
            
            if(IdProgramare.getText().equals(allProgramare.get(i).getIdProgramare()+"")){
             return true;
            }
        }
           return false;
        }
   
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgramareJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Email;
    private javax.swing.JLabel IdProgramare;
    private javax.swing.JLabel NrTelefon;
    private javax.swing.JLabel NumePacient;
    private javax.swing.JLabel PrenumePacient;
    private javax.swing.JLabel Sex;
    private javax.swing.JLabel Specializare;
    private javax.swing.JLabel TipProgramare;
    private javax.swing.JLabel Varsta;
    private javax.swing.JTextArea allPData;
    private javax.swing.JButton btnCauta;
    private javax.swing.JButton btnSalveaza;
    private javax.swing.JComboBox<String> cbSpecializare;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdProgramare;
    private javax.swing.JTextField txtNrTelefon;
    private javax.swing.JTextField txtNumePacient;
    private javax.swing.JTextField txtPrenumePacient;
    private javax.swing.JTextField txtSex;
    private javax.swing.JTextField txtTipProgramare;
    private javax.swing.JTextField txtVarsta;
    // End of variables declaration//GEN-END:variables
}
