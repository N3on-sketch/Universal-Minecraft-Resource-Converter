#Imports Required Librarys
from PIL import Image

#Copys Java variable from 'variables' file for uses in Python
with open('variables', 'r') as f:
    variable = []
    for line in f:
        variable.append(str(line))
    file = variable[0][0:-1]
    fileCopied = file+"-Converted"

#Strips out the images from "terrain.png"
#and puts them into there own files with proper names
print('It Works!')
print('Got Variable =', fileCopied)
