package com.appp.restt;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController{

	public static HashMap<String,String> map= new HashMap<> ();
@GetMapping("/welcome")
@ResponseBody

public String sayWelcome(){

return "welcome to my app";
}

@PostMapping("/loginvalidate")
@ResponseBody
public String isvalid(@RequestParam("name") String name,@RequestParam("pass") String pass){
	
if(map.get(name).equals(pass)) {
	return "Success";
}
else
	return "failed";
}
@GetMapping("/login")
//@ResponseBody
public String saylogin(){

return "login";
}
@GetMapping("/register")
//@ResponseBody
public String register(){

return "register";
}

@PostMapping("/registervalidate")
//@ResponseBody
public String registervalid(@RequestParam("name") String name,@RequestParam("pass") String pass){
		map.put(name, pass);
		return "login";
	}	

		
	



}

