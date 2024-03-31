package com.example.LabCycle9;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LabCycle9Application {

	public static void main(String[] args) {
		SpringApplication.run(LabCycle9Application.class, args);
	}

}


/*
 Dockerfile -> maven install
 Go to the file 
sudo docker build -t lab9 .

sudo docker images

Create docker-compose.yml file

 sudo docker compose up

sudo docker container ls

*/