package BMIPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JCheckBox;

public class BMI extends JFrame {

	private JPanel contentPane1;
	private JPanel contentPane2;
	private static JTextField feet;
	private static JTextField weightBox;
	private static JTextField ageBox;
	private static JTextField textField_3;
	private static JTextField inches;
	private static JCheckBox one;
	private static JCheckBox two;
	private static JCheckBox three;
	private static JCheckBox four;
	private static JCheckBox five;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMI frame = new BMI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public BMI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 600, 400);
		contentPane1 = new JPanel();
		contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane1);
		contentPane1.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 432, 253);
		contentPane1.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Height (feet)");
		lblNewLabel.setBounds(12, 51, 97, 16);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Weight (in lbs)");
		lblNewLabel_1.setBounds(106, 91, 97, 16);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Age");
		lblNewLabel_2.setBounds(12, 91, 34, 16);
		panel.add(lblNewLabel_2);

		feet = new JTextField();
		feet.setBounds(106, 48, 56, 22);
		panel.add(feet);
		feet.setColumns(10);

		weightBox = new JTextField();
		weightBox.setBounds(200, 88, 67, 22);
		panel.add(weightBox);
		weightBox.setColumns(10);

		ageBox = new JTextField();
		ageBox.setBounds(49, 88, 49, 22);
		panel.add(ageBox);
		ageBox.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(304, 123, 116, 22);
		panel.add(textField_3);
		textField_3.setColumns(10);

		one = new JCheckBox("Sedentary");
		one.setBounds(12, 151, 113, 25);
		panel.add(one);

		two = new JCheckBox("Lightly active");
		two.setBounds(12, 181, 113, 25);
		panel.add(two);

		JLabel lblYouAre = new JLabel("You are");
		lblYouAre.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblYouAre.setBounds(156, 120, 74, 16);
		panel.add(lblYouAre);

		three = new JCheckBox("Moderately active");
		three.setBounds(133, 151, 142, 25);
		panel.add(three);

		four = new JCheckBox("Very active");
		four.setBounds(133, 181, 113, 25);
		panel.add(four);

		five = new JCheckBox("Extremely active");
		five.setBounds(273, 151, 135, 25);
		panel.add(five);

		JLabel lblNewLabel_3 = new JLabel("Please enter your information in the specified units");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(12, 13, 408, 25);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Your BMI is");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(304, 85, 116, 25);
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Height (inches)");
		lblNewLabel_5.setBounds(190, 51, 106, 16);
		panel.add(lblNewLabel_5);

		inches = new JTextField();
		inches.setBounds(283, 51, 56, 22);
		panel.add(inches);
		inches.setColumns(10);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane2 = new JPanel();
		contentPane2.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane2.setLayout(null);

		JButton btnNewButton = new JButton("Female");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
          try{
			int feetHeight = Integer.parseInt(feet.getText());
             int inchHeight = Integer.parseInt(inches.getText());
             double weight = Double.parseDouble(weightBox.getText());
             int age = Integer.parseInt(ageBox.getText());
				double bmi;
             if (one.isSelected()) {
					 bmi = female(feetHeight, inchHeight, weight, age, 1.2);
				} else if (two.isSelected()) {
					 bmi = female(feetHeight, inchHeight, weight, age, 1.35);
				} else if (three.isSelected()) {
					 bmi = female(feetHeight, inchHeight, weight, age, 1.55);
				} else if (four.isSelected()) {
					 bmi = female(feetHeight, inchHeight, weight, age, 1.75);
				} else {
					bmi = female(feetHeight, inchHeight, weight, age, 2.05);
				}
             DecimalFormat printDouble = new DecimalFormat("#.00");
				textField_3.setText(printDouble.format(bmi));
          }catch (Exception e){
        	  System.out.println("Uninstantiated field may exist");
          }
				{

}
			}
		});
		btnNewButton.setBounds(12, 215, 97, 25);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Male");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int feetHeight = Integer.parseInt(feet.getText());
				int inchHeight = Integer.parseInt(inches.getText());
				double weight = Double.parseDouble(weightBox.getText());
				int age = Integer.parseInt(ageBox.getText());
				double bmi;
				if (one.isSelected()) {
					bmi = male(feetHeight, inchHeight, weight, age, 1.2);
				} else if (two.isSelected()) {
				 bmi = male(feetHeight, inchHeight, weight, age, 1.35);
				} else if (three.isSelected()) {
				 bmi = male(feetHeight, inchHeight, weight, age, 1.55);
				} else if (four.isSelected()) {
					 bmi = male(feetHeight, inchHeight, weight, age, 1.75);
				} else{
					 bmi = male(feetHeight, inchHeight, weight, age, 2.05);
				}
				DecimalFormat printDouble = new DecimalFormat("#.00");
				textField_3.setText(printDouble.format(bmi));
				}catch (Exception f){
					System.out.println("Uninstantiated field may exist");
				}
			}
		});
		btnNewButton_1.setBounds(149, 215, 97, 25);
		panel.add(btnNewButton_1);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				one.setSelected(false);
				two.setSelected(false);
				three.setSelected(false);
				four.setSelected(false);
				five.setSelected(false);
				feet.setText("");
				weightBox.setText("");
				ageBox.setText("");
				textField_3.setText("");
				inches.setText("");
			}
		});
		btnReset.setBounds(311, 215, 97, 25);
		panel.add(btnReset);

	}

	public static double female(int feet, int inch, double weight, int age, double tdee){
    double height =  ((feet * 12) + inch) * 2.54;
    double femaleWeight = weight * 0.453592;
    double femaleAge = age * 4.92;
    return ((height * 6.25) + (femaleWeight * 9.99) - femaleAge - 161) * tdee;
	}

	public static double male(int feet, int inch, double weight, int age, double tdee){
    double height =  ((feet * 12) + inch) * 2.54;
    double maleWeight = weight * 0.453592;
    double maleAge = age * 4.92;
    return ((height * 6.25) + (maleWeight * 9.99) - maleAge + 5) * tdee;
	}
}
