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

public class SaberMas extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private Controlador control;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaberMas frame = new SaberMas();
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
	public SaberMas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 709);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 102, 153));
		contentPane.setBorder(new LineBorder(Color.BLACK));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListadoDeAlumnos = new JLabel("Saber m\u00E1s...");
		lblListadoDeAlumnos.setFont(new Font("Tahoma", Font.BOLD, 47));
		lblListadoDeAlumnos.setBounds(469, 44, 533, 55);
		contentPane.add(lblListadoDeAlumnos);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setBackground(new Color(51, 153, 153));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				control.saberhome();
			}
		});
		btnNewButton.setBounds(66, 61, 97, 25);
		contentPane.add(btnNewButton);
		
		JTextPane txtpnGrupoMAlumnos = new JTextPane();
		txtpnGrupoMAlumnos.setText("Grupo: M11\r\nAlumnos: 15\r\n\r\nDocumentaci\u00F3n:\r\nParto prematuro de una mujer de 29 a\u00F1os.\r\n................................................................\r\n...............................................................\r\n................................................................\r\n\r\n\r\nSimulador: ...............................\r\nActor: Pepita G\u00F3mez Arnoso\r\nProfesor:\r\nJavier Mu\u00F1oz Rojas, 32 a\u00F1os\r\n...........................................................\r\n..........................................................");
		txtpnGrupoMAlumnos.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtpnGrupoMAlumnos.setBackground(new Color(255, 204, 51));
		txtpnGrupoMAlumnos.setBounds(310, 112, 607, 446);
		contentPane.add(txtpnGrupoMAlumnos);
		
	
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
