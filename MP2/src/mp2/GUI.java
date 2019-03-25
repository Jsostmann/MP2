/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp2;


import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author jamesostmann
 */
public class GUI extends javax.swing.JFrame {
    
    private MowerWareHouse wareHouse;
  
    public GUI(String fileName) {
        
        
        wareHouse = new MowerWareHouse();
        initComponents();
        
        if(fileName != null) {
            
           wareHouse.readMowerData(fileName);
           
        } else {
            
           JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView());
           j.showOpenDialog(null);
           String file = j.getSelectedFile().getAbsolutePath();
           wareHouse.readMowerData(file);
      
        
        }
        
        super.setTitle(wareHouse.getStoreName());
        super.setVisible(true);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        addLawnTractor.setBorder(BorderFactory.createLineBorder(Color.GREEN,3));
        addCommercialMower.setBorder(BorderFactory.createLineBorder(Color.GREEN,3));
        addGasPowered.setBorder(BorderFactory.createLineBorder(Color.GREEN,3));
        addPushMower.setBorder(BorderFactory.createLineBorder(Color.GREEN,3));
        
        lawnPane.setForeground(Color.GREEN);
        lawnPane.setBackground(Color.BLACK);
        
        pushPane.setBackground(Color.BLACK);
        pushPane.setForeground(Color.GREEN);
        
        comPane.setBackground(Color.BLACK);
        comPane.setForeground(Color.GREEN);
        
        gasPane.setBackground(Color.BLACK);
        gasPane.setForeground(Color.GREEN);
        
        super.setResizable(false);
        setData(lawnMList,'L');
        
