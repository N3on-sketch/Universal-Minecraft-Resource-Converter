package bjtmastermind.umrc.program;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ConvertScreen extends Main {

	private JFrame window;

	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConvertScreen window = new ConvertScreen();
					window.window.setVisible(true);
					window.window.setLocationRelativeTo(null);
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ConvertScreen() throws Exception {
		initialize();
	}

	private void initialize() throws Exception {
		window = new JFrame();
		window.setResizable(false);
		window.setTitle("Universal Minecraft Resource Converter");
		window.getContentPane().setBackground(Color.DARK_GRAY);
		window.getContentPane().setLayout(null);
		
		JLabel converting = new JLabel("Your Pack Has Been Converted");
		converting.setForeground(Color.WHITE);
		converting.setFont(new Font("Minecraftia", Font.PLAIN, 14));
		converting.setBounds(119, 11, 302, 48);
		window.getContentPane().add(converting);
		
		JLabel from = new JLabel("From:  " + FromPack);
		from.setForeground(Color.WHITE);
		from.setFont(new Font("Minecraftia", Font.PLAIN, 10));
		from.setBounds(169, 79, 202, 14);
		window.getContentPane().add(from);
		
		JLabel to = new JLabel("To:  " + ToPack);
		to.setForeground(Color.WHITE);
		to.setFont(new Font("Minecraftia", Font.PLAIN, 10));
		to.setBounds(169, 104, 202, 14);
		window.getContentPane().add(to);
		
		if(FromType == 2 && ToType == 1) {
		JLabel filename = new JLabel("<html>Path: " + file+".zip" + "</html>");
		filename.setVerticalAlignment(SwingConstants.TOP);
		filename.setHorizontalAlignment(SwingConstants.LEFT);
		filename.setForeground(Color.WHITE);
		filename.setFont(new Font("Minecraftia", Font.PLAIN, 10));
		filename.setBounds(10, 164, 520, 255);
		window.getContentPane().add(filename);
		} else if(FromType == 2 && ToType == 3) {
			JLabel filename = new JLabel("<html>Path: " + file+".zip" + "</html>");
			filename.setVerticalAlignment(SwingConstants.TOP);
			filename.setHorizontalAlignment(SwingConstants.LEFT);
			filename.setForeground(Color.WHITE);
			filename.setFont(new Font("Minecraftia", Font.PLAIN, 10));
			filename.setBounds(10, 164, 520, 255);
			window.getContentPane().add(filename);
		} else {
			JLabel filename = new JLabel("<html>Path: " + file + "</html>");
			filename.setVerticalAlignment(SwingConstants.TOP);
			filename.setHorizontalAlignment(SwingConstants.LEFT);
			filename.setForeground(Color.WHITE);
			filename.setFont(new Font("Minecraftia", Font.PLAIN, 10));
			filename.setBounds(10, 164, 520, 255);
			window.getContentPane().add(filename);
		}
		window.setBounds(100, 100, 546, 459);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FileConvert();
	}
	
	private void FileConvert() throws Exception {
		// Converting of all the files depending on the formats picked
		// 1 = Java Resource Pack, 2 = Java Texture Pack, 3 = Bedrock Texture Pack	
		if(FromType == 1 && ToType == 2) {
			//Java Resource to Java Texture(Ziped)
			Convert.ResourceToTexture();
			}else if(FromType == 1 && ToType == 3) {
				//Java Resource to Bedrock
				Convert.ResourceToBedrock();
			}else if(FromType == 2 && ToType == 1) {
				//Java Texture(Ziped) to Java Resource
				Convert.TextureToResource();
			}else if(FromType == 2 && ToType == 3) {
				//Java Texture(Ziped) to Bedrock
				Convert.TextureToBedrock();
			}else if(FromType == 3 && ToType == 1) {
				//Bedrock to Java Resource
				Convert.BedrockToResource();
			}else if(FromType == 3 && ToType == 2) {
				//Bedrock to Java Texture(Ziped)
				Convert.BedrockToTexture();
		}		
	}
}
