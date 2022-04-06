package itsdevle.EsameFinale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class EsameFinaleApplication {


	private static final Logger logger = LoggerFactory.getLogger(EsameFinaleApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(EsameFinaleApplication.class, args);

		logger.info("Sto facendo una prova");
	}
	@Bean
	public CommandLineRunner commandLineRunner (ApplicationContext ctx){
		return args -> {

		};

	}

}


