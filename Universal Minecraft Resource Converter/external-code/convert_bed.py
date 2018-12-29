#Imports Required Librarys
from PIL import Image

#Copy's Java variables from 'variables' file for uses in Python
with open(r"external-code/variables", "r") as f:
    variable = []
    for line in f:
        variable.append(str(line))
    file = variable[0][0:-1]
    fileCopied = file+"-Converted"
    path = fileCopied+"/assets/minecraft/textures/"

#Converts bed from a tile entity to a block
img = Image.open(path+"entity/bed/red.png")
area0 = (50, 3, 53, 6)
bedl = img.crop(area0).rotate(180)

area1 = (6, 28, 22, 44)
bedft = img.crop(area1)
bedft.rotate(-90).save(path+"entity/bed/bed_feet_top.png")

area2 = (6, 6, 22, 22)
bedht = img.crop(area2)
bedht.rotate(-90).save(path+"entity/bed/bed_head_top.png")

area3 = (22, 28, 28, 44)
bedfs = Image.new("RGBA", (16,16), (0, 0, 0, 0))
bedfs.paste(img.crop(area3), (7,0,13,16))
bedfs.paste(bedl.rotate(90), (13, 13, 16, 16))
bedfs.rotate(-90).save(path+"entity/bed/bed_feet_side.png")

area4 = (22, 6, 28, 22)
bedhs = Image.new("RGBA", (16,16), (0, 0, 0, 0))
bedhs.paste(img.crop(area4), (7,0,13,16))
bedhs.paste(bedl.rotate(90), (13, 0, 16, 3))
bedhs.rotate(-90).save(path+"entity/bed/bed_head_side.png")

area5 = (22, 22, 38, 28)
bedfe = Image.new("RGBA", (16,16), (0, 0, 0, 0))
bedfe.paste(img.crop(area5), (0,3,16,9))
bedfe.paste(bedl.rotate(180), (0, 0, 3, 3))
bedfe.paste(bedl.rotate(180), (13, 0, 16, 3))
bedfe.rotate(180).save(path+"entity/bed/bed_feet_end.png")

area6 = (6, 0, 22, 6)
bedhe = Image.new("RGBA", (16,16), (0, 0, 0, 0))
bedhe.paste(img.crop(area6), (0,3,16,9))
bedhe.paste(bedl.rotate(180), (0, 0, 3, 3))
bedhe.paste(bedl.rotate(180), (13, 0, 16, 3))
bedhe.rotate(180).save(path+"entity/bed/bed_head_end.png")




