package bjtmastermind.umrc.program;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Main {

	public static int FromType,ToType,returnVal;
	public static String FromPack,ToPack;
	public static File file,fileCopied;
	private JFrame window;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.window.setVisible(true);
					window.window.setLocationRelativeTo(null);
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		initialize();
	}
	private void initialize() {
		window = new JFrame();
		window.setResizable(false);
		window.getContentPane().setBackground(Color.DARK_GRAY);
		window.setTitle("Universal Minecraft Resource Converter");
		window.setBounds(100, 100, 546, 459);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setLayout(null);
		
		JLabel platform = new JLabel("Pick The Pack Format To Convert From");
		platform.setForeground(Color.WHITE);
		platform.setFont(new Font("Minecraftia", Font.PLAIN, 14));
		platform.setBounds(85, 11, 370, 50);
		window.getContentPane().add(platform);
		
		JLabel javareicon = new JLabel("");
		javareicon.setToolTipText("Java Resource Pack");
		Image jereimg = new ImageIcon(this.getClass().getResource("/javarepk.png")).getImage();
		javareicon.setIcon(new ImageIcon(jereimg));
		javareicon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FromType = 1;
				FromPack = "Java Resource Pack";
				ConvTo.main();
				window.setVisible(false);
			}
		});
		javareicon.setBounds(123, 72, 80, 80);
		window.getContentPane().add(javareicon);
		
		JLabel javatxicon = new JLabel("");
		javatxicon.setToolTipText("Java Texture Pack");
		Image jetximg = new ImageIcon(this.getClass().getResource("/javatxpk.png")).getImage();
		javatxicon.setIcon(new ImageIcon(jetximg));
		javatxicon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FromType = 2;
				FromPack = "Java Texture Pack";
				ConvTo.main();
				window.setVisible(false);
			}
		});
		javatxicon.setBounds(230, 72, 80, 80);
		window.getContentPane().add(javatxicon);
		
		JLabel bedrockicon = new JLabel("");
		bedrockicon.setToolTipText("Bedrock Texture Pack");
		Image beimg = new ImageIcon(this.getClass().getResource("/bedrock.png")).getImage();
		bedrockicon.setIcon(new ImageIcon(beimg));
		bedrockicon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FromType = 3;
				FromPack = "Bedrock Texture Pack";
				ConvTo.main();
				window.setVisible(false);
			}
		});
		bedrockicon.setBounds(336, 72, 80, 80);
		window.getContentPane().add(bedrockicon);
		
		JLabel instrucs = new JLabel("<html>[Instructions]: To start what you want to do is click the icon to convert from.</html>");
		instrucs.setVerticalAlignment(SwingConstants.TOP);
		instrucs.setFont(new Font("Minecraftia", Font.PLAIN, 12));
		instrucs.setForeground(Color.WHITE);
		instrucs.setBounds(99, 163, 342, 36);
		window.getContentPane().add(instrucs);
		
		JLabel example = new JLabel("<html>[Example]: If you want to convert a Java Resource Pack to a Java Texture Pack you will want to click the icon that says 'Resource'</html>");
		example.setForeground(Color.WHITE);
		example.setFont(new Font("Minecraftia", Font.PLAIN, 12));
		example.setVerticalAlignment(SwingConstants.TOP);
		example.setBounds(99, 210, 342, 72);
		window.getContentPane().add(example);
	}
}

