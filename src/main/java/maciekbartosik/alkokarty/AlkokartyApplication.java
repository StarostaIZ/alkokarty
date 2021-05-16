package maciekbartosik.alkokarty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AlkokartyApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World test heroku";
	}

	public static void main(String[] args) {
		SpringApplication.run(AlkokartyApplication.class, args);
	}

}
