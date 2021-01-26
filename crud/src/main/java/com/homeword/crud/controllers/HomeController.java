package com.homeword.crud.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.homeword.crud.classes.Customer;
import com.homeword.crud.interService.interfaceService;
import com.homeword.crud.model.Person;


//@RestController
@Controller
@RequestMapping
public class HomeController {
	/**
	@RequestMapping("/api/example")
	public ResponseEntity<String> index() {
		return ResponseEntity.ok("Hello World!");
	}

	@RequestMapping("/costumers")
	public int CustomerController() {
		return Customer.suma();
	}
	*/
	@Autowired
	private interfaceService service;

	@GetMapping("/list")
	public String list(Model model){
		List<Person>people=service.list();
		model.addAttribute("people",people);
		return "index";
	}

	@GetMapping("/new")
	public String add(Model model) {
		model.addAttribute("person", new Person());
		return "form";
	}
	@PostMapping("/save")
	public String save(@Validated Person p, Model model) {
		service.save(p);
		return "redirect:/list";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model model) {
		Optional<Person>person = service.listPersonById(id);
		model.addAttribute("person", person);
		return "form";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id, Model model) {
		service.delete(id);
		return "redirect:/list";
	}
}