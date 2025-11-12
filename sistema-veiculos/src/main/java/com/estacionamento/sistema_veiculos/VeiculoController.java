ppackage com.estacionamento.sistema_veiculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.estacionamento.sistema_veiculos.model.Veiculo;
import com.estacionamento.sistema_veiculos.repository.VeiculoRepository;

@RestController
@RequestMapping("/veiculos")
@CrossOrigin(origins = "*") // permite o front-end acessar
public class VeiculoController {

    @Autowired
    private VeiculoRepository repository;

    @GetMapping
    public List<Veiculo> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Veiculo cadastrar(@RequestBody Veiculo veiculo) {
        return repository.save(veiculo);
    }

    @PutMapping("/{id}")
    public Veiculo atualizar(@PathVariable Long id, @RequestBody Veiculo dados) {
        Veiculo v = repository.findById(id).orElseThrow();
        v.setPreco(dados.getPreco());
        v.setQuilometragem(dados.getQuilometragem());
        v.setStatus(dados.getStatus());
        return repository.save(v);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
