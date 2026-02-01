# from moviepy.editor import  *
# #vedio size ( reels+ moblie freindly)
# WIDTH , HEIGHT = 720,1280
# #background color
# bg = ColorClip(size=(WIDTH,HEIGHT), color=(30,144,255), duration=10)
# #Tettel text 
# title = TextClip("WHAT IS PYTHON?", fontsize=80, color='yellow', font="Arial-Bold").set_position(("center",200)).set_duration(10)
# #explanation text
# text1 = TextClip(
#     "Python is a high-level,\ninterpreted programming language\nknown for its readability\nand versatility.",
#     fontsize=50,
#     color="white", 
#      ).set_position(("center",520)).duration(10)
#     text2 = TextClip(
#     "It supports multiple programming\nparadigms, including procedural,\nobject-oriented, and functional programming.",
#     fontsize=50,
#     color="white", 
#     ).set_position(("center",720)).set_duration(10)
#     text3 = TextClip(
#         "used in AI,WED,DATAScience,\nAutomation,and more.",
#         fontsize=50,
#         color="white",
#     ).set_position(("center",600)).set_duration(10)
#     #composite all clips
#     final_vedio = CompositeVideoClip([bg, title, text1, text2, text3])
#     #save vedio
from moviepy.editor import *

# Video size (Reels + Mobile friendly)
WIDTH, HEIGHT = 720, 1280
DURATION = 4

# Background
bg = ColorClip(size=(WIDTH, HEIGHT), color=(30, 144, 255), duration=DURATION)

# Title text
title = TextClip(
    "What is Python?",
    fontsize=80,
    color="yellow",
    font="Arial-Bold"
).set_position(("center", 200)).set_duration(DURATION)

# Explanation text
text1 = TextClip(
    "Python is a Programming Language",
    fontsize=45,
    color="white"
).set_position(("center", 400)).set_duration(DURATION)

text2 = TextClip(
    "Easy to Learn 👌",
    fontsize=40,
    color="white"
).set_position(("center", 520)).set_duration(DURATION)

text3 = TextClip(
    "Used in AI, Web, Data Science 🚀",
    fontsize=40,
    color="white"
).set_position(("center", 600)).set_duration(DURATION)

# Combine all
final_video = CompositeVideoClip([bg, title, text1, text2, text3])

# Save video
final_video.write_videofile("python_intro_animation.mp4", fps=24)
