package br.com.gartech.bootstore;

import br.com.gartech.bootstore.domain.Categoria;
import br.com.gartech.bootstore.domain.Livro;
import br.com.gartech.bootstore.domain.repositories.CategoriaRepository;
import br.com.gartech.bootstore.domain.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BootstoreApplication {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private LivroRepository livroRepository;

    public static void main(String[] args) {
        SpringApplication.run(BootstoreApplication.class, args);
    }


}
