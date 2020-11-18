/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author Lenovo
 */
public class InputMahasiswaBaru extends JFrame implements ActionListener {
    JFrame frame;
    
    JButton btn_submit, btn_back;
    
    JLabel nimL, namaL, angkatanL, kode_jurusanL;
    
    JTextField nim, nama, angkatan;
    
    JComboBox cb_kode_jurusan;
    //Dummy data
    String[] kode_jurusan_dummy = {"IF", "SI", "TI", "AK", "MG"};
    
    Controller controller = new Controller();
    
    public InputMahasiswaBaru(){
        frame = new JFrame("Input Mahasiswa Baru");
        frame.setSize(500,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        //NIM
        nimL = new JLabel();
        nimL.setText("NIM");
        nimL.setBounds(10,0,150,50);
        nim = new JTextField();
        nim.setBounds(160,15,500,20);
        
        //Nama
        namaL = new JLabel();
        namaL.setText("Nama ");
        namaL.setBounds(10,25,150,50);
        nama = new JTextField();
        nama.setBounds(160,40, 500, 20);
        
        //Angkatan
        angkatanL = new JLabel();
        angkatanL.setText("Angkatan ");
        angkatanL.setBounds(10,50,150,50);
        angkatan = new JTextField();
        angkatan.setBounds(160,65, 500, 20);
        
        //Kode Jurusan
        kode_jurusanL = new JLabel();
        kode_jurusanL.setText("Kode Jurusan");
        kode_jurusanL.setBounds(10,75,150,50);
        cb_kode_jurusan = new JComboBox(kode_jurusan_dummy);
        cb_kode_jurusan.setBounds(160,90,100,20);
        
        //Button Submit
        btn_submit = new JButton("Submit");
        btn_submit.setBounds(100,100,80,30);
        btn_submit.addActionListener(this);
                
        //Button Back
        btn_back = new JButton("Back");
        btn_back.setBounds(200,200,80,30);
        btn_back.addActionListener(this);
        
        frame.add(btn_back);
        frame.add(btn_submit);
        
        frame.add(nim);
        frame.add(nama);
        frame.add(angkatan);
        frame.add(cb_kode_jurusan);
        frame.add(nimL);
        frame.add(namaL);
        frame.add(angkatanL);
        frame.add(kode_jurusanL);
        
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        switch(command){
            case "Submit":
                if(nim.getText().equals("") && nama.getText().equals("") && angkatan.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                } else {
                    
                }
                break;
            case "Back":
                new MainMenu();
                break;
        }
    }
}
