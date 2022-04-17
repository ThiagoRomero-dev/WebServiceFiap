package br.com.fiap.smarticities.controller;

import br.com.fiap.smarticities.model.Parceiro;
import br.com.fiap.smarticities.repository.ParceiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("parceiro")
public class ParceiroResource {
    @Autowired
    private ParceiroRepository parceiroRepository;

    @GetMapping
    public List<Parceiro> listar() {
        return parceiroRepository.findAll();
    }

    @GetMapping("{id}")
    public Parceiro buscar(@PathVariable int id) {
        return parceiroRepository.findById(id).get();
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public Parceiro cadastrar(@RequestBody Parceiro parceiro) {
        return parceiroRepository.save(parceiro);
    }

    @PutMapping("{id}")
    public Parceiro atualizar(@RequestBody Parceiro parceiro, @PathVariable int id) {
        parceiro.setId(id);
        return parceiroRepository.save(parceiro);
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id) {
        parceiroRepository.deleteById(id);
    }
}
