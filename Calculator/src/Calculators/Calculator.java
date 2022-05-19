package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textDisp;
	double fnum;
	double secnum;
	String opt;
	String ans;
	double result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 273, 397);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textDisp = new JTextField();
		textDisp.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisp.setFont(new Font("Tahoma", Font.BOLD, 18));
		textDisp.setBounds(10, 11, 225, 37);
		frame.getContentPane().add(textDisp);
		textDisp.setColumns(10);
		
		//-------------row1----------------
				JButton btnback = new JButton("BK");
				btnback.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
                    String backspace=null;
                    if(textDisp.getText().length()>0) {
                    	StringBuilder s=new StringBuilder(textDisp.getText());
                    	s.deleteCharAt(textDisp.getText().length()-1);
                    	backspace=s.toString();
                    	textDisp.setText(backspace);
                    }
					}
				});
				btnback.setFont(new Font("Tahoma", Font.BOLD, 13));
				btnback.setBounds(10, 59, 50, 50);
				frame.getContentPane().add(btnback);
				
				JButton btnop = new JButton("+_");
				btnop.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					double ops=Double.parseDouble(String.valueOf(textDisp.getText()));
					double opj=ops*(-1);
					textDisp.setText(String.valueOf(opj));
					}
				});
				btnop.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnop.setBounds(70, 59, 50, 50);
				frame.getContentPane().add(btnop);
				
				JButton btnPercantage = new JButton("%");
				btnPercantage.setFont(new Font("Tahoma", Font.BOLD, 13));
				btnPercantage.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						fnum=Double.parseDouble(textDisp.getText());
						textDisp.setText("");
						opt="%";
					if (opt=="%") {
							result =fnum/100;
							ans=String.format("%.2f", result);
							textDisp.setText(ans);	
						}
						
						
					}
				});
				btnPercantage.setBounds(130, 59, 50, 50);
				frame.getContentPane().add(btnPercantage);
				
				JButton btnAC = new JButton("AC");
				btnAC.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						textDisp.setText(null);
					}
				});
				btnAC.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnAC.setBounds(191, 59, 50, 50);
				frame.getContentPane().add(btnAC);
		//.....................row 2...................------------------------------
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textDisp.getText() +btn7.getText();
				textDisp.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 112, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textDisp.getText() +btn8.getText();
				textDisp.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(70, 112, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textDisp.getText() +btn9.getText();
				textDisp.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(130, 112, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnum=Double.parseDouble(textDisp.getText());
				textDisp.setText("");
				opt="+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(191, 112, 50, 50);
		frame.getContentPane().add(btnPlus);
		//------------row 3-------------------------------------------------------
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textDisp.getText() +btn4.getText();
				textDisp.setText(EnterNumber);
			}
		});
		btn4.setBounds(10, 173, 50, 50);
		frame.getContentPane().add(btn4);
		
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textDisp.getText() +btn5.getText();
				textDisp.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(70, 173, 50, 50);
		frame.getContentPane().add(btn5);
		
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textDisp.getText() +btn6.getText();
				textDisp.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(130, 173, 50, 50);
		frame.getContentPane().add(btn6);
		
		
		JButton btn4_6 = new JButton("-");
		btn4_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnum=Double.parseDouble(textDisp.getText());
				textDisp.setText("");
				opt="-";
			}
		});
		btn4_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4_6.setBounds(191, 173, 50, 50);
		frame.getContentPane().add(btn4_6);
		
		
		
		
		//------row 4-------------------------------------------------------------
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textDisp.getText() +btn1.getText();
				textDisp.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 236, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textDisp.getText() +btn2.getText();
				textDisp.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(70, 236, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textDisp.getText() +btn3.getText();
				textDisp.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(130, 236, 50, 50);
		frame.getContentPane().add(btn3);
		
		
		
		JButton btnmultiply = new JButton("x");
		btnmultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnum=Double.parseDouble(textDisp.getText());
				textDisp.setText("");
				opt="*";
			}
		});
		btnmultiply.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnmultiply.setBounds(190, 236, 50, 50);
		frame.getContentPane().add(btnmultiply);
		//------------------row5------------------------------------------
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textDisp.getText() +btn0.getText();
				textDisp.setText(EnterNumber);
			}
			
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 297, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textDisp.getText().contains(".")) {
					textDisp.setText(textDisp.getText()+btndot.getText());
					
				}
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndot.setBounds(70, 297, 50, 50);
		frame.getContentPane().add(btndot);
		
		JButton btnequals = new JButton("=");
		
		btnequals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				secnum =Double.parseDouble(textDisp.getText());
				if (opt=="+") {
					result =fnum+secnum;
					ans=String.format("%.2f", result);
					textDisp.setText(ans);	
				}
				else if (opt=="-") {
					result =fnum-secnum;
					ans=String.format("%.2f", result);
					textDisp.setText(ans);
					
				}
				else if (opt=="*") {
					result =fnum*secnum;
					ans=String.format("%.2f", result);
					textDisp.setText(ans);	
				}
				else if (opt=="/") {
					result =fnum/secnum;
					ans=String.format("%.2f", result);
					textDisp.setText(ans);	
				}
				
				
				
				
			}
		});
		btnequals.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnequals.setBounds(130, 297, 50, 50);
		frame.getContentPane().add(btnequals);
		
		JButton btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnum=Double.parseDouble(textDisp.getText());
				textDisp.setText("");
				opt="/";
			}
		});
		btndivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndivide.setBounds(191, 297, 50, 50);
		frame.getContentPane().add(btndivide);
		
		
		
		
	}
}
