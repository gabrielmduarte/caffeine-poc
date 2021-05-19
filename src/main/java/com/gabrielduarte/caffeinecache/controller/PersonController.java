package com.gabrielduarte.caffeinecache.controller;

import com.gabrielduarte.caffeinecache.domain.PersonEntity;
import com.gabrielduarte.caffeinecache.repository.PersonRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonRepository repository;

    public PersonController(PersonRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    @Cacheable("users")
    public List<PersonEntity> findAll() {
        return repository.findAll();
    }

}
