package br.com.fiap.smarticities.controller;

import br.com.fiap.smarticities.model.Projeto;
import br.com.fiap.smarticities.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projeto")
public class ProjetoResource {
    @Autowired
    private ProjetoRepository projetoRepository;

    @GetMapping
    public List<Projeto> listar() {
        return projetoRepository.findAll();
    }

    @GetMapping("{id}")
    public Projeto buscar(@PathVariable int id) {
        return projetoRepository.findById(id).get();
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public Projeto cadastrar(@RequestBody Projeto projeto) {
        return projetoRepository.save(projeto);
    }

    @PutMapping("{id}")
    public Projeto atualizar(@RequestBody Projeto projeto, @PathVariable int id) {
        projeto.setId(id);
        return projetoRepository.save(projeto);
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id) {
        projetoRepository.deleteById(id);
    }
}
