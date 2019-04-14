package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import java.awt.GridBagLayout;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.JScrollBar;
import java.awt.Canvas;
import java.awt.Panel;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;

public class RegistroAlumnos extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_2;
	private JLabel lblDni;
	private JTextField textField_3;
	private JLabel lblGrupo;
	private JTextField textField_4;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroAlumnos frame = new RegistroAlumnos();
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
	public RegistroAlumnos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 709);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 102, 153));
		contentPane.setBorder(new LineBorder(Color.BLACK));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(153, 319, 884, -198);
		contentPane.add(table);
		
		JLabel lblNewLabel = new JLabel(" Nombre :");
		lblNewLabel.setBounds(370, 153, 104, 16);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(500, 152, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Titulaci\u00F3n :");
		lblNewLabel_1.setBounds(373, 220, 101, 16);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblAcad = new JLabel("Expediente:");
		lblAcad.setBounds(370, 290, 118, 16);
		lblAcad.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblAcad);
		
		textField_2 = new JTextField();
		textField_2.setBounds(500, 284, 116, 22);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		lblDni = new JLabel("Acad :");
		lblDni.setBounds(370, 438, 56, 16);
		lblDni.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblDni);
		
		textField_3 = new JTextField();
		textField_3.setBounds(500, 437, 116, 22);
		textField_3.setColumns(10);
		contentPane.add(textField_3);
		
		lblGrupo = new JLabel("Grupo :");
		lblGrupo.setBounds(370, 360, 104, 19);
		lblGrupo.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblGrupo);
		
		textField_4 = new JTextField();
		textField_4.setBounds(500, 360, 116, 22);
		textField_4.setColumns(10);
		contentPane.add(textField_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(500, 217, 116, 22);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Enfermer\u00EDa", "Anatom\u00EDa"}));
		contentPane.add(comboBox);
		
		JButton btnAadir = new JButton("A\u00F1adir");
		btnAadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAadir.setEnabled(false);
		btnAadir.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAadir.setBackground(Color.RED);
		btnAadir.setBounds(908, 570, 140, 55);
		contentPane.add(btnAadir);
		
		JLabel lblListadoDeAlumnos = new JLabel("Registro Alumnos");
		lblListadoDeAlumnos.setFont(new Font("Tahoma", Font.BOLD, 47));
		lblListadoDeAlumnos.setBounds(339, 43, 533, 55);
		contentPane.add(lblListadoDeAlumnos);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setBackground(new Color(51, 153, 153));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(66, 61, 97, 25);
		contentPane.add(btnNewButton);
		
	
		JScrollPane scroll = new JScrollPane();
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	public JTable getTable() {
		return table;
	}
}
