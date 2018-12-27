package bjtmastermind.umrc.program;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class MoveFiles extends FileWorks {
	public static void main() throws IOException {
		if(FromType == 1 && ToType == 2) {
			File[] files = {new File(path+"lang"),new File(path+"textures/models/armor"),new File(path+"textures/art"),new File(path+"textures/environment"),new File(path+"textures/gui"),new File(path+"textures/misc"),new File(path+"textures/mob"),new File(path+"textures/particle/particles.png")};
			
			for(int i = 0; i < files.length; i++) {
				Files.move(files[i].toPath(), fileCopied.toPath().resolve(files[i].toPath().getFileName()));
			}
			File[] moveFile = {new File(fileCopied+"/environment/moon.png"),new File(fileCopied+"/environment/sun.png"),new File(fileCopied+"/mob/arrows.png"),new File(fileCopied+"/mob/cart.png"),new File(fileCopied+"/mob/sign.png"),new File(path+"textures/colormap/foliagecolor.png"),
					new File(path+"textures/colormap/grasscolor.png"),new File(fileCopied+"/gui/container/crafting.png"),new File(fileCopied+"/gui/container/furnace.png"),new File(fileCopied+"/gui/container/container.png"),new File(fileCopied+"/gui/container/inventory.png"),
					new File(fileCopied+"/gui/container/trap.png"),new File(fileCopied+"/gui/title/mojang.png"),new File(fileCopied+"/misc/unknown_pack.png"),new File(fileCopied+"/mob/cow/cow.png"),new File(fileCopied+"/mob/creeper/creeper.png"),new File(fileCopied+"/mob/ghast/ghast.png"),
					new File(fileCopied+"/mob/ghast/ghast_fire.png"),new File(fileCopied+"/mob/pig/pig.png"),new File(fileCopied+"/mob/pig/saddle.png"),new File(fileCopied+"/mob/sheep/sheep.png"),new File(fileCopied+"/mob/sheep/sheep_fur.png"),new File(fileCopied+"/mob/skeleton/skeleton.png"),
					new File(fileCopied+"/mob/slime/slime.png"),new File(fileCopied+"/mob/spider/spider.png"),new File(fileCopied+"/mob/zombie/zombie.png")};
			
			File[] moveTo = {new File(fileCopied+"/terrain"),new File(fileCopied+"/terrain"),new File(fileCopied+"/item"),new File(fileCopied+"/item"),new File(fileCopied+"/item"),new File(fileCopied+"/misc"),
					new File(fileCopied+"/misc"),new File(fileCopied+"/gui"),new File(fileCopied+"/gui"),new File(fileCopied+"/gui"),new File(fileCopied+"/gui"),
					new File(fileCopied+"/gui"),new File(fileCopied+"/title"),new File(fileCopied+"/gui"),new File(fileCopied+"/mob"),new File(fileCopied+"/mob"),new File(fileCopied+"/mob"),
					new File(fileCopied+"/mob"),new File(fileCopied+"/mob"),new File(fileCopied+"/mob"),new File(fileCopied+"/mob"),new File(fileCopied+"/mob"),new File(fileCopied+"/mob"),
					new File(fileCopied+"/mob"),new File(fileCopied+"/mob"),new File(fileCopied+"/mob")};
		
			for(int i = 0; i < moveFile.length; i++) {
				Files.move(moveFile[i].toPath(), moveTo[i].toPath().resolve(moveFile[i].toPath().getFileName()));
			}
			
			File[] delete = {new File(fileCopied+"/mob/cow"),new File(fileCopied+"/mob/creeper"),new File(fileCopied+"/mob/ghast"),new File(fileCopied+"/mob/pig"),new File(fileCopied+"/mob/sheep"),new File(fileCopied+"/mob/skeleton"),
					new File(fileCopied+"/mob/slime"),new File(fileCopied+"/mob/spider"),new File(fileCopied+"/mob/zombie"),new File(fileCopied+"/gui/container"),new File(fileCopied+"/gui/title"),new File(fileCopied+"/assets")};
			
			for(int i = 0; i < delete.length; i++) {
				if(delete[i].isDirectory()) {
					File[] f = delete[i].listFiles();
					for(File ff : f) {
						if(ff.isDirectory()) {
							File[] fff = ff.listFiles();
							for(File ffff : fff) {
								ffff.delete();
							}
							ff.delete();
						} else {
							ff.delete();
						}
					}
					delete[i].delete();
				} else {
					delete[i].delete();
				}
			}
		} else if(FromType == 1 && ToType == 3) {
			
		} else if(FromType == 2 && ToType == 1) {
			
		} else if(FromType == 2 && ToType == 2) {
			
		} else if(FromType == 3 && ToType == 1) {
			
		} else if(FromType == 3 && ToType == 2) {
			
		}
	}
}
