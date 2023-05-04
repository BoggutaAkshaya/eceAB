package restro_bill;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bill {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill window = new bill();
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
	public bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Restro_Bill");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 20));
		lblNewLabel.setBounds(320, 11, 151, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Menu");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_1.setBounds(59, 118, 73, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantity");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_2.setBounds(59, 200, 87, 29);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "Tea-Rs.10", "Coffee-Rs.30", "Maggiee-Rs.50", "Icecream-Rs.80"}));
		c1.setBounds(215, 126, 73, 22);
		frame.getContentPane().add(c1);
		
		t1 = new JTextField();
		t1.setBounds(215, 206, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("Order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item=(String) c1.getSelectedItem();
				String quantity=t1.getText();
				int q=Integer.parseInt(quantity);
				int bill=0;
				if(item.equals("Tea-Rs.10")) 
				{
					bill=q*10;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Selected item: "+item+"\n Quantity: "+q+"\n your bill:"+bill);
					
				}
				else if(item.equals("Coffee-Rs.30")) {
					bill=q*30;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Selected item: "+item+"\n Quantity: "+q+"\n your bill:"+bill);
				
				}
				else if(item.equals("Maggiee-Rs.50")) {
					bill=q*50;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Selected item: "+item+"\n Quantity: "+q+"\n your bill:"+bill);
				
				}
				else if(item.equals("Icecream-Rs.80")) {
					bill=q*80;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Selected item: "+item+"\n Quantity: "+q+"\n your bill:"+bill);
					
				}
					                                  
							}
		});
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 15));
		btnNewButton.setBounds(146, 285, 89, 23);
		frame.getContentPane().add(btnNewButton);
		frame.setBackground(Color.PINK);
		frame.setBounds(100, 100, 772, 432);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
