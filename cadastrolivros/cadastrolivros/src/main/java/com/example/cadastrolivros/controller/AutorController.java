package com.example.cadastrolivros.controller;
import com.example.cadastrolivros.model.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import com.example.cadastrolivros.repository.AutorRepository;
@CrossOrigin(origins = "http://localhost:5173") // Endereço do front
@RestController

@RequestMapping("/autores")
public class AutorController {
    @Autowired
    private AutorRepository autorRepository;
    @GetMapping
    public List<Autor> listarGeneros() {
        return autorRepository.findAll();
    }
    @PostMapping
    public Autor criarGenero(@RequestBody Autor autor) {
        return autorRepository.save(autor);
    }

}
