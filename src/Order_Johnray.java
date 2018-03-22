import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Order_Johnray extends JFrame {
	
	String total;
	int cc;
	private JPanel contentPane;
	private JTextField tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10;
	private JTextField tx11,tx12,tx13,tx14,tx15,tx16,tx17,tx18;
	private JTextField tx19,tx20,tx21,tx22,tx23,tx24,tx25,tx26;
	private JTextField tx27,tx28,tx29,tx30,tx31,tx32,tx33,tx34,tx35;
	private JTextField tx36,tx37,tx38,tx39,tx40,tx41,tx42,tx43,tx46;
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order_Johnray frame = new Order_Johnray();
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
	public Order_Johnray() {
		setTitle("Karinderya ni Aling Ligaya");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1350, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ulam");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(0, 7, 221, 32);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblNewLabel);
		
		JCheckBox jr1 = new JCheckBox("Singang na Baboy Php35");
		jr1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr1.isSelected())
				{
					tx2.setEnabled(true);
					tx2.setText("");
					tx2.requestFocus();
				}else {
					tx2.setEnabled(false);
					tx2.setText("0");
				}
				
			}
		});
		jr1.setBounds(0, 39, 221, 32);
		panel_6.add(jr1);
		
		JCheckBox jr2 = new JCheckBox("Adobong manok Php30");
		jr2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr2.isSelected())
				{
					tx3.setEnabled(true);
					tx3.setText("");
					tx3.requestFocus();
				}else {
					tx3.setEnabled(false);
					tx3.setText("0");
				}
			}
		});
		jr2.setBounds(0, 71, 221, 32);
		panel_6.add(jr2);
		
		JCheckBox jr3 = new JCheckBox("Seafood Paella Php30");
		jr3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr3.isSelected())
				{
					tx4.setEnabled(true);
					tx4.setText("");
					tx4.requestFocus();
				}else {
					tx4.setEnabled(false);
					tx4.setText("0");
				}
			}
		});
		jr3.setBounds(0, 103, 221, 32);
		panel_6.add(jr3);
		
		JCheckBox jr4 = new JCheckBox("Kare Kare Php25");
		jr4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr4.isSelected())
				{
					tx5.setEnabled(true);
					tx5.setText("");
					tx5.requestFocus();
				}else {
					tx5.setEnabled(false);
					tx5.setText("0");
				}
			}
		});
		jr4.setBounds(0, 135, 221, 32);
		panel_6.add(jr4);
		
		JCheckBox jr5 = new JCheckBox("Sisig Pork Php40");
		jr5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr5.isSelected())
				{
					tx6.setEnabled(true);
					tx6.setText("");
					tx6.requestFocus();
				}else {
					tx6.setEnabled(false);
					tx6.setText("0");
				}
			}
		});
		jr5.setBounds(0, 167, 221, 32);
		panel_6.add(jr5);
		
		JCheckBox jr6 = new JCheckBox("Kaldereta Php40");
		jr6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr6.isSelected())
				{
					tx7.setEnabled(true);
					tx7.setText("");
					tx7.requestFocus();
				}else {
					tx7.setEnabled(false);
					tx7.setText("0");
				}
			}
		});
		jr6.setBounds(0, 199, 221, 32);
		panel_6.add(jr6);
		
		JCheckBox jr7 = new JCheckBox("Menudo Php35");
		jr7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr7.isSelected())
				{
					tx8.setEnabled(true);
					tx8.setText("");
					tx8.requestFocus();
				}else {
					tx8.setEnabled(false);
					tx8.setText("0");
				}
			}
		});
		jr7.setBounds(0, 231, 221, 32);
		panel_6.add(jr7);
		
		JCheckBox jr8 = new JCheckBox("Shanghai Php10");
		jr8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr8.isSelected())
				{
					tx9.setEnabled(true);
					tx9.setText("");
					tx9.requestFocus();
				}else {
					tx9.setEnabled(false);
					tx9.setText("0");
				}
			}
		});
		jr8.setBounds(0, 263, 221, 32);
		panel_6.add(jr8);
		
		JCheckBox jr9 = new JCheckBox("Tuyo Php5");
		jr9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr9.isSelected())
				{
					tx10.setEnabled(true);
					tx10.setText("");
					tx10.requestFocus();
				}else {
					tx10.setEnabled(false);
					tx10.setText("0");
				}
			}
		});
		jr9.setBounds(0, 295, 221, 32);
		panel_6.add(jr9);
		
		JCheckBox jr10 = new JCheckBox("BinagoongBaboy Php50");
		jr10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr10.isSelected())
				{
					tx11.setEnabled(true);
					tx11.setText("");
					tx11.requestFocus();
				}else {
					tx11.setEnabled(false);
					tx11.setText("0");
				}
			}
		});
		jr10.setBounds(0, 327, 221, 32);
		panel_6.add(jr10);
		
		JCheckBox jr11 = new JCheckBox("Bagoong Isda Php30");
		jr11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr11.isSelected())
				{
					tx12.setEnabled(true);
					tx12.setText("");
					tx12.requestFocus();
				}else {
					tx12.setEnabled(false);
					tx12.setText("0");
				}
			}
		});
		jr11.setBounds(0, 359, 221, 32);
		panel_6.add(jr11);
		
		JCheckBox jr12 = new JCheckBox("Tinapa Php15");
		jr12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr12.isSelected())
				{
					tx13.setEnabled(true);
					tx13.setText("");
					tx13.requestFocus();
				}else {
					tx13.setEnabled(false);
					tx13.setText("0");
				}
			}
		});
		jr12.setBounds(0, 391, 221, 32);
		panel_6.add(jr12);
		
		JCheckBox jr13 = new JCheckBox("Tortang Talong Php8");
		jr13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr13.isSelected())
				{
					tx14.setEnabled(true);
					tx14.setText("");
					tx14.requestFocus();
				}else {
					tx14.setEnabled(false);
					tx14.setText("0");
				}
			}
		});
		jr13.setBounds(0, 423, 221, 32);
		panel_6.add(jr13);
		
		JCheckBox jr14 = new JCheckBox("Maling Php10");
		jr14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr14.isSelected())
				{
					tx15.setEnabled(true);
					tx15.setText("");
					tx15.requestFocus();
				}else {
					tx15.setEnabled(false);
					tx15.setText("0");
				}
			}
		});
		jr14.setBounds(0, 455, 221, 32);
		panel_6.add(jr14);
		
		JCheckBox jr15 = new JCheckBox("Chopsuey Php20");
		jr15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr15.isSelected())
				{
					tx16.setEnabled(true);
					tx16.setText("");
					tx16.requestFocus();
				}else {
					tx16.setEnabled(false);
					tx16.setText("0");
				}
			}
		});
		jr15.setBounds(0, 487, 221, 32);
		panel_6.add(jr15);
		
		JCheckBox jr16 = new JCheckBox("Bicol Express Php35");
		jr16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr16.isSelected())
				{
					tx17.setEnabled(true);
					tx17.setText("");
					tx17.requestFocus();
				}else {
					tx17.setEnabled(false);
					tx17.setText("0");
				}
			}
		});
		jr16.setBounds(0, 519, 221, 32);
		panel_6.add(jr16);
		
		JCheckBox jr17 = new JCheckBox("Pinakbet Php25");
		jr17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr17.isSelected())
				{
					tx18.setEnabled(true);
					tx18.setText("");
					tx18.requestFocus();
				}else {
					tx18.setEnabled(false);
					tx18.setText("0");
				}
			}
		});
		jr17.setBounds(0, 551, 221, 32);
		panel_6.add(jr17);
		
		JCheckBox jr18 = new JCheckBox("Adobong Kangkong Php30");
		jr18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr18.isSelected())
				{
					tx19.setEnabled(true);
					tx19.setText("");
					tx19.requestFocus();
				}else {
					tx19.setEnabled(false);
					tx19.setText("0");
				}
			}
		});
		jr18.setBounds(0, 583, 221, 32);
		panel_6.add(jr18);
		
		JCheckBox jr19 = new JCheckBox("Munggo Php30");
		jr19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr19.isSelected()) {
					tx20.setEnabled(true);
					tx20.setText("");
					tx20.requestFocus();
				}else {
					tx20.setEnabled(false);
					tx20.setText("0");
				}
				
			}
		});
		jr19.setBounds(0, 615, 221, 32);
		panel_6.add(jr19);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 3, 3));
		
		JLabel lblNewLabel_1 = new JLabel("Quantity");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_3.add(lblNewLabel_1);
		
		tx2 = new JTextField();
		tx2.setText("0");
		tx2.setEnabled(false);
		panel_3.add(tx2);
		tx2.setColumns(10);
		
		tx3 = new JTextField();
		tx3.setText("0");
		tx3.setEnabled(false);
		panel_3.add(tx3);
		tx3.setColumns(10);
		
		tx4 = new JTextField();
		tx4.setText("0");
		tx4.setEnabled(false);
		panel_3.add(tx4);
		tx4.setColumns(10);
		
		tx5 = new JTextField();
		tx5.setText("0");
		tx5.setEnabled(false);
		panel_3.add(tx5);
		tx5.setColumns(10);
		
		tx6 = new JTextField();
		tx6.setText("0");
		tx6.setEnabled(false);
		panel_3.add(tx6);
		tx6.setColumns(10);
		
		tx7 = new JTextField();
		tx7.setText("0");
		tx7.setEnabled(false);
		panel_3.add(tx7);
		tx7.setColumns(10);
		
		tx8 = new JTextField();
		tx8.setText("0");
		tx8.setEnabled(false);
		panel_3.add(tx8);
		tx8.setColumns(10);
		
		tx9 = new JTextField();
		tx9.setText("0");
		tx9.setEnabled(false);
		panel_3.add(tx9);
		tx9.setColumns(10);
		
		tx10 = new JTextField();
		tx10.setText("0");
		tx10.setEnabled(false);
		panel_3.add(tx10);
		tx10.setColumns(10);
		
		tx11 = new JTextField();
		tx11.setText("0");
		tx11.setEnabled(false);
		panel_3.add(tx11);
		tx11.setColumns(10);
		
		tx12 = new JTextField();
		tx12.setText("0");
		tx12.setEnabled(false);
		panel_3.add(tx12);
		tx12.setColumns(10);
		
		tx13 = new JTextField();
		tx13.setText("0");
		tx13.setEnabled(false);
		panel_3.add(tx13);
		tx13.setColumns(10);
		
		tx14 = new JTextField();
		tx14.setText("0");
		tx14.setEnabled(false);
		panel_3.add(tx14);
		tx14.setColumns(10);
		
		tx15 = new JTextField();
		tx15.setText("0");
		tx15.setEnabled(false);
		panel_3.add(tx15);
		tx15.setColumns(10);
		
		tx16 = new JTextField();
		tx16.setText("0");
		tx16.setEnabled(false);
		panel_3.add(tx16);
		tx16.setColumns(10);
		
		tx17 = new JTextField();
		tx17.setText("0");
		tx17.setEnabled(false);
		panel_3.add(tx17);
		tx17.setColumns(10);
		
		tx18 = new JTextField();
		tx18.setText("0");
		tx18.setEnabled(false);
		panel_3.add(tx18);
		tx18.setColumns(10);
		
		tx19 = new JTextField();
		tx19.setText("0");
		tx19.setEnabled(false);
		panel_3.add(tx19);
		tx19.setColumns(10);
		
		tx20 = new JTextField();
		tx20.setText("0");
		tx20.setEnabled(false);
		panel_3.add(tx20);
		tx20.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Dessert");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_2);
		
		JCheckBox jr20= new JCheckBox("BlueBerry Cheesecake Php30");
		jr20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(jr20.isSelected()) {
					tx21.setEnabled(true);
					tx21.setText("");
					tx21.requestFocus();
				}else {
					tx21.setEnabled(false);
					tx21.setText("0");
				}
			}
		});
		panel_4.add(jr20);
		
		JCheckBox jr21 = new JCheckBox("Halohalo Php25");
		jr21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr21.isSelected()) {
					tx22.setEnabled(true);
					tx22.setText("");
					tx22.requestFocus();
				}else {
					tx22.setEnabled(false);
					tx22.setText("0");
				}
				
			}
		});
		panel_4.add(jr21);
		
		JCheckBox jr22 = new JCheckBox("EggPie Php15");
		jr22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr22.isSelected()) {
					tx23.setEnabled(true);
					tx23.setText("");
					tx23.requestFocus();
				}else {
					tx23.setEnabled(false);
					tx23.setText("0");
				}
			}
		});
		panel_4.add(jr22);
		
		JCheckBox jr23 = new JCheckBox("Buko Salad Php50");
		jr23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr23.isSelected()) {
					tx24.setEnabled(true);
					tx24.setText("");
					tx24.requestFocus();
				}else {
					tx24.setEnabled(false);
					tx24.setText("0");
				}
			}
		});
		panel_4.add(jr23);
		
		JCheckBox jr24 = new JCheckBox("Asukal Php2");
		jr24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr24.isSelected()) {
					tx25.setEnabled(true);
					tx25.setText("");
					tx25.requestFocus();
				}else {
					tx25.setEnabled(false);
					tx25.setText("0");
				}
			}
		});
		panel_4.add(jr24);
		
		JLabel lblJuice = new JLabel("Juice");
		lblJuice.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblJuice);
		
		JCheckBox jr25 = new JCheckBox("Pineapple Juice Php15");
		jr25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr25.isSelected()) {
					tx27.setEnabled(true);
					tx27.setText("");
					tx27.requestFocus();
				}else {
					tx27.setEnabled(false);
					tx27.setText("0");
				}
			}
		});
		panel_4.add(jr25);
		
		JCheckBox jr26 = new JCheckBox("Gin Pomelo Php30");
		jr26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr26.isSelected()) {
					tx28.setEnabled(true);
					tx28.setText("");
					tx28.requestFocus();
				}else {
					tx28.setEnabled(false);
					tx28.setText("0");
				}
			}
		});
		panel_4.add(jr26);
		
		JCheckBox jr27 = new JCheckBox("Four Season Php30");
		jr27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr27.isSelected()) {
					tx29.setEnabled(true);
					tx29.setText("");
					tx29.requestFocus();
				}else {
					tx29.setEnabled(false);
					tx29.setText("0");
				}
			}
		});
		panel_4.add(jr27);
		
		JCheckBox jr28 = new JCheckBox("Cola Php15");
		jr28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr28.isSelected()) {
					tx30.setEnabled(true);
					tx30.setText("");
					tx30.requestFocus();
				}else {
					tx30.setEnabled(false);
					tx30.setText("0");
				}
			}
		});
		panel_4.add(jr28);
		
		JCheckBox jr29 = new JCheckBox("Sprite Php15");
		jr29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr29.isSelected()) {
					tx31.setEnabled(true);
					tx31.setText("");
					tx31.requestFocus();
				}else {
					tx31.setEnabled(false);
					tx31.setText("0");
				}
			}
		});
		panel_4.add(jr29);
		
		JCheckBox jr30 = new JCheckBox("Pepsi Php15");
		jr30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr30.isSelected()) {
					tx32.setEnabled(true);
					tx32.setText("");
					tx32.requestFocus();
				}else {
					tx32.setEnabled(false);
					tx32.setText("0");
				}
			}
		});
		panel_4.add(jr30);
		
		JCheckBox jr31 = new JCheckBox("Yakult Php10");
		jr31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr31.isSelected()) {
					tx33.setEnabled(true);
					tx33.setText("");
					tx33.requestFocus();
				}else {
					tx33.setEnabled(false);
					tx33.setText("0");
				}
			}
		});
		panel_4.add(jr31);
		
		JCheckBox jr32 = new JCheckBox("Tea Php15");
		jr32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr32.isSelected()) {
					tx34.setEnabled(true);
					tx34.setText("");
					tx34.requestFocus();
				}else {
					tx34.setEnabled(false);
					tx34.setText("0");
				}
			}
		});
		panel_4.add(jr32);
		
		JLabel lblNewLabel_3 = new JLabel("Rice ");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_3);
		
		JCheckBox jr33 = new JCheckBox("ChaoPan Php30");
		jr33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr33.isSelected()) {
					tx36.setEnabled(true);
					tx36.setText("");
					tx36.requestFocus();
				}else {
					tx36.setEnabled(false);
					tx36.setText("0");
				}
			}
		});
		panel_4.add(jr33);
		
		JCheckBox jr34 = new JCheckBox("Fried Rice Php15");
		jr34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr34.isSelected()) {
					tx37.setEnabled(true);
					tx37.setText("");
					tx37.requestFocus();
				}else {
					tx37.setEnabled(false);
					tx37.setText("0");
				}
			}
		});
		panel_4.add(jr34);
		
		JCheckBox jr35 = new JCheckBox("Garlic Rice Php15");
		jr35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr35.isSelected()) {
					tx38.setEnabled(true);
					tx38.setText("");
					tx38.requestFocus();
				}else {
					tx38.setEnabled(false);
					tx38.setText("0");
				}
			}
		});
		panel_4.add(jr35);
		
		JCheckBox jr36 = new JCheckBox("Java Rice Php30");
		jr36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr36.isSelected()) {
					tx39.setEnabled(true);
					tx39.setText("");
					tx39.requestFocus();
				}else {
					tx39.setEnabled(false);
					tx39.setText("0");
				}
			}
		});
		panel_4.add(jr36);
		
		JCheckBox jr37 = new JCheckBox("Brown Rice Php15");
		jr37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr37.isSelected()) {
					tx40.setEnabled(true);
					tx40.setText("");
					tx40.requestFocus();
				}else {
					tx40.setEnabled(false);
					tx40.setText("0");
				}
			}
		});
		panel_4.add(jr37);
		
		JCheckBox jr38 = new JCheckBox("Plain Rice Php10");
		jr38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr38.isSelected()) {
					tx41.setEnabled(true);
					tx41.setText("");
					tx41.requestFocus();
				}else {
					tx41.setEnabled(false);
					tx41.setText("0");
				}
			}
		});
		panel_4.add(jr38);
		
		JCheckBox jr39 = new JCheckBox("Alamang Rice Php20");
		jr39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr39.isSelected()) {
					tx42.setEnabled(true);
					tx42.setText("");
					tx42.requestFocus();
				}else {
					tx42.setEnabled(false);
					tx42.setText("0");
				}
			}
		});
		panel_4.add(jr39);
		
		JCheckBox jr40 = new JCheckBox("Bagoong Rice Php20");
		jr40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jr40.isSelected()) {
					tx43.setEnabled(true);
					tx43.setText("");
					tx43.requestFocus();
				}else {
					tx43.setEnabled(false);
					tx43.setText("0");
				}
			}
		});
		panel_4.add(jr40);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 1, 2, 2));
		
		JLabel lblNewLabel_4 = new JLabel("Quantity");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_4);
		
		tx21 = new JTextField();
		tx21.setText("0");
		tx21.setEnabled(false);
		panel_5.add(tx21);
		tx21.setColumns(10);
		
		tx22 = new JTextField();
		tx22.setText("0");
		tx22.setEnabled(false);
		panel_5.add(tx22);
		tx22.setColumns(10);
		
		tx23 = new JTextField();
		tx23.setText("0");
		tx23.setEnabled(false);
		panel_5.add(tx23);
		tx23.setColumns(10);
		
		tx24 = new JTextField();
		tx24.setText("0");
		tx24.setEnabled(false);
		panel_5.add(tx24);
		tx24.setColumns(10);
		
		tx25 = new JTextField();
		tx25.setText("0");
		tx25.setEnabled(false);
		panel_5.add(tx25);
		tx25.setColumns(10);
		
		tx26 = new JTextField();
		tx26.setEnabled(false);
		panel_5.add(tx26);
		tx26.setColumns(10);
		
		tx27 = new JTextField();
		tx27.setText("0");
		tx27.setEnabled(false);
		panel_5.add(tx27);
		tx27.setColumns(10);
		
		tx28 = new JTextField();
		tx28.setText("0");
		tx28.setEnabled(false);
		panel_5.add(tx28);
		tx28.setColumns(10);
		
		tx29 = new JTextField();
		tx29.setText("0");
		tx29.setEnabled(false);
		panel_5.add(tx29);
		tx29.setColumns(10);
		
		tx30 = new JTextField();
		tx30.setText("0");
		tx30.setEnabled(false);
		panel_5.add(tx30);
		tx30.setColumns(10);
		
		tx31 = new JTextField();
		tx31.setText("0");
		tx31.setEnabled(false);
		panel_5.add(tx31);
		tx31.setColumns(10);
		
		tx32 = new JTextField();
		tx32.setText("0");
		tx32.setEnabled(false);
		panel_5.add(tx32);
		tx32.setColumns(10);
		
		tx33 = new JTextField();
		tx33.setText("0");
		tx33.setEnabled(false);
		panel_5.add(tx33);
		tx33.setColumns(10);
		
		tx34 = new JTextField();
		tx34.setText("0");
		tx34.setEnabled(false);
		panel_5.add(tx34);
		tx34.setColumns(10);
		
		tx35 = new JTextField();
		tx35.setEnabled(false);
		panel_5.add(tx35);
		tx35.setColumns(10);
		
		tx36 = new JTextField();
		tx36.setText("0");
		tx36.setEnabled(false);
		panel_5.add(tx36);
		tx36.setColumns(10);
		
		tx37 = new JTextField();
		tx37.setText("0");
		tx37.setEnabled(false);
		panel_5.add(tx37);
		tx37.setColumns(10);
		
		tx38 = new JTextField();
		tx38.setText("0");
		tx38.setEnabled(false);
		panel_5.add(tx38);
		tx38.setColumns(10);
		
		tx39 = new JTextField();
		tx39.setText("0");
		tx39.setEnabled(false);
		panel_5.add(tx39);
		tx39.setColumns(10);
		
		tx40 = new JTextField();
		tx40.setText("0");
		tx40.setEnabled(false);
		panel_5.add(tx40);
		tx40.setColumns(10);
		
		tx41 = new JTextField();
		tx41.setText("0");
		tx41.setEnabled(false);
		panel_5.add(tx41);
		tx41.setColumns(10);
		
		tx42 = new JTextField();
		tx42.setText("0");
		tx42.setEnabled(false);
		panel_5.add(tx42);
		tx42.setColumns(10);
		
		tx43 = new JTextField();
		tx43.setText("0");
		tx43.setEnabled(false);
		panel_5.add(tx43);
		tx43.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTotal.setBounds(10, 326, 80, 25);
		panel_2.add(lblTotal);
		
		tx46 = new JTextField();
		tx46.setText("0");
		tx46.setHorizontalAlignment(SwingConstants.CENTER);
		tx46.setFont(new Font("Tahoma", Font.BOLD, 20));
		tx46.setColumns(10);
		tx46.setBounds(175, 319, 210, 40);
		panel_2.add(tx46);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double jr1 = Double.parseDouble(tx2.getText())*35;
				double jr2 = Double.parseDouble(tx3.getText())*35;
				double jr3 = Double.parseDouble(tx4.getText())*35;
				double jr4 = Double.parseDouble(tx5.getText())*35;
				double jr5 = Double.parseDouble(tx6.getText())*35;
				double jr6 = Double.parseDouble(tx7.getText())*35;
				double jr7 = Double.parseDouble(tx8.getText())*35;
				double jr8 = Double.parseDouble(tx9.getText())*35;
				double jr9 = Double.parseDouble(tx10.getText())*35;
				double jr10 = Double.parseDouble(tx11.getText())*35;
				double jr11 = Double.parseDouble(tx12.getText())*35;
				double jr12 = Double.parseDouble(tx13.getText())*35;
				double jr13 = Double.parseDouble(tx14.getText())*35;
				double jr14 = Double.parseDouble(tx15.getText())*35;
				double jr15 = Double.parseDouble(tx16.getText())*35;
				double jr16 = Double.parseDouble(tx17.getText())*35;
				double jr17 = Double.parseDouble(tx18.getText())*35;
				double jr18 = Double.parseDouble(tx19.getText())*35;
				double jr19 = Double.parseDouble(tx20.getText())*35;
				double jr20 = Double.parseDouble(tx21.getText())*35;
				double jr21 = Double.parseDouble(tx22.getText())*35;
				double jr22 = Double.parseDouble(tx23.getText())*35;
				double jr23 = Double.parseDouble(tx24.getText())*35;
				double jr24 = Double.parseDouble(tx25.getText())*35;
				double jr25 = Double.parseDouble(tx27.getText())*35;
				double jr26 = Double.parseDouble(tx28.getText())*35;
				double jr27 = Double.parseDouble(tx29.getText())*35;
				double jr28 = Double.parseDouble(tx30.getText())*35;
				double jr29 = Double.parseDouble(tx31.getText())*35;
				double jr30 = Double.parseDouble(tx32.getText())*35;
				double jr31 = Double.parseDouble(tx33.getText())*35;
				double jr32 = Double.parseDouble(tx34.getText())*35;
				double jr33 = Double.parseDouble(tx36.getText())*35;
				double jr34 = Double.parseDouble(tx37.getText())*35;
				double jr35 = Double.parseDouble(tx38.getText())*35;
				double jr36 = Double.parseDouble(tx39.getText())*35;
				double jr37 = Double.parseDouble(tx40.getText())*35;
				double jr38 = Double.parseDouble(tx41.getText())*35;
				double jr39 = Double.parseDouble(tx42.getText())*35;
				double jr40 = Double.parseDouble(tx43.getText())*35;
				
				
				
											
				double cc = jr1+jr2+jr3+jr4+jr5+jr6+jr7+jr8+jr9+jr10+jr11+
						jr12+jr13+jr14+jr15+jr16+jr17+jr18+jr19+jr20+
						jr21+jr22+jr23+jr24+jr25+jr26+jr27+jr28+jr29+
						jr30+jr31+jr32+jr33+jr34+jr35+jr36+jr37+jr38+
						jr39+jr40;
				total = ("Php "+ cc);
				tx46.setText(total);
																		
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(22, 558, 89, 23);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tx2.setText("0");
				tx3.setText("0");
				tx4.setText("0");
				tx5.setText("0");
				tx6.setText("0");
				tx7.setText("0");
				tx8.setText("0");
				tx9.setText("0");
				tx10.setText("0");
				tx11.setText("0");
				tx12.setText("0");
				tx13.setText("0");
				tx14.setText("0");
				tx15.setText("0");
				tx16.setText("0");
				tx17.setText("0");
				tx18.setText("0");
				tx19.setText("0");
				tx20.setText("0");
				tx21.setText("0");
				tx22.setText("0");
				tx23.setText("0");
				tx24.setText("0");
				tx25.setText("0");
				tx26.setText("0");
				tx27.setText("0");
				tx28.setText("0");
				tx29.setText("0");
				tx30.setText("0");
				tx31.setText("0");
				tx32.setText("0");
				tx33.setText("0");
				tx34.setText("0");
				tx35.setText("0");
				tx36.setText("0");
				tx37.setText("0");
				tx38.setText("0");
				tx39.setText("0");
				tx40.setText("0");
				tx46.setText("0");
											
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(180, 558, 89, 23);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Karinderya ni Aling Ligaya",
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBounds(332, 558, 89, 23);
		panel_2.add(btnNewButton_2);
	}
}
