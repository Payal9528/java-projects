# import pandas as pd
# #student data 
# data ={
#     "Name" : ["Paya ","Ruchi ", "Amit" ,"Neha", "Richa ","Raman"],
#     "Math" : [ 85,75,90,54,70,95],
#     "Science" : [60,70,80,49,35,60],
#     "Hindi" : [70,54,70,70,80,70],
#     "English": [ 30,70,75,97,45,],
# } 
# df = pd.DataFrame(data)
# #Total& Avg
# df["Total"] = df["Math"]+df["Science"] + df["Hindi"] + ["English"]
# df["Average"] = df["Total"] /4
# # Pass / Fail
# df["Result"] = df["Average"].apply(lambda x: "Pass" if x >=75 else "Fail")
# print(" \n-----Result with Total &   Average ----")
# print(df)
# # TOPPER 
# topper = df.loc[df["Average"].idxmax()]
# print("\n Topper Student  ")
# print(topper)
# # save to csv 
# df.to_csv("Student_result.csv", index=False)
# print("\n Result saved in student_result.csv")


import pandas as pd

# Student data
data = {
    "Name": ["Paya ", "Amit ", "Neha ", "Ravi ", "Sita "],
    "Math": [85, 92, 78, 88, 95],
    "Science": [80, 90, 75, 85, 93],
    "English": [88, 85, 70, 90, 91]
}

df = pd.DataFrame(data)

print("\n--- Student Marks Table ---")
print(df)

# Total & Average
df["Total"] = df["Math"] + df["Science"] + df["English"]
df["Average"] = df["Total"] / 3

# Pass / Fail
df["Result"] = df["Average"].apply(lambda x: "Pass 😊" if x >= 75 else "Fail 😢")

print("\n--- Result with Total & Average ---")
print(df)

# Topper
topper = df.loc[df["Average"].idxmax()]
print("\n🏆 Topper Student 🏆")
print(topper)

# Save to CSV
df.to_csv("student_result.csv", index=False)
print("\n📁 Result saved in student_result.csv")