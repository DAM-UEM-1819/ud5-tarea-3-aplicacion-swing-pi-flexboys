package Vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class CargaProfesor extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CargaProfesor frame = new CargaProfesor();
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
	public CargaProfesor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCargaProfesores = new JLabel("CARGA PROFESORES");
		lblCargaProfesores.setForeground(SystemColor.desktop);
		lblCargaProfesores.setBackground(SystemColor.desktop);
		lblCargaProfesores.setHorizontalAlignment(SwingConstants.CENTER);
		lblCargaProfesores.setBounds(241, 11, 222, 71);
		contentPane.add(lblCargaProfesores);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Nombre", "Titulaci\u00F3n", "DNI", "Mail 1", "Mail 2", "Tel\u00E9fono", "N\u00FAmero"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(92);
		table.getColumnModel().getColumn(1).setPreferredWidth(99);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);
		table.getColumnModel().getColumn(3).setPreferredWidth(90);
		table.getColumnModel().getColumn(4).setPreferredWidth(90);
		table.getColumnModel().getColumn(5).setPreferredWidth(90);
		table.getColumnModel().getColumn(6).setPreferredWidth(90);
		table.setBounds(10, 167, 674, 64);
		contentPane.add(table);
		
		JButton btnAadirTodo = new JButton("A\u00F1adir todo");
		btnAadirTodo.setBounds(296, 302, 126, 57);
		contentPane.add(btnAadirTodo);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(28, 142, 64, 14);
		contentPane.add(lblNombre);
		
		JLabel lblTitulacion = new JLabel("Titulacion");
		lblTitulacion.setBounds(136, 142, 72, 14);
		contentPane.add(lblTitulacion);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(253, 142, 34, 14);
		contentPane.add(lblDni);
		
		JLabel lblMail = new JLabel("Mail 1");
		lblMail.setBounds(337, 142, 55, 14);
		contentPane.add(lblMail);
		
		JLabel lblMail_1 = new JLabel("Mail 2");
		lblMail_1.setBounds(429, 142, 55, 14);
		contentPane.add(lblMail_1);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono");
		lblTelfono.setBounds(515, 142, 64, 14);
		contentPane.add(lblTelfono);
		
		JLabel lblNmero = new JLabel("N\u00FAmero");
		lblNmero.setBounds(613, 142, 71, 14);
		contentPane.add(lblNmero);
	}
}
