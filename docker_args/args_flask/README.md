# ARGS usage in docker 

### Aim: To check the working of ARG attribute in Dockerfile, considering both setting and not setting the parameter in --build-arg

To build the image

`docker build --build-arg APP_PORT=8653  -t flask_args_test .`

To run the container

`docker run --rm -it -p 8000:8653 --name flask_arg_cont flask_args_test`

To view response in browser

`http://<your_system_ip>:8000/hello/<your_name>`

For notes refer:

[Docker notes](https://mr-horror-harry.notion.site/Harry-s-Docker-Docs-d252b1bba2ab42e084fcb7b2f970cf2b?pvs=4)

[Docker advanced notes](https://mr-horror-harry.notion.site/Docker-Advanced-9e3ec548158e4cd5b20601920e79d4fe?pvs=4)