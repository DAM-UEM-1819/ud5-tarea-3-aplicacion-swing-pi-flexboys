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

public class Home extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 709);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 102, 153));
		contentPane.setBorder(new LineBorder(Color.BLACK));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCargar = new JButton("CARGAR");
		btnCargar.setForeground(Color.BLACK);
		btnCargar.setBackground(new Color(0, 51, 102));
		btnCargar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
	
		JScrollPane scroll = new JScrollPane();
		btnCargar.setBounds(59, 319, 180, 69);
		contentPane.add(btnCargar);
		
		JPanel panel = new JPanel();
		panel.setBounds(321, 387, 671, -254);
		contentPane.add(panel);
		panel.setLayout(null);
		table = new JTable();
		table.setBounds(0, 0, 671, -254);
		panel.add(table);
		
		
				table.setFont(new Font("Tahoma", Font.PLAIN, 17));
				table.setForeground(Color.BLACK);
				table.setBorder(new LineBorder(new Color(51, 102, 51), 2));
				table.setModel(new DefaultTableModel(
					new Object[][] {
						{null, "erqt", null, null, null, "", null},
						{null, null, null, null, null, null, null},
						{null, null, "qet", null, null, "qrtq", null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
					},
					new String[] {
						"Sala", "Inicio", "Fin", "Actividad", "Titulaci\u00F3n", "Grupo", "Profesor"
					}
				));
		
		JButton btnRegistros = new JButton("REGISTROS");
		btnRegistros.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRegistros.setForeground(Color.BLACK);
		btnRegistros.setBackground(new Color(0, 51, 102));
		btnRegistros.setBounds(59, 387, 180, 69);
		contentPane.add(btnRegistros);
		
		JLabel lblNewLabel = new JLabel("MEN\u00DA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(new Color(0, 0, 102));
		lblNewLabel.setBounds(59, 140, 180, 35);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("LISTADOS");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(new Color(0, 51, 102));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(59, 174, 180, 76);
		contentPane.add(btnNewButton);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setForeground(Color.BLACK);
		btnRegistrar.setBackground(new Color(0, 51, 102));
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRegistrar.setBounds(59, 250, 180, 69);
		contentPane.add(btnRegistrar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 51, 255));
		panel_1.setBounds(546, 35, 196, 57);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("   8/4/2019");
		lblNewLabel_1.setBounds(33, 13, 132, 31);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBackground(new Color(0, 102, 51));
		panel_2.setBounds(317, 446, 727, 203);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Saber m\u00E1s");
		btnNewButton_1.setBackground(new Color(0, 153, 204));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(72, 70, 130, 66);
		panel_2.add(btnNewButton_1);
		
		JButton btnGrupos = new JButton("Grupos");
		btnGrupos.setBackground(new Color(204, 51, 255));
		btnGrupos.setBounds(300, 70, 130, 66);
		panel_2.add(btnGrupos);
		
		JButton btnConsultas = new JButton("Consultas");
		btnConsultas.setBackground(new Color(0, 153, 51));
		btnConsultas.setBounds(528, 70, 130, 66);
		panel_2.add(btnConsultas);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 51, 255));
		panel_3.setBounds(59, 134, 180, 41);
		contentPane.add(panel_3);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Sala", "Inicio", "Fin", "Actividad", "Titulaci\u00F3n", "Grupo", "Profesor"
			}
		));
		table_1.setBounds(286, 408, 780, -254);
		contentPane.add(table_1);
		
		Panel panel_4 = new Panel();
		panel_4.setBackground(new Color(204, 0, 51));
		panel_4.setBounds(85, 22, 124, 84);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblUem = new JLabel("UEM");
		lblUem.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUem.setBounds(39, 39, 56, 16);
		panel_4.add(lblUem);
		
		Button button = new Button("Salir");
	
		button.setFont(new Font("Dialog", Font.BOLD, 20));
		button.setForeground(Color.BLACK);
		button.setBackground(new Color(255, 51, 51));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(85, 534, 111, 69);
		contentPane.add(button);
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
