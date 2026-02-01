# from moivepy.editor import *
# bg = ColorClip((400,300),color = (0,255,0), duratio = 2)
# text = TextClip("working" , forntsize = 40 , color = "black").set_position("center").set_duration(2)
# vedio = CompositeVidioClip([bg , text])
# vedio.write_vediofile("check.mp4",fps = 24)\



# from moviepy.editor import *

# # Background clip (green color, 400x300 size, 2 seconds duration)
# bg = ColorClip(size=(400, 300), color=(0, 255, 0), duration=2)

# # Text clip (black text, fontsize 40, centered, 2 seconds duration)
# text = TextClip("working", fontsize=40, color="black").set_position("center").set_duration(2)

# # Composite video (combine background + text)
# video = CompositeVideoClip([bg, text])

# # Export video file
# video.write_videofile("check.mp4", fps=24)
from moviepy.editor import VideoFileClip

clip = VideoFileClip("example.mp4")   # apne video file ka naam yahan do
print("Duration:", clip.duration, "seconds")
