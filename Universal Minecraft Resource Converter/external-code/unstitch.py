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
    try:
        if not os.path.exists(path):
            os.makedirs(path)
    except OSError:
        print("Error: Creating directory. " + path)
    base = Image.open(fileCopied+"/terrain.png")
    names = ["grass_top.png","stone.png","dirt.png","grass_side.png","planks_oak.png","stone_slab_side.png","stone_slab_top.png","brick.png","tnt_side.png","tnt_top.png","tnt_bottom.png","web.png","flower_rose.png","flower_dandelion.png","none","sapling_oak.png",
                  "cobblestone.png","bedrock.png","sand.png","gravel.png","log_oak.png","log_oak_top.png","iron_block.png","gold_block.png","diamond_block.png","emerald_block.png","none","none","mushroom_red.png","mushroom_brown.png","sapling_jungle.png","none",
                  "gold_ore.png","iron_ore.png","coal_ore.png","bookshelf.png","cobblestone_mossy.png","obsidian.png","grass_side_overlay.png","tallgrass.png","grass_top.png","beacon.png","none","crafting_table_top.png","furnace_front_off.png","furnace_side.png","dispenser_front_horizontal.png","none",
                  "sponge.png","glass.png","diamond_ore.png","redstone_ore.png","leaves_oak.png","none","stonebrick.png","deadbush.png","fern.png","none","none","crafting_table_side.png","crafting_table_front.png","furnace_front_on.png","furnace_top.png","sapling_spruce.png",
                  "wool_colored_white.png","mob_spawner.png","snow.png","ice.png","grass_side_snowed.png","cactus_top.png","cactus_side.png","cactus_bottom.png","clay.png","reeds.png","jukebox_side.png","jukebox_top.png","waterlily.png","mycelium_side.png","mycelium_top.png","sapling_birch.png",
                  "torch_on.png","door_wood_upper.png","door_iron_upper.png","ladder.png","trapdoor.png","iron_bars.png","farmland_wet.png","farmland_dry.png","wheat_stage_0.png","wheat_stage_1.png","wheat_stage_2.png","wheat_stage_3.png","wheat_stage_4.png","wheat_stage_5.png","wheat_stage_6.png","wheat_stage_7.png",
                  "lever.png","door_wood_lower.png","door_iron_lower.png","redstone_torch_on.png","stonebrick_mossy.png","stonebrick_cracked.png","pumpkin_top.png","netherrack.png","soul_sand.png","glowstone.png","piston_top_sticky.png","piston_top_normal.png","piston_side.png","piston_bottom.png","piston_inner.png","pumpkin_stem_disconnected.png",
                  "rail_normal_turned.png","wool_colored_black.png","wool_colored_gray.png","redstone_torch_off.png","log_spruce.png","log_birch.png","pumpkin_side.png","pumpkin_face_off.png","pumpkin_face_on.png","cake_top.png","cake_side.png","cake_inner.png","cake_bottom.png","mushroom_block_skin_red.png","mushroom_block_skin_brown.png","pumpkin_stem_connected.png",
                  "rail_normal.png","wool_colored_red.png","wool_colored_pink.png","repeater_off.png","leaves_spruce.png","none","bed_feet_top.png","bed_head_top.png","melon_side.png","melon_top.png","cauldron_top.png","cauldron_inner.png","none","mushroom_block_skin_stem.png","mushroom_block_inside.png","vine.png",
                  "lapis_block.png","wool_colored_green.png","wool_colored_lime.png","repeater_on.png","glass_pane_top.png","bed_feet_end.png","bed_feet_side.png","bed_head_side.png","bed_head_end.png","log_jungle.png","cauldron_side.png","cauldron_bottom.png","brewing_stand_base.png","brewing_stand.png","endframe_top.png","endframe_side.png",
                  "lapis_ore.png","wool_colored_brown.png","wool_colored_yellow.png","rail_golden.png","redstone_dust_dot.png","redstone_dust_line0.png","enchanting_table_top.png","dragon_egg.png","cocoa_stage_2.png","cocoa_stage_1.png","cocoa_stage_0.png","emerald_ore.png","trip_wire_source.png","trip_wire.png","endframe_eye.png","end_stone.png",
                  "sandstone_top.png","wool_colored_blue.png","wool_colored_light_blue.png","rail_golden_powered.png","none","none","enchanting_table_side.png","enchanting_table_bottom.png","command_block_back.png","itemframe_background.png","flower_pot.png","none","none","none","none","none",
                  "sandstone_normal.png","wool_colored_purple.png","wool_colored_magenta.png","rail_detector.png","leaves_jungle.png","none","planks_spruce.png","planks_jungle.png","carrots_stage_0.png","carrots_stage_1.png","carrots_stage_2.png","carrots_stage_3.png","potatoes_stage_3.png","none","none","none",
                  "sandstone_bottom.png","wool_colored_cyan.png","wool_colored_orange.png","redstone_lamp_off.png","redstone_lamp_on.png","stonebrick_carved.png","planks_birch.png","anvil_base.png","anvil_top_damaged_1.png","none","none","none","none","none","none","none",
                  "nether_brick.png","wool_colored_silver.png","nether_wart_stage_0.png","nether_wart_stage_1.png","nether_wart_stage_2.png","sandstone_carved.png","sandstone_smooth.png","anvil_top_damaged_0.png","anvil_top_damaged_2.png","none","none","none","none","none","none","none",
	  "destroy_stage_0.png","destroy_stage_1.png","destroy_stage_2.png","destroy_stage_3.png","destroy_stage_4.png","destroy_stage_5.png","destroy_stage_6.png","destroy_stage_7.png","destroy_stage_8.png","destroy_stage_9.png","none","none","none","none","none","none"]
    i = 0
    ii = 0
    x1 = 0
    y1 = 0
    x2 = 16
    y2 = 16
    for img in range(256):
        if ii == 16:
            x1 = 0
            y1 += 16
            x2 = 16
            y2 += 16
            ii = 0
        elif names[i] == "none":
            x1 += 16
            x2 += 16
            i += 1
            ii += 1
        else:
            area = (x1,y1,x2,y2)
            img = base.crop(area)
            img.save(path+names[i], "PNG")
            x1 += 16
            x2 += 16
            i += 1
            ii += 1
        
