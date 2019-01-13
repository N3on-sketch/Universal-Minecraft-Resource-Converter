package bjtmastermind.umrc.program;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class FileWorks extends Main {
//CopyFiles Starts Here
	public static void copyFiles(File source, File copy) throws IOException {
		if(!file.exists()) {
			System.out.println("File does not exist.");
		}else {
			FileWorks cf = new FileWorks();
			cf.copydir(file, fileCopied);
		}
	}
	private void copydir(File src, File dest) throws IOException {
		if(src.isDirectory()) {
			if(!dest.exists()) {
				dest.mkdir();
			}
			String files[] = src.list();
			
			for(String fileName : files) {
				File srcFile = new File(src, fileName);
				File destFile = new File(dest, fileName);
				copydir(srcFile, destFile);
			}
		}else {
			fileCopy(src, dest);
		}
	}
	private void fileCopy(File src, File dest) throws FileNotFoundException {
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream(src);
			out = new FileOutputStream(dest);
			byte[] buf = new byte[1024];
			int length;
			while((length = in.read(buf)) > 0) {
				out.write(buf, 0, length);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
//FileCopys Ends Here and UnZip Starts
	public static void unzip(String zipInput, String fileOutput) {
		File dir = new File(fileOutput);
		if(!dir.exists()) {
			dir.mkdirs();
		}
		try {
		FileInputStream fis = new FileInputStream(zipInput);
		ZipInputStream zis = new ZipInputStream(fis);
		ZipEntry ze = zis.getNextEntry();
				
		while(ze != null) {
			byte[] buf = new byte[1024];
			String filename = ze.getName();
			File newfile = new File(fileOutput + File.separator + filename);
			if(ze.isDirectory()) {
				newfile.mkdir();
			}else if(!newfile.exists()) {
				newfile.getParentFile().mkdirs();
				newfile.createNewFile();
				
				FileOutputStream fos = new FileOutputStream(newfile);
				int len;
				while((len = zis.read(buf)) > 0) {
					fos.write(buf, 0, len);
				}
				fos.close();
				zis.closeEntry();
			}
			ze = zis.getNextEntry();
		}
		zis.closeEntry();
		zis.close();
		fis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
//UnZip Ends Here and Zip Starts
	public static void zip() {
		Zip.main();
	}
//Zip Ends Here and Stitch Starts	
	public static void stitch() throws IOException {
		//Uses Python Code "stitch.py"
		 try {
		     @SuppressWarnings("unused")
			 Process p = Runtime.getRuntime().exec("python external-code/stitch.py");
		 } catch (IOException e) {
		 	 e.printStackTrace();
		}
	}
//Stitch Ends Here and UnStitch Starts
	public static void unstitch() throws IOException {
		//Uses Python Code "unstitch.py"
	    FileWriter fileWriter = new FileWriter("external-code/variables");
	    fileWriter.write(file.toString()+"\n");
	    fileWriter.write(FromType+"\n");
	    fileWriter.write(ToType+"\n");
	    fileWriter.close();
		try {
			@SuppressWarnings("unused")
			Process p = Runtime.getRuntime().exec("python external-code/unstitch.py");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
//UnStitch Ends Here and renameFiles Starts
	public static void renameFiles() throws IOException, InterruptedException {
		//Partly Uses Python Code "convertpack.py"
		FileWriter fileWriter = new FileWriter("external-code/variables");
	    fileWriter.write(file.toString()+"\n");
	    fileWriter.write(FromType+"\n");
	    fileWriter.write(ToType+"\n");
	    fileWriter.close();
		try {
			@SuppressWarnings("unused")
			Process p = Runtime.getRuntime().exec("python external-code/convertpack.py");
		} catch (IOException e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		Rename.main();
	}
//renameFiles Ends Here and crop Starts
	public static void crop() throws IOException {
		//Partly Uses Python Code "convertpack.py"
		FileWriter fileWriter = new FileWriter("external-code/variables");
		fileWriter.write(file.toString()+"\n");
		fileWriter.write(FromType+"\n");
		fileWriter.write(ToType+"\n");
		fileWriter.close();
		try {
			@SuppressWarnings("unused")
			Process p = Runtime.getRuntime().exec("python external-code/crop.py");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
//crop Ends Here and moveFiles Starts
	public static void moveFiles() throws IOException {
		MoveFiles.main();
	}
//buildPack Ends Here
}
