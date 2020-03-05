package Chap01;

import javax.swing.*;
import java.awt.*;
public class Ex01_02 extends JFrame {
    public Ex01_02() {
    	setTitle("ContentPane과 JFrame");
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	Container contentPane = getContentPane();
    	contentPane.setBackground(Color.gray);
    	contentPane.setLayout(new FlowLayout());

    	contentPane.add(new JButton("Ok"));
    	contentPane.add(new JButton("cancel"));
    	contentPane.add(new JButton("Ignore"));
    	
    	setSize(300,150);
    	setVisible(true);
    }
	public static void main(String[] args) {
		new Ex01_02();
    }
}