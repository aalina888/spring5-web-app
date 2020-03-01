package com.aalina.spring5webapp.controllers;

import com.aalina.spring5webapp.repositories.AuthorRepository;
import com.aalina.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {
    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getBooks(Model model) {
        model.addAttribute("authors", authorRepository.findAll());

        return "authors";
    }
}
