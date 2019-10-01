package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.TestingObject;

@RestController
public class TestingController {

	private static final String template = "Hola mundo, ";
	
	//Para probarlo, http://localhost:8080/holamundo
	//Para probarlo, http://localhost:8080/holamundo?name=AAAA
	@RequestMapping("/holamundo")
	public TestingObject getHolaMundo(@RequestParam(value="name", defaultValue = "Unnamed") String name) {
		System.out.println("@NUEVO Entra en getHolaMundo");
		return new TestingObject(template + name);
	}
	
}
