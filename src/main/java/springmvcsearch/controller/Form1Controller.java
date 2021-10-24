package springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvcsearch.entity.Form1;

@Controller
public class Form1Controller {
	
	@RequestMapping("/form1")
	public String home() {
		System.out.println("form1 controller invoke !!");
		/*
		 * String str = null; str.length();
		 */
		return "form1";
	}
	
	
	@RequestMapping(path="/handelForm", method= RequestMethod.POST)
	public String handleForm1(@ModelAttribute("form1") Form1 form1, BindingResult result) {
		
		if(result.hasErrors()) {
			return "form1";
		}
		
		System.out.println(form1);
		
		return "success";
	}
	
	
}
