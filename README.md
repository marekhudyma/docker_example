java -jar service-exec.jar
http://localhost:8080/api/datetime
http://localhost:8080/actuator/health

docker build -t marekhudyma/docker-example-1:latest -f Dockerfile .

docker images

docker run --name service -p 9000:8080 service

docker login
docker push marekhudyma/docker-example-1:latest
http://localhost:9000/actuator/health

# executes 'ls' in the container
docker container exec -it service ls 

# export image as GZ
docker export service | gzip > service.gz

# delete  
docker images | grep 'service'
docker rmi -f 260821c0bda8
