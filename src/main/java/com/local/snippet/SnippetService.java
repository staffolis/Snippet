package com.local.snippet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SnippetService {

    private final SnippetRepository snippetRepository;

    @Autowired
    public SnippetService(SnippetRepository snippetRepository){

        this.snippetRepository = snippetRepository;
    }

    public List<Snippet> getSnippets() {

        return snippetRepository.findAll();
    }

    public void addSnippet(Snippet snippet) {

        snippetRepository.save(snippet);
    }
}
