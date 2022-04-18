package br.com.fiap.smarticities.controller;

import br.com.fiap.smarticities.model.Departamento;
import br.com.fiap.smarticities.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamento")
public class DepartamentoResource {
    @Autowired
    private DepartamentoRepository departamentoRepository;

    @GetMapping
    public List<Departamento> listar() {
        return departamentoRepository.findAll();
    }

    @GetMapping("{id}")
    public Departamento buscar(@PathVariable int id) {
        return departamentoRepository.findById(id).get();
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public Departamento cadastrar(@RequestBody Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    @PutMapping("{id}")
    public Departamento atualizar(@RequestBody Departamento departamento, @PathVariable int id) {
        departamento.setId(id);
        return departamentoRepository.save(departamento);
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id) {
        departamentoRepository.deleteById(id);
    }
}
