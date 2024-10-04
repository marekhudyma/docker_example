java -jar service-exec.jar
http://localhost:8080/api/datetime
http://localhost:8080/actuator/health

docker build -t marekhudyma/docker-example-1:latest -f Dockerfile .

docker build -t marekhudyma/docker-java-far-jar-resources:latest -f Dockerfile .  --platform="linux/amd64"
docker build -t marekhudyma/docker-java-fat-jar-sources:latest -f Dockerfile .  --platform="linux/amd64"
docker build -t marekhudyma/docker-java-fat-jar-tests:latest -f Dockerfile .  --platform="linux/amd64"
docker build -t marekhudyma/docker-python:latest -f Dockerfile .  --platform="linux/amd64"

mvn jib:dockerBuild

docker images
docker rmi {image}

docker run --name service -p 9000:8080 service

docker login
docker push marekhudyma/docker-example-1:latest
docker push marekhudyma/docker-example-2:latest

docker pull marekhudyma/docker-example-1:latest
http://localhost:9000/actuator/health

# executes 'ls' in the container
docker container exec -it service ls 

# export image as GZ
docker export service | gzip > service.gz

# delete  
docker images | grep 'service'
docker rmi -f 260821c0bda8


