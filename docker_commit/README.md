# Docker commit

### Aim: To create a custom docker image without Dockerfile (for security & abstraction) using docker commit 

Pull and run the required image interactively

`docker run -it --name=cutom_alpine alpine`

Run the required commands within package

`apk add --update --no-cache python3 py3-pip`

Exit the conatiner using `exit` or Ctrl+D

To save the custom image

`docker commit custom_alpine alpine_custom`

To view the cutom image 

`docker images | grep "alpine_custom"`

Now the image could be used as the base images for other images

**Note:**

The main aim of the above concept is generating a image without Dockerfile and not the image size optimization