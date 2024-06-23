package com.sgpa.usersgpa.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sgpa.usersgpa.entities.Paciente;
import com.sgpa.usersgpa.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<Paciente> findAll() {
        List<Paciente> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public Paciente findById(@PathVariable Long id) {
        Paciente result = repository.findById(id).get();
        return result;
    }

    @PostMapping
    public Paciente insert(@RequestBody Paciente user) {
        Paciente result = repository.save(user);
        return result;
    }
}
