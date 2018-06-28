package org.wecancodeit.library;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Book {

	@Id
	@GeneratedValue
	private Long id;
	
	private String title;
	
	@ManyToMany
	private Collection<Author> authors;
	
	@ManyToOne
	private Genre genre;
	
	public Book() {}

	public Book(String title, Genre genre, Author... authors) {
		this.title = title;
		this.genre = genre;
		this.authors = Arrays.asList(authors);
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Collection<Author> getAuthors() {
		return authors;
	}

	public Genre getGenre() {
		return genre;
	}

	@Override
	public String toString() {
		return title + " by " + authors + " is a " + genre + " type book.";
	}
}
