package br.com.fiap.smarticities.controller;

import br.com.fiap.smarticities.model.Contrato;
import br.com.fiap.smarticities.repository.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contrato")
public class ContratoResource {
    @Autowired
    private ContratoRepository contratoRepository;

    @GetMapping
    public List<Contrato> listar() {
        return contratoRepository.findAll();
    }

    @GetMapping("{id}")
    public Contrato buscar(@PathVariable int id) {
        return contratoRepository.findById(id).get();
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public Contrato cadastrar(@RequestBody Contrato contrato) {
        return contratoRepository.save(contrato);
    }

    @PutMapping("{id}")
    public Contrato atualizar(@RequestBody Contrato contrato, @PathVariable int id) {
        contrato.setId(id);
        return contratoRepository.save(contrato);
    }
    @DeleteMapping("{id}")
    public void remover(@PathVariable int id) {
        contratoRepository.deleteById(id);
    }

}
