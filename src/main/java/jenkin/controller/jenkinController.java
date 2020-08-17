package jenkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class jenkinController {

	@GetMapping("/home")
	public String getData() {
		return "good way ";
	}
}
