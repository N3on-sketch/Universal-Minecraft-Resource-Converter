#Imports Required Librarys
import json
import uuid
from os import name

#Copy's Java variables from 'variables' file for uses in Python
with open(r"external-code/variables", "r") as f:
    variable = []
    for line in f:
        variable.append(str(line))
file = variable[0][0:-1]
fileCopied = file+"-Converted"
FromType = int(variable[1][0:-1])
ToType = int(variable[2][0:-1])

if name == "nt":
    filename = fileCopied.split("\\")
    packname = filename[-1]
else:
    filename = fileCopied.split("/")
    packname = filename[-1]
#Reads json pack file
if FromType == 1 and ToType == 2:
    with open(fileCopied+"/pack.mcmeta") as j:
        data = json.load(j)
    for pack in data["pack"]:
        desc = data["pack"]["description"]
        pf = str(data["pack"]["pack_format"])
elif FromType == 1 and ToType == 3:
    pass
elif FromType == 2 and ToType == 1:
    with open(fileCopied+".zip/pack.txt", "r") as t:
        desc = t.read()
elif FromType == 2 and ToType == 3:
    with open(fileCopied+".zip/pack.txt", "r") as t:
        desc = t.read()
elif FromType == 3 and ToType == 1:
    pass
elif FromType == 3 and ToType == 2:
    with open(fileCopied+"/manifest.json") as j:
        desc = j.read()
        
#Creates pack file for select version
if FromType == 1 and ToType == 2:
    with open(fileCopied+"/pack.txt", "w") as w:
        w.write(desc+" // Converted with BJTMastermind's Universal Minecraft Resource Converter")
elif FromType == 1 and ToType == 3:
    pass
elif FromType == 2 and ToType == 1:
    with open(fileCopied+".zip/pack.mcmeta", "w") as w:
        w.write(
"""{
        "pack": {
                "description": \""""+desc+"\",""""
                "pack_format": 3
    }
}""")
elif FromType == 2 and ToType == 3:
    with open(fileCopied+'.zip/manifest.json', 'w') as w:  
        w.write(
"""{
    "format_version": 1,
    "header": {
        "description": \""""+desc+"\",""""
        "name": \""""+packname+"\",""""
        "uuid": \""""+str(uuid.uuid4())+"\",""""
        "version": [1, 0, 0],
        "min_engine_version": [1, 2, 6]
    },
    "modules": [
        {
            "description": \""""+desc+"\",""""
            "type": "resources",
            "uuid": \""""+str(uuid.uuid4())+"\",""""
            "version": [1, 0, 0]
        }
    ]
}""")
elif FromType == 3 and ToType == 1:
    pass
elif FromType == 3 and ToType == 2:
    with open(fileCopied+"/pack.txt", "w") as w:
        w.write(desc+" // Converted with BJTMastermind's Universal Minecraft Resource Converter")

    



