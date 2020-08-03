package arboltest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class TestGrid extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestGrid frame = new TestGrid();
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
	public TestGrid() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 303);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 31, 0, 31, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 32, 0, 31, 0, 30, 0, 31, 0, 30, 0, 31, 0, 29, 0, 0};
		gbl_contentPane.rowHeights = new int[]{48, 49, 47, 44, 50, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btnAaa = new JButton("AAA");
		
		GridBagConstraints gbc_btnAaa = new GridBagConstraints();
		gbc_btnAaa.insets = new Insets(0, 0, 5, 5);
		gbc_btnAaa.gridx = 1;
		gbc_btnAaa.gridy = 0;
		contentPane.add(btnAaa, gbc_btnAaa);
		
		JLabel label = new JLabel("0");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 15;
		gbc_label.gridy = 0;
		contentPane.add(label, gbc_label);
		
		JLabel label_1 = new JLabel("1");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 7;
		gbc_label_1.gridy = 1;
		contentPane.add(label_1, gbc_label_1);
		
		JLabel label_2 = new JLabel("2");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 23;
		gbc_label_2.gridy = 1;
		contentPane.add(label_2, gbc_label_2);
		
		JLabel label_3 = new JLabel("3");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 3;
		gbc_label_3.gridy = 2;
		contentPane.add(label_3, gbc_label_3);
		
		JLabel label_4 = new JLabel("4");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 11;
		gbc_label_4.gridy = 2;
		contentPane.add(label_4, gbc_label_4);
		
		JLabel label_5 = new JLabel("5");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 19;
		gbc_label_5.gridy = 2;
		contentPane.add(label_5, gbc_label_5);
		
		JLabel label_6 = new JLabel("6");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 27;
		gbc_label_6.gridy = 2;
		contentPane.add(label_6, gbc_label_6);
		
		JLabel label_7 = new JLabel("7");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 1;
		gbc_label_7.gridy = 3;
		contentPane.add(label_7, gbc_label_7);
		
		JLabel label_8 = new JLabel("8");
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 5;
		gbc_label_8.gridy = 3;
		contentPane.add(label_8, gbc_label_8);
		
		JLabel label_9 = new JLabel("9");
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 9;
		gbc_label_9.gridy = 3;
		contentPane.add(label_9, gbc_label_9);
		
		JLabel label_10 = new JLabel("10");
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.insets = new Insets(0, 0, 5, 5);
		gbc_label_10.gridx = 13;
		gbc_label_10.gridy = 3;
		contentPane.add(label_10, gbc_label_10);
		
		JLabel label_11 = new JLabel("11");
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.insets = new Insets(0, 0, 5, 5);
		gbc_label_11.gridx = 17;
		gbc_label_11.gridy = 3;
		contentPane.add(label_11, gbc_label_11);
		
		JLabel label_12 = new JLabel("12");
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.insets = new Insets(0, 0, 5, 5);
		gbc_label_12.gridx = 21;
		gbc_label_12.gridy = 3;
		contentPane.add(label_12, gbc_label_12);
		
		JLabel label_13 = new JLabel("13");
		GridBagConstraints gbc_label_13 = new GridBagConstraints();
		gbc_label_13.insets = new Insets(0, 0, 5, 5);
		gbc_label_13.gridx = 25;
		gbc_label_13.gridy = 3;
		contentPane.add(label_13, gbc_label_13);
		
		JLabel label_14 = new JLabel("14");
		GridBagConstraints gbc_label_14 = new GridBagConstraints();
		gbc_label_14.insets = new Insets(0, 0, 5, 5);
		gbc_label_14.gridx = 29;
		gbc_label_14.gridy = 3;
		contentPane.add(label_14, gbc_label_14);
		
		JLabel label_15 = new JLabel("15");
		GridBagConstraints gbc_label_15 = new GridBagConstraints();
		gbc_label_15.insets = new Insets(0, 0, 5, 5);
		gbc_label_15.gridx = 0;
		gbc_label_15.gridy = 4;
		contentPane.add(label_15, gbc_label_15);
		
		JLabel label_16 = new JLabel("16");
		GridBagConstraints gbc_label_16 = new GridBagConstraints();
		gbc_label_16.insets = new Insets(0, 0, 5, 5);
		gbc_label_16.gridx = 2;
		gbc_label_16.gridy = 4;
		contentPane.add(label_16, gbc_label_16);
		
		JLabel label_17 = new JLabel("17");
		GridBagConstraints gbc_label_17 = new GridBagConstraints();
		gbc_label_17.insets = new Insets(0, 0, 5, 5);
		gbc_label_17.gridx = 4;
		gbc_label_17.gridy = 4;
		contentPane.add(label_17, gbc_label_17);
		
		JLabel label_18 = new JLabel("18");
		GridBagConstraints gbc_label_18 = new GridBagConstraints();
		gbc_label_18.insets = new Insets(0, 0, 5, 5);
		gbc_label_18.gridx = 6;
		gbc_label_18.gridy = 4;
		contentPane.add(label_18, gbc_label_18);
		
		JLabel label_19 = new JLabel("19");
		GridBagConstraints gbc_label_19 = new GridBagConstraints();
		gbc_label_19.insets = new Insets(0, 0, 5, 5);
		gbc_label_19.gridx = 8;
		gbc_label_19.gridy = 4;
		contentPane.add(label_19, gbc_label_19);
		
		JLabel label_20 = new JLabel("20");
		GridBagConstraints gbc_label_20 = new GridBagConstraints();
		gbc_label_20.insets = new Insets(0, 0, 5, 5);
		gbc_label_20.gridx = 10;
		gbc_label_20.gridy = 4;
		contentPane.add(label_20, gbc_label_20);
		
		JLabel label_21 = new JLabel("21");
		GridBagConstraints gbc_label_21 = new GridBagConstraints();
		gbc_label_21.insets = new Insets(0, 0, 5, 5);
		gbc_label_21.gridx = 12;
		gbc_label_21.gridy = 4;
		contentPane.add(label_21, gbc_label_21);
		
		JLabel label_22 = new JLabel("22");
		GridBagConstraints gbc_label_22 = new GridBagConstraints();
		gbc_label_22.insets = new Insets(0, 0, 5, 5);
		gbc_label_22.gridx = 14;
		gbc_label_22.gridy = 4;
		contentPane.add(label_22, gbc_label_22);
		
		JLabel label_23 = new JLabel("23");
		GridBagConstraints gbc_label_23 = new GridBagConstraints();
		gbc_label_23.insets = new Insets(0, 0, 5, 5);
		gbc_label_23.gridx = 16;
		gbc_label_23.gridy = 4;
		contentPane.add(label_23, gbc_label_23);
		
		JLabel label_24 = new JLabel("24");
		GridBagConstraints gbc_label_24 = new GridBagConstraints();
		gbc_label_24.insets = new Insets(0, 0, 5, 5);
		gbc_label_24.gridx = 18;
		gbc_label_24.gridy = 4;
		contentPane.add(label_24, gbc_label_24);
		
		JLabel label_25 = new JLabel("25");
		GridBagConstraints gbc_label_25 = new GridBagConstraints();
		gbc_label_25.insets = new Insets(0, 0, 5, 5);
		gbc_label_25.gridx = 20;
		gbc_label_25.gridy = 4;
		contentPane.add(label_25, gbc_label_25);
		
		JLabel label_26 = new JLabel("26");
		GridBagConstraints gbc_label_26 = new GridBagConstraints();
		gbc_label_26.insets = new Insets(0, 0, 5, 5);
		gbc_label_26.gridx = 22;
		gbc_label_26.gridy = 4;
		contentPane.add(label_26, gbc_label_26);
		
		JLabel label_27 = new JLabel("27");
		GridBagConstraints gbc_label_27 = new GridBagConstraints();
		gbc_label_27.insets = new Insets(0, 0, 5, 5);
		gbc_label_27.gridx = 24;
		gbc_label_27.gridy = 4;
		contentPane.add(label_27, gbc_label_27);
		
		JLabel label_28 = new JLabel("28");
		GridBagConstraints gbc_label_28 = new GridBagConstraints();
		gbc_label_28.insets = new Insets(0, 0, 5, 5);
		gbc_label_28.gridx = 26;
		gbc_label_28.gridy = 4;
		contentPane.add(label_28, gbc_label_28);
		
		JLabel label_29 = new JLabel("29");
		GridBagConstraints gbc_label_29 = new GridBagConstraints();
		gbc_label_29.insets = new Insets(0, 0, 5, 5);
		gbc_label_29.gridx = 28;
		gbc_label_29.gridy = 4;
		contentPane.add(label_29, gbc_label_29);
		
		JLabel label_30 = new JLabel("30");
		GridBagConstraints gbc_label_30 = new GridBagConstraints();
		gbc_label_30.insets = new Insets(0, 0, 5, 0);
		gbc_label_30.gridx = 30;
		gbc_label_30.gridy = 4;
		contentPane.add(label_30, gbc_label_30);
		
		btnAaa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_30.setIcon(new ImageIcon(TestGrid.class.getResource("/javax/swing/plaf/metal/icons/Error.gif")));
				label_30.setText("");
			}
		});
	}

}
