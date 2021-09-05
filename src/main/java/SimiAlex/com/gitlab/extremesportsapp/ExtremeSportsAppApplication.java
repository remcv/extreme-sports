package SimiAlex.com.gitlab.extremesportsapp;

import SimiAlex.com.gitlab.extremesportsapp.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class ExtremeSportsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExtremeSportsAppApplication.class, args);
	}

}
