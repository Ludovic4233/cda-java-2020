package block_34;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ludo_423 {

	private JFrame frame;
	private static JTextField input_screen;
	private static boolean on = false;
    private static double firstNum;
    private static String secondNum;
	private static char operateur = ' ';
	private static double result;
	private static String chiffre;
	double resultatMemoire;
	private static boolean operation = true;
	boolean operateurMultiple = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ludo_423 window = new Ludo_423();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ludo_423() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 504);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_container = new JPanel();
		panel_container.setBackground(Color.BLACK);
		frame.getContentPane().add(panel_container, BorderLayout.CENTER);
		panel_container.setLayout(null);
		
		input_screen = new JTextField();
		input_screen.setBounds(78, 36, 211, 45);
		panel_container.add(input_screen);
		input_screen.setColumns(10);
		
		
		
		JButton btnMRC = new JButton("MRC");
		btnMRC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input_screen.setText(String.valueOf(resultatMemoire));
			}
		});
		btnMRC.setBounds(10, 108, 79, 23);
		panel_container.add(btnMRC);
		
		JButton btnMplus = new JButton("M+");
		btnMplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 resultatMemoire = resultatMemoire + Double.parseDouble(input_screen.getText());
				operation = false;
				operateurMultiple = false;
			}
		});
		btnMplus.setBounds(99, 108, 62, 23);
		panel_container.add(btnMplus);
		
		JButton btnMmoin = new JButton("M-");
		btnMmoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultatMemoire = resultatMemoire - Double.parseDouble(input_screen.getText());
			}
		});
		btnMmoin.setBounds(171, 108, 66, 23);
		panel_container.add(btnMmoin);
		
		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input_screen.setText(" ");
				operation = false;
			}
		});
		btnCE.setBounds(247, 108, 77, 23);
		panel_container.add(btnCE);
		
		JButton btnON_C = new JButton("ON-C");
		btnON_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					input_screen.setText(" ");
					operation = false;
					firstNum = 0;
			}
		});
		btnON_C.setBackground(Color.RED);
		btnON_C.setBounds(334, 108, 79, 23);
		panel_container.add(btnON_C);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boutons(btn7);
			}
		});
		btn7.setBounds(34, 165, 55, 23);
		panel_container.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boutons(btn8);
			}
		});
		btn8.setBounds(99, 165, 48, 23);
		panel_container.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boutons(btn9);
			}
		});
		btn9.setBounds(157, 165, 48, 23);
		panel_container.add(btn9);
		
		JButton btnPourcent = new JButton("%");
		btnPourcent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				diviseParCent(btnPourcent);
			}
		});
		btnPourcent.setBounds(215, 165, 48, 23);
		panel_container.add(btnPourcent);
		
		JButton btnRacine = new JButton("\u221A");
		btnRacine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				racine(btnRacine);
			}
		});
		btnRacine.setBounds(273, 165, 59, 23);
		panel_container.add(btnRacine);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boutons(btn4);
			}
		});
		btn4.setBounds(34, 221, 55, 23);
		panel_container.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boutons(btn5);
			}
		});
		btn5.setBounds(99, 221, 48, 23);
		panel_container.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boutons(btn6);
			}
		});
		btn6.setBounds(157, 221, 48, 23);
		panel_container.add(btn6);
		
		JButton btnMultiplier = new JButton("\u00D7");
		btnMultiplier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operateur = '\u00D7';
				if(operateurMultiple == false) {
					chiffre = input_screen.getText();
				}else {
					input_screen.setText(String.valueOf(result));
					chiffre = input_screen.getText();
				}
				firstNum = Double.parseDouble(chiffre);
				operation = false;
				operateurMultiple = true;
			}
		});
		btnMultiplier.setBounds(215, 221, 48, 23);
		panel_container.add(btnMultiplier);
		
		JButton btnDiviser = new JButton("\u00F7");
		btnDiviser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operateur = '\u00F7';
				if(operateurMultiple == false) {
					chiffre = input_screen.getText();
				}else {
					input_screen.setText(String.valueOf(result));
					chiffre = input_screen.getText();
				}
				firstNum = Double.parseDouble(chiffre);
				operation = false;
				operateurMultiple = true;
			}
		});
		btnDiviser.setBounds(273, 221, 59, 23);
		panel_container.add(btnDiviser);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boutons(btn1);
			}
		});
		btn1.setBounds(34, 278, 55, 23);
		panel_container.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boutons(btn2);
			}
		});
		btn2.setBounds(99, 278, 48, 23);
		panel_container.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boutons(btn3);
			}
		});
		btn3.setBounds(157, 278, 48, 23);
		panel_container.add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boutons(btn0);
			}
		});
		btn0.setBounds(34, 331, 55, 23);
		panel_container.add(btn0);
		
		JButton btnPoint = new JButton(".");
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boutons(btnPoint);
			}
		});
		btnPoint.setBounds(99, 331, 48, 23);
		panel_container.add(btnPoint);
		
		JButton btnPlusMoin = new JButton("+/-");
		btnPlusMoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input_screen.setText("-");
			}
		});
		btnPlusMoin.setBounds(157, 331, 48, 23);
		panel_container.add(btnPlusMoin);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operateur = '+';
				if(operateurMultiple == false) {
					chiffre = input_screen.getText();
				}else {
					input_screen.setText(String.valueOf(result));
					chiffre = input_screen.getText();
				}
				firstNum = Double.parseDouble(chiffre);
				operation = false;
				operateurMultiple = true;
			}
		});
		btnPlus.setBounds(215, 278, 48, 76);
		panel_container.add(btnPlus);
		
		JButton btnMoins = new JButton("-");
		btnMoins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operateur = '-';
				if(operateurMultiple == false) {
					chiffre = input_screen.getText();
				}else {
					input_screen.setText(String.valueOf(result));
					chiffre = input_screen.getText();
				}
				firstNum = Double.parseDouble(chiffre);
				operation = false;
				operateurMultiple = true;
			}
		});
		btnMoins.setBounds(273, 278, 59, 23);
		panel_container.add(btnMoins);
		
		JButton btnEgale = new JButton("=");
		btnEgale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input_screen.setText(String.valueOf(result));
			}
		});
		btnEgale.setBounds(273, 331, 59, 23);
		panel_container.add(btnEgale);
		
	}
	
	public static void boutons(JButton btn) {
		if(operation == true) {
			String old= input_screen.getText();
			String nbre = btn.getText();
			input_screen.setText(old+nbre);
			if(operateur == '+') {
				result = firstNum + Double.parseDouble(secondNum+btn.getText());
			}else if(operateur == '-'){
				result = firstNum - Double.parseDouble(secondNum+btn.getText());
			}else if(operateur == '\u00D7') {
				result = firstNum * Double.parseDouble(secondNum+btn.getText());
			}else if(operateur == '\u00F7') {
				result = firstNum / Double.parseDouble(secondNum+btn.getText());
			}
			secondNum = secondNum+btn.getText();
		}else {
			String signe = input_screen.getText();
			char s = signe.charAt(0);
			if(s == '-') {
				input_screen.setText('-'+btn.getText());
				secondNum = '-'+btn.getText();
				if(operateur == '+') {
					result = firstNum + Double.parseDouble(secondNum);
				}else if(operateur == '-') {
					result = firstNum - Double.parseDouble(secondNum);
				}else if(operateur == '\u00D7') {
					result = firstNum * Double.parseDouble(secondNum);
				}else if(operateur == '\u00F7') {
					result = firstNum / Double.parseDouble(secondNum);
				}
			}else {
				input_screen.setText(btn.getText());
				secondNum =  btn.getText();
				if(operateur == '+') {
					result = firstNum + Double.parseDouble(secondNum);
				}else if(operateur == '-') {
					result = firstNum - Double.parseDouble(secondNum);
				}else if(operateur == '\u00D7') {
					result = firstNum * Double.parseDouble(secondNum);
				}else if(operateur == '\u00F7') {
					result = firstNum / Double.parseDouble(secondNum);
				}
			}
		}
		operation = true;

	}
	
	
	
	public static void diviseParCent(JButton btn) {
		String old= input_screen.getText();
		 double dpc= Double.parseDouble(old);
		 dpc=dpc/100;
		 String res = String.valueOf(dpc);
		 input_screen.setText(res);
	}
	
	public static void racine(JButton btn) {
		double rc = Math.sqrt(Double.parseDouble(input_screen.getText()));
		input_screen.setText(String.valueOf(rc));
	}
	
	
}
