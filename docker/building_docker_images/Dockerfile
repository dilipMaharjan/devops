FROM ubuntu

RUN apt update
RUN apt install -y python-is-python3

COPY app.py .

ENTRYPOINT python app.py