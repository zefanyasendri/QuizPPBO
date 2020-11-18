/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;
import Model.Jurusan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author Lenovo
 */
public class InputDataJurusan extends JFrame implements ActionListener{
    JFrame frame;
    
    //Button
    JButton btn_inputData;
    
    JLabel kodeL, namaL;
    JTextField kode, nama;
    
    Controller controller = new Controller();
    
    public InputDataJurusan(){
        frame = new JFrame("Input Data Jurusan");
        frame.setSize(300,200);
        frame.setLocationRelativeTo(null);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        kodeL = new JLabel();
        kodeL.setText("Kode ");
        kodeL.setBounds(10,0,150,50);
        kode = new JTextField();
        kode.setBounds(100,15,150,20);
        
        namaL = new JLabel();
        namaL.setText("Nama ");
        namaL.setBounds(10,25,150,50);
        nama = new JTextField();
        nama.setBounds(100, 40,150,20);
        
        btn_inputData = new JButton("Submit");
        btn_inputData.setBounds(10,65,80,30);
        btn_inputData.addActionListener(this);
        
        frame.add(kode);
        frame.add(kodeL);
        frame.add(nama);
        frame.add(namaL);
        frame.add(btn_inputData);
        
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        switch(command){
            case "Submit":
                if(kode.getText().equals("") && nama.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                } else {
                    Jurusan j = new Jurusan();
                    j.setKode(kode.getText());
                    j.setNama(nama.getText());
                    boolean input = Controller.insertNewUser(j);
                    if (input){
                        JOptionPane.showMessageDialog(null, "Input Berhasil");
                        frame.setVisible(false);
                        new MainMenu();
                    } else {
                        JOptionPane.showMessageDialog(null, "Input Gagal");
                    }
                }
                break;        
        }
        System.out.println("command");
    }
}
