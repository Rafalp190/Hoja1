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
	private JButton forwardEmisora;
	private JButton botoONyOFF;
	private JButton btnAmfm;
	private JButton backEmisora;
	private JButton buttonEmisora1;
	private JButton buttonEmisora2;
	private JButton buttonEmisora3;
	private JButton buttonEmisora4;
	private JButton buttonEmisora5;
	private JButton buttonEmisora6;
	private JButton buttonEmisora7;
	private JButton buttonEmisora8;
	private JButton buttonEmisora9;
	private JButton buttonEmisora10;
	private JButton buttonEmisora11;
	private JButton buttonEmisora12;

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
		panel.setLayout(null);
		
		botoONyOFF = new JButton("ON/OFF");
		botoONyOFF.setBounds(27, 23, 71, 23);
		panel.add(botoONyOFF);
		
		btnAmfm = new JButton("AM/FM");
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
		
		backEmisora = new JButton("<--");
		backEmisora.setBounds(107, 119, 49, 23);
		panel.add(backEmisora);
		
		forwardEmisora = new JButton("-->");
		forwardEmisora.setBounds(251, 119, 49, 23);
		panel.add(forwardEmisora);
		
		buttonEmisora1 = new JButton("1");
		buttonEmisora1.setBounds(27, 153, 39, 23);
		panel.add(buttonEmisora1);
		
		buttonEmisora2 = new JButton("2");
		buttonEmisora2.setBounds(76, 153, 39, 23);
		panel.add(buttonEmisora2);
		
		buttonEmisora3 = new JButton("3");
		buttonEmisora3.setBounds(127, 153, 39, 23);
		panel.add(buttonEmisora3);
		
		buttonEmisora4 = new JButton("4");
		buttonEmisora4.setBounds(176, 153, 39, 23);
		panel.add(buttonEmisora4);
		
		buttonEmisora5 = new JButton("5");
		buttonEmisora5.setBounds(225, 153, 39, 23);
		panel.add(buttonEmisora5);
		
		buttonEmisora6 = new JButton("6");
		buttonEmisora6.setBounds(274, 153, 39, 23);
		panel.add(buttonEmisora6);
		
		buttonEmisora7 = new JButton("7");
		buttonEmisora7.setBounds(323, 153, 39, 23);
		panel.add(buttonEmisora7);
		
		buttonEmisora8 = new JButton("8");
		buttonEmisora8.setBounds(372, 153, 39, 23);
		panel.add(buttonEmisora8);
		
		buttonEmisora9 = new JButton("9");
		buttonEmisora9.setBounds(86, 193, 49, 23);
		panel.add(buttonEmisora9);
		
		buttonEmisora10 = new JButton("10");
		buttonEmisora10.setBounds(147, 193, 49, 23);
		panel.add(buttonEmisora10);
		
		buttonEmisora11 = new JButton("11");
		buttonEmisora11.setBounds(206, 193, 49, 23);
		panel.add(buttonEmisora11);
		
		buttonEmisora12 = new JButton("12");
		buttonEmisora12.setBounds(271, 193, 49, 23);
		panel.add(buttonEmisora12);
		
		botoONyOFF.addActionListener(new MiListener());
		btnAmfm.addActionListener(new MiListener());
		backEmisora.addActionListener(new MiListener());
		forwardEmisora.addActionListener(new MiListener());
		buttonEmisora1.addActionListener(new MiListener());
		buttonEmisora2.addActionListener(new MiListener());
		buttonEmisora3.addActionListener(new MiListener());
		buttonEmisora4.addActionListener(new MiListener());
		buttonEmisora5.addActionListener(new MiListener());
		buttonEmisora6.addActionListener(new MiListener());
		buttonEmisora7.addActionListener(new MiListener());
		buttonEmisora8.addActionListener(new MiListener());
		buttonEmisora9.addActionListener(new MiListener());
		buttonEmisora10.addActionListener(new MiListener());
		buttonEmisora11.addActionListener(new MiListener());
		buttonEmisora12.addActionListener(new MiListener());


	}
