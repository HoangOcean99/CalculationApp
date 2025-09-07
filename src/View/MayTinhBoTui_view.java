package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.MayTinhBoTui_Model;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JSeparator;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.Color;

import javax.swing.AbstractAction;
import javax.swing.Action;

public class MayTinhBoTui_view extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField textField;
	public double ketQuaPhepTinh;
	public MayTinhBoTui_Model mtbt_m;
	public String phepTinh;
	
	public double Solve(String phepTinh) {
		if(phepTinh.equals("+")) {
			ketQuaPhepTinh = mtbt_m.Cong();
		}
		else if(phepTinh.equals("-")) {
			ketQuaPhepTinh = mtbt_m.Tru();
		}
		else if(phepTinh.equals("*")) {
			ketQuaPhepTinh = mtbt_m.Nhan();
		}
		else if(phepTinh.equals("/")) {
			ketQuaPhepTinh = mtbt_m.Chia();
		}
		else if(phepTinh.equals("^")) {
			ketQuaPhepTinh = mtbt_m.mu();
		}
		return ketQuaPhepTinh;
	}
	
	public static MayTinhBoTui_view frame = new MayTinhBoTui_view();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
	public MayTinhBoTui_view() {	
		mtbt_m = new MayTinhBoTui_Model();
		setPreferredSize(new Dimension(250, 400));
		setTitle("Mini Calculator");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 338, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.LIGHT_GRAY);
		setIconImage(Toolkit.getDefaultToolkit().createImage(MayTinhBoTui_view.class.getResource("Hopstarter-Soft-Scraps-Calculator.16.png")));
	
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setColumns(10);
		textField.setBounds(10, 24, 309, 47);
		contentPane.add(textField);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String src_1 = e.getActionCommand();
				textField.setText(textField.getText()+src_1);
			}
		});
		btnNewButton_1.setBounds(10, 139, 61, 37);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String src_2 = e.getActionCommand();
				textField.setText(textField.getText()+src_2);
			}
		});
		btnNewButton_2.setBounds(92, 139, 61, 37);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String src_3 = e.getActionCommand();
				textField.setText(textField.getText()+src_3);
			}
		});
		btnNewButton_3.setBounds(175, 139, 61, 37);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String src_4 = e.getActionCommand();
				textField.setText(textField.getText()+src_4);
			}
		});
		btnNewButton_4.setBounds(10, 186, 61, 37);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String src_5 = e.getActionCommand();
				textField.setText(textField.getText()+src_5);
			}
		});
		btnNewButton_5.setBounds(92, 186, 61, 37);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String src_6 = e.getActionCommand();
				textField.setText(textField.getText()+src_6);
			}
		});
		btnNewButton_6.setBounds(175, 186, 61, 37);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String src_7 = e.getActionCommand();
				textField.setText(textField.getText()+src_7);
			}
		});
		btnNewButton_7.setBounds(10, 239, 61, 37);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String src_8 = e.getActionCommand();
				textField.setText(textField.getText()+src_8);
			}
		});
		btnNewButton_8.setBounds(92, 239, 61, 37);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String src_9 = e.getActionCommand();
				textField.setText(textField.getText()+src_9);
			}
		});
		btnNewButton_9.setBounds(175, 239, 61, 37);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_0 = new JButton("0");
		btnNewButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String src_0 = e.getActionCommand();
				textField.setText(textField.getText()+src_0);
			}
		});
		btnNewButton_0.setBounds(10, 294, 61, 37);
		contentPane.add(btnNewButton_0);
		
		JButton btnNewButton_plus = new JButton("+");
		btnNewButton_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mtbt_m.setA(Double.valueOf(textField.getText()));
				textField.setText("");	
				phepTinh = btnNewButton_plus.getText();
			}
		});
		btnNewButton_plus.setBounds(258, 92, 61, 37);
		contentPane.add(btnNewButton_plus);
		
		JButton btnNewButton_minus = new JButton("-");
		btnNewButton_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mtbt_m.setA(Double.valueOf(textField.getText()));
				textField.setText("");	
				phepTinh = btnNewButton_minus.getText();
			}
		});
		btnNewButton_minus.setBounds(258, 139, 61, 37);
		contentPane.add(btnNewButton_minus);
		
		JButton btnNewButton_multiplicate = new JButton("*");
		btnNewButton_multiplicate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mtbt_m.setA(Double.valueOf(textField.getText()));
				textField.setText("");	
				phepTinh = btnNewButton_multiplicate.getText();
			}
		});
		btnNewButton_multiplicate.setBounds(258, 186, 61, 37);
		contentPane.add(btnNewButton_multiplicate);
	
		JButton btnNewButton_divide = new JButton("/");
		btnNewButton_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mtbt_m.setA(Double.valueOf(textField.getText()));
				textField.setText("");	
				phepTinh = btnNewButton_divide.getText();			}

		});
		btnNewButton_divide.setBounds(258, 239, 61, 37);
		contentPane.add(btnNewButton_divide);
		
		JButton btnNewButton_xoaAll = new JButton("AC");
		btnNewButton_xoaAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton_xoaAll.setBounds(10, 92, 61, 37);
		contentPane.add(btnNewButton_xoaAll);
		
		JButton btnNewButton_xoa1Chu = new JButton("C");
		btnNewButton_xoa1Chu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String soFieldText2 = textField.getText();
				String soC = soFieldText2.substring(0, soFieldText2.length()-1);
				textField.setText(soC);
				
			}
		});
		btnNewButton_xoa1Chu.setBounds(92, 92, 61, 37);
		contentPane.add(btnNewButton_xoa1Chu);
		
		JButton btnNewButton_doiDau = new JButton("+/-");
		btnNewButton_doiDau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double soFieldText = Double.valueOf(textField.getText());
				double doiDau = -soFieldText;
				textField.setText(doiDau+"");
			}
		});
		btnNewButton_doiDau.setBounds(175, 294, 61, 37);
		contentPane.add(btnNewButton_doiDau);
		
		JButton btnNewButton_phay = new JButton(".");
		btnNewButton_phay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String src_phay = e.getActionCommand();
				textField.setText(textField.getText()+src_phay);
			}
		});
		btnNewButton_phay.setBounds(92, 294, 61, 37);
		contentPane.add(btnNewButton_phay);
		
		JButton btnNewButton_mu = new JButton("^");
		btnNewButton_mu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mtbt_m.setA(Double.valueOf(textField.getText()));
				textField.setText("");	
				phepTinh = btnNewButton_mu.getText();
			}
		});
		btnNewButton_mu.setBounds(175, 92, 61, 37);
		contentPane.add(btnNewButton_mu);
		
		JButton btnNewButton_bang = new JButton("=");
		btnNewButton_bang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mtbt_m.setB(Double.valueOf(textField.getText()));
				textField.setText(Solve(phepTinh)+"");
			}
		});
		btnNewButton_bang.setBounds(258, 294, 61, 37);
		contentPane.add(btnNewButton_bang);

		JMenuBar jmenubar = new JMenuBar();
		JMenu mnNewMenu_system = new JMenu("System");
		mnNewMenu_system.setActionCommand("");
		
		
		JMenu mnNewMenu_background = new JMenu("Background");
		mnNewMenu_background.setMargin(new Insets(0, 0, 0, 0));
		mnNewMenu_system.add(mnNewMenu_background);
		
		JMenuItem mntmNewMenuItem_light = new JMenuItem("Light");
		mntmNewMenuItem_light.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.LIGHT_GRAY);
				textField.setBackground(Color.WHITE);
				btnNewButton_0.setBackground(Color.WHITE);
                btnNewButton_1.setBackground(Color.WHITE);
				btnNewButton_2.setBackground(Color.WHITE);
				btnNewButton_3.setBackground(Color.WHITE);
				btnNewButton_4.setBackground(Color.WHITE);
				btnNewButton_5.setBackground(Color.WHITE);
				btnNewButton_6.setBackground(Color.WHITE);
				btnNewButton_7.setBackground(Color.WHITE);
				btnNewButton_8.setBackground(Color.WHITE);
				btnNewButton_9.setBackground(Color.WHITE);
				btnNewButton_bang.setBackground(Color.WHITE);
				btnNewButton_divide.setBackground(Color.WHITE);
				btnNewButton_doiDau.setBackground(Color.WHITE);
				btnNewButton_minus.setBackground(Color.WHITE);
				btnNewButton_mu.setBackground(Color.WHITE);
				btnNewButton_phay.setBackground(Color.WHITE);
				btnNewButton_plus.setBackground(Color.WHITE);
				btnNewButton_xoa1Chu.setBackground(Color.WHITE);
				btnNewButton_xoaAll.setBackground(Color.WHITE);
				btnNewButton_multiplicate.setBackground(Color.WHITE);
				
				textField.setForeground(Color.BLACK);
				btnNewButton_0.setForeground(Color.BLACK);
                btnNewButton_1.setForeground(Color.BLACK);
				btnNewButton_2.setForeground(Color.BLACK);
				btnNewButton_3.setForeground(Color.BLACK);
				btnNewButton_4.setForeground(Color.BLACK);
				btnNewButton_5.setForeground(Color.BLACK);
				btnNewButton_6.setForeground(Color.BLACK);
				btnNewButton_7.setForeground(Color.BLACK);
				btnNewButton_8.setForeground(Color.BLACK);
				btnNewButton_9.setForeground(Color.BLACK);
				btnNewButton_bang.setForeground(Color.BLACK);
				btnNewButton_divide.setForeground(Color.BLACK);
				btnNewButton_doiDau.setForeground(Color.BLACK);
				btnNewButton_minus.setForeground(Color.BLACK);
				btnNewButton_mu.setForeground(Color.BLACK);
				btnNewButton_phay.setForeground(Color.BLACK);
				btnNewButton_plus.setForeground(Color.BLACK);
				btnNewButton_xoa1Chu.setForeground(Color.BLACK);
				btnNewButton_xoaAll.setForeground(Color.BLACK);
                btnNewButton_multiplicate.setForeground(Color.BLACK);
			}
		});
		mnNewMenu_background.add(mntmNewMenuItem_light);
		
		JMenuItem mntmNewMenuItem_dark = new JMenuItem("Dark");
		mntmNewMenuItem_dark.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.GRAY);
				textField.setBackground(Color.BLACK);
				btnNewButton_0.setBackground(Color.BLACK);
                btnNewButton_1.setBackground(Color.BLACK);
				btnNewButton_2.setBackground(Color.BLACK);
				btnNewButton_3.setBackground(Color.BLACK);
				btnNewButton_4.setBackground(Color.BLACK);
				btnNewButton_5.setBackground(Color.BLACK);
				btnNewButton_6.setBackground(Color.BLACK);
				btnNewButton_7.setBackground(Color.BLACK);
				btnNewButton_8.setBackground(Color.BLACK);
				btnNewButton_9.setBackground(Color.BLACK);
				btnNewButton_bang.setBackground(Color.BLACK);
				btnNewButton_divide.setBackground(Color.BLACK);
				btnNewButton_doiDau.setBackground(Color.BLACK);
				btnNewButton_minus.setBackground(Color.BLACK);
				btnNewButton_mu.setBackground(Color.BLACK);
				btnNewButton_phay.setBackground(Color.BLACK);
				btnNewButton_plus.setBackground(Color.BLACK);
				btnNewButton_xoa1Chu.setBackground(Color.BLACK);
				btnNewButton_xoaAll.setBackground(Color.BLACK);
				btnNewButton_multiplicate.setBackground(Color.BLACK);
				
				textField.setForeground(Color.WHITE);
				btnNewButton_0.setForeground(Color.WHITE);
                btnNewButton_1.setForeground(Color.WHITE);
				btnNewButton_2.setForeground(Color.WHITE);
				btnNewButton_3.setForeground(Color.WHITE);
				btnNewButton_4.setForeground(Color.WHITE);
				btnNewButton_5.setForeground(Color.WHITE);
				btnNewButton_6.setForeground(Color.WHITE);
				btnNewButton_7.setForeground(Color.WHITE);
				btnNewButton_8.setForeground(Color.WHITE);
				btnNewButton_9.setForeground(Color.WHITE);
				btnNewButton_bang.setForeground(Color.WHITE);
				btnNewButton_divide.setForeground(Color.WHITE);
				btnNewButton_doiDau.setForeground(Color.WHITE);
				btnNewButton_minus.setForeground(Color.WHITE);
				btnNewButton_mu.setForeground(Color.WHITE);
				btnNewButton_phay.setForeground(Color.WHITE);
				btnNewButton_plus.setForeground(Color.WHITE);
				btnNewButton_xoa1Chu.setForeground(Color.WHITE);
				btnNewButton_xoaAll.setForeground(Color.WHITE);
                btnNewButton_multiplicate.setForeground(Color.WHITE);
				
			}
		});
		mnNewMenu_background.add(mntmNewMenuItem_dark);
		
		
		JMenu mnNewMenu_help = new JMenu("Help");
		
		
		JMenuItem mntmNewMenuItem_use = new JMenuItem("Use");
		mntmNewMenuItem_use.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String HTUse = "Turn it on.\r\n"
						+ "Log in or unlock.\r\n"
						+ "Use apps and features.\r\n"
						+ "Connect to networks and devices.\r\n"
						+ "Manage power.\r\n"
						+ "Turn it off when not in use.";
				JOptionPane.showMessageDialog(frame, HTUse , "How to use", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		mnNewMenu_help.add(mntmNewMenuItem_use);
		
		jmenubar.add(mnNewMenu_system);
		
		JSeparator separator = new JSeparator();
		mnNewMenu_system.add(separator);
		
		JMenuItem mntmNewMenuItem_exit = new JMenuItem("Exit");
		mntmNewMenuItem_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu_system.add(mntmNewMenuItem_exit);
		jmenubar.add(mnNewMenu_help);
		
		this.setJMenuBar(jmenubar);
	}


}
