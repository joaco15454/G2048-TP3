import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.Font;

public class visual {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					visual window = new visual();
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
	public visual() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("2048");
		frame.setBounds(100, 100, 499, 356);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(4, 4, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255)));
		panel_1.setBackground(new Color(255, 128, 192));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("2");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(40, 25, 80, 43);
		panel_1.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255)));
		panel_3.setBackground(new Color(255, 128, 192));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("2");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(10, 25, 80, 43);
		panel_3.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255)));
		panel.setBackground(new Color(255, 128, 192));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("2");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_2.setBounds(30, 25, 80, 43);
		panel.add(lblNewLabel_2);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255)));
		panel_11.setBackground(new Color(255, 128, 192));
		frame.getContentPane().add(panel_11);
		panel_11.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("2");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_3.setBounds(30, 25, 80, 43);
		panel_11.add(lblNewLabel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255)));
		panel_4.setBackground(new Color(255, 128, 192));
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("2");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_4.setBounds(10, 25, 80, 43);
		panel_4.add(lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 128, 192));
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255)));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("2");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_5.setBounds(30, 25, 80, 43);
		panel_2.add(lblNewLabel_5);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255)));
		panel_5.setBackground(new Color(255, 128, 192));
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("2");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_6.setBounds(10, 25, 80, 43);
		panel_5.add(lblNewLabel_6);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255)));
		panel_6.setBackground(new Color(255, 128, 192));
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("2");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_7.setBounds(30, 25, 80, 43);
		panel_6.add(lblNewLabel_7);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255)));
		panel_7.setBackground(new Color(255, 128, 192));
		frame.getContentPane().add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("2");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_8.setBounds(10, 25, 80, 43);
		panel_7.add(lblNewLabel_8);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255)));
		panel_8.setBackground(new Color(255, 128, 192));
		frame.getContentPane().add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("2");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_9.setBounds(10, 25, 80, 43);
		panel_8.add(lblNewLabel_9);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255)));
		panel_9.setBackground(new Color(255, 128, 192));
		frame.getContentPane().add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("2");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_10.setBounds(10, 25, 80, 43);
		panel_9.add(lblNewLabel_10);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255)));
		panel_10.setBackground(new Color(255, 128, 192));
		frame.getContentPane().add(panel_10);
		panel_10.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("2");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_11.setBounds(30, 25, 80, 43);
		panel_10.add(lblNewLabel_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255)));
		panel_12.setBackground(new Color(255, 128, 192));
		frame.getContentPane().add(panel_12);
		panel_12.setLayout(null);
		
		JLabel lblNewLabel_12 = new JLabel("2");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_12.setBounds(10, 25, 80, 43);
		panel_12.add(lblNewLabel_12);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255)));
		panel_13.setBackground(new Color(255, 128, 192));
		frame.getContentPane().add(panel_13);
		panel_13.setLayout(null);
		
		JLabel lblNewLabel_13 = new JLabel("2");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_13.setBounds(10, 25, 80, 43);
		panel_13.add(lblNewLabel_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255)));
		panel_14.setBackground(new Color(255, 128, 192));
		frame.getContentPane().add(panel_14);
		panel_14.setLayout(null);
		
		JLabel lblNewLabel_14 = new JLabel("2");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_14.setBounds(10, 25, 80, 43);
		panel_14.add(lblNewLabel_14);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255)));
		panel_15.setBackground(new Color(255, 128, 192));
		frame.getContentPane().add(panel_15);
		panel_15.setLayout(null);
		
		JLabel lblNewLabel_15 = new JLabel("2");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_15.setBounds(30, 25, 80, 43);
		panel_15.add(lblNewLabel_15);
	}
}
