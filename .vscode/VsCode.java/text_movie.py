# from moviepy.editor import VideoFileClip

# print("MoviePy imported successfully!")
# import sys
# print(sys.path)
# import moviepy
# print("MoviePy version:", moviepy.__version__)
# from moviepy.editor import VideoFileClip

# clip = VideoFileClip("example.mp4")
# print("Duration:", clip.duration, "seconds")
from moviepy.editor import ColorClip

# 5 second ka ek red color video banayenge
clip = ColorClip(size=(320, 240), color=(255, 0, 0), duration=5)

# Video ko save karenge
clip.write_videofile("test_output.mp4", fps=24)

print("MoviePy test successful! Video ban gaya ✅")
