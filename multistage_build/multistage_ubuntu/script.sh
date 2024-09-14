#!/bin/bash
mkdir env;
cat /etc/os-release > env/ubuntu.env;
printenv >> env/ubuntu.env;