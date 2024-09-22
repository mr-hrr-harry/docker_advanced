# Multistage with ubuntu-alpine

### Aim: To create a spec file in the ubuntu(~80MB) and copy that to alpine (~10MB) using multistaging

To generate the image

`docker build -t get_env .`

To run the container

`docker run --rm --name env_specs -it get_env`

For notes refer:

[Docker notes](https://mr-horror-harry.notion.site/Harry-s-Docker-Docs-d252b1bba2ab42e084fcb7b2f970cf2b?pvs=4)

[Docker advanced notes](https://mr-horror-harry.notion.site/Docker-Advanced-9e3ec548158e4cd5b20601920e79d4fe?pvs=4)