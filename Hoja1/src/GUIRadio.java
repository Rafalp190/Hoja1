import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;

public class GUIRadio extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAMyFM;
	private JTextField txtEmisora;
	private JTextField textFieldEmisoraDisplay;
	private RadioCarro carRadio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIRadio frame = new GUIRadio();
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
	public GUIRadio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JButton botoONyOFF = new JButton("ON/OFF");
		botoONyOFF.setBounds(27, 23, 71, 23);
		panel.setLayout(null);
		panel.add(botoONyOFF);
		
		JButton btnAmfm = new JButton("AM/FM");
		btnAmfm.setBounds(323, 23, 65, 23);
		panel.add(btnAmfm);
		
		textFieldAMyFM = new JTextField();
		textFieldAMyFM.setBounds(323, 57, 65, 20);
		textFieldAMyFM.setEditable(false);
		panel.add(textFieldAMyFM);
		textFieldAMyFM.setColumns(10);
		
		txtEmisora = new JTextField();
		txtEmisora.setEditable(false);
		txtEmisora.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmisora.setText("Emisora");
		txtEmisora.setBounds(161, 89, 86, 20);
		panel.add(txtEmisora);
		txtEmisora.setColumns(10);
		
		textFieldEmisoraDisplay = new JTextField();
		textFieldEmisoraDisplay.setEditable(false);
		textFieldEmisoraDisplay.setBounds(161, 120, 86, 20);
		panel.add(textFieldEmisoraDisplay);
		textFieldEmisoraDisplay.setColumns(10);
		
		JButton backEmisora = new JButton("<--");
		backEmisora.setBounds(107, 119, 49, 23);
		panel.add(backEmisora);
		
		JButton forwardEmisora = new JButton("-->");
		forwardEmisora.setBounds(251, 119, 49, 23);
		panel.add(forwardEmisora);
		
		JButton buttonEmisora1 = new JButton("1");
		buttonEmisora1.setBounds(27, 153, 39, 23);
		panel.add(buttonEmisora1);
		
		JButton buttonEmisora2 = new JButton("2");
		buttonEmisora2.setBounds(76, 153, 39, 23);
		panel.add(buttonEmisora2);
		
		JButton buttonEmisora3 = new JButton("3");
		buttonEmisora3.setBounds(127, 153, 39, 23);
		panel.add(buttonEmisora3);
		
		JButton buttonEmisora4 = new JButton("4");
		buttonEmisora4.setBounds(176, 153, 39, 23);
		panel.add(buttonEmisora4);
		
		JButton buttonEmisora5 = new JButton("5");
		buttonEmisora5.setBounds(225, 153, 39, 23);
		panel.add(buttonEmisora5);
		
		JButton buttonEmisora6 = new JButton("6");
		buttonEmisora6.setBounds(274, 153, 39, 23);
		panel.add(buttonEmisora6);
		
		JButton buttonEmisora7 = new JButton("7");
		buttonEmisora7.setBounds(323, 153, 39, 23);
		panel.add(buttonEmisora7);
		
		JButton buttonEmisora8 = new JButton("8");
		buttonEmisora8.setBounds(372, 153, 39, 23);
		panel.add(buttonEmisora8);
		
		JButton buttonEmisora9 = new JButton("9");
		buttonEmisora9.setBounds(86, 193, 49, 23);
		panel.add(buttonEmisora9);
		
		JButton buttonEmisora10 = new JButton("10");
		buttonEmisora10.setBounds(147, 193, 49, 23);
		panel.add(buttonEmisora10);
		
		JButton buttonEmisora11 = new JButton("11");
		buttonEmisora11.setBounds(206, 193, 49, 23);
		panel.add(buttonEmisora11);
		
		JButton buttonEmisora12 = new JButton("12");
		buttonEmisora12.setBounds(271, 193, 49, 23);
		panel.add(buttonEmisora12);
		
		
	}
}
