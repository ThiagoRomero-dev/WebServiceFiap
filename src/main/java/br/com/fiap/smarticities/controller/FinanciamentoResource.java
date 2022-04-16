package br.com.fiap.smarticities.controller;

import br.com.fiap.smarticities.model.Financiamento;
import br.com.fiap.smarticities.model.FinanciamentoId;
import br.com.fiap.smarticities.repository.FinanciamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("financiamento")
public class FinanciamentoResource {

    @Autowired
    private FinanciamentoRepository financiamentoRepository;

    @GetMapping
    public List<Financiamento> listar(){
        return financiamentoRepository.findAll();
    }

    @GetMapping("{id}")
    public Financiamento buscar(@PathVariable int id){
        return financiamentoRepository.findById(new FinanciamentoId()).get();
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public Financiamento cadastrar(@RequestBody Financiamento financiamento){
        return financiamentoRepository.save(financiamento);
    }

    @PutMapping("{id}")
    public Financiamento atualizar(@RequestBody Financiamento financiamento,@PathVariable int id){
        financiamento.setId(id);
        return financiamentoRepository.save(financiamento);
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id) {
        financiamentoRepository.deleteById(new FinanciamentoId());
    }
}
