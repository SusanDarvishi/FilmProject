package com.filmwebsite;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.ui.Model;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@EnableAutoConfiguration
public class LoginController {
	@Autowired 
	private UserRepository userRepository;
	
	String universalPassword = "susan33";

	@RequestMapping("/")
    String helloForm(Model model) {
		//model.addAttribute("usernamePlaceholder", username);
		return "login";
	}
	
	@RequestMapping("/homepage")
    String weclcomePage() {
		return "login";
	}
	
    @RequestMapping("/login")
    String hello(
    		@RequestParam("username") String username, 
    		@RequestParam("password") String password,
    		Model model)throws Exception {
    	List<User> users = userRepository.findByUsername(username);
    	
    	if (users.size() != 1) {
    		return "thats not right!";
    	} 
    	
    	User found = users.get(0);
    	if (password.equals(found.getPassword())) {
    		model.addAttribute("username", username);
    		return "success";
    	} else {
    		return "login";
    	}
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(LoginController.class, args);
    }
}
