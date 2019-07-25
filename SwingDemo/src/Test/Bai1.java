package Test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.TextField;
import javax.swing.JEditorPane;
import javax.swing.JCheckBoxMenuItem;

public class Bai1 extends JFrame {

	private JPanel contentPane;
	private JButton button_Tru;
	private JTextField value_1;
	private JTextField value_2;
	private String Phep_Tinh;
	private String one;
	private String two;
	private String temp;
	private float kp;
	private int dem;
	private boolean reset = false;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai1 frame = new Bai1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public void Reset_Calculator()
	{
		if(reset == true)
		{
			value_1.setText("");
			dem = 0;
			one = "";
			two = "";
			kp = 0;
			temp ="";
			reset = false;
		}
	}
	public void Tinh()
	{
		
		dem++;
		
		if (value_2.getText().equals(""))
		{
			one = value_1.getText();
		}
		else
		{
			two = value_1.getText();
		}
		if (dem == 2)
		{
//			temp = one - two;
			BigDecimal a = new BigDecimal(one);
			BigDecimal b = new BigDecimal(two);
			switch (Phep_Tinh) {
					case "Tru":
						temp = String.valueOf(a.subtract(b).floatValue());
						break;
					case "Cong":
						temp = String.valueOf(a.add(b).floatValue());
						break;
			}
			
		}
		else
		{
			if(dem > 2)
			{
//				temp = temp - two;
				BigDecimal a = new BigDecimal(temp);
				BigDecimal b = new BigDecimal(two);
				switch (Phep_Tinh) {
				case "Tru":
					temp = String.valueOf(a.subtract(b).floatValue());
					break;
				case "Cong":
					temp = String.valueOf(a.add(b).floatValue());
					break;
		}
			}
		}
	}
	public Bai1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 4));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Button1 = new JButton("1");
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reset_Calculator();
				value_1.setText(value_1.getText() + "1");
			}
		});
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(16, 13, 421, 84);
		contentPane.add(editorPane);
		
		value_1 = new JTextField();
		value_1.setBorder(null);
		value_1.setHorizontalAlignment(SwingConstants.RIGHT);
		value_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		value_1.setBounds(16, 55, 421, 42);
		contentPane.add(value_1);
		value_1.setColumns(10);
		
		value_2 = new JTextField();
		value_2.setBorder(null);
		value_2.setHorizontalAlignment(SwingConstants.RIGHT);
		value_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		value_2.setBounds(206, 13, 231, 42);
		contentPane.add(value_2);
		value_2.setColumns(10);
		Button1.setBounds(89, 272, 61, 42);
		contentPane.add(Button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reset_Calculator();
				value_1.setText(value_1.getText() + "2");
			}
		});
		button2.setBounds(162, 272, 61, 42);
		contentPane.add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reset_Calculator();
				value_1.setText(value_1.getText() + "3");
			}
		});
		button3.setBounds(235, 272, 61, 42);
		contentPane.add(button3);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reset_Calculator();
				value_1.setText(value_1.getText() + "4");
			}
		});
		button4.setBounds(89, 217, 61, 42);
		contentPane.add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reset_Calculator();
				value_1.setText(value_1.getText() + "5");
			}
		});
		button5.setBounds(162, 217, 61, 42);
		contentPane.add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reset_Calculator();
				value_1.setText(value_1.getText() + "6");
			}
		});
		button6.setBounds(235, 217, 61, 42);
		contentPane.add(button6);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reset_Calculator();
				value_1.setText(value_1.getText() + "7");
			}
		});
		button7.setBounds(89, 163, 61, 42);
		contentPane.add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reset_Calculator();
				value_1.setText(value_1.getText() + "8");
			}
		});
		button8.setBounds(162, 163, 61, 42);
		contentPane.add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reset_Calculator();
				value_1.setText(value_1.getText() + "9");
			}
		});
		button9.setBounds(235, 163, 61, 42);
		contentPane.add(button9);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reset_Calculator();
				value_1.setText(value_1.getText() + "0");
			}
		});
		button0.setBounds(162, 324, 61, 42);
		contentPane.add(button0);
		
		JButton button_DoiDau = new JButton("+/-");
		button_DoiDau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_DoiDau.setBounds(89, 324, 61, 42);
		contentPane.add(button_DoiDau);
		
		JButton button_Phay = new JButton(".");
		button_Phay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value_1.setText(value_1.getText() + ".");
			}
		});
		button_Phay.setBounds(235, 324, 61, 42);
		contentPane.add(button_Phay);
		
		JButton btnM = new JButton("M+");
		btnM.setBounds(16, 324, 61, 42);
		contentPane.add(btnM);
		
		JButton btnMs = new JButton("MS");
		btnMs.setBounds(16, 272, 61, 42);
		contentPane.add(btnMs);
		
		JButton button_MR = new JButton("MR");
		button_MR.setBounds(16, 217, 61, 42);
		contentPane.add(button_MR);
		
		JButton btnMc = new JButton("MC");
		btnMc.setBounds(16, 163, 61, 42);
		contentPane.add(btnMc);
		
		JButton button_Nhan = new JButton("*");
		button_Nhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tinh();
				value_2.setText(value_2.getText() + value_1.getText() + "  -  ");
				value_1.setText("");
				Phep_Tinh = "Tru";
			}
		});
		button_Nhan.setBounds(308, 217, 61, 42);
		contentPane.add(button_Nhan);
		
		JButton button_Chia = new JButton("/");
		button_Chia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tinh();
				value_2.setText(value_2.getText() + value_1.getText() + "  -  ");
				value_1.setText("");
				Phep_Tinh = "Tru";
			}
		});
		button_Chia.setBounds(308, 163, 61, 42);
		contentPane.add(button_Chia);
		
		button_Tru = new JButton("-");
		button_Tru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Tinh();
				value_2.setText(value_2.getText() + value_1.getText() + "  -  ");
				value_1.setText("");
				Phep_Tinh = "Tru";
			}
		});
		button_Tru.setBounds(308, 272, 61, 42);
		contentPane.add(button_Tru);
		
		JButton button_Cong = new JButton("+");
		button_Cong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tinh();
				value_2.setText(value_2.getText() + value_1.getText() + "  +  ");
				value_1.setText("");
				Phep_Tinh = "Cong";
				
			}
		});
		button_Cong.setBounds(308, 324, 61, 42);
		contentPane.add(button_Cong);
		
		JButton button_Phan_Tram = new JButton("%");
		button_Phan_Tram.setBounds(376, 217, 61, 42);
		contentPane.add(button_Phan_Tram);
		
		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double Can;
				
			}
		});
		btnSqrt.setBounds(376, 163, 61, 42);
		contentPane.add(btnSqrt);
		
		JButton btnx = new JButton("1/X");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double Nghich_Dao;
				Nghich_Dao =1/Float.parseFloat(value_1.getText());
				value_1.setText(String.valueOf(Nghich_Dao));
			}
		});
		btnx.setBounds(376, 272, 61, 42);
		contentPane.add(btnx);
		
		JButton button_Ket_qua = new JButton("=");
		button_Ket_qua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				two = value_1.getText();
				switch (Phep_Tinh) {
					case "Tru":
						if(dem < 2)
						{
							BigDecimal a = new BigDecimal(one);
							BigDecimal b = new BigDecimal(two);
//							kp= one - two;
							switch (Phep_Tinh) {
							case "Tru":
								temp = String.valueOf(a.subtract(b).floatValue());
								break;
							case "Cong":
								temp = String.valueOf(a.add(b).floatValue());
								break;
							}
						}
						else
						{
							if(dem >= 2)
							{
								BigDecimal a = new BigDecimal(temp);
								BigDecimal b = new BigDecimal(two);
//								kp = temp -two;
								switch (Phep_Tinh) {
								case "Tru":
									temp = String.valueOf(a.subtract(b).floatValue());
									break;
								case "Cong":
									temp = String.valueOf(a.add(b).floatValue());
									break;
								}
							}
						}
						value_2.setText("");
						value_1.setText(String.valueOf(kp));
						break;
						
				}
				reset = true;
			}
		});
		button_Ket_qua.setBounds(376, 324, 61, 42);
		contentPane.add(button_Ket_qua);
		
		JButton btn_BackSpc = new JButton("BackSpc");
		btn_BackSpc.setBounds(16, 110, 133, 40);
		contentPane.add(btn_BackSpc);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value_1.setText(null);
				value_2.setText(null);
			}
		});
		btnC.setBounds(162, 110, 134, 40);
		contentPane.add(btnC);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value_1.setText(null);
			}
		});
		btnCe.setBounds(308, 110, 129, 40);
		contentPane.add(btnCe);
		
		
	}
}
