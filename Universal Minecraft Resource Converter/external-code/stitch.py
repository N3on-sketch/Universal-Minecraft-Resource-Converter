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
filePath = fileCopied+"\\assets\\minecraft\\textures\\blocks\\"
base = Image.open(fileCopied+"\\terrain.png")
text_names = [filePath+"grass_top.png",filePath+"stone.png",filePath+"dirt.png",filePath+"grass_side.png",filePath+"planks_oak.png",filePath+"stone_slab_side.png",filePath+"stone_slab_top.png",filePath+"brick.png",filePath+"tnt_side.png",filePath+"tnt_top.png",filePath+"tnt_bottom.png",filePath+"web.png",filePath+"flower_rose.png",filePath+"flower_dandelion.png","external-code/empty.png",filePath+"sapling_oak.png",
              filePath+"cobblestone.png",filePath+"bedrock.png",filePath+"sand.png",filePath+"gravel.png",filePath+"log_oak.png",filePath+"log_oak_top.png",filePath+"iron_block.png",filePath+"gold_block.png",filePath+"diamond_block.png",filePath+"emerald_block.png","external-code/empty.png","external-code/empty.png",filePath+"mushroom_red.png",filePath+"mushroom_brown.png",filePath+"sapling_jungle.png","external-code/empty.png",
              filePath+"gold_ore.png",filePath+"iron_ore.png",filePath+"coal_ore.png",filePath+"bookshelf.png",filePath+"cobblestone_mossy.png",filePath+"obsidian.png",filePath+"grass_side_overlay.png",filePath+"tallgrass.png",filePath+"grass_top.png",filePath+"beacon.png","external-code/empty.png",filePath+"crafting_table_top.png",filePath+"furnace_front_off.png",filePath+"furnace_side.png",filePath+"dispenser_front_horizontal.png","external-code/empty.png",
              filePath+"sponge.png",filePath+"glass.png",filePath+"diamond_ore.png",filePath+"redstone_ore.png",filePath+"leaves_oak.png","external-code/empty.png",filePath+"stonebrick.png",filePath+"deadbush.png",filePath+"fern.png","external-code/empty.png","external-code/empty.png",filePath+"crafting_table_side.png",filePath+"crafting_table_front.png",filePath+"furnace_front_on.png",filePath+"furnace_top.png",filePath+"sapling_spruce.png",
              filePath+"wool_colored_white.png",filePath+"mob_spawner.png",filePath+"snow.png",filePath+"ice.png",filePath+"grass_side_snowed.png",filePath+"cactus_top.png",filePath+"cactus_side.png",filePath+"cactus_bottom.png",filePath+"clay.png",filePath+"reeds.png",filePath+"jukebox_side.png",filePath+"jukebox_top.png",filePath+"waterlily.png",filePath+"mycelium_side.png",filePath+"mycelium_top.png",filePath+"sapling_birch.png",
              filePath+"torch_on.png"]
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
