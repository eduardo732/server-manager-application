package com.example.server;

import com.example.server.enumeration.Status;
import com.example.server.model.Server;
import com.example.server.repository.ServerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

	@Bean
	CommandLineRunner run(ServerRepository serverRepository) {
		return args -> {
			serverRepository.save(new Server(null, "192.168.1.160", "Ubuntu linux", "16 GB", "Personal PC",
					"http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
			serverRepository.save(new Server(null, "192.168.1.10", "Ubuntu2 linux", "16 GB", "Personal PC",
					"http://localhost:8080/server/image/server2.png", Status.SERVER_UP));
			serverRepository.save(new Server(null, "192.168.1.122", "Ubuntu3 linux", "16 GB", "Personal PC",
					"http://localhost:8080/server/image/server3.png", Status.SERVER_UP));
			serverRepository.save(new Server(null, "192.168.1.16", "Ubuntu4 linux", "16 GB", "Personal PC",
					"http://localhost:8080/server/image/server4.png", Status.SERVER_UP));
		};
	}
}
