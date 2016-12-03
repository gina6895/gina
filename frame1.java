
import javax.swing.*;

import java.awt.*;


public class frame1 {
 public static void  main(String[]args){
	 JFrame frame = new JFrame();
	 frame.setVisible(true);
	 frame.setSize(800, 800);; 
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setLocationRelativeTo(null);
	  JPanel panel = new JPanel ();
	 panel.setBackground(Color.white);
	 
	 frame.add(panel);
	
	
	
 }

}