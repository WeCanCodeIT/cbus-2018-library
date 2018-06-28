package org.wecancodeit.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@Autowired
	BookRepository repo;

	@RequestMapping("/")
	public String home() {
		return repo.findOne(1L).toString();
	}
}
