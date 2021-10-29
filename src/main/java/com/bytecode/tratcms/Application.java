package com.bytecode.tratcms;

import com.bytecode.tratcms.service.InstalacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.bytecode.tratcms.model.entity")
@EnableJpaRepositories(basePackages = "com.bytecode.tratcms.repository.jpa")
public class Application implements CommandLineRunner {
	@Autowired
	private InstalacionService instalacionService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		instalacionService.init_usuarios();
	}
}
