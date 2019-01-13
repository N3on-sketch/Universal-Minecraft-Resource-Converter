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
		javareicon.setBounds(123, 80, 80, 66);
		javareicon.setToolTipText("Java Resource Pack");
		Image rimg = new ImageIcon(this.getClass().getResource("/javarepk.png")).getImage();
		Image rimg1 = rimg.getScaledInstance(javareicon.getWidth(), javareicon.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon jereimg = new ImageIcon(rimg1);
		javareicon.setIcon(jereimg);
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
		window.getContentPane().add(javareicon);
		
		JLabel javatxicon = new JLabel("");
		javatxicon.setBounds(230, 80, 80, 66);
		javatxicon.setToolTipText("Java Texture Pack");
		Image timg = new ImageIcon(this.getClass().getResource("/javatxpk.png")).getImage();
		Image timg1 = timg.getScaledInstance(javatxicon.getWidth(), javatxicon.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon jetximg = new ImageIcon(timg1);
		javatxicon.setIcon(jetximg);
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
		window.getContentPane().add(javatxicon);
		
		JLabel bedrockicon = new JLabel("");
		bedrockicon.setBounds(325, 51, 105, 105);
		bedrockicon.setToolTipText("Bedrock Texture Pack");
		Image img = new ImageIcon(this.getClass().getResource("/bedrock.png")).getImage();
		Image img1 = img.getScaledInstance(bedrockicon.getWidth(), bedrockicon.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon beimg = new ImageIcon(img1);
		bedrockicon.setIcon(beimg);
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
		window.getContentPane().add(bedrockicon);
		
		JButton Continue = new JButton("Continue");
		Continue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ToType == 0) {
					Dialog2.main();
				} else if(FromType == 1 && ToType == 2) {
					fileCopied = new File(file + "-Converted");
					path = fileCopied+"/assets/minecraft/";
					ConvertScreen.main();
					window.setVisible(false);
				} else if(FromType == 1 && ToType == 3) {
					fileCopied = new File(file + "-Converted");
					ConvertScreen.main();
					window.setVisible(false);
				} else if(FromType == 2 && ToType == 1) {
					String file2 = file.toString();
					file2 = file2.substring(0, file2.lastIndexOf('.'));
					file = new File(file2);
					fileCopied = new File(file + "-Converted");
					path = fileCopied+"/assets/minecraft/";
					ConvertScreen.main();
					window.setVisible(false);
				} else if(FromType == 2 && ToType == 3) {
					fileCopied = new File(file + "-Converted");
					ConvertScreen.main();
					window.setVisible(false);
				} else if(FromType == 3 && ToType == 1) {
					fileCopied = new File(file + "-Converted");
					ConvertScreen.main();
					window.setVisible(false);
				} else if(FromType == 3 && ToType == 2) {
					fileCopied = new File(file + "-Converted");
					path = fileCopied+"/textures/";
					ConvertScreen.main();
					window.setVisible(false);
				}
				
			}
		});
		
		JLabel intrucs = new JLabel("<html>[Instructions]: Click the icon of the platform you want your pack to work for, find the pack your converting from, press the 'Continue' button so the program can convert a copy of it.</html>");
		intrucs.setForeground(Color.WHITE);
		intrucs.setFont(new Font("Minecraftia", Font.PLAIN, 12));
		intrucs.setVerticalAlignment(SwingConstants.TOP);
		intrucs.setBounds(110, 163, 335, 90);
		window.getContentPane().add(intrucs);
		
		JLabel example = new JLabel("<html>[Example]: If you want to convert a Java Resource Pack to a Java Texture Pack you will want to click the icon that says 'Texture Pack' then find the Resource Pack.</html>");
		example.setForeground(Color.WHITE);
		example.setFont(new Font("Minecraftia", Font.PLAIN, 12));
		example.setVerticalAlignment(SwingConstants.TOP);
		example.setBounds(110, 264, 335, 90);
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
