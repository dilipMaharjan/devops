import os
import sys
import requests

message = os.environ.get("MESSAGE")
print(f"Hello form Docker Image new, {message} !")

r = requests.get("https://coreyms.com")
print(r.status_code)

print (sys.version)