        // interface - a class like structure, containing only abstract methods and constants 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        tabbedPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lawnMList = new javax.swing.JList<>();
        addLawnTractor = new javax.swing.JButton();
        saveBtn1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lawnPane = new javax.swing.JTextPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        pushMList = new javax.swing.JList<>();
        addPushMower = new javax.swing.JButton();
        saveBtn3 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        pushPane = new javax.swing.JTextPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        commercialMList = new javax.swing.JList<>();
        addCommercialMower = new javax.swing.JButton();
        saveBtnOn4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        comPane = new javax.swing.JTextPane();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        gasMList = new javax.swing.JList<>();
        addGasPowered = new javax.swing.JButton();
        saveBtn2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        gasPane = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabbedPane.setMaximumSize(new java.awt.Dimension(1000, 1000));
        tabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabbedPaneStateChanged(evt);
            }
        });

        lawnMList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lawnMList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lawnMList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lawnMListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lawnMList);

        addLawnTractor.setText("Add Lawn Tractor");
        addLawnTractor.setMaximumSize(new java.awt.Dimension(139, 72));
        addLawnTractor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLawnTractorActionPerformed(evt);
            }
        });

        saveBtn1.setText("Save");
        saveBtn1.setMaximumSize(new java.awt.Dimension(139, 72));
        saveBtn1.setMinimumSize(new java.awt.Dimension(139, 72));
        saveBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtn1ActionPerformed(evt);
            }
        });

        lawnPane.setEditable(false);
        jScrollPane2.setViewportView(lawnPane);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addLawnTractor, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addComponent(saveBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addLawnTractor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPane.addTab("LawnMower", jPanel2);

        pushMList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        pushMList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                pushMListValueChanged(evt);
            }
        });
        jScrollPane7.setViewportView(pushMList);

        addPushMower.setText("Add Push Reel Mower");
        addPushMower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPushMowerActionPerformed(evt);
            }
        });

        saveBtn3.setText("Save");
        saveBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtn3ActionPerformed(evt);
            }
        });

        pushPane.setEditable(false);
        jScrollPane8.setViewportView(pushPane);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveBtn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addPushMower, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(jScrollPane8))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(addPushMower)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveBtn3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPane.addTab("PushReelMower", jPanel8);

        commercialMList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        commercialMList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                commercialMListValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(commercialMList);

        addCommercialMower.setText("Add Commercial Mower");
        addCommercialMower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCommercialMowerActionPerformed(evt);
            }
        });

        saveBtnOn4.setText("Save");
        saveBtnOn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnOn4ActionPerformed(evt);
            }
        });

        comPane.setEditable(false);
        jScrollPane3.setViewportView(comPane);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBtnOn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCommercialMower, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(addCommercialMower)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveBtnOn4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPane.addTab("CommercialMower", jPanel6);

        gasMList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        gasMList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        gasMList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                gasMListValueChanged(evt);
            }
        });
        jScrollPane6.setViewportView(gasMList);

        addGasPowered.setText("Add Gas Powered Mower");
        addGasPowered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGasPoweredActionPerformed(evt);
            }
        });

        saveBtn2.setText("Save");
        saveBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtn2ActionPerformed(evt);
            }
        });

        gasPane.setEditable(false);
        jScrollPane4.setViewportView(gasPane);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addComponent(addGasPowered, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(addGasPowered)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveBtn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPane.addTab("GasPoweredMower", jPanel7);

        getContentPane().add(tabbedPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtn3ActionPerformed
             wareHouse.saveMowerData();
    }//GEN-LAST:event_saveBtn3ActionPerformed

    private void addPushMowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPushMowerActionPerformed
        
        String[] genericData = addGenericMower();
        
        String cutWidth = JOptionPane.showInputDialog(null,"Enter Cut Width: ");
        String wheelDiameter = JOptionPane.showInputDialog(null,"Enter Wheel Diameter: ");
        
        String numWheels = JOptionPane.showInputDialog(null,"Number of Wheels: ");
        
        PushReelMower t = new PushReelMower();
        t.setManufacturer(genericData[0]);
        t.setYear(Integer.parseInt(genericData[1]));
        t.setSerialNumber(genericData[2]);
        t.setCutWidth(Double.parseDouble(cutWidth));
        t.setWheelDiameter(Double.parseDouble(wheelDiameter));
        t.setNumWheels(Integer.parseInt(numWheels));
        
        wareHouse.addMower(t);
        setData(pushMList,'P');
        
    }//GEN-LAST:event_addPushMowerActionPerformed

    private void saveBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtn2ActionPerformed
            wareHouse.saveMowerData();
    }//GEN-LAST:event_saveBtn2ActionPerformed

    private void addGasPoweredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGasPoweredActionPerformed
        
        String[] genericData = addGenericMower();
        
        String cutWidth = JOptionPane.showInputDialog(null,"Enter Cut Width: ");
        String wheelDiameter = JOptionPane.showInputDialog(null,"Enter Wheel Diameter: ");
        
        String engineManufacturer = JOptionPane.showInputDialog(null,"Enter Engine Manufacuter: ");
        String horsePower = JOptionPane.showInputDialog(null,"Enter HorsePower: ");
        String engineCylinders = JOptionPane.showInputDialog(null,"Enter Cylinders: ");
        
        String selfPropelled = JOptionPane.showInputDialog(null,"Is Self Propelled: ");
        
        
        Engine e = new Engine(engineManufacturer,Integer.parseInt(horsePower),Integer.parseInt(engineCylinders)); 
        GasPoweredMower t = new GasPoweredMower();
        
        t.setManufacturer(genericData[0]);
        t.setYear(Integer.parseInt(genericData[1]));
        t.setSerialNumber(genericData[2]);
        t.setCutWidth(Double.parseDouble(cutWidth));
        t.setWheelDiameter(Double.parseDouble(wheelDiameter));
        t.setEngine(e);
        t.setSelfPropelled(Boolean.valueOf(selfPropelled));
        
        wareHouse.addMower(t);
        setData(gasMList,'G');
    }//GEN-LAST:event_addGasPoweredActionPerformed

    private void saveBtnOn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnOn4ActionPerformed
        wareHouse.saveMowerData();
    }//GEN-LAST:event_saveBtnOn4ActionPerformed

    private void addCommercialMowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCommercialMowerActionPerformed

        String[] genericData = addGenericMower();
        
        String engineManufacturer = JOptionPane.showInputDialog(null,"Enter  Engine Manufacuter: ");
        String horsePower = JOptionPane.showInputDialog(null,"Enter HorsePower: ");
        String engineCylinders = JOptionPane.showInputDialog(null,"Enter Cylinders: ");
        
        String model = JOptionPane.showInputDialog(null,"Enter Mower Model: ");
        String deckWidth = JOptionPane.showInputDialog(null,"Enter Deck Width: ");
        
        String operatingHours = JOptionPane.showInputDialog(null,"Enter Operating Hours: ");
        String zeroTurnRadius = JOptionPane.showInputDialog(null,"Enter if ZeroTurn: ");
        
        Engine e = new Engine(engineManufacturer,Double.parseDouble(horsePower),Integer.parseInt(engineCylinders));
        
        CommercialMower t = new CommercialMower();
        t.setManufacturer(genericData[0]);
        t.setYear(Integer.parseInt(genericData[1]));
        t.setSerialNumber(genericData[2]);
        t.setEngine(e);
        t.setModel(model);
        t.setOperatingHours(Double.parseDouble(operatingHours));
        t.setZeroTurnRadius(Boolean.valueOf(zeroTurnRadius));
        t.setDeckWidth(Double.parseDouble(deckWidth));
        
        
        wareHouse.addMower(t);
        
        setData(commercialMList,'C');
    }//GEN-LAST:event_addCommercialMowerActionPerformed

    private void tabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabbedPaneStateChanged
        
        JTabbedPane pane = (JTabbedPane) evt.getSource();
        int index = pane.getSelectedIndex();
       
        switch(index){
            
            case 0:
                setData(lawnMList,'L');
                break;
            case 1:
                setData(pushMList,'P');
                break;
            case 2:
                setData(commercialMList,'C');
                break;
            case 3:    
                setData(gasMList,'G');
                break;
        }
        
    }//GEN-LAST:event_tabbedPaneStateChanged

    private void gasMListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_gasMListValueChanged
        
        String tempSerial = gasMList.getSelectedValue();
        
        for(int i = 0; i < wareHouse.getMowersSize(); i++) {
        
            if(wareHouse.getMower(i).getSerialNumber().equals(tempSerial)) {
                
                GasPoweredMower t = (GasPoweredMower) wareHouse.getMower(i);
                gasPane.setText(getGasData(t));
                
            }
        
        }
        
    }//GEN-LAST:event_gasMListValueChanged

    private void pushMListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_pushMListValueChanged
        
        String tempSerial = pushMList.getSelectedValue();
        
        for(int i = 0; i < wareHouse.getMowersSize(); i++) {
        
            if(wareHouse.getMower(i).getSerialNumber().equals(tempSerial)) {
                
                PushReelMower t = (PushReelMower) wareHouse.getMower(i);
                pushPane.setText(getPushData(t));
                
            }
        
        }
    }//GEN-LAST:event_pushMListValueChanged

    private void commercialMListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_commercialMListValueChanged
        
        String tempSerial = commercialMList.getSelectedValue();
        
        for(int i = 0; i < wareHouse.getMowersSize(); i++) {
        
            if(wareHouse.getMower(i).getSerialNumber().equals(tempSerial)) {
                
                CommercialMower t = (CommercialMower) wareHouse.getMower(i);
                comPane.setText(getCommercialData(t));
                
            }
        
        }
    }//GEN-LAST:event_commercialMListValueChanged

    private void saveBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtn1ActionPerformed
        wareHouse.saveMowerData();
    }//GEN-LAST:event_saveBtn1ActionPerformed

    private void addLawnTractorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLawnTractorActionPerformed

        String[] genericData = addGenericMower();

        String engineManufacturer = JOptionPane.showInputDialog(null,"Enter  Engine Manufacuter: ");
        String horsePower = JOptionPane.showInputDialog(null,"Enter HorsePower: ");
        String engineCylinders = JOptionPane.showInputDialog(null,"Enter Cylinders: ");

        String model = JOptionPane.showInputDialog(null,"Enter Mower Model: ");
        String deckWidth = JOptionPane.showInputDialog(null,"Enter Deck Width: ");

        Engine e = new Engine(engineManufacturer,Double.parseDouble(horsePower),Integer.parseInt(engineCylinders));

        LawnTractor t = new LawnTractor();
        t.setManufacturer(genericData[0]);
        t.setYear(Integer.parseInt(genericData[1]));
        t.setSerialNumber(genericData[2]);
        t.setEngine(e);
        t.setModel(model);
        t.setDeckWidth(Double.parseDouble(deckWidth));

        wareHouse.addMower(t);

        setData(lawnMList,'L');
    }//GEN-LAST:event_addLawnTractorActionPerformed

    private void lawnMListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lawnMListValueChanged

        String tempSerial = lawnMList.getSelectedValue();

        for(int i = 0; i < wareHouse.getMowersSize(); i++) {

            if(wareHouse.getMower(i).getSerialNumber().equals(tempSerial)) {

                LawnTractor t = (LawnTractor) wareHouse.getMower(i);

                lawnPane.setText(getLawnData(t));

            }
        }
    }//GEN-LAST:event_lawnMListValueChanged

    private void setData(JList mowerList, char subClassType) {
    
    ArrayList<Mower> tempMowers = new ArrayList<>();
    
  
    for(int i = 0; i < wareHouse.getMowersSize(); i++) {
        
        Mower mower = wareHouse.getMower(i);
        
        if(mower.getSubClassType() == subClassType) {
            
            tempMowers.add(mower);
            
        }
    }

    
    String[] mowerNames = new String[tempMowers.size()];
    
    
    for(int i = 0; i < mowerNames.length; i++) {
        
        mowerNames[i] = tempMowers.get(i).getSerialNumber();
    }
        
    mowerList.setListData(mowerNames);
    
    
    
}
    
    private String getLawnData(LawnTractor t) {
        
     return  "Mower Manufacturer: " + t.getManufacturer() + System.lineSeparator() +
                              "Mower Year: " + t.getYear() + System.lineSeparator() + 
                              "Mower Serial Number: " + t.getSerialNumber() + System.lineSeparator() + 
                              "Engine Manufacturer: " + t.getEngine().getManufacturer() + System.lineSeparator() + 
                              "Engine horsepower : " + t.getEngine().getHorsePower() + System.lineSeparator() + 
                              "Engine cylinders: " + t.getEngine().getCylinders() + System.lineSeparator() + 
                              "Mower Model: " + t.getModel() + System.lineSeparator() + 
                              "Mower Deck width: " + t.getDeckWidth() + System.lineSeparator();
    }
    
    private String getGasData(GasPoweredMower t) {
        
     return  "Mower Manufacturer: " + t.getManufacturer() + System.lineSeparator() +
                              "Mower Year: " + t.getYear() + System.lineSeparator() + 
                              "Mower Serial Number: " + t.getSerialNumber() + System.lineSeparator() + 
                              "Engine Manufacturer: " + t.getEngine().getManufacturer() + System.lineSeparator() + 
                              "Cut Width: " + t.getCutWidth() + System.lineSeparator() + 
                              "Wheel Diameter" + t.getWheelDiameter() + System.lineSeparator() +
                              "Engine horsepower : " + t.getEngine().getHorsePower() + System.lineSeparator() + 
                              "Engine cylinders: " + t.getEngine().getCylinders() + System.lineSeparator() + 
                              "Self Propelled: " + t.isSelfPropelled();
    }
    
    private String getPushData(PushReelMower t) {
        
        return  "Mower Manufacturer: " + t.getManufacturer() + System.lineSeparator() +
                              "Mower Year: " + t.getYear() + System.lineSeparator() + 
                              "Mower Serial Number: " + t.getSerialNumber() + System.lineSeparator() + 
                              "Cut Width: " + t.getCutWidth() + System.lineSeparator() + 
                              "Wheel Diameter: " + t.getWheelDiameter() + System.lineSeparator() +
                              "Number Of Wheels: " + t.getNumWheels();
    }
      
    private String getCommercialData(CommercialMower t) {
        
         return  "Mower Manufacturer: " + t.getManufacturer() + System.lineSeparator() +
                              "Mower Year: " + t.getYear() + System.lineSeparator() + 
                              "Mower Serial Number: " + t.getSerialNumber() + System.lineSeparator() + 
                              "Engine Manufacturer: " + t.getEngine().getManufacturer() + System.lineSeparator() + 
                              "Engine horsepower : " + t.getEngine().getHorsePower() + System.lineSeparator() + 
                              "Engine cylinders: " + t.getEngine().getCylinders() + System.lineSeparator() + 
                              "Mower Model: " + t.getModel() + System.lineSeparator() + 
                              "Mower Deck width: " + t.getDeckWidth() + System.lineSeparator() + 
                              "Operating Hours: " + t.getOperatingHours() + System.lineSeparator() + 
                              "Has Zero Turn: " + t.isZeroTurnRadius();
    }
    
    private String[] addGenericMower(){
        
        String manufacturer = JOptionPane.showInputDialog(null,"Enter Manufacuter: ");
        String year = JOptionPane.showInputDialog(null,"Enter Year: ");
        String serialNumber = JOptionPane.showInputDialog(null,"Enter Serial Number: ");
        
        String[] temp = {manufacturer,year,serialNumber}; 
        
        return temp;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCommercialMower;
    private javax.swing.JButton addGasPowered;
    private javax.swing.JButton addLawnTractor;
    private javax.swing.JButton addPushMower;
    private javax.swing.JTextPane comPane;
    private javax.swing.JList<String> commercialMList;
    private javax.swing.JList<String> gasMList;
    private javax.swing.JTextPane gasPane;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JList<String> lawnMList;
    private javax.swing.JTextPane lawnPane;
    private javax.swing.JList<String> pushMList;
    private javax.swing.JTextPane pushPane;
    private javax.swing.JButton saveBtn1;
    private javax.swing.JButton saveBtn2;
    private javax.swing.JButton saveBtn3;
    private javax.swing.JButton saveBtnOn4;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
