package bjtmastermind.umrc.program;

import java.io.File;

public class Rename extends FileWorks {
	public static void main() {
		if(FromType == 1 && ToType == 2) {
			File[] renameFrom = {new File(path+"textures/painting"),new File(path+"textures/models/armor/chainmail_layer_1.png"),new File(path+"textures/models/armor/chainmail_layer_2.png"),new File(path+"textures/models/armor/diamond_layer_1.png"),
					new File(path+"textures/models/armor/diamond_layer_2.png"),new File(path+"textures/models/armor/gold_layer_1.png"),new File(path+"textures/models/armor/gold_layer_2.png"),new File(path+"textures/models/armor/iron_layer_1.png"),new File(path+"textures/models/armor/iron_layer_2.png"),
					new File(path+"textures/models/armor/leather_layer_1.png"),new File(path+"textures/models/armor/leather_layer_2.png"),new File(path+"textures/art/paintings_kristoffer_zetterstrand.png"),new File(path+"textures/entity/arrow.png"),new File(path+"textures/colormap/foliage.png"),
					new File(path+"textures/colormap/grass.png"),new File(path+"textures/environment/moon_phases.png"),new File(path+"lang/en_us.lang"),new File(path+"textures/entity/steve.png"),new File(path+"textures/entity/zombie_pigman.png"),new File(path+"textures/entity/minecart.png"),new File(path+"textures/entity/ghast/ghast_shooting.png"),
					new File(path+"textures/entity/pig/pig_saddle.png"),new File(path+"textures/entity"),new File(path+"textures/gui/options_background.png"),new File(path+"textures/gui/widgets.png"),new File(path+"textures/gui/container/crafting_table.png"),new File(path+"textures/gui/container/dispenser.png"),new File(path+"textures/gui/container/generic_54.png")};
			
			File[] renameTo = {new File(path+"textures/art"),new File(path+"textures/models/armor/chain_1.png"),new File(path+"textures/models/armor/chain_2.png"),new File(path+"textures/models/armor/diamond_1.png"),
					new File(path+"textures/models/armor/diamond_2.png"),new File(path+"textures/models/armor/gold_1.png"),new File(path+"textures/models/armor/gold_2.png"),new File(path+"textures/models/armor/iron_1.png"),new File(path+"textures/models/armor/iron_2.png"),
					new File(path+"textures/models/armor/cloth_1.png"),new File(path+"textures/models/armor/cloth_2.png"),new File(path+"textures/art/kz.png"),new File(path+"textures/entity/arrows.png"),new File(path+"textures/colormap/foliagecolor.png"),
					new File(path+"textures/colormap/grasscolor.png"),new File(path+"textures/environment/moon.png"),new File(path+"lang/en_US.lang"),new File(path+"textures/entity/char.png"),new File(path+"textures/entity/pigzombie.png"),new File(path+"textures/entity/cart.png"),new File(path+"textures/entity/ghast/ghast_fire.png"),
					new File(path+"textures/entity/pig/saddle.png"),new File(path+"textures/mob"),new File(path+"textures/gui/background.png"),new File(path+"textures/gui/gui.png"),new File(path+"textures/gui/container/crafting.png"),new File(path+"textures/gui/container/trap.png"),new File(path+"textures/gui/container/container.png")};
			
			File[] delete = {new File(path+"textures/models/armor/leather_layer_1_overlay.png"),new File(path+"textures/models/armor/leather_layer_2_overlay.png"),new File(path+"textures/environment/end_sky.png"),new File(path+"textures/mob/armorstand"),
					new File(path+"textures/mob/banner"),new File(path+"textures/mob/bear"),new File(path+"textures/mob/boat"),new File(path+"textures/mob/cat"),new File(path+"textures/mob/endercrystal"),new File(path+"textures/mob/enderdragon"),new File(path+"textures/mob/enderman"),
					new File(path+"textures/mob/horse"),new File(path+"textures/mob/illager"),new File(path+"textures/mob/llama"),new File(path+"textures/mob/parrot"),new File(path+"textures/mob/projectiles"),new File(path+"textures/mob/rabbit"),new File(path+"textures/mob/shield"),new File(path+"textures/mob/shulker"),
					new File(path+"textures/mob/villager"),new File(path+"textures/mob/wither"),new File(path+"textures/mob/wolf"),new File(path+"textures/mob/zombie_villager"),new File(path+"textures/mob/alex.png"),new File(path+"textures/mob/banner_base.png"),new File(path+"textures/mob/bat.png"),
					new File(path+"textures/mob/beacon_beam.png"),new File(path+"textures/mob/blaze.png"),new File(path+"textures/mob/elytra.png"),new File(path+"textures/mob/enchanting_table_book.png"),new File(path+"textures/mob/end_gateway_beam.png"),new File(path+"textures/mob/end_portal.png"),
					new File(path+"textures/mob/endermite.png"),new File(path+"textures/mob/experience_orb.png"),new File(path+"textures/mob/explosion.png"),new File(path+"textures/mob/guardian.png"),new File(path+"textures/mob/guardian_beam.png"),new File(path+"textures/mob/guardian_elder.png"),
					new File(path+"textures/mob/iron_golem.png"),new File(path+"textures/mob/lead_knot.png"),new File(path+"textures/mob/shield_base.png"),new File(path+"textures/mob/shield_base_nopattern.png"),new File(path+"textures/mob/silverfish.png"),new File(path+"textures/mob/snowman.png"),new File(path+"textures/mob/chest"),
					new File(path+"textures/mob/sweep.png"),new File(path+"textures/mob/witch.png"),new File(path+"textures/misc/enchanted_item_glint.png"),new File(path+"textures/misc/enchanted_item_glint.png.mcmeta"),new File(path+"textures/misc/forcefield.png"),new File(path+"textures/misc/pumpkinblur.png.mcmeta"),
					new File(path+"textures/misc/shadow.png.mcmeta"),new File(path+"textures/misc/underwater.png"),new File(path+"textures/misc/unknown_server.png"),new File(path+"textures/misc/vignette.png.mcmeta"),new File(path+"textures/gui/advancements"),new File(path+"textures/gui/presets"),
					new File(path+"textures/gui/bars.png"),new File(path+"textures/gui/book.png"),new File(path+"textures/gui/demo_background.png"),new File(path+"textures/gui/recipe_book.png"),new File(path+"textures/gui/resource_packs.png"),new File(path+"textures/gui/server_selection.png"),new File(path+"textures/gui/spectator_widgets.png"),
					new File(path+"textures/gui/stream_indicator.png"),new File(path+"textures/gui/toasts.png"),new File(path+"textures/gui/world_selection.png")};
			
			File[] create = {new File(fileCopied+"/pack.mcmeta"),new File(fileCopied+"/terrain"),new File(fileCopied+"/item"),new File(fileCopied+"/title")};
			
					
				for(int i = 0; i < renameFrom.length; i++) {
					renameFrom[i].renameTo(renameTo[i]);
				}
				
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
				for(int i = 0; i < create.length; i++) {
					create[i].mkdir();
				}
				
		} else if(FromType == 1 && ToType == 3) {
			
		} else if(FromType == 2 && ToType == 1) {
			File[] renameFrom = {new File(fileCopied+".zip"),new File(fileCopied+"/armor/chain_1.png"),new File(fileCopied+"/armor/chain_2.png"),new File(fileCopied+"/armor/cloth_1.png"),new File(fileCopied+"/armor/cloth_2.png"),new File(fileCopied+"/armor/diamond_1.png"),new File(fileCopied+"/armor/diamond_2.png"),new File(fileCopied+"/armor/gold_1.png"),
					new File(fileCopied+"/armor/gold_2.png"),new File(fileCopied+"/armor/iron_1.png"),new File(fileCopied+"/armor/iron_2.png"),new File(fileCopied+"/art/kz.png"),new File(fileCopied+"/art"),new File(fileCopied+"/gui/background.png"),new File(fileCopied+"/gui/container.png"),new File(fileCopied+"/gui/crafting.png"),new File(fileCopied+"/gui/gui.png"),
					new File(fileCopied+"/gui/trap.png"),new File(fileCopied+"/item/cart.png"),new File(fileCopied+"/lang/en_US.lang"),new File(fileCopied+"/misc/foliagecolor.png"),new File(fileCopied+"/misc/grasscolor.png"),new File(fileCopied+"/mob/char.png"),new File(fileCopied+"/mob/ghast_fire.png"),new File(fileCopied+"/item/arrows.png"),new File(fileCopied+"/mob/pigzombie.png"),
					new File(fileCopied+"/mob")};
			
			File[] renameTo = {new File(fileCopied.toString()),new File(fileCopied+"/armor/chainmail_layer_1.png"),new File(fileCopied+"/armor/chainmail_layer_2.png"),new File(fileCopied+"/armor/leather_layer_1.png"),new File(fileCopied+"/armor/leather_layer_2.png"),new File(fileCopied+"/armor/diamond_layer_1.png"),new File(fileCopied+"/armor/diamond_layer_2.png"),new File(fileCopied+"/armor/gold_layer_1.png"),
					new File(fileCopied+"/armor/gold_layer_2.png"),new File(fileCopied+"/armor/iron_layer_1.png"),new File(fileCopied+"/armor/iron_layer_2.png"),new File(fileCopied+"/art/paintings_kristoffer_zetterstrand.png"),new File(fileCopied+"/painting"),new File(fileCopied+"/gui/options_background.png"),new File(fileCopied+"/gui/generic_54.png"),new File(fileCopied+"/gui/crafting_table.png"),new File(fileCopied+"/gui/widgets.png"),
					new File(fileCopied+"/gui/dispenser.png"),new File(fileCopied+"/item/minecart.png"),new File(fileCopied+"/lang/en_us.lang"),new File(fileCopied+"/misc/foliage.png"),new File(fileCopied+"/misc/grass.png"),new File(fileCopied+"/mob/steve.png"),new File(fileCopied+"/mob/ghast_shooting.png"),new File(fileCopied+"/item/arrow.png"),new File(fileCopied+"/mob/zombie_pigman.png"),
					new File(fileCopied+"/entity")};
			
			File[] delete = {new File(fileCopied+"/terrain.png"),new File(fileCopied+"/pack.txt")};
			
			File[] create = {new File(fileCopied+"/entity/cow"),new File(fileCopied+"/entity/creeper"),new File(fileCopied+"/entity/ghast"),new File(fileCopied+"/entity/pig"),new File(fileCopied+"/entity/projectiles"),new File(fileCopied+"/entity/sheep"),
					new File(fileCopied+"/entity/skeleton"),new File(fileCopied+"/entity/slime"),new File(fileCopied+"/entity/spider"),new File(fileCopied+"/entity/zombie"),new File(fileCopied+"/gui/container"),new File(path+"textures/models"),new File(path+"textures/colormap"),new File(path+"textures/particle")};
						
			for(int i = 0; i < renameFrom.length; i++) {
				renameFrom[i].renameTo(renameTo[i]);
			}
			
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
			for(int i = 0; i < create.length; i++) {
				create[i].mkdir();
			}
			
		} else if(FromType == 2 && ToType == 3) {
			
		} else if(FromType == 3 && ToType == 1) {
			
		} else if(FromType == 3 && ToType == 2) {
			File[] renameFrom = {new File(path+"painting"),new File(path+"colormap/foliage.png"),new File(path+"colormap/grass.png"),new File(path+"environment/moon_phases.png"),
					new File(path+"entity/steve.png"),	new File(path+"entity/minecart.png"),new File(path+"entity/ghast/ghast_shooting.tga"),new File(path+"entity/pig/pig_saddle.png"),
					new File(path+"entity/sheep/sheep.png"),new File(path+"entity"),new File(fileCopied+"/pack_icon.png"),new File(fileCopied+"/texts")};
			
			File[] renameTo = {new File(path+"art"),new File(path+"colormap/foliagecolor.png"),new File(path+"colormap/grasscolor.png"),new File(path+"environment/moon.png"),
					new File(path+"entity/char.png"),new File(path+"entity/cart.png"),new File(path+"entity/ghast/ghast_fire.tga"),new File(path+"entity/pig/saddle.png"),
					new File(path+"entity/sheep_fur.png"),new File(path+"mob"),new File(fileCopied+"/pack.png"),new File(fileCopied+"/lang")};
			
			File[] delete = {new File(fileCopied+"/credits"),new File(fileCopied+"/font"),new File(fileCopied+"/materials"),new File(fileCopied+"/models"),new File(fileCopied+"/sounds/ambient/weather"),new File(fileCopied+"/sounds/ambient"),
					new File(fileCopied+"/sounds/block/chorusflower"),new File(fileCopied+"/sounds/block/end_portal"),new File(fileCopied+"/sounds/block/itemframe"),new File(fileCopied+"/sounds/block/permissions/shimmer"),new File(fileCopied+"/sounds/block/permissions"),
					new File(fileCopied+"/sounds/block/shulker_box"),new File(fileCopied+"/sounds/block"),new File(fileCopied+"/sounds/mob/player/attack"),new File(fileCopied+"/sounds/mob/player"),new File(fileCopied+"/sounds/mob/horse/donkey"),
					new File(fileCopied+"/sounds/mob/horse/skeleton"),new File(fileCopied+"/sounds/mob/horse/zombie"),new File(fileCopied+"/sounds/mob/horse"),new File(fileCopied+"/sounds/mob/shulker/shulker_bullet"),new File(fileCopied+"/sounds/mob/shulker/"),
					new File(fileCopied+"/sounds/mob"),new File(fileCopied+"/sounds/tile/piston"),new File(fileCopied+"/sounds/tile"),new File(fileCopied+"/sounds"),new File(fileCopied+"/ui"),new File(fileCopied+"/blocks.json"),new File(fileCopied+"/bug_pack_icon.png"),
					new File(fileCopied+"/contents.json"),new File(fileCopied+"/items_client.json"),new File(fileCopied+"/items_offsets_client.json"),new File(fileCopied+"/loading_messages.json"),new File(fileCopied+"/manifest_publish.json"),
					new File(fileCopied+"/sounds.json"),new File(fileCopied+"/splashes.json"),new File(path+"misc/missing_texture.png")};
			File manifest = new File(fileCopied+"/manifest.json");
			File terrain = new File(fileCopied+"/terrain");
			File item = new File(fileCopied+"/item");
			File title = new File(fileCopied+"/title");
							
				for(int i = 0; i < renameFrom.length; i++) {
					renameFrom[i].renameTo(renameTo[i]);
				}
				
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
				manifest.delete();
				terrain.mkdir();
				item.mkdir();
				title.mkdir();
		}
	}
}
