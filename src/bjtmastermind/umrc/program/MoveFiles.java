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
			
			File[] delete = {new File(fileCopied+"/mob/bed"),new File(fileCopied+"/mob/cow"),new File(fileCopied+"/mob/creeper"),new File(fileCopied+"/mob/ghast"),new File(fileCopied+"/mob/pig"),new File(fileCopied+"/mob/sheep"),new File(fileCopied+"/mob/skeleton"),
					new File(fileCopied+"/mob/slime"),new File(fileCopied+"/mob/spider"),new File(fileCopied+"/mob/zombie"),new File(fileCopied+"/gui/container"),new File(fileCopied+"/gui/title")};
			
			File[] assetsDel = {new File(path+"blockstates"),new File(path+"font"),new File(path+"models/block"),new File(path+"models/item"),new File(path+"models"),new File(path+"texts"),new File(path+"textures/blocks"),new File(path+"textures/colormap"),new File(path+"textures/effect"),
					new File(path+"textures/font"),new File(path+"textures/items"),new File(path+"textures/map"),new File(path+"textures/models"),new File(path+"textures/particle"),new File(path+"textures"),new File(fileCopied+"/assets/minecraft"),new File(fileCopied+"/assets")};
			
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
			for(int i = 0; i < assetsDel.length; i++) {
				if(assetsDel[i].isDirectory()) {
					File[] f = assetsDel[i].listFiles();
					for(File ff : f) {
						ff.delete();
					}
					assetsDel[i].delete();
				} else {
					assetsDel[i].delete();
				}
			}
		} else if(FromType == 1 && ToType == 3) {
			
		} else if(FromType == 2 && ToType == 1) {
			File[] moveFile = {new File(fileCopied+"/armor"),new File(fileCopied+"/entity"),new File(fileCopied+"/environment"),new File(fileCopied+"/gui"),new File(fileCopied+"/lang"),new File(fileCopied+"/misc"),new File(fileCopied+"/painting"),
					new File(fileCopied+"/title"),new File(fileCopied+"/item/arrow.png"),new File(fileCopied+"/item/minecart.png"),new File(fileCopied+"/item/sign.png"),new File(fileCopied+"/terrain/sun.png"),new File(fileCopied+"/particles.png"),new File(path+"textures/misc/foliage.png"),
					new File(path+"textures/misc/grass.png"),new File(path+"textures/entity/cow.png"),new File(path+"textures/entity/creeper.png"),new File(path+"textures/entity/ghast.png"),new File(path+"textures/entity/ghast_shooting.png"),new File(path+"textures/entity/pig.png"),
					new File(path+"textures/entity/saddle.png"),new File(path+"textures/entity/sheep.png"),new File(path+"textures/entity/sheep_fur.png"),new File(path+"textures/entity/skeleton.png"),new File(path+"textures/entity/slime.png"),new File(path+"textures/entity/spider.png"),
					new File(path+"textures/entity/zombie.png"),new File(path+"textures/gui/crafting_table.png"),new File(path+"textures/gui/dispenser.png"),new File(path+"textures/gui/furnace.png"),new File(path+"textures/gui/generic_54.png"),new File(path+"textures/gui/inventory.png"),
					new File(path+"textures/gui/unknown_pack.png")};
			
			File[] moveTo = {new File(path+"textures/models/armor"),new File(path+"textures/entity"),new File(path+"/textures/environment"),new File(path+"textures/gui"),new File(path+"lang"),new File(path+"textures/misc"),new File(path+"textures/painting"),
					new File(path+"textures/gui/title"),new File(path+"textures/entity/projectiles"),new File(path+"textures/entity"),new File(path+"textures/entity"),new File(path+"textures/environment"),new File(path+"textures/particle"),new File(path+"textures/colormap"),
					new File(path+"textures/colormap"),new File(path+"textures/entity/cow"),new File(path+"textures/entity/creeper"),new File(path+"textures/entity/ghast"),new File(path+"textures/entity/ghast"),new File(path+"textures/entity/pig"),
					new File(path+"textures/entity/pig"),new File(path+"textures/entity/sheep"),new File(path+"textures/entity/sheep"),new File(path+"textures/entity/skeleton"),new File(path+"textures/entity/slime"),new File(path+"textures/entity/spider"),
					new File(path+"textures/entity/zombie"),new File(path+"textures/gui/container"),new File(path+"textures/gui/container"),new File(path+"textures/gui/container"),new File(path+"textures/gui/container"),new File(path+"textures/gui/container"),
					new File(path+"textures/misc")};
			
			for(int i = 0; i < moveFile.length; i++) {
				if(moveFile[i].isFile()) {
					Files.move(moveFile[i].toPath(), moveTo[i].toPath().resolve(moveFile[i].toPath().getFileName()));
				} else {
					moveFile[i].renameTo(moveTo[i]);
				}
			}
			
			File[] delete = {new File(fileCopied+"/item"),new File(fileCopied+"/terrain")};
			
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
			
		} else if(FromType == 2 && ToType == 2) {
			
		} else if(FromType == 3 && ToType == 1) {
			
		} else if(FromType == 3 && ToType == 2) {
			/*File[] files = {new File(path+"models/armor"),new File(path+"art"),new File(path+"environment"),new File(path+"gui"),new File(path+"misc"),new File(path+"mob"),new File(path+"particle/particles.png")};
			
			for(int i = 0; i < files.length; i++) {
				Files.move(files[i].toPath(), fileCopied.toPath().resolve(files[i].toPath().getFileName()));
			}
			File[] moveFile = {new File(fileCopied+"/environment/moon.png"),new File(fileCopied+"/environment/sun.png"),new File(fileCopied+"/mob/arrows.png"),new File(fileCopied+"/mob/cart.png"),new File(fileCopied+"/mob/sign.png"),new File(path+"colormap/foliagecolor.png"),
					new File(path+"colormap/grasscolor.png"),new File(fileCopied+"/mob/cow/cow.png"),new File(fileCopied+"/mob/creeper/creeper.png"),new File(fileCopied+"/mob/ghast/ghast.png"),new File(fileCopied+"/mob/ghast/ghast_fire.tga"),new File(fileCopied+"/mob/pig/pig.png"),
					new File(fileCopied+"/mob/sheep/sheep_fur.png"),new File(fileCopied+"/mob/skeleton/skeleton.png"),new File(fileCopied+"/mob/slime/slime.png"),new File(fileCopied+"/mob/spider/spider.png"),new File(fileCopied+"/mob/zombie/zombie.png")};
			
			File[] moveTo = {new File(fileCopied+"/terrain"),new File(fileCopied+"/terrain"),new File(fileCopied+"/item"),new File(fileCopied+"/item"),new File(fileCopied+"/item"),new File(fileCopied+"/misc"),
					new File(fileCopied+"/misc"),new File(fileCopied+"/mob"),new File(fileCopied+"/mob"),new File(fileCopied+"/mob"),new File(fileCopied+"/mob"),new File(fileCopied+"/mob"),
					new File(fileCopied+"/mob"),new File(fileCopied+"/mob"),new File(fileCopied+"/mob"),new File(fileCopied+"/mob"),new File(fileCopied+"/mob")};
			
			for(int i = 0; i < moveFile.length; i++) {
				Files.move(moveFile[i].toPath(), moveTo[i].toPath().resolve(moveFile[i].toPath().getFileName()));
			}
			
			File[] delete = {new File(fileCopied+"/mob/bed"),new File(fileCopied+"/mob/cow"),new File(fileCopied+"/mob/creeper"),new File(fileCopied+"/mob/ghast"),new File(fileCopied+"/mob/pig"),new File(fileCopied+"/mob/sheep"),new File(fileCopied+"/mob/skeleton"),
					new File(fileCopied+"/mob/slime"),new File(fileCopied+"/mob/spider"),new File(fileCopied+"/mob/zombie")};
			
			File[] assetsDel = {new File(path+"blockstates"),new File(path+"font"),new File(path+"models/block"),new File(path+"models/item"),new File(path+"models"),new File(path+"texts"),new File(path+"textures/blocks"),new File(path+"textures/colormap"),new File(path+"textures/effect"),
					new File(path+"textures/font"),new File(path+"textures/items"),new File(path+"textures/map"),new File(path+"textures/models"),new File(path+"textures/particle"),new File(path+"textures"),new File(fileCopied+"/assets/minecraft"),new File(fileCopied+"/assets")};
			
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
			for(int i = 0; i < assetsDel.length; i++) {
				if(assetsDel[i].isDirectory()) {
					File[] f = assetsDel[i].listFiles();
					for(File ff : f) {
						ff.delete();
					}
					assetsDel[i].delete();
				} else {
					assetsDel[i].delete();
				}
			}*/
		}
	}
}
