package ma.ensaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "adminhome";
	}
	
	@GetMapping("/user")
	public String user() {
		return "userhome";
	}

}
