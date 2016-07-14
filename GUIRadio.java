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

	
	//Crea objeto
	private RadioCarro carRadio = new RadioCarro();
	
	
	//ATRIBUTOS del GUI
	private JPanel contentPane;
	private JTextField textFieldAMyFM;
	private JTextField txtEmisora;
	private JTextField textFieldEmisoraDisplay;
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
	private JTextField textFieldEmisoraSaved;

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
		setBounds(100, 100, 462, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		botoONyOFF = new JButton("ON/OFF");
		botoONyOFF.setBounds(27, 23, 129, 23);
		panel.add(botoONyOFF);
		
		btnAmfm = new JButton("AM/FM");
		btnAmfm.setBounds(280, 23, 108, 23);
		panel.add(btnAmfm);
		
		textFieldAMyFM = new JTextField();
		textFieldAMyFM.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAMyFM.setBounds(302, 54, 65, 20);
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
		textFieldEmisoraDisplay.setHorizontalAlignment(SwingConstants.CENTER);
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
		buttonEmisora1.setBounds(49, 168, 49, 23);
		panel.add(buttonEmisora1);
		
		buttonEmisora2 = new JButton("2");
		buttonEmisora2.setBounds(108, 168, 49, 23);
		panel.add(buttonEmisora2);
		
		buttonEmisora3 = new JButton("3");
		buttonEmisora3.setBounds(167, 168, 49, 23);
		panel.add(buttonEmisora3);
		
		buttonEmisora4 = new JButton("4");
		buttonEmisora4.setBounds(226, 168, 49, 23);
		panel.add(buttonEmisora4);
		
		buttonEmisora5 = new JButton("5");
		buttonEmisora5.setBounds(280, 168, 49, 23);
		panel.add(buttonEmisora5);
		
		buttonEmisora6 = new JButton("6");
		buttonEmisora6.setBounds(339, 168, 49, 23);
		panel.add(buttonEmisora6);
		
		buttonEmisora7 = new JButton("7");
		buttonEmisora7.setBounds(48, 202, 49, 23);
		panel.add(buttonEmisora7);
		
		buttonEmisora8 = new JButton("8");
		buttonEmisora8.setBounds(107, 202, 49, 23);
		panel.add(buttonEmisora8);
		
		buttonEmisora9 = new JButton("9");
		buttonEmisora9.setBounds(163, 202, 49, 23);
		panel.add(buttonEmisora9);
		
		buttonEmisora10 = new JButton("10");
		buttonEmisora10.setBounds(220, 202, 49, 23);
		panel.add(buttonEmisora10);
		
		buttonEmisora11 = new JButton("11");
		buttonEmisora11.setBounds(279, 202, 49, 23);
		panel.add(buttonEmisora11);
		
		buttonEmisora12 = new JButton("12");
		buttonEmisora12.setBounds(339, 202, 49, 23);
		panel.add(buttonEmisora12);
		
		textFieldEmisoraSaved = new JTextField();
		textFieldEmisoraSaved.setEditable(false);
		textFieldEmisoraSaved.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldEmisoraSaved.setBounds(161, 236, 86, 20);
		panel.add(textFieldEmisoraSaved);
		textFieldEmisoraSaved.setColumns(10);
		
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
				btnAmfm.setEnabled(false);
				backEmisora.setEnabled(false);
				forwardEmisora.setEnabled(false);
				textFieldAMyFM.setEnabled(false);
				txtEmisora.setEnabled(false);
				textFieldEmisoraDisplay.setEnabled(false);
				buttonEmisora1.setEnabled(false);
				buttonEmisora2.setEnabled(false);
				buttonEmisora3.setEnabled(false);
				buttonEmisora4.setEnabled(false);
				buttonEmisora5.setEnabled(false);
				buttonEmisora6.setEnabled(false);
				buttonEmisora7.setEnabled(false);
				buttonEmisora8.setEnabled(false);
				buttonEmisora9.setEnabled(false);
				buttonEmisora10.setEnabled(false);
				buttonEmisora11.setEnabled(false);
				buttonEmisora12.setEnabled(false);
			}
			else{
				btnAmfm.setEnabled(true);
				backEmisora.setEnabled(true);
				forwardEmisora.setEnabled(true);
				textFieldAMyFM.setEnabled(true);
				txtEmisora.setEnabled(true);
				textFieldEmisoraDisplay.setEnabled(true);
				buttonEmisora1.setEnabled(true);
				buttonEmisora2.setEnabled(true);
				buttonEmisora3.setEnabled(true);
				buttonEmisora4.setEnabled(true);
				buttonEmisora5.setEnabled(true);
				buttonEmisora6.setEnabled(true);
				buttonEmisora7.setEnabled(true);
				buttonEmisora8.setEnabled(true);
				buttonEmisora9.setEnabled(true);
				buttonEmisora10.setEnabled(true);
				buttonEmisora11.setEnabled(true);
				buttonEmisora12.setEnabled(true);
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
			textFieldEmisoraDisplay.setText(String.valueOf(emi));
		}
		if (e.getSource()==forwardEmisora){
			double emi = carRadio.getEmisora();
			if (emi==150){
				emi= 0;
			}
			else
				emi+= 1;
			carRadio.setEmisora(emi);
			textFieldEmisoraDisplay.setText(String.valueOf(emi));
		}
		if (e.getSource()== buttonEmisora1){
			carRadio.saveEmisora(1, carRadio.getEmisora());
			textFieldEmisoraSaved.setText(String.valueOf(carRadio.selectEmisora(1)));
		}
		if (e.getSource()== buttonEmisora2){
			carRadio.saveEmisora(2, carRadio.getEmisora());
		}
		if (e.getSource()== buttonEmisora3){
			carRadio.saveEmisora(3, carRadio.getEmisora());
			textFieldEmisoraSaved.setText(String.valueOf(carRadio.selectEmisora(1)));
		}
		if (e.getSource()== buttonEmisora4){
			carRadio.saveEmisora(4, carRadio.getEmisora());
			textFieldEmisoraSaved.setText(String.valueOf(carRadio.selectEmisora(1)));
		}
		if (e.getSource()== buttonEmisora5){
			carRadio.saveEmisora(5, carRadio.getEmisora());
			textFieldEmisoraSaved.setText(String.valueOf(carRadio.selectEmisora(1)));
		}
		if (e.getSource()== buttonEmisora6){
			carRadio.saveEmisora(6, carRadio.getEmisora());
			textFieldEmisoraSaved.setText(String.valueOf(carRadio.selectEmisora(1)));
		}
		if (e.getSource()== buttonEmisora7){
			carRadio.saveEmisora(7, carRadio.getEmisora());
			textFieldEmisoraSaved.setText(String.valueOf(carRadio.selectEmisora(1)));
		}
		if (e.getSource()== buttonEmisora8){
			carRadio.saveEmisora(8, carRadio.getEmisora());
			textFieldEmisoraSaved.setText(String.valueOf(carRadio.selectEmisora(1)));
		}
		if (e.getSource()== buttonEmisora9){
			carRadio.saveEmisora(9, carRadio.getEmisora());
			textFieldEmisoraSaved.setText(String.valueOf(carRadio.selectEmisora(1)));
		}
		if (e.getSource()== buttonEmisora10){
			carRadio.saveEmisora(10, carRadio.getEmisora());
			textFieldEmisoraSaved.setText(String.valueOf(carRadio.selectEmisora(1)));
		}
		if (e.getSource()== buttonEmisora11){
			carRadio.saveEmisora(11, carRadio.getEmisora());
			textFieldEmisoraSaved.setText(String.valueOf(carRadio.selectEmisora(1)));
		}
		if (e.getSource()== buttonEmisora12){
			carRadio.saveEmisora(0, carRadio.getEmisora());
			textFieldEmisoraSaved.setText(String.valueOf(carRadio.selectEmisora(1)));
		}
		}
}
}