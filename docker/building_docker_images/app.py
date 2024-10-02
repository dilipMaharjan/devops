import os
message=os.environ.get('MESSAGE')
print(f'Hello form Docker Image, {message} !')