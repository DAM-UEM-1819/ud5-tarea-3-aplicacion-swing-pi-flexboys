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
	private JTable table_1;
	private Controlador control;
	private JButton btnRegistros;
	private JButton btnListados;
	private JButton btnRegistrar;

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
		
		JButton btnCargar = new JButton("CARGAR");
		btnCargar.setBounds(59, 319, 180, 69);
		btnCargar.setForeground(Color.BLACK);
		btnCargar.setBackground(new Color(0, 51, 102));
		btnCargar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				control.homeCarga();
			}
		});
		
	
		JScrollPane scroll = new JScrollPane();
		contentPane.setLayout(null);
		contentPane.add(btnCargar);
		
		btnRegistros = new JButton("REGISTROS");
		btnRegistros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				control.homeReg();
			}
		});
		btnRegistros.setBounds(59, 387, 180, 69);
		btnRegistros.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRegistros.setForeground(Color.BLACK);
		btnRegistros.setBackground(new Color(0, 51, 102));
		contentPane.add(btnRegistros);
		
		JLabel lblNewLabel = new JLabel("MEN\u00DA");
		lblNewLabel.setBounds(59, 140, 180, 35);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(new Color(0, 0, 102));
		contentPane.add(lblNewLabel);
		
		btnListados = new JButton("LISTADOS");
		btnListados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				control.homelistp();
			}
		});
		btnListados.setBounds(59, 174, 180, 76);
		btnListados.setForeground(Color.BLACK);
		btnListados.setBackground(new Color(0, 51, 102));
		btnListados.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(btnListados);
		
		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnRegistrar.setBounds(59, 250, 180, 69);
		btnRegistrar.setForeground(Color.BLACK);
		btnRegistrar.setBackground(new Color(0, 51, 102));
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(btnRegistrar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(546, 35, 196, 57);
		panel_1.setBackground(new Color(51, 51, 255));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("   8/4/2019");
		lblNewLabel_1.setBounds(33, 13, 132, 31);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(317, 446, 727, 203);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBackground(new Color(0, 102, 51));
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
		panel_3.setBounds(59, 134, 180, 41);
		panel_3.setBackground(new Color(0, 51, 255));
		contentPane.add(panel_3);
		
		table_1 = new JTable();
		table_1.setBounds(286, 408, 780, -254);
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
		contentPane.add(table_1);
		
		Panel panel_4 = new Panel();
		panel_4.setBounds(85, 22, 124, 84);
		panel_4.setBackground(new Color(204, 0, 51));
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblUem = new JLabel("UEM");
		lblUem.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUem.setBounds(39, 39, 56, 16);
		panel_4.add(lblUem);
		
		Button button = new Button("Salir");
		button.setBounds(85, 534, 111, 69);
	
		button.setFont(new Font("Dialog", Font.BOLD, 20));
		button.setForeground(Color.BLACK);
		button.setBackground(new Color(255, 51, 51));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
	
}
