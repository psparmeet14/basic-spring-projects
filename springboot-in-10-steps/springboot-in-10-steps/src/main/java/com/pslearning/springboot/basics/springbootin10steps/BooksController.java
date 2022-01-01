package com.pslearning.springboot.basics.springbootin10steps;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	
	@GetMapping("/books")
	public List<Book> getBooks() {
		return Arrays.asList(
				new Book(1l, "Spring framework", "Parmeet Singh"),
				new Book(2l, "Java complete", "Parmeet Singh"));
	};

}
