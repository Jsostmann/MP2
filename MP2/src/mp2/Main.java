/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp2;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author jamesostmann
 */
public class Main {
    
    public static void main(String[] args) {
        
        MowerWareHouse mowerWareHouse = new MowerWareHouse();
        
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView()); 
        j.showSaveDialog(null);
        String fileName = j.getSelectedFile().getAbsolutePath();
        
        mowerWareHouse.readMowerData(fileName);
        System.out.println(mowerWareHouse);
        mowerWareHouse.setStoreName("James Store");
        System.out.println(mowerWareHouse);
        mowerWareHouse.saveMowerData();
        
    }
    
}