private class MiListener implements ActionListener{
	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==botoONyOFF){
			carRadio.setEncendido(carRadio.getEncendido());
			boolean state = carRadio.getEncendido();
			if (state==false){
				btnAmfm.disable();
				backEmisora.disable();
				forwardEmisora.disable();
				textFieldAMyFM.disable();
				txtEmisora.disable();
				textFieldEmisoraDisplay.disable();
				buttonEmisora1.disable();
				buttonEmisora2.disable();
				buttonEmisora3.disable();
				buttonEmisora4.disable();
				buttonEmisora5.disable();
				buttonEmisora6.disable();
				buttonEmisora7.disable();
				buttonEmisora8.disable();
				buttonEmisora9.disable();
				buttonEmisora10.disable();
				buttonEmisora11.disable();
				buttonEmisora12.disable();
			}
			else{
				btnAmfm.enable();
				backEmisora.enable();
				forwardEmisora.enable();
				textFieldAMyFM.enable();
				txtEmisora.enable();
				textFieldEmisoraDisplay.enable();
				buttonEmisora1.enable();
				buttonEmisora2.enable();
				buttonEmisora3.enable();
				buttonEmisora4.enable();
				buttonEmisora5.enable();
				buttonEmisora6.enable();
				buttonEmisora7.enable();
				buttonEmisora8.enable();
				buttonEmisora9.enable();
				buttonEmisora10.enable();
				buttonEmisora11.enable();
				buttonEmisora12.enable();
			}
		}
			
		if (e.getSource()==btnAmfm){
			carRadio.setFrecuencia(carRadio.getFrecuencia());
			boolean freq = carRadio.getFrecuencia();
			if (freq==true){
				textFieldAMyFM.setText("FM");
			}
			else{
				textFieldAMyFM.setText("AM");
			}
		}
		if (e.getSource()==backEmisora){
			double emi = carRadio.getEmisora();
			if (emi==0){
				emi= 150;
			}
			else
				emi-= 1;
			carRadio.setEmisora(emi);
			txtEmisora.setText(String.valueOf(emi));
		}
		if (e.getSource()==forwardEmisora){
			double emi = carRadio.getEmisora();
			if (emi==150){
				emi= 0;
			}
			else
				emi+= 1;
			carRadio.setEmisora(emi);
			txtEmisora.setText(String.valueOf(emi));
		}
		if (e.getSource()== buttonEmisora1){
			carRadio.saveEmisora(1, carRadio.getEmisora());
		}
		if (e.getSource()== buttonEmisora2){
			carRadio.saveEmisora(2, carRadio.getEmisora());
		}
		if (e.getSource()== buttonEmisora3){
			carRadio.saveEmisora(3, carRadio.getEmisora());
		}
		if (e.getSource()== buttonEmisora4){
			carRadio.saveEmisora(4, carRadio.getEmisora());
		}
		if (e.getSource()== buttonEmisora5){
			carRadio.saveEmisora(5, carRadio.getEmisora());
		}
		if (e.getSource()== buttonEmisora6){
			carRadio.saveEmisora(6, carRadio.getEmisora());
		}
		if (e.getSource()== buttonEmisora7){
			carRadio.saveEmisora(7, carRadio.getEmisora());
		}
		if (e.getSource()== buttonEmisora8){
			carRadio.saveEmisora(8, carRadio.getEmisora());
		}
		if (e.getSource()== buttonEmisora9){
			carRadio.saveEmisora(9, carRadio.getEmisora());
		}
		if (e.getSource()== buttonEmisora10){
			carRadio.saveEmisora(10, carRadio.getEmisora());
		}
		if (e.getSource()== buttonEmisora11){
			carRadio.saveEmisora(11, carRadio.getEmisora());
		}
		if (e.getSource()== buttonEmisora12){
			carRadio.saveEmisora(12, carRadio.getEmisora());
		}
		}
}
}