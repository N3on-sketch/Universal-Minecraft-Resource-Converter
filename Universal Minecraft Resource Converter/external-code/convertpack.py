#Imports Required Librarys
import json

#Copy's Java variables from 'variables' file for uses in Python
with open(r"external-code/variables", "r") as f:
    variable = []
    for line in f:
        variable.append(str(line))
file = variable[0][0:-1]
fileCopied = file+"-Converted"
FromType = int(variable[1][0:-1])
ToType = int(variable[2][0:-1])

#Reads json pack file
with open(fileCopied+"/pack.mcmeta") as j:
    data = json.load(j)
for pack in data["pack"]:
    desc = data["pack"]["description"]
    pf = str(data["pack"]["pack_format"])
    
#Creates pack file for select version
if FromType == 1 and ToType == 2:
    with open(fileCopied+"/pack.txt", "w") as w:
        w.write(desc+" // Converted with BJTMastermind's Universal Minecraft Resource Converter")
elif FromType == 1 and ToType == 3:
    pass
elif FromType == 2 and ToType == 1:
    pass
elif FromType == 2 and ToType == 3:
    pass
elif FromType == 3 and ToType == 1:
    pass
elif FromType == 3 and ToType == 2:
    pass
    



