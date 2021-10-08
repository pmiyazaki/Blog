package com.DigitalHouse.blog.controller;

import com.DigitalHouse.blog.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postagem")
@CrossOrigin("*")
public class PostController {

    @Autowired
    private PostagemRepository repository;

    @GetMapping
    public String getPosts() {
        return "All posts";
    }
}
