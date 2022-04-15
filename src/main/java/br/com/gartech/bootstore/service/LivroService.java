package br.com.gartech.bootstore.service;

import br.com.gartech.bootstore.domain.Livro;
import br.com.gartech.bootstore.domain.repositories.LivroRepository;
import br.com.gartech.bootstore.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    public Livro findById(Integer id) {
        Optional<Livro> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! " + id + ", Tipo: " + Livro.class.getName()));
    }
}
