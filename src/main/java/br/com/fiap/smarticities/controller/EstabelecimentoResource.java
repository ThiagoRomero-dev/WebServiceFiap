package br.com.fiap.smarticities.controller;

import br.com.fiap.smarticities.model.Estabelecimento;
import br.com.fiap.smarticities.repository.EstabelecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estabelecimento")
public class EstabelecimentoResource {

    @Autowired
    private EstabelecimentoRepository estabelecimentoRepository;

    @GetMapping
    public List<Estabelecimento> listar(){return estabelecimentoRepository.findAll();}

    @GetMapping("{id}")
    public Estabelecimento buscar(@PathVariable int id){
        return estabelecimentoRepository.findById(id).get();
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public Estabelecimento cadastrar(@RequestBody Estabelecimento estabelecimento) {
        return estabelecimentoRepository.save(estabelecimento);
    }

    @PutMapping("{id}")
    public Estabelecimento atualizar(@RequestBody Estabelecimento estabelecimento, @PathVariable int id) {
        estabelecimento.setId(id);
        return estabelecimentoRepository.save(estabelecimento);
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id) {
        estabelecimentoRepository.deleteById(id);
    }

}
