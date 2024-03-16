package com.br.graphql.model;

import java.util.Arrays;
import java.util.List;

public record Book(Long id, String title, String text, String category,  Long authorId) {
	
	 
	
	
	 private static List<Book> books = Arrays.asList(
	            new Book(1L, "Effective Java", "Effective Java 2", "Java", 1L),
	            new Book(2L, "Hitchhiker's Guide to the Galaxy", "Hitchhiker's Guide to the Galaxy", "PHP", 2L),
	            new Book(3L, "Down Under", "Down Under", "PY", 3L)
	    );

	    public static Book getById(long id) {
	        return books.stream()
					.filter(book -> book.id().equals(id))
					.findFirst()
					.orElse(null);
	    }

}
