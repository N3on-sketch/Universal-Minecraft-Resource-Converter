#Imports Required Librarys
from PIL import Image

#Copy's Java variables from 'variables' file for uses in Python
with open(r"external-code/variables", "r") as f:
    variable = []
    for line in f:
        variable.append(str(line))
    file = variable[0][0:-1]
    fileCopied = file+"-Converted"

#Creates a blank 256x256 image called "terrain.png"
def blank():
    img = Image.new("RGBA", (256,256), (0, 0, 0, 0))
    img.save(fileCopied+"\\terrain.png", "PNG")
blank()

#Stitches all the images together into "terrain.png"
filePath = fileCopied+"/assets/minecraft/textures/blocks/"
beds = fileCopied+"/assets/minecraft/textures/entity/bed/"
base = Image.open(fileCopied+"\\terrain.png")
text_names = [filePath+"grass_top.png",filePath+"stone.png",filePath+"dirt.png",filePath+"grass_side.png",filePath+"planks_oak.png",filePath+"stone_slab_side.png",filePath+"stone_slab_top.png",filePath+"brick.png",filePath+"tnt_side.png",filePath+"tnt_top.png",filePath+"tnt_bottom.png",filePath+"web.png",filePath+"flower_rose.png",filePath+"flower_dandelion.png","external-code/empty.png",filePath+"sapling_oak.png",
              filePath+"cobblestone.png",filePath+"bedrock.png",filePath+"sand.png",filePath+"gravel.png",filePath+"log_oak.png",filePath+"log_oak_top.png",filePath+"iron_block.png",filePath+"gold_block.png",filePath+"diamond_block.png",filePath+"emerald_block.png","external-code/empty.png","external-code/empty.png",filePath+"mushroom_red.png",filePath+"mushroom_brown.png",filePath+"sapling_jungle.png","external-code/empty.png",
              filePath+"gold_ore.png",filePath+"iron_ore.png",filePath+"coal_ore.png",filePath+"bookshelf.png",filePath+"cobblestone_mossy.png",filePath+"obsidian.png",filePath+"grass_side_overlay.png",filePath+"tallgrass.png",filePath+"grass_top.png",filePath+"beacon.png","external-code/empty.png",filePath+"crafting_table_top.png",filePath+"furnace_front_off.png",filePath+"furnace_side.png",filePath+"dispenser_front_horizontal.png","external-code/empty.png",
              filePath+"sponge.png",filePath+"glass.png",filePath+"diamond_ore.png",filePath+"redstone_ore.png",filePath+"leaves_oak.png","external-code/empty.png",filePath+"stonebrick.png",filePath+"deadbush.png",filePath+"fern.png","external-code/empty.png","external-code/empty.png",filePath+"crafting_table_side.png",filePath+"crafting_table_front.png",filePath+"furnace_front_on.png",filePath+"furnace_top.png",filePath+"sapling_spruce.png",
              filePath+"wool_colored_white.png",filePath+"mob_spawner.png",filePath+"snow.png",filePath+"ice.png",filePath+"grass_side_snowed.png",filePath+"cactus_top.png",filePath+"cactus_side.png",filePath+"cactus_bottom.png",filePath+"clay.png",filePath+"reeds.png",filePath+"jukebox_side.png",filePath+"jukebox_top.png",filePath+"waterlily.png",filePath+"mycelium_side.png",filePath+"mycelium_top.png",filePath+"sapling_birch.png",
              filePath+"torch_on.png",filePath+"door_wood_upper.png",filePath+"door_iron_upper.png",filePath+"ladder.png",filePath+"trapdoor.png",filePath+"iron_bars.png",filePath+"farmland_wet.png",filePath+"farmland_dry.png",filePath+"wheat_stage_0.png",filePath+"wheat_stage_1.png",filePath+"wheat_stage_2.png",filePath+"wheat_stage_3.png",filePath+"wheat_stage_4.png",filePath+"wheat_stage_5.png",filePath+"wheat_stage_6.png",filePath+"wheat_stage_7.png",
              filePath+"lever.png",filePath+"door_wood_lower.png",filePath+"door_iron_lower.png",filePath+"redstone_torch_on.png",filePath+"stonebrick_mossy.png",filePath+"stonebrick_cracked.png",filePath+"pumpkin_top.png",filePath+"netherrack.png",filePath+"soul_sand.png",filePath+"glowstone.png",filePath+"piston_top_sticky.png",filePath+"piston_top_normal.png",filePath+"piston_side.png",filePath+"piston_bottom.png",filePath+"piston_inner.png",filePath+"pumpkin_stem_disconnected.png",
              filePath+"rail_normal_turned.png",filePath+"wool_colored_black.png",filePath+"wool_colored_gray.png",filePath+"redstone_torch_off.png",filePath+"log_spruce.png",filePath+"log_birch.png",filePath+"pumpkin_side.png",filePath+"pumpkin_face_off.png",filePath+"pumpkin_face_on.png",filePath+"cake_top.png",filePath+"cake_side.png",filePath+"cake_inner.png",filePath+"cake_bottom.png",filePath+"mushroom_block_skin_red.png",filePath+"mushroom_block_skin_brown.png",filePath+"pumpkin_stem_connected.png",
              filePath+"rail_normal.png",filePath+"wool_colored_red.png",filePath+"wool_colored_pink.png",filePath+"repeater_off.png",filePath+"leaves_spruce.png","external-code/empty.png",beds+"/bed_feet_top.png",beds+"/bed_head_top.png",filePath+"melon_side.png",filePath+"melon_top.png",filePath+"cauldron_top.png",filePath+"cauldron_inner.png","external-code/empty.png",filePath+"mushroom_block_skin_stem.png",filePath+"mushroom_block_inside.png",filePath+"vine.png",
              filePath+"lapis_block.png",filePath+"wool_colored_green.png",filePath+"wool_colored_lime.png",filePath+"repeater_on.png",filePath+"glass_pane_top.png",beds+"/bed_feet_end.png",beds+"/bed_feet_side.png",beds+"/bed_head_side.png",beds+"/bed_head_end.png",filePath+"log_jungle.png",filePath+"cauldron_side.png",filePath+"cauldron_bottom.png",filePath+"brewing_stand_base.png",filePath+"brewing_stand.png",filePath+"endframe_top.png",filePath+"endframe_side.png",
              filePath+"lapis_ore.png",filePath+"wool_colored_brown.png",filePath+"wool_colored_yellow.png",filePath+"rail_golden.png",filePath+"redstone_dust_dot.png",filePath+"redstone_dust_line0.png",filePath+"enchanting_table_top.png",filePath+"dragon_egg.png",filePath+"cocoa_stage_2.png",filePath+"cocoa_stage_1.png",filePath+"cocoa_stage_0.png",filePath+"emerald_ore.png",filePath+"trip_wire_source.png",filePath+"trip_wire.png",filePath+"endframe_eye.png",filePath+"end_stone.png",
              filePath+"sandstone_top.png",filePath+"wool_colored_blue.png",filePath+"wool_colored_light_blue.png",filePath+"rail_golden_powered.png","external-code/empty.png","external-code/empty.png",filePath+"enchanting_table_side.png",filePath+"enchanting_table_bottom.png",filePath+"command_block_back.png",filePath+"itemframe_background.png",filePath+"flower_pot.png","external-code/empty.png","external-code/empty.png","external-code/empty.png","external-code/empty.png","external-code/empty.png",
              filePath+"sandstone_normal.png",filePath+"wool_colored_purple.png",filePath+"wool_colored_magenta.png",filePath+"rail_detector.png",filePath+"leaves_jungle.png","external-code/empty.png",filePath+"planks_spruce.png",filePath+"planks_jungle.png",filePath+"carrots_stage_0.png",filePath+"carrots_stage_1.png",filePath+"carrots_stage_2.png",filePath+"carrots_stage_3.png",filePath+"potatoes_stage_3.png","external-code/empty.png","external-code/empty.png","external-code/empty.png",
              filePath+"sandstone_bottom.png"]
texture_objects = []
img_top = 0
img_bottom = 16
img_right = 16
img_left = 0

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
    base.paste(Image.open(img), area)
    base.save(fileCopied+"\\terrain.png", "PNG")
