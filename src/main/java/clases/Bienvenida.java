/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author Yne1
 */
public class Bienvenida extends JFrame implements ActionListener {
    
    private JTextField textField1;
    private JLabel label1, label2, label3, label4;
    private JButton boton1;
    public static String nombreUsuario = "";
    
    public Bienvenida() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenid@");
        getContentPane().setBackground(new Color(255, 0, 0));
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        
        label1 = new JLabel();
        label1.setIcon(new ImageIcon(getClass().getResource("/images/logo-coca.png")));
        label1.setBounds(25, 15, 300, 150);
        add(label1);
        
        label2 = new JLabel("Sistema de control vacacional");
        label2.setBounds(35, 135, 300, 30);
        label2.setFont(new Font("Andale Mono", 3, 18));
        label2.setForeground(new Color(255, 255, 255));
        add(label2);
        
        label3 = new JLabel("Ingrese su nombre, por favor");
        label3.setBounds(45, 212, 200, 30);
        label3.setFont(new Font("Andale Mono", 1, 12));
        label3.setForeground(new Color(255, 255, 255));
        add(label3);
        
        label4 = new JLabel("2019 The Coca Cola Company");
        label4.setBounds(85, 375, 300, 30);
        label4.setFont(new Font("Andale Mono", 1, 12));
        label4.setForeground(new Color(255, 255, 255));
        add(label4);
        
        textField1 = new JTextField();
        textField1.setBounds(45, 240, 255, 25);
        add(textField1);
        textField1.setBackground(new Color(224, 224, 224));
        textField1.setFont(new Font("Andale Mono", 1, 14));
        textField1.setForeground(new Color(255, 0, 0));
        add(textField1);
        
        boton1 = new JButton("Acceder");
        boton1.setBounds(125, 280, 100, 30);
        boton1.setBackground(new Color(255, 255, 255));
        boton1.setFont(new Font("Andale Mono", 1, 14));
        boton1.setForeground(new Color(255, 0, 0));
        boton1.addActionListener(this);
        add(boton1);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            nombreUsuario = textField1.getText().trim();
            if (nombreUsuario.equals("")) {
                textField1.setBackground(Color.lightGray);
                JOptionPane.showMessageDialog(null, "Por favor escriba su nombre");
            } else {
                Licencia ventanaLicencia = new Licencia();
                ventanaLicencia.setBounds(0, 0, 600, 360);
                ventanaLicencia.setVisible(true);
                ventanaLicencia.setResizable(false);
                ventanaLicencia.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        }
    }
    
    public static void main(String[] args) {
        Bienvenida ventanaBienvenida = new Bienvenida();
        ventanaBienvenida.setBounds(0, 0, 350, 450);
        ventanaBienvenida.setVisible(true);
        ventanaBienvenida.setResizable(false);
        ventanaBienvenida.setLocationRelativeTo(null);
        
    }
    
}
