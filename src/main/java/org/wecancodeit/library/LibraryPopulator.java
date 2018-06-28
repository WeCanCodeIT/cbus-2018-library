package org.wecancodeit.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class LibraryPopulator implements CommandLineRunner {
	
	@Autowired
	GenreRepository genreRepo;
	
	@Autowired
	AuthorRepository authorRepo;

	@Autowired
	BookRepository bookRepo;

	@Override
	public void run(String... args) throws Exception {
		Genre fiction = genreRepo.save(new Genre("fiction"));
		Genre nonFiction = genreRepo.save(new Genre("non fiction"));
		Genre mystery = genreRepo.save(new Genre("mystery"));
		Genre technology = genreRepo.save(new Genre("technology"));
		
		Author kathy = authorRepo.save(new Author("Kathy", "Sierra"));
		Author bert = authorRepo.save(new Author("Bert", "Bates"));
		
		Book hfdp = bookRepo.save(new Book("Head First Design Patterns", technology, kathy, bert));
	}

}
