from PIL import Image

input_path = "smiley2.png"
image = Image.open(input_path).convert("RGB")
width, height = image.width, image.height

print(f"Loaded image '{input_path}' with dimensions: {width}x{height}\n")

with open("awesome_picture.txt", "w") as output_file:
    for y in range(height):
        row_codes= []
        for x in range(width):
            r, g, b = image.getpixel((x, y))
            if r > 180 and g < 100 and b < 100:
                code = "R"
            elif r < 100 and g < 100 and b < 100:
                code = "B"
            elif r > 180 and g > 180 and b < 100:
                code = "Y"
            else:
                code = "W"

            row_codes.append(code)
            print(f"Pixel at ({x}, {y}): RGB({r}, {g}, {b})")
            
        output_file.write(" ".join(row_codes) + "\n")