elif FromType == 2 and ToType == 3:
    path = fileCopied+"/textures/blocks/"
    try:
        if not os.path.exists(path):
            os.makedirs(path)
    except OSError:
        print("Error: Creating directory. " + path)
    base = Image.open(fileCopied+"/terrain.png")
    names = ["grass_top.png","stone.png","dirt.png","grass_side.png","planks_oak.png","stone_slab_side.png","stone_slab_top.png","brick.png","tnt_side.png","tnt_top.png","tnt_bottom.png","web.png","flower_rose.png","flower_dandelion.png","none","sapling_oak.png",
                  "cobblestone.png","bedrock.png","sand.png","gravel.png","log_oak.png","log_oak_top.png","iron_block.png","gold_block.png","diamond_block.png","emerald_block.png","none","none","mushroom_red.png","mushroom_brown.png","sapling_jungle.png","none",
                  "gold_ore.png","iron_ore.png","coal_ore.png","bookshelf.png","cobblestone_mossy.png","obsidian.png","grass_side_overlay.png","tallgrass.png","grass_top.png","beacon.png","none","crafting_table_top.png","furnace_front_off.png","furnace_side.png","dispenser_front_horizontal.png","none",
                  "sponge.png","glass.png","diamond_ore.png","redstone_ore.png","leaves_oak.png","none","stonebrick.png","deadbush.png","fern.png","none","none","crafting_table_side.png","crafting_table_front.png","furnace_front_on.png","furnace_top.png","sapling_spruce.png",
                  "wool_colored_white.png","mob_spawner.png","snow.png","ice.png","grass_side_snowed.png","cactus_top.png","cactus_side.png","cactus_bottom.png","clay.png","reeds.png","jukebox_side.png","jukebox_top.png","waterlily.png","mycelium_side.png","mycelium_top.png","sapling_birch.png",
                  "torch_on.png","door_wood_upper.png","door_iron_upper.png","ladder.png","trapdoor.png","iron_bars.png","farmland_wet.png","farmland_dry.png","wheat_stage_0.png","wheat_stage_1.png","wheat_stage_2.png","wheat_stage_3.png","wheat_stage_4.png","wheat_stage_5.png","wheat_stage_6.png","wheat_stage_7.png",
                  "lever.png","door_wood_lower.png","door_iron_lower.png","redstone_torch_on.png","stonebrick_mossy.png","stonebrick_cracked.png","pumpkin_top.png","netherrack.png","soul_sand.png","glowstone.png","piston_top_sticky.png","piston_top_normal.png","piston_side.png","piston_bottom.png","piston_inner.png","pumpkin_stem_disconnected.png",
                  "rail_normal_turned.png","wool_colored_black.png","wool_colored_gray.png","redstone_torch_off.png","log_spruce.png","log_birch.png","pumpkin_side.png","pumpkin_face_off.png","pumpkin_face_on.png","cake_top.png","cake_side.png","cake_inner.png","cake_bottom.png","mushroom_block_skin_red.png","mushroom_block_skin_brown.png","pumpkin_stem_connected.png",
                  "rail_normal.png","wool_colored_red.png","wool_colored_pink.png","repeater_off.png","leaves_spruce.png","none","bed_feet_top.png","bed_head_top.png","melon_side.png","melon_top.png","cauldron_top.png","cauldron_inner.png","none","mushroom_block_skin_stem.png","mushroom_block_inside.png","vine.png",
                  "lapis_block.png","wool_colored_green.png","wool_colored_lime.png","repeater_on.png","glass_pane_top.png","bed_feet_end.png","bed_feet_side.png","bed_head_side.png","bed_head_end.png","log_jungle.png","cauldron_side.png","cauldron_bottom.png","brewing_stand_base.png","brewing_stand.png","endframe_top.png","endframe_side.png",
                  "lapis_ore.png","wool_colored_brown.png","wool_colored_yellow.png","rail_golden.png","redstone_dust_dot.png","redstone_dust_line0.png","enchanting_table_top.png","dragon_egg.png","cocoa_stage_2.png","cocoa_stage_1.png","cocoa_stage_0.png","emerald_ore.png","trip_wire_source.png","trip_wire.png","endframe_eye.png","end_stone.png",
                  "sandstone_top.png","wool_colored_blue.png","wool_colored_light_blue.png","rail_golden_powered.png","none","none","enchanting_table_side.png","enchanting_table_bottom.png","command_block_back.png","itemframe_background.png","flower_pot.png","none","none","none","none","none",
                  "sandstone_normal.png","wool_colored_purple.png","wool_colored_magenta.png","rail_detector.png","leaves_jungle.png","none","planks_spruce.png","planks_jungle.png","carrots_stage_0.png","carrots_stage_1.png","carrots_stage_2.png","carrots_stage_3.png","potatoes_stage_3.png","none","none","none",
                  "sandstone_bottom.png","wool_colored_cyan.png","wool_colored_orange.png","redstone_lamp_off.png","redstone_lamp_on.png","stonebrick_carved.png","planks_birch.png","anvil_base.png","anvil_top_damaged_1.png","none","none","none","none","none","none","none",
                  "nether_brick.png","wool_colored_silver.png","nether_wart_stage_0.png","nether_wart_stage_1.png","nether_wart_stage_2.png","sandstone_carved.png","sandstone_smooth.png","anvil_top_damaged_0.png","anvil_top_damaged_2.png","none","none","none","none","none","none","none",
	  "destroy_stage_0.png","destroy_stage_1.png","destroy_stage_2.png","destroy_stage_3.png","destroy_stage_4.png","destroy_stage_5.png","destroy_stage_6.png","destroy_stage_7.png","destroy_stage_8.png","destroy_stage_9.png","none","none","none","none","none","none"]
    i = 0
    ii = 0
    x1 = 0
    y1 = 0
    x2 = 16
    y2 = 16
    for img in range(256):
        if ii == 16:
            x1 = 0
            y1 += 16
            x2 = 16
            y2 += 16
            ii = 0
        elif names[i] == "none":
            x1 += 16
            x2 += 16
            i += 1
            ii += 1
        else:
            area = (x1,y1,x2,y2)
            img = base.crop(area)
            img.save(path+names[i], "PNG")
            x1 += 16
            x2 += 16
            i += 1
            ii += 1

elif FromType == 3 and ToType == 1:
    pass
elif FromType == 3 and ToType == 2:
    pass
