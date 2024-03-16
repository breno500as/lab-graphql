package com.br.graphql.controller;

import java.util.List;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.br.graphql.model.Author;

@Controller
public class AuthorController {
	
	
	 /*chamada:
		query {
          getAuthors { 
          id,
          name,
         thumbnail
      }
     } */
	

	@QueryMapping
	public List<Author> getAuthors() {
		return  Author.getAll();
	}

}
