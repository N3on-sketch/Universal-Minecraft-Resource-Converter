#Imports Required Librarys
from os import remove
from PIL import Image

#Copy's Java variables from 'variables' file for uses in Python
with open("external-code/variables", "r") as f:
    variables = []
    for line in f:
        variables.append(str(line))
file = variables[0][0:-1]
fileCopied = file+"-Converted"
FromType = int(variables[1][0:-1])
ToType = int(variables[2][0:-1])

#Converts All files to/from TGA format
if FromType == 1 and ToType == 2:
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
    tga_textures = (path+"entity/ghast/ghast_shooting.tga",path+"entity/sheep/sheep.tga")
    png_textures = (path+"entity/ghast/ghast_shooting.png",path+"entity/sheep/sheep.png")

    try:
        for img in tga_textures:
            img = Image.open(tga_textures[1])
            img.save(png_textures[1])
            remove(tga_textures[1])
    except:
        pass
