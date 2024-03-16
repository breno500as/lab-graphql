package com.br.graphql.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import com.br.graphql.model.Author;
import com.br.graphql.model.Book;

@Controller
public class BookController {


 /* chamada:
	query {
	    bookById(id: 1) {
	        id
	        title
	        category
	        author {
	            id
	            name
	            thumbnail
	        }
	    }
	} */

	@QueryMapping
	public Book bookById(@Argument long id) {
		return Book.getById(id);
	}

	@SchemaMapping
	public Author author(Book book) {
		return Author.getById(book.id());
	}

}
