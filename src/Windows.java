import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Windows {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	/* 
	Aten��o!!!!!!
	Vari�veis int abaixo inseridas para o exerc�cio de cria��o de Window e teste de try/catch/finally.
	*/
	int num1;
	int num2;
	int r;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Windows window = new Windows();
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
	public Windows() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("N =");
		lblNewLabel.setBounds(10, 11, 31, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("D = ");
		lblNewLabel_1.setBounds(10, 36, 31, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("R = ");
		lblNewLabel_2.setBounds(10, 63, 31, 18);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(52, 8, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(52, 34, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(52, 62, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("DIVIDIR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/* 
				Aten��o!!!!!!
				Bloco abaixo inserido para o exerc�cio de cria��o de Window e teste de try/catch/finally.
				A quest�o � que temos que tratar a exce��o das divis�es por zero, por isso, usaremos, try/catch...
				no bloco abaixo. Mais uma vez:
				try: execute este bloco.
				catch: caso, n�o consiga, fa�o isso. 
				finally, caso n�o consiga fazer o passo anterior, fa�a isso finalmente.   
				*/
				try {
					num1 = Integer.parseInt(textField.getText());
					num2 = Integer.parseInt(textField_1.getText());
					r = num1 / num2;
					textField_2.setText(String.valueOf(r));
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
			}
		});
		btnNewButton.setBounds(52, 93, 86, 18);
		frame.getContentPane().add(btnNewButton);
	}
}
