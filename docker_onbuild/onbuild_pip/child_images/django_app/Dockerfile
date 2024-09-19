FROM python_prepared:onbuild 

ARG PROJECT_NAME=django_init

RUN django-admin startproject ${PROJECT_NAME}

WORKDIR /opt/app/${PROJECT_NAME}

RUN sed -i 's/ALLOWED_HOSTS = \[\]/ALLOWED_HOSTS = ["*"]/' ${PROJECT_NAME}/settings.py

EXPOSE 8100

ENTRYPOINT ["python", "manage.py", "runserver", "0.0.0.0:8100"]