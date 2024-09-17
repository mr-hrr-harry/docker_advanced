ARG IMAGE_TAG=3-alpine
FROM python:${IMAGE_TAG}

WORKDIR /opt/app

COPY requirements.txt .

RUN pip install -r requirements.txt 

COPY . .

ARG APP_PORT=8000

ENV PORT=${APP_PORT}

EXPOSE ${APP_PORT}

ENTRYPOINT ["./script.sh"]
