package packBD;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.ButtonGroup;

public class Interfaz {

	private JFrame frame;
	private JTextField txtId;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtLevel;
	private JTextField txtCredits;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
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
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 384, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton rdbtnDirector = new JRadioButton("Director");
		buttonGroup.add(rdbtnDirector);
		rdbtnDirector.setBounds(51, 44, 109, 23);
		frame.getContentPane().add(rdbtnDirector);
		
		JRadioButton rdbtnTeacher = new JRadioButton("Teacher");
		buttonGroup.add(rdbtnTeacher);
		rdbtnTeacher.setBounds(162, 44, 109, 23);
		frame.getContentPane().add(rdbtnTeacher);
		
		JRadioButton rdbtnStudent = new JRadioButton("Student");
		buttonGroup.add(rdbtnStudent);
		rdbtnStudent.setBounds(273, 44, 109, 23);
		frame.getContentPane().add(rdbtnStudent);
		
		JRadioButton rdbtnCourse = new JRadioButton("Course");
		buttonGroup_1.add(rdbtnCourse);
		rdbtnCourse.setBounds(51, 128, 109, 23);
		frame.getContentPane().add(rdbtnCourse);
		
		JRadioButton rdbtnRegistrartion = new JRadioButton("Registrartion");
		buttonGroup_1.add(rdbtnRegistrartion);
		rdbtnRegistrartion.setBounds(51, 154, 109, 23);
		frame.getContentPane().add(rdbtnRegistrartion);
		
		JButton btnConsult = new JButton("Consult");
		btnConsult.setBounds(246, 139, 89, 23);
		frame.getContentPane().add(btnConsult);
		
		txtId = new JTextField();
		txtId.setText("Id");
		txtId.setBounds(51, 245, 86, 20);
		frame.getContentPane().add(txtId);
		txtId.setColumns(10);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setBounds(51, 220, 46, 14);
		frame.getContentPane().add(lblId);
		
		JLabel lblFirsName = new JLabel("Firs Name:");
		lblFirsName.setBounds(50, 272, 87, 14);
		frame.getContentPane().add(lblFirsName);
		
		txtFirstName = new JTextField();
		txtFirstName.setText("First Name");
		txtFirstName.setBounds(51, 297, 86, 20);
		frame.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(175, 272, 86, 14);
		frame.getContentPane().add(lblLastName);
		
		txtLastName = new JTextField();
		txtLastName.setText("Last Name");
		txtLastName.setBounds(175, 297, 86, 20);
		frame.getContentPane().add(txtLastName);
		txtLastName.setColumns(10);
		
		JLabel lblLevel = new JLabel("Level:");
		lblLevel.setBounds(51, 323, 46, 14);
		frame.getContentPane().add(lblLevel);
		
		JLabel lblCredits = new JLabel("Credits:");
		lblCredits.setBounds(175, 323, 46, 14);
		frame.getContentPane().add(lblCredits);
		
		txtLevel = new JTextField();
		txtLevel.setText("Level");
		txtLevel.setBounds(51, 348, 86, 20);
		frame.getContentPane().add(txtLevel);
		txtLevel.setColumns(10);
		
		txtCredits = new JTextField();
		txtCredits.setText("Credits");
		txtCredits.setBounds(175, 348, 86, 20);
		frame.getContentPane().add(txtCredits);
		txtCredits.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(246, 244, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JTextPane txtpnMessages = new JTextPane();
		txtpnMessages.setText("Messages");
		txtpnMessages.setBounds(10, 382, 358, 112);
		frame.getContentPane().add(txtpnMessages);
	}
}
