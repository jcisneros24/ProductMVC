package com.hiveit.pe.sf.view;

import java.awt.EventQueue;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class JFProductUpdate extends JFrame {

	private JPanel contentPane;
	public JTextField txtReferenceOld;
	public JButton btnUpdate;
	public JTextField txtReferenceNew;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFProductUpdate frame = new JFProductUpdate();
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
	public JFProductUpdate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 203);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblProductUpdate = new JLabel("Product Update");
		lblProductUpdate.setFont(new Font("Verdana", Font.BOLD, 14));
		lblProductUpdate.setBounds(15, 5, 207, 14);
		
		JLabel lblReference = new JLabel("Reference old:");
		lblReference.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblReference.setBounds(15, 37, 140, 32);
		
		txtReferenceOld = new JTextField();
		txtReferenceOld.setBounds(165, 37, 157, 20);
		txtReferenceOld.setColumns(10);
		
		btnUpdate = new JButton("Update");
		btnUpdate.setBounds(332, 53, 92, 23);
		
		JLabel lblReferenceNew = new JLabel("Reference new:");
		lblReferenceNew.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblReferenceNew.setBounds(15, 75, 140, 32);
		
		txtReferenceNew = new JTextField();
		txtReferenceNew.setBounds(165, 75, 157, 20);
		txtReferenceNew.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
			}
		});
		txtReferenceNew.setColumns(10);
		contentPane.setLayout(null);
		contentPane.add(lblProductUpdate);
		contentPane.add(lblReference);
		contentPane.add(txtReferenceOld);
		contentPane.add(btnUpdate);
		contentPane.add(lblReferenceNew);
		contentPane.add(txtReferenceNew);
	}
}
