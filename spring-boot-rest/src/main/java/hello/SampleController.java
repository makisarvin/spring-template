package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SampleController {

	@RequestMapping("/")
	String home() {
		return "Greetings from Spring Boot!";
	}

} 