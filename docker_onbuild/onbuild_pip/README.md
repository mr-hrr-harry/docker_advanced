# Docker onbuild

### Aim: To create an base image and two or more child images that share common intialisation prcoess to be handled by the base image using onbuild

To build the base image:

`docker build -t python_prepared:onbuild .`

---

To build the child image 1 (Flask):

`docker build -t onbuild_child_flask flask_app/`

To run the same,

`docker run --rm --network=test-network -it --name=flask_child -p 8080:8000 onbuild_child_flask`

Access the service in browser using **http://<YOUR_IP>:8080/hello/<YOUR_NAME>**

---

To build the child image 2 (Django):

`docker build -t onbuild_child_django --build-arg PROJECT_NAME=django_start django_app/`

To run the same,

`docker run -it --rm --name=child_django -p 8050:8000  onbuild_child_django`

View the django app in browser using **http://<YOUR_IP>:8050** 
