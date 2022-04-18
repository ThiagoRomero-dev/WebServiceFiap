package br.com.fiap.smarticities.controller;

import br.com.fiap.smarticities.model.Implantacao;
import br.com.fiap.smarticities.model.ImplantacaoId;
import br.com.fiap.smarticities.repository.ImplantacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/implantacao")
public class ImplantacaoResource {
    @Autowired
    private ImplantacaoRepository implantacaoRepository;

    @GetMapping
    public List<Implantacao> listar(){
        return implantacaoRepository.findAll();
    }

    @GetMapping("{id}")
    public Implantacao buscar(@PathVariable int id){
        return implantacaoRepository.findById(new ImplantacaoId()).get();
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public Implantacao cadastrar(@RequestBody Implantacao implantacao){
        return implantacaoRepository.save(implantacao);
    }

    @PutMapping("{id}")
    public Implantacao atualizar(@RequestBody Implantacao implantacao,@PathVariable int id){
        implantacao.setId(id);
        return implantacaoRepository.save(implantacao);
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id) {
        implantacaoRepository.deleteById(new ImplantacaoId());
    }
}
