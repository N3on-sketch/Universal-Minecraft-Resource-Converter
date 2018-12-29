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
system('python external-code/convert_bed.py')
