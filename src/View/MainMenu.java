/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Lenovo
 */
public class MainMenu extends JFrame implements ActionListener{
    JFrame frame;
    JButton btn_inputJurusan, btn_lihatJurusan;
    JButton btn_inputMhs, btn_lihatMhsPerJurusan;
    JButton btn_exit;
    
    public MainMenu(){
        frame = new JFrame("MyITHB Quiz");
        frame.setSize(350,420);
        frame.setLocationRelativeTo(null);
        
        btn_inputJurusan = new JButton("Input Data Jurusan");
        btn_inputJurusan.setBounds(40, 20,250,50);
        btn_inputJurusan.addActionListener(this);
        
        btn_lihatJurusan = new JButton("Lihat Semua Jurusan");
        btn_lihatJurusan.setBounds(40,80,250,50);
        btn_lihatJurusan.addActionListener(this);
        
        btn_inputMhs = new JButton("Input Mahasiswa Baru");
        btn_inputMhs.setBounds(40,140,250,50);
        btn_inputMhs.addActionListener(this);
        
        btn_lihatMhsPerJurusan = new JButton("Lihat Mahasiswa per Jurusan");
        btn_lihatMhsPerJurusan.setBounds(40,200,250,50);
        btn_lihatMhsPerJurusan.addActionListener(this);
        
        btn_exit = new JButton("EXIT");
        btn_exit.setBounds(40,260,250,50);
        btn_exit.addActionListener(this);
        
        frame.add(btn_inputJurusan);
        frame.add(btn_lihatJurusan);
        frame.add(btn_inputMhs);
        frame.add(btn_lihatMhsPerJurusan);
        frame.add(btn_exit);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String cmd = ae.getActionCommand();
        switch (cmd){
            case "Input Data Jurusan":
                frame.setVisible(false);
                new InputDataJurusan();
                break;
            case "Lihat Semua Jurusan":
                frame.setVisible(false);
                new LihatSemuaJurusan();
                break;
            case "Input Mahasiswa":
                frame.setVisible(false);
                new InputMahasiswaBaru();
                break;
            case "Lihat Mahasiswa per Jurusan":
                frame.setVisible(false);
                new LihatMahasiswaPerJurusan();
                break;
            case "EXIT": 
                System.exit(0);
                break;
        }
    }
}
