package com.br.graphql.model;

import java.util.Arrays;
import java.util.List;


public record Author(Long id, String name, String thumbnail) {

	private static List<Author> authors = Arrays.asList(new Author(1L, "Joshua", "Bloch"),
			new Author(2L, "Douglas", "Adams"), new Author(3L, "Bill", "Bryson"));

	public static Author getById(Long id) {
		return authors.stream().filter(author -> author.id().equals(id)).findFirst().orElse(null);
	}
	
	public static List<Author> getAll() {
		return authors;
	}

}
