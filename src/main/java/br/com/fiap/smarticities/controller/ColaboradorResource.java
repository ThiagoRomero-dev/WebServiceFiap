package br.com.fiap.smarticities.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import br.com.fiap.smarticities.model.Colaborador;
import br.com.fiap.smarticities.repository.ColaboradorRepository;

@RestController
@RequestMapping("/colaborador")
public class ColaboradorResource{
    
    @Autowired
    private ColaboradorRepository colaboradorRepository;

    @GetMapping
    public List<Colaborador> listar(){
        return colaboradorRepository.findAll();
    }

    @GetMapping("{id}")
    public Colaborador buscar(@PathVariable int id){
        return colaboradorRepository.findById(id).get();
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public Colaborador cadastrar(@RequestBody Colaborador colaborador){
        return colaboradorRepository.save(colaborador);
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id){
        colaboradorRepository.deleteById(id);
    }

    @PutMapping("{id}")
    public Colaborador atualizar(@RequestBody Colaborador colaborador, @PathVariable int id){
        return colaboradorRepository.save(colaborador);
    }

}
