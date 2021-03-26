package com.local.snippet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/snippets")
public class SnippetController {

    private final SnippetService snippetService;

    @Autowired
    public SnippetController(SnippetService snippetService) {this.snippetService = snippetService;}

    @GetMapping
    public List<Snippet> getAllSnippets(){

        return snippetService.getSnippets();
    }

    @PostMapping
    public void addSnippet(@RequestBody Snippet snippet){

        snippetService.addSnippet(snippet);
    }
}
