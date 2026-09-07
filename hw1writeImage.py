from PIL import Image

def convert(code):
    if code == "R": 
        return (237, 28, 36)   
    elif code == "B": 
        return (0, 0, 0)      
    elif code == "Y": 
        return (255, 242, 0) 
    else: 
        return (255, 255, 255) 
    
input_text_file = open("awesome_picture.txt", "r")
lines = input_text_file.readlines()
input_text_file.close()


h = len(lines)
w = len(lines[0].split())


img = Image.new(mode="RGB", size=(w, h), color=(0, 0, 0))


for y in range(h):
    pixels = lines[y].split()
    for x in range(w):
        pixel = pixels[x]
        img.putpixel((x, y), convert(pixel))

# 5. Save the final reconstructed image
img.save("smiley2.png")
print("Successfully generated 'smiley2.png' from text file!")