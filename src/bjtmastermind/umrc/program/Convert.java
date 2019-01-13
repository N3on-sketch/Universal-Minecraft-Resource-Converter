package bjtmastermind.umrc.program;

public class Convert extends Main {

	public static void ResourceToTexture() throws Exception {
		FileWorks.copyFiles(file, fileCopied);
		FileWorks.crop();
		FileWorks.stitch();
		Thread.sleep(7000);
		FileWorks.renameFiles();
		FileWorks.moveFiles();
		FileWorks.zip();
	}
	
	public static void ResourceToBedrock() throws Exception {
		FileWorks.copyFiles(file, fileCopied);
		FileWorks.renameFiles();
		FileWorks.moveFiles();
	}
	
	public static void TextureToResource() throws Exception {
		FileWorks.copyFiles(file, fileCopied);
		FileWorks.unzip(file+".zip".toString(), fileCopied+".zip".toString());
		FileWorks.unstitch();
		FileWorks.renameFiles();
		Thread.sleep(4599);
		FileWorks.moveFiles();
	}
	
	public static void TextureToBedrock() throws Exception {
		FileWorks.copyFiles(file, fileCopied);
		FileWorks.unzip(file.toString(), fileCopied.toString());
		FileWorks.unstitch();
		FileWorks.renameFiles();
		FileWorks.moveFiles();
	}
	
	public static void BedrockToResource() throws Exception {
		FileWorks.copyFiles(file, fileCopied);
		FileWorks.renameFiles();
		FileWorks.moveFiles();
	}
	
	public static void BedrockToTexture() throws Exception {
		FileWorks.copyFiles(file, fileCopied);
		FileWorks.crop();
		FileWorks.stitch();
		Thread.sleep(7000);
		FileWorks.renameFiles();
		Thread.sleep(3000);
		FileWorks.moveFiles();
		//FileWorks.zip();
	}
}
