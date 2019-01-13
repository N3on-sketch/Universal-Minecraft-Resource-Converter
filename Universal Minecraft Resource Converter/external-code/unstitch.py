#Imports Required Librarys
import os
from PIL import Image

#Copy's Java variables from 'variables' file for uses in Python
with open('external-code/variables', 'r') as f:
    variable = []
    for line in f:
        variable.append(str(line))
file = variable[0][0:-1]
fileCopied = file+"-Converted.zip"
FromType = int(variable[1][0:-1])
ToType = int(variable[2][0:-1])

#Strips out the images from "terrain.png" and puts them into there own files with proper names
if FromType == 1 and ToType == 2:
    pass
elif FromType == 1 and ToType == 3:
    pass
elif FromType == 2 and ToType == 1:
    path = fileCopied+"/assets/minecraft/textures/blocks/"
    os.makedirs(path)
    base = Image.open(fileCopied+"/terrain.png")
    text_names = [path+"grass_top.png",path+"stone.png",path+"dirt.png",path+"grass_side.png",path+"planks_oak.png",path+"stone_slab_side.png",path+"stone_slab_top.png",path+"brick.png",path+"tnt_side.png",path+"tnt_top.png",path+"tnt_bottom.png",path+"web.png",path+"flower_rose.png",path+"flower_dandelion.png","external-code/empty.png",path+"sapling_oak.png",
                  path+"cobblestone.png",path+"bedrock.png",path+"sand.png",path+"gravel.png",path+"log_oak.png",path+"log_oak_top.png",path+"iron_block.png",path+"gold_block.png",path+"diamond_block.png",path+"emerald_block.png","external-code/empty.png","external-code/empty.png",path+"mushroom_red.png",path+"mushroom_brown.png",path+"sapling_jungle.png","external-code/empty.png",
                  path+"gold_ore.png",path+"iron_ore.png",path+"coal_ore.png",path+"bookshelf.png",path+"cobblestone_mossy.png",path+"obsidian.png",path+"grass_side_overlay.png",path+"tallgrass.png",path+"grass_top.png",path+"beacon.png","external-code/empty.png",path+"crafting_table_top.png",path+"furnace_front_off.png",path+"furnace_side.png",path+"dispenser_front_horizontal.png","external-code/empty.png",
                  path+"sponge.png",path+"glass.png",path+"diamond_ore.png",path+"redstone_ore.png",path+"leaves_oak.png","external-code/empty.png",path+"stonebrick.png",path+"deadbush.png",path+"fern.png","external-code/empty.png","external-code/empty.png",path+"crafting_table_side.png",path+"crafting_table_front.png",path+"furnace_front_on.png",path+"furnace_top.png",path+"sapling_spruce.png",
                  path+"wool_colored_white.png",path+"mob_spawner.png",path+"snow.png",path+"ice.png",path+"grass_side_snowed.png",path+"cactus_top.png",path+"cactus_side.png",path+"cactus_bottom.png",path+"clay.png",path+"reeds.png",path+"jukebox_side.png",path+"jukebox_top.png",path+"waterlily.png",path+"mycelium_side.png",path+"mycelium_top.png",path+"sapling_birch.png",
                  path+"torch_on.png",path+"door_wood_upper.png",path+"door_iron_upper.png",path+"ladder.png",path+"trapdoor.png",path+"iron_bars.png",path+"farmland_wet.png",path+"farmland_dry.png",path+"wheat_stage_0.png",path+"wheat_stage_1.png",path+"wheat_stage_2.png",path+"wheat_stage_3.png",path+"wheat_stage_4.png",path+"wheat_stage_5.png",path+"wheat_stage_6.png",path+"wheat_stage_7.png",
                  path+"lever.png",path+"door_wood_lower.png",path+"door_iron_lower.png",path+"redstone_torch_on.png",path+"stonebrick_mossy.png",path+"stonebrick_cracked.png",path+"pumpkin_top.png",path+"netherrack.png",path+"soul_sand.png",path+"glowstone.png",path+"piston_top_sticky.png",path+"piston_top_normal.png",path+"piston_side.png",path+"piston_bottom.png",path+"piston_inner.png",path+"pumpkin_stem_disconnected.png",
                  path+"rail_normal_turned.png",path+"wool_colored_black.png",path+"wool_colored_gray.png",path+"redstone_torch_off.png",path+"log_spruce.png",path+"log_birch.png",path+"pumpkin_side.png",path+"pumpkin_face_off.png",path+"pumpkin_face_on.png",path+"cake_top.png",path+"cake_side.png",path+"cake_inner.png",path+"cake_bottom.png",path+"mushroom_block_skin_red.png",path+"mushroom_block_skin_brown.png",path+"pumpkin_stem_connected.png",
                  path+"rail_normal.png",path+"wool_colored_red.png",path+"wool_colored_pink.png",path+"repeater_off.png",path+"leaves_spruce.png","external-code/empty.png",path+"/bed_feet_top.png",path+"/bed_head_top.png",path+"melon_side.png",path+"melon_top.png",path+"cauldron_top.png",path+"cauldron_inner.png","external-code/empty.png",path+"mushroom_block_skin_stem.png",path+"mushroom_block_inside.png",path+"vine.png",
                  path+"lapis_block.png",path+"wool_colored_green.png",path+"wool_colored_lime.png",path+"repeater_on.png",path+"glass_pane_top.png",path+"/bed_feet_end.png",path+"/bed_feet_side.png",path+"/bed_head_side.png",path+"/bed_head_end.png",path+"log_jungle.png",path+"cauldron_side.png",path+"cauldron_bottom.png",path+"brewing_stand_base.png",path+"brewing_stand.png",path+"endframe_top.png",path+"endframe_side.png",
                  path+"lapis_ore.png",path+"wool_colored_brown.png",path+"wool_colored_yellow.png",path+"rail_golden.png",path+"redstone_dust_dot.png",path+"redstone_dust_line0.png",path+"enchanting_table_top.png",path+"dragon_egg.png",path+"cocoa_stage_2.png",path+"cocoa_stage_1.png",path+"cocoa_stage_0.png",path+"emerald_ore.png",path+"trip_wire_source.png",path+"trip_wire.png",path+"endframe_eye.png",path+"end_stone.png",
                  path+"sandstone_top.png",path+"wool_colored_blue.png",path+"wool_colored_light_blue.png",path+"rail_golden_powered.png","external-code/empty.png","external-code/empty.png",path+"enchanting_table_side.png",path+"enchanting_table_bottom.png",path+"command_block_back.png",path+"itemframe_background.png",path+"flower_pot.png","external-code/empty.png","external-code/empty.png","external-code/empty.png","external-code/empty.png","external-code/empty.png",
                  path+"sandstone_normal.png",path+"wool_colored_purple.png",path+"wool_colored_magenta.png",path+"rail_detector.png",path+"leaves_jungle.png","external-code/empty.png",path+"planks_spruce.png",path+"planks_jungle.png",path+"carrots_stage_0.png",path+"carrots_stage_1.png",path+"carrots_stage_2.png",path+"carrots_stage_3.png",path+"potatoes_stage_3.png","external-code/empty.png","external-code/empty.png","external-code/empty.png",
                  path+"sandstone_bottom.png",path+"wool_colored_cyan.png",path+"wool_colored_orange.png",path+"redstone_lamp_off.png",path+"redstone_lamp_on.png",path+"stonebrick_carved.png",path+"planks_birch.png",path+"anvil_base.png",path+"anvil_top_damaged_1.png","external-code/empty.png","external-code/empty.png","external-code/empty.png","external-code/empty.png","external-code/empty.png","external-code/empty.png","external-code/empty.png",
                  path+"nether_brick.png",path+"wool_colored_silver.png",path+"nether_wart_stage_0.png",path+"nether_wart_stage_1.png",path+"nether_wart_stage_2.png",path+"sandstone_carved.png",path+"sandstone_smooth.png",path+"anvil_top_damaged_0.png",path+"anvil_top_damaged_2.png","external-code/empty.png","external-code/empty.png","external-code/empty.png","external-code/empty.png","external-code/empty.png","external-code/empty.png","external-code/empty.png",
	  path+"destroy_stage_0.png",path+"destroy_stage_1.png",path+"destroy_stage_2.png",path+"destroy_stage_3.png",path+"destroy_stage_4.png",path+"destroy_stage_5.png",path+"destroy_stage_6.png",path+"destroy_stage_7.png",path+"destroy_stage_8.png",path+"destroy_stage_9.png","external-code/empty.png","external-code/empty.png","external-code/empty.png","external-code/empty.png","external-code/empty.png","external-code/empty.png"]
    texture_objects = []
    img_top = 0
    img_bottom = 16
    img_right = 16
    img_left = 0

    i = 0
    for img in text_names:
        if img_right == 256:
            area = (img_left,img_top,img_right,img_bottom)
            img_right = 0
            img_bottom += 16
            img_left = -16
            img_top += 16
        else:
            area = (img_left,img_top,img_right,img_bottom)
            img_left += 16
            img_right += 16
            newimg = Image.new("RGBA", (16,16), (0, 0, 0, 0))
            newimg = base.crop(area)
            newimg.save(text_names[i], "PNG")
            i+=1
    
elif FromType == 2 and ToType == 3:
    pass
elif FromType == 3 and ToType == 1:
    pass
elif FromType == 3 and ToType == 2:
    pass
