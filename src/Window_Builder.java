import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window_Builder extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	double primero;
	double segundo;
	double resultado;
	
	String operacion;
	String pregunta;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_Builder frame = new Window_Builder();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Window_Builder() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 334, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setBounds(10, 11, 296, 72);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
					
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 16));
		btnBackspace.setBounds(10, 94, 70, 54);
		contentPane.add(btnBackspace);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnClear.setBounds(85, 94, 70, 54);
		contentPane.add(btnClear);
		
		JButton btn2cero = new JButton("00");
		btn2cero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2cero.getText();
				textField.setText(number);
			}
		});
		btn2cero.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2cero.setBounds(160, 94, 71, 54);
		contentPane.add(btn2cero);
		
		JButton btnsum = new JButton("+");
		btnsum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primero=Double.parseDouble(textField.getText());
				textField.setText("");
				operacion="+";
			}
		});
		btnsum.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnsum.setBounds(236, 94, 70, 54);
		contentPane.add(btnsum);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn7.setBounds(10, 150, 70, 54);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn8.setBounds(85, 150, 70, 54);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn9.setBounds(160, 150, 70, 54);
		contentPane.add(btn9);
		
		JButton btnrest = new JButton("-");
		btnrest.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnrest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primero=Double.parseDouble(textField.getText());
				textField.setText("");
				operacion="-";
			}
		});
		btnrest.setBounds(236, 150, 70, 54);
		contentPane.add(btnrest);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn4.setBounds(10, 206, 70, 54);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn5.setBounds(85, 206, 70, 54);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn6.setBounds(161, 206, 70, 54);
		contentPane.add(btn6);
		
		JButton btnmult = new JButton("x");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primero=Double.parseDouble(textField.getText());
				textField.setText("");
				operacion="x";
			}
		});
		btnmult.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnmult.setBounds(236, 206, 70, 54);
		contentPane.add(btnmult);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn1.setBounds(10, 262, 70, 54);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setBounds(85, 262, 70, 54);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn3.setBounds(161, 262, 70, 54);
		contentPane.add(btn3);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primero=Double.parseDouble(textField.getText());
				textField.setText("");
				operacion="/";
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 16));
		btndiv.setBounds(236, 262, 70, 54);
		contentPane.add(btndiv);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn0.setBounds(10, 318, 70, 54);
		contentPane.add(btn0);
		
		JButton btnPunt = new JButton(".");
		btnPunt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnPunt.getText();
				textField.setText(number);
			}
		});
		btnPunt.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPunt.setBounds(85, 318, 70, 54);
		contentPane.add(btnPunt);
		
		JButton btnpunto = new JButton("=");
		btnpunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pregunta;
				segundo=Double.parseDouble(textField.getText());
				if(operacion=="+") {
					resultado=primero+segundo;
					pregunta=String.format("%.2f", resultado);
					textField.setText(pregunta);
				}else if(operacion=="-") {
					resultado=primero-segundo;
					pregunta=String.format("%.2f", resultado);
					textField.setText(pregunta);
				}else if(operacion=="x") {
					resultado=primero*segundo;
					pregunta=String.format("%.2f", resultado);
					textField.setText(pregunta);
				}else if(operacion=="/") {
					resultado=primero/segundo;
					pregunta=String.format("%.2f", resultado);
					textField.setText(pregunta);
				}else if(operacion=="%") {
					resultado=primero%segundo;
					pregunta=String.format("%.2f", resultado);
					textField.setText(pregunta);
				}
			}
		});
		btnpunto.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnpunto.setBounds(160, 318, 70, 54);
		contentPane.add(btnpunto);
		
		JButton btnporcentaje = new JButton("%");
		btnporcentaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primero=Double.parseDouble(textField.getText());
				textField.setText("");
				operacion="%";
			}
		});
		btnporcentaje.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnporcentaje.setBounds(236, 318, 70, 54);
		contentPane.add(btnporcentaje);
	}
}
