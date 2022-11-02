package com.alexmv.rest.webservices.restfulwebservices.helloworld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
		
		private MessageSource messageSource;
		
		public HelloWorldController(MessageSource messageSource) {
			this.messageSource = messageSource;
		}
		

	    //Llamada simple, devuelve un String
	    //http://localhost:8080/hello-world
	    @GetMapping("/hello-world")
	    public String helloWorld(){
	        return "Hello World";
	    }

	    //Devuelve un Objeto de tipo HelloWorld, lo traduce a JSON gracias al getter
	    // http://localhost:8080/hello-world-bean
	    @GetMapping(path = "/hello-world-bean")
	    public HelloWorldBean helloWorldBean() {
	        return new HelloWorldBean("Hello World");
	    }

	    //PathVariable, mas utilizado para REST APIs
	    // http://localhost:8080/hello-world-path-variable/alex
	    @GetMapping("/hello-world-path-variable/{message}")
	    public HelloWorldBean helloWorldPathVariable(@PathVariable String message){
	        return new HelloWorldBean(message);
	    }

	    //RequestParam, mas utilizado para webs tradicionales como formularios
	    //http://localhost:8080/hello-world-request-param?message=alexito
	    @GetMapping("/hello-world-request-param")
	    public HelloWorldBean helloWorldRequestParam(@RequestParam String message){
	        return new HelloWorldBean(message);
	    }

		@GetMapping(path = "/hello-world-i18n")
		public String helloWorldi18n() {
			Locale locale = LocaleContextHolder.getLocale();
			return messageSource.getMessage("good.morning.message", null, "Default Message", locale);
		}


}
