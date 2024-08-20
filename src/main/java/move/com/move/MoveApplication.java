package move.com.move;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication()
@RestController
public class MoveApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoveApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "hello World";
	}
	

}
