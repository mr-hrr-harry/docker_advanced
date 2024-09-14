# docker multistage
FROM ubuntu:22.04 AS ubuntu_22_build
WORKDIR /gen
COPY script.sh .
RUN apt update && \
    ./script.sh

FROM alpine:3.20
WORKDIR /opt/app
RUN apk update && \
    cat /etc/os-release > alpine.env; \
    printenv >> alpine.env;
COPY --from=ubuntu_22_build /gen/env/ubuntu.env /opt/app/ubuntu.env
CMD ["/bin/sh"]