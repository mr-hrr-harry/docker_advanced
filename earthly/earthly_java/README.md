# Earthly build with java images

### Aim: To create a java-class file in one image, store it and use it later in another image to maintain source code abstraction using earthly 

pre-requisites: earthly ([Install](https://earthly.dev/get-earthly))

To generate the artifacts

`earthly +build`

To build the image

`earthly +final`

To run the container

`docker run --rm -it --name java_sum_n earthly-java-app:latest`

For notes refer:

[Docker notes](https://mr-horror-harry.notion.site/Harry-s-Docker-Docs-d252b1bba2ab42e084fcb7b2f970cf2b?pvs=4)

[Docker advanced notes](https://mr-horror-harry.notion.site/Docker-Advanced-9e3ec548158e4cd5b20601920e79d4fe?pvs=4)