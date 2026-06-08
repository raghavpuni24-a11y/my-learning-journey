# to open and operate on 2 files at once in modern py

#  Method 1 — Comma separated (cleanest ✅)
with open("file_01.txt") as f1, open("file_02.txt","w") as f2:
    f2.write(f1.read())
    
# Method 2 — Parenthesized (Python 3.10+)
with (
    open("file_01.txt", "r") as f1,
    open("file_02.txt", "w") as f2
):
    f2.write(f1.read())