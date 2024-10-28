package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializer
 * OS seguintes módulos foram selecionados:
 *  - Spring Data JPA
 *  - Spring WEB
 *  - H2 Database
 *  - OpenFeign
 *
 * @author eleonilson
 */
@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
