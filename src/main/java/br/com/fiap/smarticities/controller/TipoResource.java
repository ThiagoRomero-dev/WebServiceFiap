package br.com.fiap.smarticities.controller;

import br.com.fiap.smarticities.model.Tipo;
import br.com.fiap.smarticities.repository.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipo")
public class TipoResource {
    @Autowired
    private TipoRepository tipoRepository;

    @GetMapping
    public List<Tipo> listar() {
        return tipoRepository.findAll();
    }

    @GetMapping("{id}")
    public Tipo buscar(@PathVariable int id) {
        return tipoRepository.findById(id).get();
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public Tipo cadastrar(@RequestBody Tipo tipo) {
        return tipoRepository.save(tipo);
    }

    @PutMapping("{id}")
    public Tipo atualizar(@RequestBody Tipo tipo, @PathVariable int id) {
        tipo.setId(id);
        return tipoRepository.save(tipo);
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id) {
        tipoRepository.deleteById(id);
    }
}
