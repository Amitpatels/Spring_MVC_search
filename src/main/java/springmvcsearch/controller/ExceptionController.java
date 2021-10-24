package springmvcsearch.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionController {
	
	/*
	 * @RequestMapping("/homeExc") public String exceptionHandler() {
	 * System.out.println("going to home view ..."); String str = null;
	 * System.out.println(str.length()); return "home"; }
	 */
	
	/*
	 * @ExceptionHandler({NullPointerException.class, NumberFormatException.class})
	 * public String exceptionHandlerMethod() { return "exceptionHandler"; }
	 */
	
	@ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
	public String exceptionHandlerNull(Model m) {
		m.addAttribute("msg","Nullpointer exception has occured");
		return "exceptionHandler";
	}
	
	@ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NumberFormatException.class)
	public String exceptionHandlerNumberFormat(Model m) {
		m.addAttribute("msg","NumberFormat exception has occured");
		return "exceptionHandler";
	}
	
	@ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
	public String exceptionHandlerException(Model m) {
		m.addAttribute("msg","Exception has occured");
		return "exceptionHandler";
	}
	
}
