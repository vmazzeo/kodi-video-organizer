package it.ninjatech.kvo.test;

import it.ninjatech.kvo.utils.EnhancedLocaleMap;

import java.awt.FlowLayout;
import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Flags {

	public static void main(String[] args) throws Exception {
		EnhancedLocaleMap.init();
		
		JFrame frame = new JFrame();
		JLabel lblimage = new JLabel(EnhancedLocaleMap.getFlagByCountry(Locale.CANADA.getCountry()));
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(lblimage);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
}
