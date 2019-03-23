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
    path = fileCopied+"/textures/"
    tga_textures = (path+"entity/ghast_shooting.tga",path+"entity/sheep.tga")
    png_textures = (path+"entity/ghast_shooting.png",path+"entity/sheep.png")

    try:
        for i in range(len(png_textures)):
            img = Image.open(png_textures[i])
            img.save(tga_textures[i])
            remove(png_textures[i])
    except:
        pass
elif FromType == 3 and ToType == 1:
    pass
elif FromType == 3 and ToType == 2:
    path = fileCopied+"/textures/"
    tga_textures = (path+"entity/ghast/ghast_shooting.tga",path+"entity/sheep/sheep.tga")
    png_textures = (path+"entity/ghast/ghast_shooting.png",path+"entity/sheep/sheep.png")

    try:
        for i in range(len(tga_textures)):
            img = Image.open(tga_textures[i])
            img.save(png_textures[i])
            remove(tga_textures[i])
    except:
        pass
