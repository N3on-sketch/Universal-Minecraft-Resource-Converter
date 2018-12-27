package bjtmastermind.umrc.program;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zip extends FileWorks {
    List<String> fileList;
    private static final String OUTPUT_ZIP_FILE = fileCopied+".zip";
    private static final String SOURCE_FOLDER = fileCopied.toString();
    Zip() {
	fileList = new ArrayList<String>();
    }
    public static void main() {
    	Zip appZip = new Zip();
    	appZip.generateFileList(new File(SOURCE_FOLDER));
    	appZip.zipIt(OUTPUT_ZIP_FILE);
    }
    public void zipIt(String zipFile) {
     byte[] buffer = new byte[1024];
     try{
    	FileOutputStream fos = new FileOutputStream(zipFile);
    	ZipOutputStream zos = new ZipOutputStream(fos);
    	for(String file : this.fileList){
    		ZipEntry ze= new ZipEntry(file);
        	zos.putNextEntry(ze);
        	FileInputStream in = new FileInputStream(SOURCE_FOLDER + File.separator + file);
        	int len;
        	while ((len = in.read(buffer)) > 0) {
        		zos.write(buffer, 0, len);
        	}
        	in.close();
    	}
    	zos.closeEntry();
    	zos.close();
    }catch(IOException ex){
       ex.printStackTrace();
    	}
    }
    public void generateFileList(File node){
	if(node.isFile()){
		fileList.add(generateZipEntry(node.getAbsoluteFile().toString()));
	}
	if(node.isDirectory()){
		String[] subNote = node.list();
		for(String filename : subNote){
			generateFileList(new File(node, filename));
			}
		}
    }
    private String generateZipEntry(String file){
    	return file.substring(SOURCE_FOLDER.length()+1, file.length());
    }
}