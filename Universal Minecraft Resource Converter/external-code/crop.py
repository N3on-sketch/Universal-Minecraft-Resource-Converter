#Imports Required Librarys
from os import name, system
from PIL import Image

#Copy's Java variables from 'variables' file for uses in Python
with open(r"external-code/variables", "r") as f:
    variable = []
    for line in f:
        variable.append(str(line))
file = variable[0][0:-1]
fileCopied = file+"-Converted"
FromType = int(variable[1][0:-1])
ToType = int(variable[2][0:-1])

#Crop All Images Needed
if FromType == 1 and ToType == 2:
    path = fileCopied+"/assets/minecraft/"
    textures = (path+"textures/entity/steve.png",path+"textures/entity/zombie_pigman.png",path+"textures/entity/zombie/zombie.png")

    try:
        img = Image.open(path+"textures/blocks/command_block_back.png")
        area1 = (0,0,16,16)
        cropped = img.crop(area1)
        cropped.save(path+"textures/blocks/command_block_back.png")
    except:
        pass
    
    try:
        img = Image.open(path+"textures/environment/moon_phases.png")
        area2 = (0,0,32,32)
        cropped = img.crop(area2)
        cropped.save(path+"textures/environment/moon_phases.png")
    except:
        pass
    try:
        for img in textures:
            image = Image.open(img)
            area3 = (0,0,64,32)
            cropped = image.crop(area3)
            cropped.save(img)
    except:
        pass
    
elif FromType == 1 and ToType == 3:
    pass
elif FromType == 2 and ToType == 1:
    pass
elif FromType == 2 and ToType == 3:
    pass
elif FromType == 3 and ToType == 1:
    pass
elif FromType == 3 and ToType == 2:
    path = fileCopied+"/textures/"
    textures = (path+"entity/steve.png",path+"entity/zombie_pigman.png",path+"entity/zombie/zombie.png")

    try:
        img = Image.open(path+"blocks/glass_pane_top.png")
        area1 = (7,0,9,16)
        pane = Image.new("RGBA",(16,16), (0,0,0,0))
        pane.paste(img.crop(area1), (area1))
        pane.save(path+"blocks/glass_pane_top.png")
    except:
        pass
    
    try:
        img = Image.open(path+"environment/moon_phases.png")
        area2 = (0,0,32,32)
        cropped = img.crop(area2)
        cropped.save(path+"environment/moon_phases.png")
    except:
        pass
    try:
        for img in textures:
            image = Image.open(img)
            area3 = (0,0,64,32)
            cropped = image.crop(area3)
            cropped.save(img)
    except:
        pass

system('python external-code/convert_bed.py')
system('python external-code/convert_tga.py')
