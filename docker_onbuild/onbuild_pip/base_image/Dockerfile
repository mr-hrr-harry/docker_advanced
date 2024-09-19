FROM python:3-alpine

WORKDIR /opt/app

ONBUILD COPY requirements.txt .

ONBUILD RUN pip install -r requirements.txt

ONBUILD COPY . . 