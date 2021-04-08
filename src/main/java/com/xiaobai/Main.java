package com.xiaobai;

import com.xiaobai.gui.MainFrame;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame=new MainFrame("第三次实验");
        frame.setSize(1500,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
