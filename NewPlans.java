
import javax.swing.JOptionPane;

/**
 *
 * @author Mohammed Alsharaf
 */
public class NewPlans extends javax.swing.JFrame {

    //fields for creating a new plan
    private Profile profile;
    private Catalog catalog;
    private String planName;
    private Major major1, major2;
    private Minor minor1, minor2;
    private char action;
    private Plan plan;
    /**
     * Creates new form NewPlans
     * @param profile
     */
    public NewPlans(Profile profile) {
        initComponents();
        initList();
        catalog = new Catalog();
        this.profile = profile;
        major1 = new Major();
        major2 = new Major();
        minor1 = new Minor();
        minor2 = new Minor();
    }
    public NewPlans(Profile pro, Plan plan, char action){
        initComponents();
        this.plan = plan; 
        this.profile = pro;
        catalog = new Catalogs().getCatalogByID(plan.getCatalogID());
        initList();
        setLists();
    }

    /**
     *
     * @param profile must provide profile to update in database
     * @param catalog catalog year
     * @param planName can be given using UI
     * @param mj1 First Major
     * @param mj2 Second Major (Optional)
     * @param mi1 First Minor (Optional)
     * @param mi2 Second Minor (Optional, but must have first Minor)
     */
    public NewPlans(Profile profile, Catalog catalog, String planName, Major mj1, Major mj2, Minor mi1, Major mi2) {
        initComponents();
        initList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        planeNametxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        major1List = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        major2List = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        minor1List = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        catalogList = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Please Complete the Following");

        jLabel2.setText("Plan name*");

        jLabel3.setText("Major 1*");

        major1List.setEnabled(false);
        major1List.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                major1ListItemStateChanged(evt);
            }
        });

        jLabel4.setText("Major 2");

        major2List.setEnabled(false);
        major2List.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                major2ListItemStateChanged(evt);
            }
        });

        jLabel5.setText("Minor 1");

        minor1List.setEnabled(false);
        minor1List.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                minor1ListItemStateChanged(evt);
            }
        });

        jButton1.setText("Done");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Catalog*");

        catalogList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                catalogListItemStateChanged(evt);
            }
        });

        jLabel8.setText("* Required");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(planeNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(catalogList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(minor1List, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(major1List, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(major2List, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(planeNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(catalogList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(major1List, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(major2List, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(minor1List, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //check if everything is compeleted and update database
        if (this.planeNametxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please give the plan a name", "Plan Name Error", JOptionPane.ERROR_MESSAGE);
        } else {
            //check if majors and minors confilic each other
            //create a new plan object with all the required fields
            Plan plan_t = new Plan(this.planeNametxt.getText().hashCode(), profile.getStudentID(), catalog.getCatalogID(),
                    planeNametxt.getText(), major1.getMajorID(), minor1.getMinorID(),
                    major2.getMajorID(), minor2.getMinorID(),profile.getCoursesTaken());
            //update database using UpdateData()
            new UpdateData().updatePlan(plan_t, action);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Closes the NewPlans window
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void major1ListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_major1ListItemStateChanged
        // TODO add your handling code here:
        // if a major is selected then enable both second major and first minor
        if (major1List.getSelectedIndex() > 0) {
            //enable
            this.jButton1.setEnabled(true);
            //removes all items
            major2List.removeAllItems();
            minor1List.removeAllItems();
            //set the first major
            major1 = new Majors(catalog.getCatalogID()).getMajorByName((String) major1List.getSelectedItem());
            if (major1.getMajorName().equals(major2.getMajorName())) {
                JOptionPane.showMessageDialog(this, "You can't have the same major", "Major conflict", JOptionPane.ERROR_MESSAGE);
                major1 = new Major();
                major1List.setSelectedIndex(0);
            } else if (major1.getMajorName().equals(minor1.getMinorName())) {
                JOptionPane.showMessageDialog(this, "You can't have the same major", "Major conflict", JOptionPane.ERROR_MESSAGE);
                major1 = new Major();
                major1List.setSelectedIndex(0);
            } else if (major1.getMajorName().equals(minor2.getMinorName())) {
                JOptionPane.showMessageDialog(this, "You can't have the same major", "Major conflict", JOptionPane.ERROR_MESSAGE);
                major1 = new Major();
                major1List.setSelectedIndex(0);
            } else {
                major2List.setEnabled(true);
                minor1List.setEnabled(true);
                //add dumy item
                major2List.addItem("");
                minor1List.addItem("");
                //set up the lists
                new Majors(catalog.getCatalogID()).getMajorsList().forEach((mj) -> {
                    major2List.addItem(mj.getMajorName());
                });
                new Minors(catalog.getCatalogID()).getMinorList().forEach((mj) -> {
                    minor1List.addItem(mj.getMinorName());
                });
            }
        } else if (major1List.getSelectedIndex() == 0) {
            //enable
            this.jButton1.setEnabled(false);
            //else if disable both list and remove times
            major1 = new Major();
            major2List.removeAllItems();
            minor1List.removeAllItems();
            major2List.setEnabled(false);
            minor1List.setEnabled(false);
        }
    }//GEN-LAST:event_major1ListItemStateChanged

    private void major2ListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_major2ListItemStateChanged
        // TODO add your handling code here:
        // if second major seleted then set it up
        if (major2List.getSelectedIndex() > 0) {
            major2 = new Majors(catalog.getCatalogID()).getMajorByName((String) major2List.getSelectedItem());
            if (major2.getMajorName().equals(major1.getMajorName())) {
                major2List.setSelectedIndex(0);
                JOptionPane.showMessageDialog(this, "You can't have the same major", "Major conflict", JOptionPane.ERROR_MESSAGE);
                major2 = new Major();
            }
            else if (major2.getMajorName().equals(minor1.getMinorName())) {
                JOptionPane.showMessageDialog(this, "You can't have the same major", "Major conflict", JOptionPane.ERROR_MESSAGE);
                major2 = new Major();
                major2List.setSelectedIndex(0);
            }
            else if (major2.getMajorName().equals(minor2.getMinorName())) {
                JOptionPane.showMessageDialog(this, "You can't have the same major", "Major conflict", JOptionPane.ERROR_MESSAGE);
                major2 = new Major();
                major2List.setSelectedIndex(0);
            }
        } else {
            major2 = new Major();
        }
    }//GEN-LAST:event_major2ListItemStateChanged

    private void minor1ListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_minor1ListItemStateChanged
        // TODO add your handling code here:
        // if a first minor was selected enbale second minor's list
        if (minor1List.getSelectedIndex() > 0) {
            //removes all items
            minor1 = new Minors(catalog.getCatalogID()).getMinorByName((String) minor1List.getSelectedItem());
            if (minor1.getMinorName().equals(major1.getMajorName())) {
                JOptionPane.showMessageDialog(this, "You can't have the same  major", "Major conflict", JOptionPane.ERROR_MESSAGE);
                minor1 = new Minor();
                minor1List.setSelectedIndex(0);
            } else if (minor1.getMinorName().equals(major2.getMajorName())) {
                JOptionPane.showMessageDialog(this, "You can't have the same  major", "Major conflict", JOptionPane.ERROR_MESSAGE);
                minor1 = new Minor();
                minor1List.setSelectedIndex(0);
            } else if (minor1.getMinorName().equals(minor2.getMinorName())) {
                JOptionPane.showMessageDialog(this, "You can't have the same  major", "Major conflict", JOptionPane.ERROR_MESSAGE);
                minor1 = new Minor();
                minor1List.setSelectedIndex(0);
            } else {
                minor1List.setEnabled(true);
                //add dummy item
                minor1List.addItem("");
                //add list
                new Minors(catalog.getCatalogID()).getMinorList().forEach((mj) -> {
                });
            }
        } else if (minor1List.getSelectedIndex() == 0) {
            minor1 = new Minor();
        }
    }//GEN-LAST:event_minor1ListItemStateChanged

    private void catalogListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_catalogListItemStateChanged
        // if a catalog year was selected then enable major one
        if (catalogList.getSelectedIndex() > 0) {
            //removes all items
            major1List.removeAllItems();
            //set the catalog
            catalog = new Catalogs().getCatalogByName((String) catalogList.getSelectedItem());
            major1List.setEnabled(true);
            //add a dumy item
            major1List.addItem("");
            //set up the list
            new Majors(catalog.getCatalogID()).getMajorsList().forEach((mj) -> {
                major1List.addItem(mj.getMajorName());
            });
        } else if (catalogList.getSelectedIndex() == 0) {
            //if no catalog selected disable major 1 and remove all items
            catalog = new Catalog();
            major1List.removeAllItems();
            major1List.setEnabled(false);
        }
    }//GEN-LAST:event_catalogListItemStateChanged

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(NewPlans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(NewPlans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(NewPlans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(NewPlans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> {
//            new NewPlans().setVisible(true);
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> catalogList;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> major1List;
    private javax.swing.JComboBox<String> major2List;
    private javax.swing.JComboBox<String> minor1List;
    private javax.swing.JTextField planeNametxt;
    // End of variables declaration//GEN-END:variables

    /**
     * This method sets up the comboboxes so the user can pick the appropriate
     * information
     */
    private void initList() {
        catalogList.addItem("");    
        new Catalogs().getCatalogs().forEach((cat) -> {
            catalogList.addItem(cat.getCatalogName());
        });
        if(catalog.getCatalogID()!=-1){
            catalogList.setSelectedItem(catalog.getCatalogName());
        }
    }

    private void setLists() {
        major1List.setSelectedItem(plan.getMajors()[0]);
        major2List.setSelectedItem(plan.getMajors()[1]);
        minor1List.setSelectedItem(plan.getMinors()[0]);
    }
}
