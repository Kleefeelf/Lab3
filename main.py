import re

pattern = r"\b304\b"
log = open("access_log", "r")
result = open("result", "w")
for line in log:
    if re.findall(pattern, line):
        result.write(line)