package com.kh.project.model.dao;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JPanel;

public class Data5 {
    public Frame mainFrame;
    public Label headerLabel;
    public Label statusLabel;
    public Panel controlPanel;
 
    public Data5() {
        GUI();
    }
 
    public static void main(String[] args) {
    	Data5 awtControlDemo = new Data5();
        awtControlDemo.show();
        JPanel panel = new JPanel();
        
    }
 
    
    
    public void GUI() {
        //panel ����
        Frame panel = new Frame("ROOMESCPAE");
        panel.setSize(400, 400);
        panel.setLayout(new GridLayout(3, 1));
        panel.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
               
            	

            }
        });
        
        // ��ܿ� �ִ� ��
        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        headerLabel.setText("�������� �����ñ��?");
 
        // �ϴ� ���°� ��
        statusLabel = new Label();
        statusLabel.setText("ROOMESCAPE");
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350, 100);
 
        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());
 
        panel.add(headerLabel);
        panel.add(controlPanel);
        panel.add(statusLabel);
        panel.setVisible(true);
       

    }
 
    void show() {
 
        Button btnone = new Button("�޼ҵ� �����");
        Button btntwo = new Button("��ü �Ҹ��");
        Button btnthree = new Button("�޼ҵ� �����");
        Button btnfour = new Button("��ü ������");

 
 
        btnone.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("�����Դϴ�");
            }
        });
 
        btntwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("�����Դϴ�");
               
            }
        });
 
        btnthree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("�����Դϴ�.���� ���Ƚ��ϴ�.");
                System.exit(0);
            }
        });
   
        btnfour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("�����Դϴ�");
            }
        });
      
        controlPanel.add(btnone);
        controlPanel.add(btntwo);
        controlPanel.add(btnthree);
        controlPanel.add(btnfour);
      
 
        mainFrame.setVisible(true);
       
 
    }
}
