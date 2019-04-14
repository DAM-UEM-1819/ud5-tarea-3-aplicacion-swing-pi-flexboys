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

public class ListadoProfesores extends JFrame {

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
					ListadoProfesores frame = new ListadoProfesores();
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
	public ListadoProfesores() {
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
		lblNewLabel.setBounds(110, 354, 104, 16);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(226, 353, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Titulaci\u00F3n :");
		lblNewLabel_1.setBounds(113, 408, 101, 16);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblAcad = new JLabel("Acad :");
		lblAcad.setBounds(113, 459, 56, 16);
		lblAcad.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblAcad);
		
		textField_2 = new JTextField();
		textField_2.setBounds(226, 458, 116, 22);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		lblDni = new JLabel("DNI :");
		lblDni.setBounds(113, 509, 56, 16);
		lblDni.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblDni);
		
		textField_3 = new JTextField();
		textField_3.setBounds(226, 508, 116, 22);
		textField_3.setColumns(10);
		contentPane.add(textField_3);
		
		lblGrupo = new JLabel("Grupo :");
		lblGrupo.setBounds(630, 353, 104, 19);
		lblGrupo.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblGrupo);
		
		textField_4 = new JTextField();
		textField_4.setBounds(723, 353, 116, 22);
		textField_4.setColumns(10);
		contentPane.add(textField_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(226, 405, 116, 22);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Enfermer\u00EDa", "Anatom\u00EDa"}));
		contentPane.add(comboBox);
		
		JLabel lblActivo = new JLabel("Activo :");
		lblActivo.setBounds(630, 407, 104, 19);
		lblActivo.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblActivo);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		buttonGroup.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setBounds(723, 405, 25, 25);
		chckbxNewCheckBox.setForeground(new Color(51, 102, 153));
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox checkBox = new JCheckBox("");
		buttonGroup.add(checkBox);
		checkBox.setBounds(801, 405, 25, 25);
		checkBox.setForeground(new Color(51, 102, 153));
		contentPane.add(checkBox);
		
		JLabel lblSi = new JLabel("SI");
		lblSi.setBounds(723, 439, 56, 16);
		lblSi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblSi);
		
		JLabel lblNo = new JLabel("  NO");
		lblNo.setBounds(794, 439, 56, 16);
		lblNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNo);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnModificar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnModificar.setBackground(new Color(0, 204, 255));
		btnModificar.setBounds(517, 570, 140, 55);
		contentPane.add(btnModificar);
		
		JButton button_2 = new JButton("Eliminar");
		button_2.setEnabled(false);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_2.setBackground(Color.RED);
		button_2.setBounds(137, 570, 140, 55);
		contentPane.add(button_2);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAgregar.setBackground(new Color(102, 204, 102));
		btnAgregar.setBounds(897, 570, 140, 55);
		contentPane.add(btnAgregar);
		
		JLabel lblListadoDeAlumnos = new JLabel("Listado de Alumnos");
		lblListadoDeAlumnos.setFont(new Font("Tahoma", Font.BOLD, 47));
		lblListadoDeAlumnos.setBounds(339, 43, 470, 55);
		contentPane.add(lblListadoDeAlumnos);
		
		JButton btnNewButton = new JButton("Imprimir");
		btnNewButton.setBackground(new Color(51, 153, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(985, 43, 109, 67);
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
