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
import javax.swing.JTextPane;

public class Consultas extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consultas frame = new Consultas();
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
	public Consultas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 709);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 102, 153));
		contentPane.setBorder(new LineBorder(Color.BLACK));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListadoDeAlumnos = new JLabel("Consultas");
		lblListadoDeAlumnos.setFont(new Font("Tahoma", Font.BOLD, 47));
		lblListadoDeAlumnos.setBounds(469, 44, 533, 55);
		contentPane.add(lblListadoDeAlumnos);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setBackground(new Color(51, 153, 153));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(66, 61, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnHorasActividadtitulacion = new JButton("Horas Actividad-Titulacion");
		btnHorasActividadtitulacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnHorasActividadtitulacion.setBounds(77, 164, 188, 40);
		contentPane.add(btnHorasActividadtitulacion);
		
		JButton btnHorasActividadTitulacion = new JButton("Horas Actividad\r\nTitulacion y Profesor");
		btnHorasActividadTitulacion.setBounds(64, 234, 237, 40);
		contentPane.add(btnHorasActividadTitulacion);
		
		JButton button = new JButton("Horas Actividad\r\nTitulacion y Curso");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(309, 164, 237, 40);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Horas Actividad-Titulacion y Acad");
		button_1.setBounds(336, 234, 223, 40);
		contentPane.add(button_1);
		
		JButton btnMeses = new JButton("Meses");
		btnMeses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMeses.setBounds(573, 164, 223, 40);
		contentPane.add(btnMeses);
		
		JButton btnSemestres = new JButton("Semestres");
		btnSemestres.setBounds(588, 234, 223, 40);
		contentPane.add(btnSemestres);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTotal.setBounds(808, 164, 141, 40);
		contentPane.add(btnTotal);
		
		JButton button_2 = new JButton("Horas Actor Acad");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(982, 164, 163, 40);
		contentPane.add(button_2);
		
		JButton btnHorasTitulacinY = new JButton("Horas Titulaci\u00F3n y mes");
		btnHorasTitulacinY.setBounds(839, 234, 163, 40);
		contentPane.add(btnHorasTitulacinY);
		
		JButton btnHorasActorTitulacion = new JButton("Horas actor titulacion y Acad");
		btnHorasActorTitulacion.setBounds(1014, 234, 163, 40);
		contentPane.add(btnHorasActorTitulacion);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(226, 331, 801, 257);
		contentPane.add(table);
		
	
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
		return getTable();
	}
}
