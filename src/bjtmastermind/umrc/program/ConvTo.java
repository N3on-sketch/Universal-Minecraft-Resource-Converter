package bjtmastermind.umrc.program;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class ConvTo extends Main {

	public static JFileChooser fc = new JFileChooser();
	private JFrame window;
	
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConvTo window = new ConvTo();
					window.window.setVisible(true);
					window.window.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ConvTo() {
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
		
		JLabel platform = new JLabel("Pick The Pack Format To Convert To");
		platform.setForeground(Color.WHITE);
		platform.setFont(new Font("Minecraftia", Font.PLAIN, 14));
		platform.setBounds(95, 11, 350, 50);
		window.getContentPane().add(platform);
		
		JLabel javareicon = new JLabel("");
		javareicon.setToolTipText("Java Resource Pack");
		Image jereimg = new ImageIcon(this.getClass().getResource("/javarepk.png")).getImage();
		javareicon.setIcon(new ImageIcon(jereimg));
		javareicon.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(FromType == 1) {
					Dialog.main();
				}else if(FromType == 2) {
					FileNameExtensionFilter filter = new FileNameExtensionFilter("Minecraft Texture Pack (*.zip)","zip");
					fc.setFileFilter(filter);
					fc.setAcceptAllFileFilterUsed(false);
					if(e.getSource() == javareicon) {
						returnVal = fc.showOpenDialog(null);
						if(returnVal == JFileChooser.APPROVE_OPTION) {
							ToType = 1;
							ToPack = "Java Resource Pack";
							file = fc.getSelectedFile();
						}
					}
				}else if(FromType == 3) {
					fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
					fc.setAcceptAllFileFilterUsed(false);
					if(e.getSource() == javareicon) {
						returnVal = fc.showOpenDialog(null);
						if(returnVal == JFileChooser.APPROVE_OPTION) {
							ToType = 1;
							ToPack = "Java Resource Pack";
							file = fc.getSelectedFile();
						}
					}
				}
			}
		});
		javareicon.setBounds(123, 72, 80, 80);
		window.getContentPane().add(javareicon);
		
		JLabel javatxicon = new JLabel("");
		javatxicon.setToolTipText("Java Texture Pack");
		Image jetximg = new ImageIcon(this.getClass().getResource("/javatxpk.png")).getImage();
		javatxicon.setIcon(new ImageIcon(jetximg));
		javatxicon.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(FromType == 1) {
					fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
					fc.setAcceptAllFileFilterUsed(false);
					if(e.getSource() == javatxicon) {
						returnVal = fc.showOpenDialog(null);
						if(returnVal == JFileChooser.APPROVE_OPTION) {
							ToType = 2;
							ToPack = "Java Texture Pack";
							file = fc.getSelectedFile();
						}
					}
				}else if(FromType == 2) {
					Dialog.main();
				}else if(FromType == 3) {
					fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
					fc.setAcceptAllFileFilterUsed(false);
					if(e.getSource() == javatxicon) {
						returnVal = fc.showOpenDialog(null);
						if(returnVal == JFileChooser.APPROVE_OPTION) {
							ToType = 2;
							ToPack = "Java Texture Pack";
							file = fc.getSelectedFile();
						}
					}
				}
			}
		});
		javatxicon.setBounds(230, 72, 80, 80);
		window.getContentPane().add(javatxicon);
		
		JLabel bedrockicon = new JLabel("");
		bedrockicon.setToolTipText("Bedrock Texture Pack");
		Image beimg = new ImageIcon(this.getClass().getResource("/bedrock.png")).getImage();
		bedrockicon.setIcon(new ImageIcon(beimg));
		bedrockicon.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(FromType == 1) {
					fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
					fc.setAcceptAllFileFilterUsed(false);
					if(e.getSource() == bedrockicon) {
						returnVal = fc.showOpenDialog(null);
						if(returnVal == JFileChooser.APPROVE_OPTION) {
							ToType = 3;
							ToPack = "Bedrock Texture Pack";
							file = fc.getSelectedFile();
						}
					}
				}else if(FromType == 2) {
					FileNameExtensionFilter filter = new FileNameExtensionFilter("Minecraft Texture Pack (*.zip)","zip");
					fc.setFileFilter(filter);
					fc.setAcceptAllFileFilterUsed(false);
					if(e.getSource() == bedrockicon) {
						returnVal = fc.showOpenDialog(null);
						if(returnVal == JFileChooser.APPROVE_OPTION) {
							ToType = 3;
							ToPack = "Bedrock Texture Pack";
							file = fc.getSelectedFile();
						}
					}
				}else if(FromType == 3) {
					Dialog.main();
				}
			}
		});
		bedrockicon.setBounds(336, 72, 80, 80);
		window.getContentPane().add(bedrockicon);
		
		JButton Continue = new JButton("Continue");
		Continue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ToType == 0) {
					Dialog2.main();
				}else {
					fileCopied = new File(file + "-Converted");
					ConvertScreen.main();
					window.setVisible(false);
				}
				
			}
		});
		
		JLabel intrucs = new JLabel("<html>[Instructions]: Now click the icon of the platform you want your pack to work for, then find the pack your converting from, then press 'Continue' button so the program can convert a copy of it.</html>");
		intrucs.setForeground(Color.WHITE);
		intrucs.setFont(new Font("Minecraftia", Font.PLAIN, 12));
		intrucs.setVerticalAlignment(SwingConstants.TOP);
		intrucs.setBounds(110, 163, 335, 90);
		window.getContentPane().add(intrucs);
		
		JLabel example = new JLabel("<html>[Example]: If you want to convert a Java Resource Pack to a Java Texture Pack you will want to click the icon that says 'Texture' then find the Resoure Pack.</html>");
		example.setForeground(Color.WHITE);
		example.setFont(new Font("Minecraftia", Font.PLAIN, 12));
		example.setVerticalAlignment(SwingConstants.TOP);
		example.setBounds(110, 264, 335, 72);
		window.getContentPane().add(example);
		Continue.setBounds(441, 396, 89, 23);
		window.getContentPane().add(Continue);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ToType = 0;
				Main.main(null);
				window.setVisible(false);
			}
		});
		back.setBounds(10, 396, 89, 23);
		window.getContentPane().add(back);
	}
}
