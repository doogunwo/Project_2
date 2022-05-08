import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JTabbedPane;
import javax.swing.border.BevelBorder;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main1 extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tab1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main1 frame = new Main1();
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
	public Main1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1049, 803);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tab1 = new JTabbedPane(JTabbedPane.LEFT);
		
		tab1.setFont(new Font("Arial Black", Font.BOLD, 12));
		tab1.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tab1.setBorder(new LineBorder(new Color(0, 0, 0)));
		tab1.setToolTipText("");
		tab1.setBounds(22, 67, 988, 595);
		contentPane.add(tab1);
		
		Panel panel2 = new Panel();
		tab1.addTab("Member", null, panel2, "");
		panel2.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(58, 0, 301, 588);
		panel2.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("로그인 화면 열기");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				Log log1 = new Log();
				log1.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(466, 27, 246, 23);
		panel2.add(btnNewButton);
		
		Panel panel3 = new Panel();
		tab1.addTab("Control", null, panel3, null);
		panel3.setLayout(null);
		
		JButton b3 = new JButton("3\uBC88\uD654\uBA74");
		b3.setBounds(320, 215, 97, 23);
		panel3.add(b3);
		Panel panel4 = new Panel();
		tab1.addTab("Status", null, panel4, null);
		panel4.setLayout(null);
		
		JButton b4 = new JButton("4\uBC88\uD654\uBA74");
		b4.setBounds(323, 200, 97, 23);
		panel4.add(b4);
		
		Panel panel1 = new Panel();
		tab1.addTab("Data", null, panel1, null);
		panel1.setLayout(null);
		
		Panel panel5 = new Panel();
		tab1.addTab("management", null, panel5, null);
		
		JLabel lblNewLabel = new JLabel("급여/사원 관리 시스템");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblNewLabel.setBounds(23, 10, 189, 62);
		contentPane.add(lblNewLabel);
	}
}
